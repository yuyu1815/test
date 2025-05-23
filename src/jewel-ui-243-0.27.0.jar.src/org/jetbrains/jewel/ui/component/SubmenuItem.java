/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.Composer;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\022\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001BG\022\b\b\002\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\027\020\006\032\023\022\004\022\0020\b\022\004\022\0020\t0\007¢\006\002\b\n\022\021\020\013\032\r\022\004\022\0020\t0\f¢\006\002\b\r¢\006\004\b\016\020\017J\t\020\030\032\0020\003HÆ\003J\013\020\031\032\004\030\0010\005HÆ\003J\032\020\032\032\023\022\004\022\0020\b\022\004\022\0020\t0\007¢\006\002\b\nHÆ\003J\031\020\033\032\r\022\004\022\0020\t0\f¢\006\002\b\rHÆ\003¢\006\002\020\026JT\020\034\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0052\031\b\002\020\006\032\023\022\004\022\0020\b\022\004\022\0020\t0\007¢\006\002\b\n2\023\b\002\020\013\032\r\022\004\022\0020\t0\f¢\006\002\b\rHÆ\001¢\006\002\020\035J\023\020\036\032\0020\0032\b\020\037\032\004\030\0010 HÖ\003J\t\020!\032\0020\"HÖ\001J\t\020#\032\0020$HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\002\020\020R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\021\020\022R\"\020\006\032\023\022\004\022\0020\b\022\004\022\0020\t0\007¢\006\002\b\n¢\006\b\n\000\032\004\b\023\020\024R!\020\013\032\r\022\004\022\0020\t0\f¢\006\002\b\rX\004¢\006\n\n\002\020\027\032\004\b\025\020\026¨\006%"}, d2 = {"Lorg/jetbrains/jewel/ui/component/SubmenuItem;", "Lorg/jetbrains/jewel/ui/component/MenuItem;", "isEnabled", "", "iconKey", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "submenu", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/ui/component/MenuScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "<init>", "(ZLorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "()Z", "getIconKey", "()Lorg/jetbrains/jewel/ui/icon/IconKey;", "getSubmenu", "()Lkotlin/jvm/functions/Function1;", "getContent", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "component1", "component2", "component3", "component4", "copy", "(ZLorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/jewel/ui/component/SubmenuItem;", "equals", "other", "", "hashCode", "", "toString", "", "ui"})
/*     */ final class SubmenuItem
/*     */   implements MenuItem
/*     */ {
/*     */   private final boolean isEnabled;
/*     */   @Nullable
/*     */   private final IconKey iconKey;
/*     */   @NotNull
/*     */   private final Function1<MenuScope, Unit> submenu;
/*     */   @NotNull
/*     */   private final Function2<Composer, Integer, Unit> content;
/*     */   
/*     */   public SubmenuItem(boolean isEnabled, @Nullable IconKey iconKey, @NotNull Function1<MenuScope, Unit> submenu, @NotNull Function2<Composer, Integer, Unit> content) {
/* 307 */     this.isEnabled = isEnabled;
/* 308 */     this.iconKey = iconKey;
/* 309 */     this.submenu = submenu;
/* 310 */     this.content = content; } @NotNull public Function2<Composer, Integer, Unit> getContent() { return this.content; }
/*     */ 
/*     */   
/*     */   public final boolean isEnabled() {
/*     */     return this.isEnabled;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final IconKey getIconKey() {
/*     */     return this.iconKey;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function1<MenuScope, Unit> getSubmenu() {
/*     */     return this.submenu;
/*     */   }
/*     */   
/*     */   public final boolean component1() {
/*     */     return this.isEnabled;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final IconKey component2() {
/*     */     return this.iconKey;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function1<MenuScope, Unit> component3() {
/*     */     return this.submenu;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function2<Composer, Integer, Unit> component4() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SubmenuItem copy(boolean isEnabled, @Nullable IconKey iconKey, @NotNull Function1<? super MenuScope, Unit> submenu, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
/*     */     Intrinsics.checkNotNullParameter(submenu, "submenu");
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     return new SubmenuItem(isEnabled, iconKey, submenu, content);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "SubmenuItem(isEnabled=" + this.isEnabled + ", iconKey=" + this.iconKey + ", submenu=" + this.submenu + ", content=" + this.content + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Boolean.hashCode(this.isEnabled);
/*     */     result = result * 31 + ((this.iconKey == null) ? 0 : this.iconKey.hashCode());
/*     */     result = result * 31 + this.submenu.hashCode();
/*     */     return result * 31 + this.content.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof SubmenuItem))
/*     */       return false; 
/*     */     SubmenuItem submenuItem = (SubmenuItem)other;
/*     */     return (this.isEnabled != submenuItem.isEnabled) ? false : (!Intrinsics.areEqual(this.iconKey, submenuItem.iconKey) ? false : (!Intrinsics.areEqual(this.submenu, submenuItem.submenu) ? false : (!!Intrinsics.areEqual(this.content, submenuItem.content))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SubmenuItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */