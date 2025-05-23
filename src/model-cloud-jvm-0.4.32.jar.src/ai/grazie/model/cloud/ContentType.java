/*     */ package ai.grazie.model.cloud;
/*     */ 
/*     */ @Serializable(with = ContentType.Serializer.class)
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\013\b\b\030\000 \0242\0020\001:\t\022\023\024\025\026\027\030\031\032B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005J\t\020\t\032\0020\003HÆ\003J\t\020\n\032\0020\003HÆ\003J\035\020\013\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\001HÖ\003J\t\020\017\032\0020\020HÖ\001J\b\020\021\032\0020\003H\026R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\007¨\006\033"}, d2 = {"Lai/grazie/model/cloud/ContentType;", "", "type", "", "subtype", "(Ljava/lang/String;Ljava/lang/String;)V", "getSubtype", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Application", "Audio", "Companion", "Image", "Message", "MultiPart", "Serializer", "Text", "Video", "model-cloud"})
/*     */ public final class ContentType {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*   9 */   public ContentType(@NotNull String type, @NotNull String subtype) { this.type = type; this.subtype = subtype; } @NotNull private final String type; @NotNull private final String subtype; @NotNull public final String getType() { return this.type; } @NotNull public final String getSubtype() { return this.subtype; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/model/cloud/ContentType$Companion;", "", "()V", "parse", "Lai/grazie/model/cloud/ContentType;", "text", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model-cloud"}) @SourceDebugExtension({"SMAP\nContentType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentType.kt\nai/grazie/model/cloud/ContentType$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1557#2:135\n1628#2,3:136\n*S KotlinDebug\n*F\n+ 1 ContentType.kt\nai/grazie/model/cloud/ContentType$Companion\n*L\n12#1:135\n12#1:136,3\n*E\n"}) public static final class Companion { private Companion() {} @NotNull
/*  10 */     public final KSerializer<ContentType> serializer() { return (KSerializer<ContentType>)ContentType.Serializer.INSTANCE; } @NotNull
/*     */     public final ContentType parse(@NotNull String text) {
/*  12 */       Intrinsics.checkNotNullParameter(text, "text"); String[] arrayOfString = new String[1]; arrayOfString[0] = "/"; Iterable $this$map$iv = StringsKt.split$default(text, arrayOfString, false, 0, 6, null); int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 135 */       Iterable iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 136 */       for (Object item$iv$iv : iterable1) {
/* 137 */         String str = (String)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-ContentType$Companion$parse$1 = 0; collection.add(StringsKt.trim(str).toString());
/* 138 */       }  List<String> list = (List)destination$iv$iv;
/*     */       String type = list.get(0), subtype = list.get(1);
/*     */       return new ContentType(type, subtype);
/*     */     } }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/model/cloud/ContentType$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/model/cloud/ContentType;", "()V", "model-cloud"})
/*     */   public static final class Serializer extends StringValueClassSerializer<ContentType> {
/*     */     @NotNull
/*     */     public static final Serializer INSTANCE = new Serializer();
/*     */     
/*     */     private Serializer() {
/*     */       super("ContentType", null.INSTANCE, null.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return this.type + "/" + this.type;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.type;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.subtype;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ContentType copy(@NotNull String type, @NotNull String subtype) {
/*     */     Intrinsics.checkNotNullParameter(type, "type");
/*     */     Intrinsics.checkNotNullParameter(subtype, "subtype");
/*     */     return new ContentType(type, subtype);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.type.hashCode();
/*     */     return result * 31 + this.subtype.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ContentType))
/*     */       return false; 
/*     */     ContentType contentType = (ContentType)other;
/*     */     return !Intrinsics.areEqual(this.type, contentType.type) ? false : (!!Intrinsics.areEqual(this.subtype, contentType.subtype));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b-\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006R\021\020\017\032\0020\004¢\006\b\n\000\032\004\b\020\020\006R\021\020\021\032\0020\004¢\006\b\n\000\032\004\b\022\020\006R\021\020\023\032\0020\004¢\006\b\n\000\032\004\b\024\020\006R\021\020\025\032\0020\004¢\006\b\n\000\032\004\b\026\020\006R\021\020\027\032\0020\004¢\006\b\n\000\032\004\b\030\020\006R\021\020\031\032\0020\004¢\006\b\n\000\032\004\b\032\020\006R\021\020\033\032\0020\004¢\006\b\n\000\032\004\b\034\020\006R\021\020\035\032\0020\004¢\006\b\n\000\032\004\b\036\020\006R\021\020\037\032\0020\004¢\006\b\n\000\032\004\b \020\006R\021\020!\032\0020\004¢\006\b\n\000\032\004\b\"\020\006R\021\020#\032\0020\004¢\006\b\n\000\032\004\b$\020\006R\021\020%\032\0020\004¢\006\b\n\000\032\004\b&\020\006R\021\020'\032\0020\004¢\006\b\n\000\032\004\b(\020\006R\021\020)\032\0020\004¢\006\b\n\000\032\004\b*\020\006R\021\020+\032\0020\004¢\006\b\n\000\032\004\b,\020\006R\021\020-\032\0020\004¢\006\b\n\000\032\004\b.\020\006R\021\020/\032\0020\004¢\006\b\n\000\032\004\b0\020\006¨\0061"}, d2 = {"Lai/grazie/model/cloud/ContentType$Application;", "", "()V", "Any", "Lai/grazie/model/cloud/ContentType;", "getAny", "()Lai/grazie/model/cloud/ContentType;", "Atom", "getAtom", "Cbor", "getCbor", "DocX", "getDocX", "Epub", "getEpub", "FontWoff", "getFontWoff", "FormUrlEncoded", "getFormUrlEncoded", "GZip", "getGZip", "HalJson", "getHalJson", "JavaScript", "getJavaScript", "Json", "getJson", "OctetStream", "getOctetStream", "Odt", "getOdt", "PDF", "getPDF", "ProblemJson", "getProblemJson", "ProblemXml", "getProblemXml", "ProtoBuf", "getProtoBuf", "RSS", "getRSS", "WASM", "getWASM", "Xml", "getXml", "Xml_Dtd", "getXml_Dtd", "Zip", "getZip", "model-cloud"})
/*     */   public static final class Application {
/*     */     @NotNull
/*     */     public static final Application INSTANCE = new Application();
/*     */     @NotNull
/*     */     private static final ContentType Any = new ContentType("application", "*");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getAny() {
/*     */       return Any;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Atom = new ContentType("application", "atom+xml");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getAtom() {
/*     */       return Atom;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType DocX = new ContentType("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getDocX() {
/*     */       return DocX;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Odt = new ContentType("application", "vnd.oasis.opendocument.text");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getOdt() {
/*     */       return Odt;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Cbor = new ContentType("application", "cbor");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getCbor() {
/*     */       return Cbor;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Json = new ContentType("application", "json");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getJson() {
/*     */       return Json;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType HalJson = new ContentType("application", "hal+json");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getHalJson() {
/*     */       return HalJson;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType JavaScript = new ContentType("application", "javascript");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getJavaScript() {
/*     */       return JavaScript;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType OctetStream = new ContentType("application", "octet-stream");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getOctetStream() {
/*     */       return OctetStream;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType FontWoff = new ContentType("application", "font-woff");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getFontWoff() {
/*     */       return FontWoff;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType RSS = new ContentType("application", "rss+xml");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getRSS() {
/*     */       return RSS;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Xml = new ContentType("application", "xml");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getXml() {
/*     */       return Xml;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Xml_Dtd = new ContentType("application", "xml-dtd");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getXml_Dtd() {
/*     */       return Xml_Dtd;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Zip = new ContentType("application", "zip");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getZip() {
/*     */       return Zip;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType GZip = new ContentType("application", "gzip");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getGZip() {
/*     */       return GZip;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getFormUrlEncoded() {
/*     */       return FormUrlEncoded;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType FormUrlEncoded = new ContentType("application", "x-www-form-urlencoded");
/*     */     @NotNull
/*     */     private static final ContentType PDF = new ContentType("application", "pdf");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getPDF() {
/*     */       return PDF;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Epub = new ContentType("application", "epub+zip");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getEpub() {
/*     */       return Epub;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType ProtoBuf = new ContentType("application", "protobuf");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getProtoBuf() {
/*     */       return ProtoBuf;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType WASM = new ContentType("application", "wasm");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getWASM() {
/*     */       return WASM;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType ProblemJson = new ContentType("application", "problem+json");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getProblemJson() {
/*     */       return ProblemJson;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType ProblemXml = new ContentType("application", "problem+xml");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getProblemXml() {
/*     */       return ProblemXml;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\t\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006¨\006\r"}, d2 = {"Lai/grazie/model/cloud/ContentType$Audio;", "", "()V", "Any", "Lai/grazie/model/cloud/ContentType;", "getAny", "()Lai/grazie/model/cloud/ContentType;", "MP4", "getMP4", "MPEG", "getMPEG", "OGG", "getOGG", "model-cloud"})
/*     */   public static final class Audio {
/*     */     @NotNull
/*     */     public static final Audio INSTANCE = new Audio();
/*     */     @NotNull
/*     */     private static final ContentType Any = new ContentType("audio", "*");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getAny() {
/*     */       return Any;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType MP4 = new ContentType("audio", "mp4");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getMP4() {
/*     */       return MP4;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType MPEG = new ContentType("audio", "mpeg");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getMPEG() {
/*     */       return MPEG;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType OGG = new ContentType("audio", "ogg");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getOGG() {
/*     */       return OGG;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\023\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\b\022\004\022\0020\0050\004¢\006\n\n\002\020\b\032\004\b\006\020\007R\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\013R\021\020\016\032\0020\005¢\006\b\n\000\032\004\b\017\020\013R\021\020\020\032\0020\005¢\006\b\n\000\032\004\b\021\020\013R\021\020\022\032\0020\005¢\006\b\n\000\032\004\b\023\020\013R\021\020\024\032\0020\005¢\006\b\n\000\032\004\b\025\020\013R\021\020\026\032\0020\005¢\006\b\n\000\032\004\b\027\020\013¨\006\030"}, d2 = {"Lai/grazie/model/cloud/ContentType$Image;", "", "()V", "All", "", "Lai/grazie/model/cloud/ContentType;", "getAll", "()[Lai/grazie/model/cloud/ContentType;", "[Lai/grazie/model/cloud/ContentType;", "Any", "getAny", "()Lai/grazie/model/cloud/ContentType;", "GIF", "getGIF", "JPEG", "getJPEG", "PNG", "getPNG", "SVG", "getSVG", "WebP", "getWebP", "XIcon", "getXIcon", "model-cloud"})
/*     */   public static final class Image {
/*     */     @NotNull
/*     */     public static final Image INSTANCE = new Image();
/*     */     @NotNull
/*     */     private static final ContentType Any = new ContentType("image", "*");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getAny() {
/*     */       return Any;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType GIF = new ContentType("image", "gif");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getGIF() {
/*     */       return GIF;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType JPEG = new ContentType("image", "jpeg");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getJPEG() {
/*     */       return JPEG;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType PNG = new ContentType("image", "png");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getPNG() {
/*     */       return PNG;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType SVG = new ContentType("image", "svg+xml");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getSVG() {
/*     */       return SVG;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType XIcon = new ContentType("image", "x-icon");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getXIcon() {
/*     */       return XIcon;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType WebP = new ContentType("image", "webp");
/*     */     @NotNull
/*     */     private static final ContentType[] All;
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getWebP() {
/*     */       return WebP;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ContentType[] getAll() {
/*     */       return All;
/*     */     }
/*     */     
/*     */     static {
/*     */       ContentType[] arrayOfContentType = new ContentType[7];
/*     */       arrayOfContentType[0] = Any;
/*     */       arrayOfContentType[1] = GIF;
/*     */       arrayOfContentType[2] = JPEG;
/*     */       arrayOfContentType[3] = PNG;
/*     */       arrayOfContentType[4] = SVG;
/*     */       arrayOfContentType[5] = XIcon;
/*     */       arrayOfContentType[6] = WebP;
/*     */       All = arrayOfContentType;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/model/cloud/ContentType$Message;", "", "()V", "Any", "Lai/grazie/model/cloud/ContentType;", "getAny", "()Lai/grazie/model/cloud/ContentType;", "Http", "getHttp", "model-cloud"})
/*     */   public static final class Message {
/*     */     @NotNull
/*     */     public static final Message INSTANCE = new Message();
/*     */     @NotNull
/*     */     private static final ContentType Any = new ContentType("message", "*");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getAny() {
/*     */       return Any;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Http = new ContentType("message", "http");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getHttp() {
/*     */       return Http;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\021\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006R\021\020\017\032\0020\004¢\006\b\n\000\032\004\b\020\020\006R\021\020\021\032\0020\004¢\006\b\n\000\032\004\b\022\020\006R\021\020\023\032\0020\004¢\006\b\n\000\032\004\b\024\020\006¨\006\025"}, d2 = {"Lai/grazie/model/cloud/ContentType$MultiPart;", "", "()V", "Alternative", "Lai/grazie/model/cloud/ContentType;", "getAlternative", "()Lai/grazie/model/cloud/ContentType;", "Any", "getAny", "ByteRanges", "getByteRanges", "Encrypted", "getEncrypted", "FormData", "getFormData", "Mixed", "getMixed", "Related", "getRelated", "Signed", "getSigned", "model-cloud"})
/*     */   public static final class MultiPart {
/*     */     @NotNull
/*     */     public static final MultiPart INSTANCE = new MultiPart();
/*     */     @NotNull
/*     */     private static final ContentType Any = new ContentType("multipart", "*");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getAny() {
/*     */       return Any;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Mixed = new ContentType("multipart", "mixed");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getMixed() {
/*     */       return Mixed;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Alternative = new ContentType("multipart", "alternative");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getAlternative() {
/*     */       return Alternative;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Related = new ContentType("multipart", "related");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getRelated() {
/*     */       return Related;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType FormData = new ContentType("multipart", "form-data");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getFormData() {
/*     */       return FormData;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Signed = new ContentType("multipart", "signed");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getSigned() {
/*     */       return Signed;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Encrypted = new ContentType("multipart", "encrypted");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getEncrypted() {
/*     */       return Encrypted;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType ByteRanges = new ContentType("multipart", "byteranges");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getByteRanges() {
/*     */       return ByteRanges;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\027\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006R\021\020\017\032\0020\004¢\006\b\n\000\032\004\b\020\020\006R\021\020\021\032\0020\004¢\006\b\n\000\032\004\b\022\020\006R\021\020\023\032\0020\004¢\006\b\n\000\032\004\b\024\020\006R\021\020\025\032\0020\004¢\006\b\n\000\032\004\b\026\020\006R\021\020\027\032\0020\004¢\006\b\n\000\032\004\b\030\020\006R\021\020\031\032\0020\004¢\006\b\n\000\032\004\b\032\020\006¨\006\033"}, d2 = {"Lai/grazie/model/cloud/ContentType$Text;", "", "()V", "Any", "Lai/grazie/model/cloud/ContentType;", "getAny", "()Lai/grazie/model/cloud/ContentType;", "CSS", "getCSS", "CSV", "getCSV", "EventStream", "getEventStream", "Html", "getHtml", "JavaScript", "getJavaScript", "Markdown", "getMarkdown", "Plain", "getPlain", "RTF", "getRTF", "VCard", "getVCard", "XML", "getXML", "model-cloud"})
/*     */   public static final class Text {
/*     */     @NotNull
/*     */     public static final Text INSTANCE = new Text();
/*     */     @NotNull
/*     */     private static final ContentType Any = new ContentType("text", "*");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getAny() {
/*     */       return Any;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Plain = new ContentType("text", "plain");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getPlain() {
/*     */       return Plain;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType CSS = new ContentType("text", "css");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getCSS() {
/*     */       return CSS;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType CSV = new ContentType("text", "csv");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getCSV() {
/*     */       return CSV;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Html = new ContentType("text", "html");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getHtml() {
/*     */       return Html;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType Markdown = new ContentType("text", "markdown");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getMarkdown() {
/*     */       return Markdown;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType RTF = new ContentType("text", "rtf");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getRTF() {
/*     */       return RTF;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType JavaScript = new ContentType("text", "javascript");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getJavaScript() {
/*     */       return JavaScript;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType VCard = new ContentType("text", "vcard");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getVCard() {
/*     */       return VCard;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType XML = new ContentType("text", "xml");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getXML() {
/*     */       return XML;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType EventStream = new ContentType("text", "event-stream");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getEventStream() {
/*     */       return EventStream;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\013\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006¨\006\017"}, d2 = {"Lai/grazie/model/cloud/ContentType$Video;", "", "()V", "Any", "Lai/grazie/model/cloud/ContentType;", "getAny", "()Lai/grazie/model/cloud/ContentType;", "MP4", "getMP4", "MPEG", "getMPEG", "OGG", "getOGG", "QuickTime", "getQuickTime", "model-cloud"})
/*     */   public static final class Video {
/*     */     @NotNull
/*     */     public static final Video INSTANCE = new Video();
/*     */     @NotNull
/*     */     private static final ContentType Any = new ContentType("video", "*");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getAny() {
/*     */       return Any;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType MPEG = new ContentType("video", "mpeg");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getMPEG() {
/*     */       return MPEG;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType MP4 = new ContentType("video", "mp4");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getMP4() {
/*     */       return MP4;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType OGG = new ContentType("video", "ogg");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getOGG() {
/*     */       return OGG;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final ContentType QuickTime = new ContentType("video", "quicktime");
/*     */     
/*     */     @NotNull
/*     */     public final ContentType getQuickTime() {
/*     */       return QuickTime;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\ContentType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */