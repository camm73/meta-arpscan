SUMMARY = "Layer for building royhills/arp-scan"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/royhills/arp-scan/"

SRC_REV = "7f88dc0afd10947aca92ff70526a50530b5bae16"

inherit autotools

do_configure_prepend() {
    autotools_do_configure
}

DEPENDS = "libpcap"

RPROVIDES_${PN} += "arp-scan"
