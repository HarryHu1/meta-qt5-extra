DESCRIPTION = "Terminal emulator for the Hawaii desktop environment"
LICENSE = "GPLv2 MIT"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=414fa9eab8935f538d25474667060bd1 \
	file://LICENSE.GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://LICENSE.yat;md5=e1fd7e8dc980533b8d71d81c102cb511 \
"

inherit cmake_qt5 hawaii-git-submodule

DEPENDS = "qtbase qtdeclarative qtquickcontrols"

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=dev"
SRCREV = "27a981a50ea8db753097c6726db2396b901921da"
PV = "0.2.0+git${SRCPV}"

S = "${WORKDIR}/git"
