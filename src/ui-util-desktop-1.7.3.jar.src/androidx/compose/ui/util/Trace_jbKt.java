/*    */ package androidx.compose.ui.util;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmName;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\022\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\b\002\032-\020\000\032\002H\001\"\004\b\000\020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\002H\0010\005H\bø\001\000¢\006\002\020\006\002\007\n\005\b20\001¨\006\007"}, d2 = {"trace", "T", "sectionName", "", "block", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ui-util"})
/*    */ @JvmName(name = "Trace_jbKt")
/*    */ public final class Trace_jbKt
/*    */ {
/*    */   public static final <T> T trace(@NotNull String sectionName, @NotNull Function0 block) {
/* 21 */     Intrinsics.checkNotNullParameter(sectionName, "sectionName"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$trace = 0; return (T)block.invoke();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-util-desktop-1.7.3.jar!\androidx\compos\\u\\util\Trace_jbKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */