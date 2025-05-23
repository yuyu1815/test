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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\000\n\002\020\031\n\000\n\002\020\b\n\002\b\002\032(\020\000\032\0020\001*\0060\002j\002`\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\007H\000¨\006\t"}, d2 = {"appendPartOfCharArray", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "charArray", "", "offset", "", "len", "ui-text"})
/*    */ public final class AppendPartOfCharArrayKt
/*    */ {
/*    */   public static final void appendPartOfCharArray(@NotNull StringBuilder $this$appendPartOfCharArray, @NotNull char[] charArray, int offset, int len) {
/* 20 */     Intrinsics.checkNotNullParameter($this$appendPartOfCharArray, "<this>"); Intrinsics.checkNotNullParameter(charArray, "charArray"); $this$appendPartOfCharArray.append(charArray, offset, len);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\AppendPartOfCharArrayKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */