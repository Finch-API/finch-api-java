# Changelog

## 0.3.0 (2023-08-29)

Full Changelog: [v0.2.4...v0.3.0](https://github.com/Finch-API/finch-api-java/compare/v0.2.4...v0.3.0)

### ⚠ BREAKING CHANGES

* **client:** restructure some methods ([#59](https://github.com/Finch-API/finch-api-java/issues/59))

### Features

* **client:** restructure some methods ([#59](https://github.com/Finch-API/finch-api-java/issues/59)) ([4a53cb8](https://github.com/Finch-API/finch-api-java/commit/4a53cb840a3a61a272f3a81071fe870564a1b59c))


### Chores

* **ci:** setup workflows to create releases and release PRs ([#56](https://github.com/Finch-API/finch-api-java/issues/56)) ([09f532d](https://github.com/Finch-API/finch-api-java/commit/09f532d1717713f532dd83e1c718d2d66a1fdccd))

## [0.2.4](https://github.com/Finch-API/finch-api-java/compare/v0.2.3...v0.2.4) (2023-08-26)


### Chores

* **internal:** minor code re-ordering ([#52](https://github.com/Finch-API/finch-api-java/issues/52)) ([982b0f8](https://github.com/Finch-API/finch-api-java/commit/982b0f841a2c5f5b1d5c4b3a07e8e6bfd01f5ede))
* **internal:** remove reviewer ([#54](https://github.com/Finch-API/finch-api-java/issues/54)) ([8918d16](https://github.com/Finch-API/finch-api-java/commit/8918d165f8a69bb0b4733262ec23c0bfce0e2b6c))

## [0.2.3](https://github.com/Finch-API/finch-api-java/compare/v0.2.2...v0.2.3) (2023-08-16)


### Features

* **ci:** add a publish-sonatype workflow for manual running ([#38](https://github.com/Finch-API/finch-api-java/issues/38)) ([955e06f](https://github.com/Finch-API/finch-api-java/commit/955e06ff1870a413af1f4c172a6a5fe0ce1a9190))
* default timeout is set for java clients ([#46](https://github.com/Finch-API/finch-api-java/issues/46)) ([81cf300](https://github.com/Finch-API/finch-api-java/commit/81cf3009cdea49ead9c289e584bcd45b0d2f9c1e))
* generate addXxx methods for array types ([#48](https://github.com/Finch-API/finch-api-java/issues/48)) ([b09c620](https://github.com/Finch-API/finch-api-java/commit/b09c620b1c0eba7a68ab247682c37068a6d674c6))


### Bug Fixes

* set correct timeouts on okhttp client ([#49](https://github.com/Finch-API/finch-api-java/issues/49)) ([e4d644c](https://github.com/Finch-API/finch-api-java/commit/e4d644cf115662f552a6686d083f8b57d1f2fb4a))


### Chores

* assign default reviewers to release PRs ([#47](https://github.com/Finch-API/finch-api-java/issues/47)) ([d68e3ca](https://github.com/Finch-API/finch-api-java/commit/d68e3cadfb2c47fb7f9b8faf7cb7d51441625b15))
* **ci:** allow release to proceed without signing key id secret ([#43](https://github.com/Finch-API/finch-api-java/issues/43)) ([eb68631](https://github.com/Finch-API/finch-api-java/commit/eb68631766141498cc548a3bca4cf208bc3c6904))
* **internal:** add `codegen.log` to `.gitignore` ([#36](https://github.com/Finch-API/finch-api-java/issues/36)) ([fdb1391](https://github.com/Finch-API/finch-api-java/commit/fdb13916e3c44f4cc98cfa9201e8157c08bda562))
* **internal:** publish with --stacktrace for more helpful error information ([#40](https://github.com/Finch-API/finch-api-java/issues/40)) ([9837fbf](https://github.com/Finch-API/finch-api-java/commit/9837fbfe20c813ffbd72e5a9d6537502cea25b09))
* **internal:** reorganize types ([#44](https://github.com/Finch-API/finch-api-java/issues/44)) ([6e16f39](https://github.com/Finch-API/finch-api-java/commit/6e16f39e868a9687cdffadc2b5b4eadb4f95851d))
* **internal:** support passing GPG_SIGNING_KEY_ID from secrets ([#42](https://github.com/Finch-API/finch-api-java/issues/42)) ([8559c90](https://github.com/Finch-API/finch-api-java/commit/8559c90c4b58fe66b04749edf22a83bd7da56f7a))

## [0.2.2](https://github.com/Finch-API/finch-api-java/compare/v0.2.1...v0.2.2) (2023-07-22)


### Bug Fixes

* auto-close responses even if an exception is thrown during deserialization ([#33](https://github.com/Finch-API/finch-api-java/issues/33)) ([b428fc2](https://github.com/Finch-API/finch-api-java/commit/b428fc2817885e74e13b4eeee6354f627768b80b))


### Chores

* reformatting and response auto-closing ([#34](https://github.com/Finch-API/finch-api-java/issues/34)) ([a923265](https://github.com/Finch-API/finch-api-java/commit/a923265e3df98118a4530c226815c85c995b7ecd))

## [0.2.1](https://github.com/Finch-API/finch-api-java/compare/v0.2.0...v0.2.1) (2023-07-17)


### Chores

* unreleased changes ([#30](https://github.com/Finch-API/finch-api-java/issues/30)) ([adcffe5](https://github.com/Finch-API/finch-api-java/commit/adcffe5e01386f00977e7b3e59691f9e0cdc6a6c))

## [0.2.0](https://github.com/Finch-API/finch-api-java/compare/v0.1.0...v0.2.0) (2023-06-29)


### ⚠ BREAKING CHANGES

* improve pagination response types ([#16](https://github.com/Finch-API/finch-api-java/issues/16))

### Features

* add JsonValue.convert method ([#14](https://github.com/Finch-API/finch-api-java/issues/14)) ([c8e25a8](https://github.com/Finch-API/finch-api-java/commit/c8e25a8c6d6984f72d807f496a362f9c2267915a))
* **core:** add `asUnknown` to `JsonField` ([#17](https://github.com/Finch-API/finch-api-java/issues/17)) ([7f1a599](https://github.com/Finch-API/finch-api-java/commit/7f1a59990c62892bbc1906b1bf20c0638da165f5))
* improve pagination response types ([#16](https://github.com/Finch-API/finch-api-java/issues/16)) ([dd55fad](https://github.com/Finch-API/finch-api-java/commit/dd55fad7654c196d1f7d91c6e5e4cc50b8a57980))
* **tests:** support specifying `SKIP_MOCK_TESTS=true` ([#18](https://github.com/Finch-API/finch-api-java/issues/18)) ([54f4511](https://github.com/Finch-API/finch-api-java/commit/54f4511903408094aa10ba2f4ce4a4b2c180fbb7))


### Chores

* **internal:** add explicit type annotations to `validate()` ([#15](https://github.com/Finch-API/finch-api-java/issues/15)) ([6346363](https://github.com/Finch-API/finch-api-java/commit/6346363ca201d194158d3366e34a8b5d71a48866))
* **internal:** added version comment ([#12](https://github.com/Finch-API/finch-api-java/issues/12)) ([fde66a8](https://github.com/Finch-API/finch-api-java/commit/fde66a85f4f93c9fe8bd43d36c333dfc5d0ed554))
* **internal:** cleaner asUnknown implementation ([#19](https://github.com/Finch-API/finch-api-java/issues/19)) ([c2ff924](https://github.com/Finch-API/finch-api-java/commit/c2ff92488d9cf79dd8d26fb2ee9f264379c6a654))
* **internal:** remove unused check-test-server script ([#20](https://github.com/Finch-API/finch-api-java/issues/20)) ([27ddf0c](https://github.com/Finch-API/finch-api-java/commit/27ddf0cfa71d1a3e5aa4b628773a978c19ebeeef))


### Documentation

* add trailing newlines ([#27](https://github.com/Finch-API/finch-api-java/issues/27)) ([0e6eac9](https://github.com/Finch-API/finch-api-java/commit/0e6eac94270e3411bad15aea9d28a6920a718c3f))
* improve some naming ([#23](https://github.com/Finch-API/finch-api-java/issues/23)) ([fb6d2d0](https://github.com/Finch-API/finch-api-java/commit/fb6d2d05e8cb383f5afa0d280fa30f0c470abe51))
* point to github repo instead of email contact ([#22](https://github.com/Finch-API/finch-api-java/issues/22)) ([b0d04b0](https://github.com/Finch-API/finch-api-java/commit/b0d04b0f66066b277888183c2c7cc9ec5c815777))
* **readme:** fix main example snippet ([#26](https://github.com/Finch-API/finch-api-java/issues/26)) ([5f0a17f](https://github.com/Finch-API/finch-api-java/commit/5f0a17f09cfe37dd70b9870ab3fb69b9c92fc2a1))
* **readme:** update main example ([#25](https://github.com/Finch-API/finch-api-java/issues/25)) ([1b99edd](https://github.com/Finch-API/finch-api-java/commit/1b99edd58e289bfebb29c10b88b7fcdd532ccc59))
