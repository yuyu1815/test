/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.ByteOrder;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.Bitmap;
/*    */ import org.jetbrains.skia.Image;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000*\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\020\022\n\000\n\002\020\025\n\000\n\002\020\b\n\002\b\002\032\f\020\000\032\0020\001*\0020\002H\007\032\f\020\003\032\0020\002*\0020\001H\007\032\f\020\003\032\0020\002*\0020\004H\007\032$\020\005\032\0020\006*\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\013H\000¨\006\r"}, d2 = {"asDesktopBitmap", "Lorg/jetbrains/skia/Bitmap;", "Landroidx/compose/ui/graphics/ImageBitmap;", "asImageBitmap", "Lorg/jetbrains/skia/Image;", "putBytesInto", "", "", "array", "", "offset", "", "length", "ui-graphics"})
/*    */ public final class DesktopImageAsset_desktopKt
/*    */ {
/*    */   @Deprecated(message = "Use asComposeImageBitmap", replaceWith = @ReplaceWith(expression = "asComposeImageBitmap()", imports = {}))
/*    */   @NotNull
/*    */   public static final ImageBitmap asImageBitmap(@NotNull Bitmap $this$asImageBitmap) {
/* 30 */     Intrinsics.checkNotNullParameter($this$asImageBitmap, "<this>"); return SkiaImageAsset_skikoKt.asComposeImageBitmap($this$asImageBitmap);
/*    */   }
/*    */   
/*    */   @Deprecated(message = "Use toComposeImageBitmap", replaceWith = @ReplaceWith(expression = "toComposeImageBitmap()", imports = {}))
/*    */   @NotNull
/*    */   public static final ImageBitmap asImageBitmap(@NotNull Image $this$asImageBitmap) {
/* 36 */     Intrinsics.checkNotNullParameter($this$asImageBitmap, "<this>"); return SkiaImageAsset_skikoKt.toComposeImageBitmap($this$asImageBitmap);
/*    */   }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "Use asSkiaBitmap()", replaceWith = @ReplaceWith(expression = "asSkiaBitmap()", imports = {}))
/*    */   @NotNull
/*    */   public static final Bitmap asDesktopBitmap(@NotNull ImageBitmap $this$asDesktopBitmap) {
/* 43 */     Intrinsics.checkNotNullParameter($this$asDesktopBitmap, "<this>"); return SkiaImageAsset_skikoKt.asSkiaBitmap($this$asDesktopBitmap);
/*    */   }
/*    */   public static final void putBytesInto(@NotNull byte[] $this$putBytesInto, @NotNull int[] array, int offset, int length) {
/* 46 */     Intrinsics.checkNotNullParameter($this$putBytesInto, "<this>"); Intrinsics.checkNotNullParameter(array, "array"); ByteBuffer.wrap($this$putBytesInto)
/* 47 */       .order(ByteOrder.LITTLE_ENDIAN)
/* 48 */       .asIntBuffer()
/* 49 */       .get(array, offset, length);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\DesktopImageAsset_desktopKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */