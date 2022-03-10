require('source-map-support/register');
module.exports =
/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, { enumerable: true, get: getter });
/******/ 		}
/******/ 	};
/******/
/******/ 	// define __esModule on exports
/******/ 	__webpack_require__.r = function(exports) {
/******/ 		if(typeof Symbol !== 'undefined' && Symbol.toStringTag) {
/******/ 			Object.defineProperty(exports, Symbol.toStringTag, { value: 'Module' });
/******/ 		}
/******/ 		Object.defineProperty(exports, '__esModule', { value: true });
/******/ 	};
/******/
/******/ 	// create a fake namespace object
/******/ 	// mode & 1: value is a module id, require it
/******/ 	// mode & 2: merge all properties of value into the ns
/******/ 	// mode & 4: return value when already ns object
/******/ 	// mode & 8|1: behave like require
/******/ 	__webpack_require__.t = function(value, mode) {
/******/ 		if(mode & 1) value = __webpack_require__(value);
/******/ 		if(mode & 8) return value;
/******/ 		if((mode & 4) && typeof value === 'object' && value && value.__esModule) return value;
/******/ 		var ns = Object.create(null);
/******/ 		__webpack_require__.r(ns);
/******/ 		Object.defineProperty(ns, 'default', { enumerable: true, value: value });
/******/ 		if(mode & 2 && typeof value != 'string') for(var key in value) __webpack_require__.d(ns, key, function(key) { return value[key]; }.bind(null, key));
/******/ 		return ns;
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "/";
/******/
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = 0);
/******/ })
/************************************************************************/
/******/ ({

/***/ "./src/auth/index.js":
/*!***************************!*\
  !*** ./src/auth/index.js ***!
  \***************************/
/*! exports provided: router */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _router__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ./router */ "./src/auth/router.js");
/* harmony reexport (safe) */ __webpack_require__.d(__webpack_exports__, "router", function() { return _router__WEBPACK_IMPORTED_MODULE_0__["router"]; });



/***/ }),

/***/ "./src/auth/router.js":
/*!****************************!*\
  !*** ./src/auth/router.js ***!
  \****************************/
/*! exports provided: router */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "router", function() { return router; });
/* harmony import */ var koa_router__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! koa-router */ "koa-router");
/* harmony import */ var koa_router__WEBPACK_IMPORTED_MODULE_0___default = /*#__PURE__*/__webpack_require__.n(koa_router__WEBPACK_IMPORTED_MODULE_0__);
/* harmony import */ var _store__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./store */ "./src/auth/store.js");
/* harmony import */ var jsonwebtoken__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! jsonwebtoken */ "jsonwebtoken");
/* harmony import */ var jsonwebtoken__WEBPACK_IMPORTED_MODULE_2___default = /*#__PURE__*/__webpack_require__.n(jsonwebtoken__WEBPACK_IMPORTED_MODULE_2__);
/* harmony import */ var _utils__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../utils */ "./src/utils/index.js");




const router = new koa_router__WEBPACK_IMPORTED_MODULE_0___default.a();

const createToken = user => {
  return jsonwebtoken__WEBPACK_IMPORTED_MODULE_2___default.a.sign({
    username: user.username,
    _id: user._id
  }, _utils__WEBPACK_IMPORTED_MODULE_3__["jwtConfig"].secret, {
    expiresIn: 60 * 60 * 60
  });
};

const createUser = async (user, response) => {
  try {
    await _store__WEBPACK_IMPORTED_MODULE_1__["default"].insert(user);
    response.body = {
      token: createToken(user)
    };
    response.status = 201; // created
  } catch (err) {
    response.body = {
      issue: [{
        error: err.message
      }]
    };
    response.status = 400; // bad request
  }
};

router.post('/signup', async ctx => await createUser(ctx.request.body, ctx.response));
router.post('/login', async ctx => {
  const credentials = ctx.request.body;
  const response = ctx.response;
  const user = await _store__WEBPACK_IMPORTED_MODULE_1__["default"].findOne({
    username: credentials.username
  });

  if (user && credentials.password === user.password) {
    response.body = {
      token: createToken(user)
    };
    response.status = 201; // created
  } else {
    response.body = {
      issue: [{
        error: 'Invalid credentials'
      }]
    };
    response.status = 400; // bad request
  }
});

/***/ }),

/***/ "./src/auth/store.js":
/*!***************************!*\
  !*** ./src/auth/store.js ***!
  \***************************/
/*! exports provided: UserStore, default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UserStore", function() { return UserStore; });
/* harmony import */ var nedb_promise__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! nedb-promise */ "nedb-promise");
/* harmony import */ var nedb_promise__WEBPACK_IMPORTED_MODULE_0___default = /*#__PURE__*/__webpack_require__.n(nedb_promise__WEBPACK_IMPORTED_MODULE_0__);

class UserStore {
  constructor({
    filename,
    autoload
  }) {
    this.store = nedb_promise__WEBPACK_IMPORTED_MODULE_0___default()({
      filename,
      autoload
    });
  }

  async findOne(props) {
    return this.store.findOne(props);
  }

  async insert(user) {
    //
    return this.store.insert(user);
  }

}
/* harmony default export */ __webpack_exports__["default"] = (new UserStore({
  filename: './db/users.json',
  autoload: true
}));

/***/ }),

/***/ "./src/hotels/index.js":
/*!*****************************!*\
  !*** ./src/hotels/index.js ***!
  \*****************************/
/*! exports provided: router */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _router__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ./router */ "./src/hotels/router.js");
/* harmony reexport (safe) */ __webpack_require__.d(__webpack_exports__, "router", function() { return _router__WEBPACK_IMPORTED_MODULE_0__["router"]; });



/***/ }),

/***/ "./src/hotels/router.js":
/*!******************************!*\
  !*** ./src/hotels/router.js ***!
  \******************************/
/*! exports provided: router */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "router", function() { return router; });
/* harmony import */ var koa_router__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! koa-router */ "koa-router");
/* harmony import */ var koa_router__WEBPACK_IMPORTED_MODULE_0___default = /*#__PURE__*/__webpack_require__.n(koa_router__WEBPACK_IMPORTED_MODULE_0__);
/* harmony import */ var _utils__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../utils */ "./src/utils/index.js");
/* harmony import */ var _store__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./store */ "./src/hotels/store.js");
/* harmony import */ var fs__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! fs */ "fs");
/* harmony import */ var fs__WEBPACK_IMPORTED_MODULE_3___default = /*#__PURE__*/__webpack_require__.n(fs__WEBPACK_IMPORTED_MODULE_3__);




const router = new koa_router__WEBPACK_IMPORTED_MODULE_0___default.a();
router.get('/filter/:name?', async ctx => {
  const response = ctx.response;
  const userId = ctx.state.user._id;
  let name = ctx.params.name;
  if (!name) name = '';
  let arr = [];
  let all = await _store__WEBPACK_IMPORTED_MODULE_2__["default"].find({
    userId
  });

  for (let hotel of all) if (hotel.name.toLowerCase().includes(name.toLowerCase())) arr = arr.concat(hotel);

  response.body = arr;
  response.status = 200; // ok
});
router.get('/:id', async ctx => {
  const userId = ctx.state.user._id;
  const hotel = await _store__WEBPACK_IMPORTED_MODULE_2__["default"].findOne({
    _id: ctx.params.id
  });
  const response = ctx.response;

  if (hotel) {
    if (hotel.userId === userId) {
      response.body = hotel;
      response.status = 200; // ok
    } else {
      response.status = 403; // forbidden
    }
  } else {
    response.status = 404; // not found
  }
});

const createHotel = async (ctx, hotel, response) => {
  try {
    const userId = ctx.state.user._id;
    hotel.userId = userId;
    response.body = await _store__WEBPACK_IMPORTED_MODULE_2__["default"].insert(hotel);
    response.status = 201; // created

    Object(_utils__WEBPACK_IMPORTED_MODULE_1__["broadcast"])(userId, {
      type: 'created',
      payload: response.body
    });
  } catch (err) {
    response.body = {
      message: err.message
    };
    response.status = 400; // bad request
  }
};

router.post('/', async ctx => await createHotel(ctx, ctx.request.body, ctx.response));
router.post('/photo', async ctx => {
  // noinspection JSUnresolvedVariable
  const photo = ctx.request.body.data;
  let buff = Buffer.from(photo, 'base64');
  fs__WEBPACK_IMPORTED_MODULE_3___default.a.writeFile('my-file.png', buff, err => {
    if (err) throw err;
    console.log('The binary data has been decoded and saved to my-file.png');
  });
  ctx.response.status = 200;
});
router.put('/:id', async ctx => {
  const hotel = ctx.request.body;
  const id = ctx.params.id;
  const hotelId = hotel._id;
  const response = ctx.response;

  if (hotelId && hotelId !== id) {
    response.body = {
      message: 'Param id and body _id should be the same'
    };
    response.status = 400; // bad request

    return;
  }

  if (!hotelId) {
    await createHotel(ctx, hotel, response);
  } else {
    const userId = ctx.state.user._id;
    hotel.userId = userId;
    const updatedCount = await _store__WEBPACK_IMPORTED_MODULE_2__["default"].update({
      _id: id
    }, hotel);

    if (updatedCount === 1) {
      response.body = hotel;
      response.status = 200; // ok

      Object(_utils__WEBPACK_IMPORTED_MODULE_1__["broadcast"])(userId, {
        type: 'updated',
        payload: hotel
      });
    } else {
      response.body = {
        message: 'Resource no longer exists'
      };
      response.status = 405; // method not allowed
    }
  }
});
router.del('/:id', async ctx => {
  const userId = ctx.state.user._id;
  const hotel = await _store__WEBPACK_IMPORTED_MODULE_2__["default"].findOne({
    _id: ctx.params.id
  });

  if (hotel && userId !== hotel.userId) {
    ctx.response.status = 403; // forbidden
  } else {
    await _store__WEBPACK_IMPORTED_MODULE_2__["default"].remove({
      _id: ctx.params.id
    });
    ctx.response.status = 204; // no content
  }
});

/***/ }),

/***/ "./src/hotels/store.js":
/*!*****************************!*\
  !*** ./src/hotels/store.js ***!
  \*****************************/
/*! exports provided: HotelStore, default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HotelStore", function() { return HotelStore; });
/* harmony import */ var nedb_promise__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! nedb-promise */ "nedb-promise");
/* harmony import */ var nedb_promise__WEBPACK_IMPORTED_MODULE_0___default = /*#__PURE__*/__webpack_require__.n(nedb_promise__WEBPACK_IMPORTED_MODULE_0__);

class HotelStore {
  constructor({
    filename,
    autoload
  }) {
    this.store = nedb_promise__WEBPACK_IMPORTED_MODULE_0___default()({
      filename,
      autoload
    });
  }

  async find(props) {
    return this.store.find(props);
  }

  async findOne(props) {
    return this.store.findOne(props);
  }

  async insert(hotel) {
    let hotelText = hotel.name;

    if (!hotelText) {
      // validation
      throw new Error('Missing text property');
    }

    return this.store.insert(hotel);
  }

  async update(props, hotel) {
    return this.store.update(props, hotel);
  }

  async remove(props) {
    return this.store.remove(props);
  }

}
/* harmony default export */ __webpack_exports__["default"] = (new HotelStore({
  filename: './db/hotels.json',
  autoload: true
}));

/***/ }),

/***/ "./src/index.js":
/*!**********************!*\
  !*** ./src/index.js ***!
  \**********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _utils__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ./utils */ "./src/utils/index.js");
/* harmony import */ var _hotels__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./hotels */ "./src/hotels/index.js");
/* harmony import */ var _auth__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./auth */ "./src/auth/index.js");
/* harmony import */ var koa_jwt__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! koa-jwt */ "koa-jwt");
/* harmony import */ var koa_jwt__WEBPACK_IMPORTED_MODULE_3___default = /*#__PURE__*/__webpack_require__.n(koa_jwt__WEBPACK_IMPORTED_MODULE_3__);


const Koa = __webpack_require__(/*! koa */ "koa");

const app = new Koa();

const server = __webpack_require__(/*! http */ "http").createServer(app.callback());

const WebSocket = __webpack_require__(/*! ws */ "ws");

const wss = new WebSocket.Server({
  server
});

const Router = __webpack_require__(/*! koa-router */ "koa-router");

const cors = __webpack_require__(/*! koa-cors */ "koa-cors");

const bodyparser = __webpack_require__(/*! koa-bodyparser */ "koa-bodyparser");

const {
  timingLogger,
  exceptionHandler,
  initWss
} = __webpack_require__(/*! ./utils */ "./src/utils/index.js");




initWss(wss);
app.use(bodyparser());
app.use(cors());
app.use(timingLogger);
app.use(exceptionHandler);
const prefix = '/api'; // public

const publicApiRouter = new Router({
  prefix
});
publicApiRouter.use('/auth', _auth__WEBPACK_IMPORTED_MODULE_2__["router"].routes());
app.use(publicApiRouter.routes()).use(publicApiRouter.allowedMethods());
app.use(koa_jwt__WEBPACK_IMPORTED_MODULE_3___default()(_utils__WEBPACK_IMPORTED_MODULE_0__["jwtConfig"])); // protected

const protectedApiRouter = new Router({
  prefix
});
protectedApiRouter.use('/hotel', _hotels__WEBPACK_IMPORTED_MODULE_1__["router"].routes());
app.use(protectedApiRouter.routes()).use(protectedApiRouter.allowedMethods());
server.listen(3000);
console.log('started on port 3000');

/***/ }),

/***/ "./src/utils/constants.js":
/*!********************************!*\
  !*** ./src/utils/constants.js ***!
  \********************************/
/*! exports provided: jwtConfig */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "jwtConfig", function() { return jwtConfig; });
const jwtConfig = {
  secret: 'my-secret'
};

/***/ }),

/***/ "./src/utils/index.js":
/*!****************************!*\
  !*** ./src/utils/index.js ***!
  \****************************/
/*! exports provided: jwtConfig, timingLogger, exceptionHandler, initWss, broadcast */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _constants__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ./constants */ "./src/utils/constants.js");
/* harmony reexport (safe) */ __webpack_require__.d(__webpack_exports__, "jwtConfig", function() { return _constants__WEBPACK_IMPORTED_MODULE_0__["jwtConfig"]; });

/* harmony import */ var _middlewares__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./middlewares */ "./src/utils/middlewares.js");
/* harmony reexport (safe) */ __webpack_require__.d(__webpack_exports__, "timingLogger", function() { return _middlewares__WEBPACK_IMPORTED_MODULE_1__["timingLogger"]; });

/* harmony reexport (safe) */ __webpack_require__.d(__webpack_exports__, "exceptionHandler", function() { return _middlewares__WEBPACK_IMPORTED_MODULE_1__["exceptionHandler"]; });

/* harmony import */ var _wss__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./wss */ "./src/utils/wss.js");
/* harmony reexport (safe) */ __webpack_require__.d(__webpack_exports__, "initWss", function() { return _wss__WEBPACK_IMPORTED_MODULE_2__["initWss"]; });

/* harmony reexport (safe) */ __webpack_require__.d(__webpack_exports__, "broadcast", function() { return _wss__WEBPACK_IMPORTED_MODULE_2__["broadcast"]; });





/***/ }),

/***/ "./src/utils/middlewares.js":
/*!**********************************!*\
  !*** ./src/utils/middlewares.js ***!
  \**********************************/
/*! exports provided: timingLogger, exceptionHandler */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "timingLogger", function() { return timingLogger; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "exceptionHandler", function() { return exceptionHandler; });
const timingLogger = async (ctx, next) => {
  const start = new Date();
  await next();
  const ms = new Date() - start;
  console.log(`${ctx.method} ${ctx.url} ${ctx.response.status} - ${ms}ms`);
};
const exceptionHandler = async (ctx, next) => {
  try {
    return await next();
  } catch (err) {
    console.log(err);
    ctx.response.body = {
      issue: [{
        error: err.message || 'Unexpected error'
      }]
    };
    ctx.response.status = 500;
  }
};

/***/ }),

/***/ "./src/utils/wss.js":
/*!**************************!*\
  !*** ./src/utils/wss.js ***!
  \**************************/
/*! exports provided: initWss, broadcast */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "initWss", function() { return initWss; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "broadcast", function() { return broadcast; });
/* harmony import */ var jsonwebtoken__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! jsonwebtoken */ "jsonwebtoken");
/* harmony import */ var jsonwebtoken__WEBPACK_IMPORTED_MODULE_0___default = /*#__PURE__*/__webpack_require__.n(jsonwebtoken__WEBPACK_IMPORTED_MODULE_0__);
/* harmony import */ var _constants__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./constants */ "./src/utils/constants.js");



const WebSocket = __webpack_require__(/*! ws */ "ws");

let wss;
const initWss = value => {
  wss = value;
  wss.on('connection', ws => {
    ws.on('message', message => {
      const {
        type,
        payload: {
          token
        }
      } = JSON.parse(message);

      if (type !== 'authorization') {
        ws.close();
        return;
      }

      try {
        ws.user = jsonwebtoken__WEBPACK_IMPORTED_MODULE_0___default.a.verify(token, _constants__WEBPACK_IMPORTED_MODULE_1__["jwtConfig"].secret);
      } catch (err) {
        ws.close();
      }
    });
  });
};
const broadcast = (userId, data) => {
  if (!wss) {
    return;
  }

  wss.clients.forEach(client => {
    if (client.readyState === WebSocket.OPEN && userId === client.user._id) {
      console.log(`broadcast sent to ${client.user.username}`);
      client.send(JSON.stringify(data));
    }
  });
};

/***/ }),

/***/ 0:
/*!****************************!*\
  !*** multi ./src/index.js ***!
  \****************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! C:\DATA\UBB\AN 3\I\MA - Mobile Applications\lab\ANDROID\Hotel Manager Server\src/index.js */"./src/index.js");


/***/ }),

/***/ "fs":
/*!*********************!*\
  !*** external "fs" ***!
  \*********************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = require("fs");

/***/ }),

/***/ "http":
/*!***********************!*\
  !*** external "http" ***!
  \***********************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = require("http");

/***/ }),

/***/ "jsonwebtoken":
/*!*******************************!*\
  !*** external "jsonwebtoken" ***!
  \*******************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = require("jsonwebtoken");

/***/ }),

/***/ "koa":
/*!**********************!*\
  !*** external "koa" ***!
  \**********************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = require("koa");

/***/ }),

/***/ "koa-bodyparser":
/*!*********************************!*\
  !*** external "koa-bodyparser" ***!
  \*********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = require("koa-bodyparser");

/***/ }),

/***/ "koa-cors":
/*!***************************!*\
  !*** external "koa-cors" ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = require("koa-cors");

/***/ }),

/***/ "koa-jwt":
/*!**************************!*\
  !*** external "koa-jwt" ***!
  \**************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = require("koa-jwt");

/***/ }),

/***/ "koa-router":
/*!*****************************!*\
  !*** external "koa-router" ***!
  \*****************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = require("koa-router");

/***/ }),

/***/ "nedb-promise":
/*!*******************************!*\
  !*** external "nedb-promise" ***!
  \*******************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = require("nedb-promise");

/***/ }),

/***/ "ws":
/*!*********************!*\
  !*** external "ws" ***!
  \*********************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = require("ws");

/***/ })

/******/ });
//# sourceMappingURL=main.map