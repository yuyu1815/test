/*    */ package androidx.compose.ui.text.input;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\020\002\n\002\020\016\n\000\n\002\020\031\n\000\n\002\020\b\n\002\b\003\032,\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\006H\000¨\006\t"}, d2 = {"toCharArray", "", "", "destination", "", "destinationOffset", "", "startIndex", "endIndex", "ui-text"})
/*    */ public final class GapBuffer_jvmKt
/*    */ {
/*    */   public static final void toCharArray(@NotNull String $this$toCharArray, @NotNull char[] destination, int destinationOffset, int startIndex, int endIndex) {
/* 26 */     Intrinsics.checkNotNullParameter($this$toCharArray, "<this>"); Intrinsics.checkNotNullParameter(destination, "destination"); $this$toCharArray.getChars(startIndex, endIndex, destination, destinationOffset);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\GapBuffer_jvmKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */