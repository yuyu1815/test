/*    */ package androidx.compose.ui.text.input;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\032&\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\0012\f\020\003\032\b\022\004\022\0020\0010\004H\bø\001\000\032&\020\005\032\0020\001*\0020\0012\006\020\002\032\0020\0012\f\020\003\032\b\022\004\022\0020\0010\004H\bø\001\000\002\007\n\005\b20\001¨\006\006"}, d2 = {"addExactOrElse", "", "right", "defaultValue", "Lkotlin/Function0;", "subtractExactOrElse", "ui-text"})
/*    */ public final class MathUtilsKt
/*    */ {
/*    */   public static final int addExactOrElse(int $this$addExactOrElse, int right, @NotNull Function0 defaultValue) {
/* 23 */     Intrinsics.checkNotNullParameter(defaultValue, "defaultValue"); int $i$f$addExactOrElse = 0, result = $this$addExactOrElse + right;
/*    */     
/* 25 */     return ((($this$addExactOrElse ^ result) & (right ^ result)) < 0) ? ((Number)defaultValue.invoke()).intValue() : result;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final int subtractExactOrElse(int $this$subtractExactOrElse, int right, @NotNull Function0 defaultValue) {
/* 32 */     Intrinsics.checkNotNullParameter(defaultValue, "defaultValue"); int $i$f$subtractExactOrElse = 0, result = $this$subtractExactOrElse - right;
/*    */ 
/*    */     
/* 35 */     return ((($this$subtractExactOrElse ^ right) & ($this$subtractExactOrElse ^ result)) < 0) ? ((Number)defaultValue.invoke()).intValue() : result;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\MathUtilsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */