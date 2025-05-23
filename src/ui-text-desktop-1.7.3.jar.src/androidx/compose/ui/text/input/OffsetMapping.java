/*    */ package androidx.compose.ui.text.input;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\004\bf\030\000 \0062\0020\001:\001\006J\020\020\002\032\0020\0032\006\020\004\032\0020\003H&J\020\020\005\032\0020\0032\006\020\004\032\0020\003H&ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Landroidx/compose/ui/text/input/OffsetMapping;", "", "originalToTransformed", "", "offset", "transformedToOriginal", "Companion", "ui-text"})
/*    */ public interface OffsetMapping
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   int originalToTransformed(int paramInt);
/*    */   
/*    */   int transformedToOriginal(int paramInt);
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Landroidx/compose/ui/text/input/OffsetMapping$Companion;", "", "()V", "Identity", "Landroidx/compose/ui/text/input/OffsetMapping;", "getIdentity", "()Landroidx/compose/ui/text/input/OffsetMapping;", "ui-text"})
/*    */   public static final class Companion
/*    */   {
/*    */     @NotNull
/* 54 */     private static final OffsetMapping Identity = new OffsetMapping$Companion$Identity$1(); @NotNull public final OffsetMapping getIdentity() { return Identity; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\023\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\003H\026J\020\020\005\032\0020\0032\006\020\004\032\0020\003H\026¨\006\006"}, d2 = {"androidx/compose/ui/text/input/OffsetMapping$Companion$Identity$1", "Landroidx/compose/ui/text/input/OffsetMapping;", "originalToTransformed", "", "offset", "transformedToOriginal", "ui-text"})
/* 55 */     public static final class OffsetMapping$Companion$Identity$1 implements OffsetMapping { public int originalToTransformed(int offset) { return offset; } public int transformedToOriginal(int offset) {
/* 56 */         return offset;
/*    */       } }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\OffsetMapping.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */