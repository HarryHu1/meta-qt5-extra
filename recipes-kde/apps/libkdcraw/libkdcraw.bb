SUMMARY = "Libkdcraw is a C++ interface around LibRaw library"
LICENSE = "GPLv2 & BSD & LGPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50 \
    file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-apps

DEPENDS += "\
    libraw \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "db4f2dc009fde470e3fdb78a3fe284ae"
SRC_URI[sha256sum] = "42faf081dddeef145abba46774ed240e6f35cc693c16eee76ff931c7c28c851c"
