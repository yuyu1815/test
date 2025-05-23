/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.Composer;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\020\"\n\002\020\016\n\000\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\b\026\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001BT\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\020\005\032\004\030\0010\006\022\016\020\007\032\n\022\004\022\0020\t\030\0010\b\022\016\b\002\020\n\032\b\022\004\022\0020\f0\013\022\021\020\r\032\r\022\004\022\0020\f0\013¢\006\002\b\016¢\006\004\b\017\020\020J\t\020\033\032\0020\003HÆ\003J\t\020\034\032\0020\003HÆ\003J\013\020\035\032\004\030\0010\006HÆ\003J\021\020\036\032\n\022\004\022\0020\t\030\0010\bHÆ\003J\017\020\037\032\b\022\004\022\0020\f0\013HÆ\003J\031\020 \032\r\022\004\022\0020\f0\013¢\006\002\b\016HÆ\003¢\006\002\020\031Je\020!\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\n\b\002\020\005\032\004\030\0010\0062\020\b\002\020\007\032\n\022\004\022\0020\t\030\0010\b2\016\b\002\020\n\032\b\022\004\022\0020\f0\0132\023\b\002\020\r\032\r\022\004\022\0020\f0\013¢\006\002\b\016HÆ\001¢\006\002\020\"J\023\020#\032\0020\0032\b\020$\032\004\030\0010%HÖ\003J\t\020&\032\0020'HÖ\001J\t\020(\032\0020\tHÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\002\020\021R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\004\020\021R\023\020\005\032\004\030\0010\006¢\006\b\n\000\032\004\b\022\020\023R\031\020\007\032\n\022\004\022\0020\t\030\0010\b¢\006\b\n\000\032\004\b\024\020\025R\027\020\n\032\b\022\004\022\0020\f0\013¢\006\b\n\000\032\004\b\026\020\027R!\020\r\032\r\022\004\022\0020\f0\013¢\006\002\b\016X\004¢\006\n\n\002\020\032\032\004\b\030\020\031¨\006)"}, d2 = {"Lorg/jetbrains/jewel/ui/component/MenuSelectableItem;", "Lorg/jetbrains/jewel/ui/component/MenuItem;", "isSelected", "", "isEnabled", "iconKey", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "keybinding", "", "", "onClick", "Lkotlin/Function0;", "", "content", "Landroidx/compose/runtime/Composable;", "<init>", "(ZZLorg/jetbrains/jewel/ui/icon/IconKey;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "()Z", "getIconKey", "()Lorg/jetbrains/jewel/ui/icon/IconKey;", "getKeybinding", "()Ljava/util/Set;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getContent", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZZLorg/jetbrains/jewel/ui/icon/IconKey;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/jewel/ui/component/MenuSelectableItem;", "equals", "other", "", "hashCode", "", "toString", "ui"})
/*     */ final class MenuSelectableItem
/*     */   implements MenuItem
/*     */ {
/*     */   private final boolean isSelected;
/*     */   private final boolean isEnabled;
/*     */   @Nullable
/*     */   private final IconKey iconKey;
/*     */   @Nullable
/*     */   private final Set<String> keybinding;
/*     */   @NotNull
/*     */   private final Function0<Unit> onClick;
/*     */   @NotNull
/*     */   private final Function2<Composer, Integer, Unit> content;
/*     */   
/*     */   public MenuSelectableItem(boolean isSelected, boolean isEnabled, @Nullable IconKey iconKey, @Nullable Set<String> keybinding, @NotNull Function0<Unit> onClick, @NotNull Function2<Composer, Integer, Unit> content) {
/* 296 */     this.isSelected = isSelected;
/* 297 */     this.isEnabled = isEnabled;
/* 298 */     this.iconKey = iconKey;
/* 299 */     this.keybinding = keybinding;
/* 300 */     this.onClick = onClick;
/* 301 */     this.content = content; } @NotNull public Function2<Composer, Integer, Unit> getContent() { return this.content; }
/*     */ 
/*     */   
/*     */   public final boolean isSelected() {
/*     */     return this.isSelected;
/*     */   }
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
/*     */   @Nullable
/*     */   public final Set<String> getKeybinding() {
/*     */     return this.keybinding;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function0<Unit> getOnClick() {
/*     */     return this.onClick;
/*     */   }
/*     */   
/*     */   private static final Unit _init_$lambda$0() {
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public final boolean component1() {
/*     */     return this.isSelected;
/*     */   }
/*     */   
/*     */   public final boolean component2() {
/*     */     return this.isEnabled;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final IconKey component3() {
/*     */     return this.iconKey;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Set<String> component4() {
/*     */     return this.keybinding;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function0<Unit> component5() {
/*     */     return this.onClick;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function2<Composer, Integer, Unit> component6() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MenuSelectableItem copy(boolean isSelected, boolean isEnabled, @Nullable IconKey iconKey, @Nullable Set<String> keybinding, @NotNull Function0<Unit> onClick, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
/*     */     Intrinsics.checkNotNullParameter(onClick, "onClick");
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     return new MenuSelectableItem(isSelected, isEnabled, iconKey, keybinding, onClick, content);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "MenuSelectableItem(isSelected=" + this.isSelected + ", isEnabled=" + this.isEnabled + ", iconKey=" + this.iconKey + ", keybinding=" + this.keybinding + ", onClick=" + this.onClick + ", content=" + this.content + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Boolean.hashCode(this.isSelected);
/*     */     result = result * 31 + Boolean.hashCode(this.isEnabled);
/*     */     result = result * 31 + ((this.iconKey == null) ? 0 : this.iconKey.hashCode());
/*     */     result = result * 31 + ((this.keybinding == null) ? 0 : this.keybinding.hashCode());
/*     */     result = result * 31 + this.onClick.hashCode();
/*     */     return result * 31 + this.content.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof MenuSelectableItem))
/*     */       return false; 
/*     */     MenuSelectableItem menuSelectableItem = (MenuSelectableItem)other;
/*     */     return (this.isSelected != menuSelectableItem.isSelected) ? false : ((this.isEnabled != menuSelectableItem.isEnabled) ? false : (!Intrinsics.areEqual(this.iconKey, menuSelectableItem.iconKey) ? false : (!Intrinsics.areEqual(this.keybinding, menuSelectableItem.keybinding) ? false : (!Intrinsics.areEqual(this.onClick, menuSelectableItem.onClick) ? false : (!!Intrinsics.areEqual(this.content, menuSelectableItem.content))))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\MenuSelectableItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */