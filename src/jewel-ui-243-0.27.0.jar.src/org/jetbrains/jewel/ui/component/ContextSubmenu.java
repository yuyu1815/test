/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.foundation.ContextMenuItem;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\020 \n\002\b\005\b\007\030\0002\0020\001B#\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\n\022\b\022\004\022\0020\0010\0060\005¢\006\004\b\007\020\bR\035\020\004\032\016\022\n\022\b\022\004\022\0020\0010\0060\005¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lorg/jetbrains/jewel/ui/component/ContextSubmenu;", "Landroidx/compose/foundation/ContextMenuItem;", "label", "", "submenu", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getSubmenu", "()Lkotlin/jvm/functions/Function0;", "ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class ContextSubmenu
/*    */   extends ContextMenuItem
/*    */ {
/*    */   @NotNull
/*    */   private final Function0<List<ContextMenuItem>> submenu;
/*    */   public static final int $stable;
/*    */   
/*    */   @NotNull
/*    */   public final Function0<List<ContextMenuItem>> getSubmenu() {
/* 94 */     return this.submenu;
/* 95 */   } public ContextSubmenu(@NotNull String label, @NotNull Function0<List<ContextMenuItem>> submenu) { super(label, ContextSubmenu::_init_$lambda$0); this.submenu = submenu; } private static final Unit _init_$lambda$0() { return Unit.INSTANCE; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ContextSubmenu.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */