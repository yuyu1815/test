/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import androidx.compose.ui.geometry.Size;
/*    */ import androidx.compose.ui.geometry.SizeKt;
/*    */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*    */ import androidx.compose.ui.graphics.painter.Painter;
/*    */ import androidx.compose.ui.unit.IntSizeKt;
/*    */ import java.awt.image.BufferedImage;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\004\n\002\020\002\n\002\030\002\n\000\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\f\020\022\032\0020\023*\0020\024H\024R\033\020\005\032\0020\0068BX\002¢\006\f\n\004\b\t\020\n\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\034\020\r\032\0020\016X\004ø\001\000ø\001\001¢\006\n\n\002\020\021\032\004\b\017\020\020\002\013\n\005\b¡\0360\001\n\002\b!¨\006\025"}, d2 = {"Landroidx/compose/ui/graphics/BufferedImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "image", "Ljava/awt/image/BufferedImage;", "(Ljava/awt/image/BufferedImage;)V", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "getBitmap", "()Landroidx/compose/ui/graphics/ImageBitmap;", "bitmap$delegate", "Lkotlin/Lazy;", "getImage", "()Ljava/awt/image/BufferedImage;", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "J", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui-graphics"})
/*    */ final class BufferedImagePainter
/*    */   extends Painter
/*    */ {
/*    */   @NotNull
/*    */   private final BufferedImage image;
/*    */   @NotNull
/*    */   private final Lazy bitmap$delegate;
/*    */   private final long intrinsicSize;
/*    */   
/*    */   @NotNull
/*    */   public final BufferedImage getImage() {
/*    */     return this.image;
/*    */   }
/*    */   
/*    */   public BufferedImagePainter(@NotNull BufferedImage image) {
/* 61 */     this.image = image;
/* 62 */     this.bitmap$delegate = LazyKt.lazy(new BufferedImagePainter$bitmap$2());
/*    */     
/* 64 */     this.intrinsicSize = SizeKt.Size(this.image.getWidth(), this.image.getHeight()); } public long getIntrinsicSize-NH-jbRc() { return this.intrinsicSize; }
/*    */   
/*    */   protected void onDraw(@NotNull DrawScope $this$onDraw) {
/* 67 */     Intrinsics.checkNotNullParameter($this$onDraw, "<this>"); long intSize = IntSizeKt.IntSize((int)Size.getWidth-impl($this$onDraw.getSize-NH-jbRc()), (int)Size.getHeight-impl($this$onDraw.getSize-NH-jbRc()));
/* 68 */     DrawScope.drawImage-AZ2fEMs$default($this$onDraw, getBitmap(), 0L, 0L, 0L, intSize, 0.0F, null, null, 0, 0, 1006, null);
/*    */   }
/*    */   
/*    */   private final ImageBitmap getBitmap() {
/*    */     Lazy lazy = this.bitmap$delegate;
/*    */     return (ImageBitmap)lazy.getValue();
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/ImageBitmap;", "invoke"})
/*    */   static final class BufferedImagePainter$bitmap$2 extends Lambda implements Function0<ImageBitmap> {
/*    */     BufferedImagePainter$bitmap$2() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ImageBitmap invoke() {
/*    */       return DesktopImageConverters_desktopKt.toComposeImageBitmap(BufferedImagePainter.this.getImage());
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\BufferedImagePainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */