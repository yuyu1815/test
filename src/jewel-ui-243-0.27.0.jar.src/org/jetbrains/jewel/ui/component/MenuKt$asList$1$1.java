/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.Composer;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000C\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\"\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001JX\020\002\032\0020\0032\006\020\004\032\0020\0052\b\020\006\032\004\030\0010\0072\016\020\b\032\n\022\004\022\0020\n\030\0010\t2\f\020\013\032\b\022\004\022\0020\0030\f2\006\020\r\032\0020\0052\021\020\016\032\r\022\004\022\0020\0030\f¢\006\002\b\017H\026¢\006\002\020\020J \020\021\032\0020\0032\021\020\016\032\r\022\004\022\0020\0030\f¢\006\002\b\017H\026¢\006\002\020\022JK\020\023\032\0020\0032\006\020\r\032\0020\0052\b\020\006\032\004\030\0010\0072\027\020\023\032\023\022\004\022\0020\001\022\004\022\0020\0030\024¢\006\002\b\0252\021\020\016\032\r\022\004\022\0020\0030\f¢\006\002\b\017H\026¢\006\002\020\026¨\006\027"}, d2 = {"org/jetbrains/jewel/ui/component/MenuKt$asList$1$1", "Lorg/jetbrains/jewel/ui/component/MenuScope;", "selectableItem", "", "selected", "", "iconKey", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "keybinding", "", "", "onClick", "Lkotlin/Function0;", "enabled", "content", "Landroidx/compose/runtime/Composable;", "(ZLorg/jetbrains/jewel/ui/icon/IconKey;Ljava/util/Set;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;)V", "passiveItem", "(Lkotlin/jvm/functions/Function2;)V", "submenu", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(ZLorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "ui"})
/*     */ public final class MenuKt$asList$1$1
/*     */   implements MenuScope
/*     */ {
/*     */   MenuKt$asList$1$1(List<MenuItem> $receiver) {}
/*     */   
/*     */   public void selectableItem(boolean selected, IconKey iconKey, Set<String> keybinding, Function0<Unit> onClick, boolean enabled, Function2<? super Composer, ? super Integer, Unit> content) {
/* 263 */     Intrinsics.checkNotNullParameter(onClick, "onClick"); Intrinsics.checkNotNullParameter(content, "content"); this.$this_buildList.add(
/* 264 */         new MenuSelectableItem(
/* 265 */           selected, 
/* 266 */           enabled, 
/* 267 */           iconKey, 
/* 268 */           keybinding, 
/* 269 */           onClick, 
/* 270 */           content));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void passiveItem(Function2<? super Composer, ? super Integer, Unit> content) {
/* 276 */     Intrinsics.checkNotNullParameter(content, "content"); this.$this_buildList.add(new MenuPassiveItem(content));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void submenu(boolean enabled, IconKey iconKey, Function1<? super MenuScope, Unit> submenu, Function2<? super Composer, ? super Integer, Unit> content) {
/* 285 */     Intrinsics.checkNotNullParameter(submenu, "submenu"); Intrinsics.checkNotNullParameter(content, "content"); this.$this_buildList.add(new SubmenuItem(enabled, iconKey, submenu, content));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\MenuKt$asList$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */