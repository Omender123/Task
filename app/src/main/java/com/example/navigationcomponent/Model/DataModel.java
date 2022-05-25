package com.example.navigationcomponent.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataModel {

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("notifications")
    @Expose
    private List<Notification> notifications = null;
    @SerializedName("response")
    @Expose
    private Response response;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public class Meta {

        @SerializedName("code")
        @Expose
        private Integer code;
        @SerializedName("requestId")
        @Expose
        private String requestId;

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getRequestId() {
            return requestId;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

    }

    public class Notification {

        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("item")
        @Expose
        private Item item;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Item getItem() {
            return item;
        }

        public void setItem(Item item) {
            this.item = item;
        }

    }

    public class Item {

        @SerializedName("unreadCount")
        @Expose
        private Integer unreadCount;

        public Integer getUnreadCount() {
            return unreadCount;
        }

        public void setUnreadCount(Integer unreadCount) {
            this.unreadCount = unreadCount;
        }

    }

    public class Response {

        @SerializedName("venues")
        @Expose
        private List<Venue> venues = null;
        @SerializedName("confident")
        @Expose
        private Boolean confident;

        public List<Venue> getVenues() {
            return venues;
        }

        public void setVenues(List<Venue> venues) {
            this.venues = venues;
        }

        public Boolean getConfident() {
            return confident;
        }

        public void setConfident(Boolean confident) {
            this.confident = confident;
        }

        public class Venue {

            @SerializedName("id")
            @Expose
            private String id;
            @SerializedName("name")
            @Expose
            private String name;
            @SerializedName("contact")
            @Expose
            private Contact contact;
            @SerializedName("location")
            @Expose
            private Location location;
            @SerializedName("categories")
            @Expose
            private List<Category> categories = null;
            @SerializedName("verified")
            @Expose
            private Boolean verified;
            @SerializedName("stats")
            @Expose
            private Stats stats;
            @SerializedName("url")
            @Expose
            private String url;
            @SerializedName("hasMenu")
            @Expose
            private Boolean hasMenu;
            @SerializedName("menu")
            @Expose
            private Menu menu;
            @SerializedName("allowMenuUrlEdit")
            @Expose
            private Boolean allowMenuUrlEdit;
            @SerializedName("beenHere")
            @Expose
            private BeenHere beenHere;
            @SerializedName("venuePage")
            @Expose
            private VenuePage venuePage;
            @SerializedName("storeId")
            @Expose
            private String storeId;
            @SerializedName("hereNow")
            @Expose
            private HereNow hereNow;
            @SerializedName("referralId")
            @Expose
            private String referralId;
            @SerializedName("venueChains")
            @Expose
            private List<Object> venueChains = null;
            @SerializedName("hasPerk")
            @Expose
            private Boolean hasPerk;
            @SerializedName("venueRatingBlacklisted")
            @Expose
            private Boolean venueRatingBlacklisted;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Contact getContact() {
                return contact;
            }

            public void setContact(Contact contact) {
                this.contact = contact;
            }

            public Location getLocation() {
                return location;
            }

            public void setLocation(Location location) {
                this.location = location;
            }

            public List<Category> getCategories() {
                return categories;
            }

            public void setCategories(List<Category> categories) {
                this.categories = categories;
            }

            public Boolean getVerified() {
                return verified;
            }

            public void setVerified(Boolean verified) {
                this.verified = verified;
            }

            public Stats getStats() {
                return stats;
            }

            public void setStats(Stats stats) {
                this.stats = stats;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public Boolean getHasMenu() {
                return hasMenu;
            }

            public void setHasMenu(Boolean hasMenu) {
                this.hasMenu = hasMenu;
            }

            public Menu getMenu() {
                return menu;
            }

            public void setMenu(Menu menu) {
                this.menu = menu;
            }

            public Boolean getAllowMenuUrlEdit() {
                return allowMenuUrlEdit;
            }

            public void setAllowMenuUrlEdit(Boolean allowMenuUrlEdit) {
                this.allowMenuUrlEdit = allowMenuUrlEdit;
            }

            public BeenHere getBeenHere() {
                return beenHere;
            }

            public void setBeenHere(BeenHere beenHere) {
                this.beenHere = beenHere;
            }

            public VenuePage getVenuePage() {
                return venuePage;
            }

            public void setVenuePage(VenuePage venuePage) {
                this.venuePage = venuePage;
            }

            public String getStoreId() {
                return storeId;
            }

            public void setStoreId(String storeId) {
                this.storeId = storeId;
            }

            public HereNow getHereNow() {
                return hereNow;
            }

            public void setHereNow(HereNow hereNow) {
                this.hereNow = hereNow;
            }

            public String getReferralId() {
                return referralId;
            }

            public void setReferralId(String referralId) {
                this.referralId = referralId;
            }

            public List<Object> getVenueChains() {
                return venueChains;
            }

            public void setVenueChains(List<Object> venueChains) {
                this.venueChains = venueChains;
            }

            public Boolean getHasPerk() {
                return hasPerk;
            }

            public void setHasPerk(Boolean hasPerk) {
                this.hasPerk = hasPerk;
            }

            public Boolean getVenueRatingBlacklisted() {
                return venueRatingBlacklisted;
            }

            public void setVenueRatingBlacklisted(Boolean venueRatingBlacklisted) {
                this.venueRatingBlacklisted = venueRatingBlacklisted;
            }

        }

        public class VenuePage {

            @SerializedName("id")
            @Expose
            private String id;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }



        }
        public class Contact {

            @SerializedName("phone")
            @Expose
            private String phone;
            @SerializedName("formattedPhone")
            @Expose
            private String formattedPhone;
            @SerializedName("twitter")
            @Expose
            private String twitter;
            @SerializedName("instagram")
            @Expose
            private String instagram;
            @SerializedName("facebook")
            @Expose
            private String facebook;
            @SerializedName("facebookUsername")
            @Expose
            private String facebookUsername;
            @SerializedName("facebookName")
            @Expose
            private String facebookName;

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getFormattedPhone() {
                return formattedPhone;
            }

            public void setFormattedPhone(String formattedPhone) {
                this.formattedPhone = formattedPhone;
            }

            public String getTwitter() {
                return twitter;
            }

            public void setTwitter(String twitter) {
                this.twitter = twitter;
            }

            public String getInstagram() {
                return instagram;
            }

            public void setInstagram(String instagram) {
                this.instagram = instagram;
            }

            public String getFacebook() {
                return facebook;
            }

            public void setFacebook(String facebook) {
                this.facebook = facebook;
            }

            public String getFacebookUsername() {
                return facebookUsername;
            }

            public void setFacebookUsername(String facebookUsername) {
                this.facebookUsername = facebookUsername;
            }

            public String getFacebookName() {
                return facebookName;
            }

            public void setFacebookName(String facebookName) {
                this.facebookName = facebookName;
            }

        }
        public class Location {

            @SerializedName("address")
            @Expose
            private String address;
            @SerializedName("crossStreet")
            @Expose
            private String crossStreet;
            @SerializedName("lat")
            @Expose
            private Float lat;
            @SerializedName("lng")
            @Expose
            private Float lng;
            @SerializedName("labeledLatLngs")
            @Expose
            private List<LabeledLatLng> labeledLatLngs = null;
            @SerializedName("distance")
            @Expose
            private Integer distance;
            @SerializedName("postalCode")
            @Expose
            private String postalCode;
            @SerializedName("cc")
            @Expose
            private String cc;
            @SerializedName("city")
            @Expose
            private String city;
            @SerializedName("state")
            @Expose
            private String state;
            @SerializedName("country")
            @Expose
            private String country;
            @SerializedName("formattedAddress")
            @Expose
            private List<String> formattedAddress = null;
            @SerializedName("neighborhood")
            @Expose
            private String neighborhood;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getCrossStreet() {
                return crossStreet;
            }

            public void setCrossStreet(String crossStreet) {
                this.crossStreet = crossStreet;
            }

            public Float getLat() {
                return lat;
            }

            public void setLat(Float lat) {
                this.lat = lat;
            }

            public Float getLng() {
                return lng;
            }

            public void setLng(Float lng) {
                this.lng = lng;
            }

            public List<LabeledLatLng> getLabeledLatLngs() {
                return labeledLatLngs;
            }

            public void setLabeledLatLngs(List<LabeledLatLng> labeledLatLngs) {
                this.labeledLatLngs = labeledLatLngs;
            }

            public Integer getDistance() {
                return distance;
            }

            public void setDistance(Integer distance) {
                this.distance = distance;
            }

            public String getPostalCode() {
                return postalCode;
            }

            public void setPostalCode(String postalCode) {
                this.postalCode = postalCode;
            }

            public String getCc() {
                return cc;
            }

            public void setCc(String cc) {
                this.cc = cc;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public List<String> getFormattedAddress() {
                return formattedAddress;
            }

            public void setFormattedAddress(List<String> formattedAddress) {
                this.formattedAddress = formattedAddress;
            }

            public String getNeighborhood() {
                return neighborhood;
            }

            public void setNeighborhood(String neighborhood) {
                this.neighborhood = neighborhood;
            }

            public class LabeledLatLng {

                @SerializedName("label")
                @Expose
                private String label;
                @SerializedName("lat")
                @Expose
                private Float lat;
                @SerializedName("lng")
                @Expose
                private Float lng;

                public String getLabel() {
                    return label;
                }

                public void setLabel(String label) {
                    this.label = label;
                }

                public Float getLat() {
                    return lat;
                }

                public void setLat(Float lat) {
                    this.lat = lat;
                }

                public Float getLng() {
                    return lng;
                }

                public void setLng(Float lng) {
                    this.lng = lng;
                }

            }
        }
        public class Category {

            @SerializedName("id")
            @Expose
            private String id;
            @SerializedName("name")
            @Expose
            private String name;
            @SerializedName("pluralName")
            @Expose
            private String pluralName;
            @SerializedName("shortName")
            @Expose
            private String shortName;
            @SerializedName("icon")
            @Expose
            private Icon icon;
            @SerializedName("primary")
            @Expose
            private Boolean primary;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPluralName() {
                return pluralName;
            }

            public void setPluralName(String pluralName) {
                this.pluralName = pluralName;
            }

            public String getShortName() {
                return shortName;
            }

            public void setShortName(String shortName) {
                this.shortName = shortName;
            }

            public Icon getIcon() {
                return icon;
            }

            public void setIcon(Icon icon) {
                this.icon = icon;
            }

            public Boolean getPrimary() {
                return primary;
            }

            public void setPrimary(Boolean primary) {
                this.primary = primary;
            }
            public class Icon {

                @SerializedName("prefix")
                @Expose
                private String prefix;
                @SerializedName("suffix")
                @Expose
                private String suffix;

                public String getPrefix() {
                    return prefix;
                }

                public void setPrefix(String prefix) {
                    this.prefix = prefix;
                }

                public String getSuffix() {
                    return suffix;
                }

                public void setSuffix(String suffix) {
                    this.suffix = suffix;
                }

            }
        }
        public class Stats {

            @SerializedName("tipCount")
            @Expose
            private Integer tipCount;
            @SerializedName("usersCount")
            @Expose
            private Integer usersCount;
            @SerializedName("checkinsCount")
            @Expose
            private Integer checkinsCount;

            public Integer getTipCount() {
                return tipCount;
            }

            public void setTipCount(Integer tipCount) {
                this.tipCount = tipCount;
            }

            public Integer getUsersCount() {
                return usersCount;
            }

            public void setUsersCount(Integer usersCount) {
                this.usersCount = usersCount;
            }

            public Integer getCheckinsCount() {
                return checkinsCount;
            }

            public void setCheckinsCount(Integer checkinsCount) {
                this.checkinsCount = checkinsCount;
            }

        }
        public class Menu {

            @SerializedName("type")
            @Expose
            private String type;
            @SerializedName("label")
            @Expose
            private String label;
            @SerializedName("anchor")
            @Expose
            private String anchor;
            @SerializedName("url")
            @Expose
            private String url;
            @SerializedName("mobileUrl")
            @Expose
            private String mobileUrl;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public String getAnchor() {
                return anchor;
            }

            public void setAnchor(String anchor) {
                this.anchor = anchor;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getMobileUrl() {
                return mobileUrl;
            }

            public void setMobileUrl(String mobileUrl) {
                this.mobileUrl = mobileUrl;
            }

        }
        public class BeenHere {

            @SerializedName("lastCheckinExpiredAt")
            @Expose
            private Integer lastCheckinExpiredAt;

            public Integer getLastCheckinExpiredAt() {
                return lastCheckinExpiredAt;
            }

            public void setLastCheckinExpiredAt(Integer lastCheckinExpiredAt) {
                this.lastCheckinExpiredAt = lastCheckinExpiredAt;
            }

        }
        public class HereNow {

            @SerializedName("count")
            @Expose
            private Integer count;
            @SerializedName("summary")
            @Expose
            private String summary;
            @SerializedName("groups")
            @Expose
            private List<Group> groups = null;

            public Integer getCount() {
                return count;
            }

            public void setCount(Integer count) {
                this.count = count;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public List<Group> getGroups() {
                return groups;
            }

            public void setGroups(List<Group> groups) {
                this.groups = groups;
            }
            public class Group {

                @SerializedName("type")
                @Expose
                private String type;
                @SerializedName("name")
                @Expose
                private String name;
                @SerializedName("count")
                @Expose
                private Integer count;
                @SerializedName("items")
                @Expose
                private List<Object> items = null;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public Integer getCount() {
                    return count;
                }

                public void setCount(Integer count) {
                    this.count = count;
                }

                public List<Object> getItems() {
                    return items;
                }

                public void setItems(List<Object> items) {
                    this.items = items;
                }

            }
        }
    }
}
