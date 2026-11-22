package(default_visibility = ["//visibility:public"])

genrule(
    name = "all",
    testonly = 1,
    srcs = [
        "//org.eclipse.jgit:jgit",
        "//org.eclipse.jgit.lfs:jgit-lfs",
    ],
    outs = ["all.zip"],
    cmd = " && ".join([
        "p=$$PWD",
        "t=$$(mktemp -d || mktemp -d -t bazel-tmp)",
        "cp $(SRCS) $$t",
        "cd $$t",
        "zip -qr $$p/$@ .",
    ]),
)
