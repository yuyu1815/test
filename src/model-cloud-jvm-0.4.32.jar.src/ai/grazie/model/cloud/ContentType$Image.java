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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\023\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\b\022\004\022\0020\0050\004¢\006\n\n\002\020\b\032\004\b\006\020\007R\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\013R\021\020\016\032\0020\005¢\006\b\n\000\032\004\b\017\020\013R\021\020\020\032\0020\005¢\006\b\n\000\032\004\b\021\020\013R\021\020\022\032\0020\005¢\006\b\n\000\032\004\b\023\020\013R\021\020\024\032\0020\005¢\006\b\n\000\032\004\b\025\020\013R\021\020\026\032\0020\005¢\006\b\n\000\032\004\b\027\020\013¨\006\030"}, d2 = {"Lai/grazie/model/cloud/ContentType$Image;", "", "()V", "All", "", "Lai/grazie/model/cloud/ContentType;", "getAll", "()[Lai/grazie/model/cloud/ContentType;", "[Lai/grazie/model/cloud/ContentType;", "Any", "getAny", "()Lai/grazie/model/cloud/ContentType;", "GIF", "getGIF", "JPEG", "getJPEG", "PNG", "getPNG", "SVG", "getSVG", "WebP", "getWebP", "XIcon", "getXIcon", "model-cloud"})
/*    */ public final class Image
/*    */ {
/*    */   @NotNull
/* 69 */   public static final Image INSTANCE = new Image(); @NotNull private static final ContentType Any = new ContentType("image", "*"); @NotNull public final ContentType getAny() { return Any; } @NotNull
/* 70 */   private static final ContentType GIF = new ContentType("image", "gif"); @NotNull public final ContentType getGIF() { return GIF; } @NotNull
/* 71 */   private static final ContentType JPEG = new ContentType("image", "jpeg"); @NotNull public final ContentType getJPEG() { return JPEG; } @NotNull
/* 72 */   private static final ContentType PNG = new ContentType("image", "png"); @NotNull public final ContentType getPNG() { return PNG; } @NotNull
/* 73 */   private static final ContentType SVG = new ContentType("image", "svg+xml"); @NotNull public final ContentType getSVG() { return SVG; } @NotNull
/* 74 */   private static final ContentType XIcon = new ContentType("image", "x-icon"); @NotNull public final ContentType getXIcon() { return XIcon; } @NotNull
/* 75 */   private static final ContentType WebP = new ContentType("image", "webp"); @NotNull public final ContentType getWebP() { return WebP; } @NotNull
/*    */   private static final ContentType[] All; @NotNull
/* 77 */   public final ContentType[] getAll() { return All; } static { ContentType[] arrayOfContentType = new ContentType[7]; arrayOfContentType[0] = Any; arrayOfContentType[1] = GIF; arrayOfContentType[2] = JPEG; arrayOfContentType[3] = PNG; arrayOfContentType[4] = SVG; arrayOfContentType[5] = XIcon; arrayOfContentType[6] = WebP; All = arrayOfContentType; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\ContentType$Image.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */