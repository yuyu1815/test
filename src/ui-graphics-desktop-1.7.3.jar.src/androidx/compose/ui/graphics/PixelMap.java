/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import androidx.annotation.IntRange;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\025\n\000\n\002\020\b\n\002\b\f\n\002\030\002\n\002\b\005\030\0002\0020\001B-\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005\022\006\020\b\032\0020\005¢\006\002\020\tJ*\020\021\032\0020\0222\b\b\001\020\023\032\0020\0052\b\b\001\020\024\032\0020\005H\002ø\001\000ø\001\001¢\006\004\b\025\020\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\016\020\rR\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\017\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\r\002\013\n\002\b!\n\005\b¡\0360\001¨\006\027"}, d2 = {"Landroidx/compose/ui/graphics/PixelMap;", "", "buffer", "", "width", "", "height", "bufferOffset", "stride", "([IIIII)V", "getBuffer", "()[I", "getBufferOffset", "()I", "getHeight", "getStride", "getWidth", "get", "Landroidx/compose/ui/graphics/Color;", "x", "y", "get-WaAFU9c", "(II)J", "ui-graphics"})
/*    */ public final class PixelMap
/*    */ {
/*    */   @NotNull
/*    */   private final int[] buffer;
/*    */   private final int width;
/*    */   private final int height;
/*    */   private final int bufferOffset;
/*    */   private final int stride;
/*    */   
/*    */   @NotNull
/*    */   public final int[] getBuffer() {
/*    */     return this.buffer;
/*    */   }
/*    */   
/*    */   public final int getWidth() {
/*    */     return this.width;
/*    */   }
/*    */   
/*    */   public PixelMap(@NotNull int[] buffer, int width, int height, int bufferOffset, int stride) {
/* 39 */     this.buffer = buffer;
/* 40 */     this.width = width;
/* 41 */     this.height = height;
/* 42 */     this.bufferOffset = bufferOffset;
/* 43 */     this.stride = stride; } public final int getStride() { return this.stride; }
/*    */   
/*    */   public final int getHeight() {
/*    */     return this.height;
/*    */   }
/*    */   public final int getBufferOffset() {
/*    */     return this.bufferOffset;
/*    */   }
/*    */   
/*    */   public final long get-WaAFU9c(@IntRange(from = 0L) int x, @IntRange(from = 0L) int y) {
/* 53 */     return ColorKt.Color(this.buffer[this.bufferOffset + y * this.stride + x]);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\PixelMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */