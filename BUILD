load("@rules_java//java:defs.bzl", "java_binary", "java_library")

java_binary(
    name = "my_java_app",
    main_class = "com.example.App",
    srcs = glob(["src/main/java/com/example/*.java"]),
    deps = ["lib/commons-lang3-3.20.0.jar"],
)

java_library(
    name = "my_library",
    srcs = glob(["src/main/java/com/example/mylibrary/*.java"]),
    visibility = ["//visibility:public"],
)