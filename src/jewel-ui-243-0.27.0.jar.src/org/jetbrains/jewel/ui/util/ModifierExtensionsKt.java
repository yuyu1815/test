/*    */ package org.jetbrains.jewel.ui.util;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\000\0321\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\0032\027\020\004\032\023\022\004\022\0020\001\022\004\022\0020\0010\005¢\006\002\b\006H\bø\001\000\002\007\n\005\b20\001¨\006\007"}, d2 = {"thenIf", "Landroidx/compose/ui/Modifier;", "precondition", "", "action", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ui"})
/*    */ public final class ModifierExtensionsKt {
/*    */   @NotNull
/*    */   public static final Modifier thenIf(@NotNull Modifier $this$thenIf, boolean precondition, @NotNull Function1 action) {
/* 10 */     Intrinsics.checkNotNullParameter($this$thenIf, "<this>"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$thenIf = 0; return precondition ? (Modifier)action.invoke($this$thenIf) : $this$thenIf;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\u\\util\ModifierExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */