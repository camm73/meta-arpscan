SUMMARY = "Layer for building royhills/arp-scan"
LICENSE = "MIT"

SRC_URI = "https://github.com/royhills/arp-scan/archive/refs/tags/${PV}.tar.gz"

SRC_URI[sha256sum] = "e03c36e4933c655bd0e4a841272554a347cd0136faf42c4a6564059e0761c039"

inherit autotools

do_configure() {
    autotools_do_configure
    ./configure
}

RDEPENDS_${PN} += "libpcap (>= 1.5)"

RPROVIDES_${PN} += "arp-scan"
