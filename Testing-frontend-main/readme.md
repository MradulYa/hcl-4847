# Testing

1. unit testing -> isolation
2. Integrated Testing
3. End to end Testing

NodeJs bydefault support inbuild testing framework from node >=23 version

> node-test > create simple node app

> npm init -y

update package.json

create app.js in node-test

```
export const greet = (name) => {
  return `Hello, ${name}`;
};
```

export here signify that the method should be used by other file

## Jest framework with React and Vite

> create a react app using npm create vite@latest

install below package under developer dependency

> npm install -D jest babel-jest @babel/core@^7 @babel preset-env@^7 @babel/preset-react@^7

> npm i -D jest-environment-jsdom @testing-library/react @testing-library/jest-dom @testing-library/user-event

> npm install -D identity-obj-proxy

add these files in folder

1. babel.config.js -> root folder
2. jest.config.js -> root folder
3. src/setupTests.js

update package.json

```
"scripts": {
    "dev": "vite",
    "test": "jest",
    "test:watch": "jest --watch",
    "test:coverage": "jest --coverage",
    "build": "vite build",
    "lint": "eslint .",
    "preview": "vite preview"
  },
```

## Create first test using jest in react
