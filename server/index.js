//@ts-check

const ldapjs = require("ldapjs");

const server = ldapjs.createServer();
server.search("o=buz", (/** @type ldapjs.LDAPMessage */ req, res, next) => {
  console.log(req.dn.toString());
  res.end();
});

server.listen(389);
