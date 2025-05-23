/*    */ package ai.grazie.model.cloud;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b-\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006R\021\020\017\032\0020\004¢\006\b\n\000\032\004\b\020\020\006R\021\020\021\032\0020\004¢\006\b\n\000\032\004\b\022\020\006R\021\020\023\032\0020\004¢\006\b\n\000\032\004\b\024\020\006R\021\020\025\032\0020\004¢\006\b\n\000\032\004\b\026\020\006R\021\020\027\032\0020\004¢\006\b\n\000\032\004\b\030\020\006R\021\020\031\032\0020\004¢\006\b\n\000\032\004\b\032\020\006R\021\020\033\032\0020\004¢\006\b\n\000\032\004\b\034\020\006R\021\020\035\032\0020\004¢\006\b\n\000\032\004\b\036\020\006R\021\020\037\032\0020\004¢\006\b\n\000\032\004\b \020\006R\021\020!\032\0020\004¢\006\b\n\000\032\004\b\"\020\006R\021\020#\032\0020\004¢\006\b\n\000\032\004\b$\020\006R\021\020%\032\0020\004¢\006\b\n\000\032\004\b&\020\006R\021\020'\032\0020\004¢\006\b\n\000\032\004\b(\020\006R\021\020)\032\0020\004¢\006\b\n\000\032\004\b*\020\006R\021\020+\032\0020\004¢\006\b\n\000\032\004\b,\020\006R\021\020-\032\0020\004¢\006\b\n\000\032\004\b.\020\006R\021\020/\032\0020\004¢\006\b\n\000\032\004\b0\020\006¨\0061"}, d2 = {"Lai/grazie/model/cloud/ContentType$Application;", "", "()V", "Any", "Lai/grazie/model/cloud/ContentType;", "getAny", "()Lai/grazie/model/cloud/ContentType;", "Atom", "getAtom", "Cbor", "getCbor", "DocX", "getDocX", "Epub", "getEpub", "FontWoff", "getFontWoff", "FormUrlEncoded", "getFormUrlEncoded", "GZip", "getGZip", "HalJson", "getHalJson", "JavaScript", "getJavaScript", "Json", "getJson", "OctetStream", "getOctetStream", "Odt", "getOdt", "PDF", "getPDF", "ProblemJson", "getProblemJson", "ProblemXml", "getProblemXml", "ProtoBuf", "getProtoBuf", "RSS", "getRSS", "WASM", "getWASM", "Xml", "getXml", "Xml_Dtd", "getXml_Dtd", "Zip", "getZip", "model-cloud"})
/*    */ public final class Application
/*    */ {
/*    */   @NotNull
/* 26 */   public static final Application INSTANCE = new Application(); @NotNull private static final ContentType Any = new ContentType("application", "*"); @NotNull public final ContentType getAny() { return Any; } @NotNull
/* 27 */   private static final ContentType Atom = new ContentType("application", "atom+xml"); @NotNull public final ContentType getAtom() { return Atom; } @NotNull
/* 28 */   private static final ContentType DocX = new ContentType("application", "vnd.openxmlformats-officedocument.wordprocessingml.document"); @NotNull public final ContentType getDocX() { return DocX; } @NotNull
/* 29 */   private static final ContentType Odt = new ContentType("application", "vnd.oasis.opendocument.text"); @NotNull public final ContentType getOdt() { return Odt; } @NotNull
/* 30 */   private static final ContentType Cbor = new ContentType("application", "cbor"); @NotNull public final ContentType getCbor() { return Cbor; } @NotNull
/* 31 */   private static final ContentType Json = new ContentType("application", "json"); @NotNull public final ContentType getJson() { return Json; } @NotNull
/* 32 */   private static final ContentType HalJson = new ContentType("application", "hal+json"); @NotNull public final ContentType getHalJson() { return HalJson; } @NotNull
/* 33 */   private static final ContentType JavaScript = new ContentType("application", "javascript"); @NotNull public final ContentType getJavaScript() { return JavaScript; } @NotNull
/* 34 */   private static final ContentType OctetStream = new ContentType("application", "octet-stream"); @NotNull public final ContentType getOctetStream() { return OctetStream; } @NotNull
/* 35 */   private static final ContentType FontWoff = new ContentType("application", "font-woff"); @NotNull public final ContentType getFontWoff() { return FontWoff; } @NotNull
/* 36 */   private static final ContentType RSS = new ContentType("application", "rss+xml"); @NotNull public final ContentType getRSS() { return RSS; } @NotNull
/* 37 */   private static final ContentType Xml = new ContentType("application", "xml"); @NotNull public final ContentType getXml() { return Xml; } @NotNull
/* 38 */   private static final ContentType Xml_Dtd = new ContentType("application", "xml-dtd"); @NotNull public final ContentType getXml_Dtd() { return Xml_Dtd; } @NotNull
/* 39 */   private static final ContentType Zip = new ContentType("application", "zip"); @NotNull public final ContentType getZip() { return Zip; } @NotNull
/* 40 */   private static final ContentType GZip = new ContentType("application", "gzip"); @NotNull public final ContentType getGZip() { return GZip; }
/*    */   @NotNull
/* 42 */   public final ContentType getFormUrlEncoded() { return FormUrlEncoded; } @NotNull
/* 43 */   private static final ContentType FormUrlEncoded = new ContentType("application", "x-www-form-urlencoded");
/*    */   @NotNull
/* 45 */   private static final ContentType PDF = new ContentType("application", "pdf"); @NotNull public final ContentType getPDF() { return PDF; } @NotNull
/* 46 */   private static final ContentType Epub = new ContentType("application", "epub+zip"); @NotNull public final ContentType getEpub() { return Epub; } @NotNull
/* 47 */   private static final ContentType ProtoBuf = new ContentType("application", "protobuf"); @NotNull public final ContentType getProtoBuf() { return ProtoBuf; } @NotNull
/* 48 */   private static final ContentType WASM = new ContentType("application", "wasm"); @NotNull public final ContentType getWASM() { return WASM; } @NotNull
/* 49 */   private static final ContentType ProblemJson = new ContentType("application", "problem+json"); @NotNull public final ContentType getProblemJson() { return ProblemJson; } @NotNull
/* 50 */   private static final ContentType ProblemXml = new ContentType("application", "problem+xml"); @NotNull public final ContentType getProblemXml() { return ProblemXml; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\ContentType$Application.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */