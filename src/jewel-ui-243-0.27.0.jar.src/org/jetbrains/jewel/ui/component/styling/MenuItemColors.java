/*     */ package org.jetbrains.jewel.ui.component.styling;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.MenuItemState;
/*     */ 
/*     */ @GenerateDataFunctions
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b.\n\002\030\002\n\000\n\002\030\002\n\002\b\n\b\007\030\000 =2\0020\001:\001=B¯\001\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003\022\006\020\t\032\0020\003\022\006\020\n\032\0020\003\022\006\020\013\032\0020\003\022\006\020\f\032\0020\003\022\006\020\r\032\0020\003\022\006\020\016\032\0020\003\022\006\020\017\032\0020\003\022\006\020\020\032\0020\003\022\006\020\021\032\0020\003\022\006\020\022\032\0020\003\022\006\020\023\032\0020\003\022\006\020\024\032\0020\003\022\006\020\025\032\0020\003\022\006\020\026\032\0020\003\022\006\020\027\032\0020\003¢\006\004\b\030\020\031J\035\0201\032\b\022\004\022\0020\003022\006\0203\032\00204H\007¢\006\004\b5\0206J\035\0207\032\b\022\004\022\0020\003022\006\0203\032\00204H\007¢\006\004\b8\0206J\035\0209\032\b\022\004\022\0020\003022\006\0203\032\00204H\007¢\006\004\b:\0206J\035\020;\032\b\022\004\022\0020\003022\006\0203\032\00204H\007¢\006\004\b<\0206R\023\020\002\032\0020\003¢\006\n\n\002\020\034\032\004\b\032\020\033R\023\020\004\032\0020\003¢\006\n\n\002\020\034\032\004\b\035\020\033R\023\020\005\032\0020\003¢\006\n\n\002\020\034\032\004\b\036\020\033R\023\020\006\032\0020\003¢\006\n\n\002\020\034\032\004\b\037\020\033R\023\020\007\032\0020\003¢\006\n\n\002\020\034\032\004\b \020\033R\023\020\b\032\0020\003¢\006\n\n\002\020\034\032\004\b!\020\033R\023\020\t\032\0020\003¢\006\n\n\002\020\034\032\004\b\"\020\033R\023\020\n\032\0020\003¢\006\n\n\002\020\034\032\004\b#\020\033R\023\020\013\032\0020\003¢\006\n\n\002\020\034\032\004\b$\020\033R\023\020\f\032\0020\003¢\006\n\n\002\020\034\032\004\b%\020\033R\023\020\r\032\0020\003¢\006\n\n\002\020\034\032\004\b&\020\033R\023\020\016\032\0020\003¢\006\n\n\002\020\034\032\004\b'\020\033R\023\020\017\032\0020\003¢\006\n\n\002\020\034\032\004\b(\020\033R\023\020\020\032\0020\003¢\006\n\n\002\020\034\032\004\b)\020\033R\023\020\021\032\0020\003¢\006\n\n\002\020\034\032\004\b*\020\033R\023\020\022\032\0020\003¢\006\n\n\002\020\034\032\004\b+\020\033R\023\020\023\032\0020\003¢\006\n\n\002\020\034\032\004\b,\020\033R\023\020\024\032\0020\003¢\006\n\n\002\020\034\032\004\b-\020\033R\023\020\025\032\0020\003¢\006\n\n\002\020\034\032\004\b.\020\033R\023\020\026\032\0020\003¢\006\n\n\002\020\034\032\004\b/\020\033R\023\020\027\032\0020\003¢\006\n\n\002\020\034\032\004\b0\020\033¨\006>"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;", "", "background", "Landroidx/compose/ui/graphics/Color;", "backgroundDisabled", "backgroundFocused", "backgroundPressed", "backgroundHovered", "content", "contentDisabled", "contentFocused", "contentPressed", "contentHovered", "iconTint", "iconTintDisabled", "iconTintFocused", "iconTintPressed", "iconTintHovered", "keybindingTint", "keybindingTintDisabled", "keybindingTintFocused", "keybindingTintPressed", "keybindingTintHovered", "separator", "<init>", "(JJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getBackgroundDisabled-0d7_KjU", "getBackgroundFocused-0d7_KjU", "getBackgroundPressed-0d7_KjU", "getBackgroundHovered-0d7_KjU", "getContent-0d7_KjU", "getContentDisabled-0d7_KjU", "getContentFocused-0d7_KjU", "getContentPressed-0d7_KjU", "getContentHovered-0d7_KjU", "getIconTint-0d7_KjU", "getIconTintDisabled-0d7_KjU", "getIconTintFocused-0d7_KjU", "getIconTintPressed-0d7_KjU", "getIconTintHovered-0d7_KjU", "getKeybindingTint-0d7_KjU", "getKeybindingTintDisabled-0d7_KjU", "getKeybindingTintFocused-0d7_KjU", "getKeybindingTintPressed-0d7_KjU", "getKeybindingTintHovered-0d7_KjU", "getSeparator-0d7_KjU", "backgroundFor", "Landroidx/compose/runtime/State;", "state", "Lorg/jetbrains/jewel/ui/component/MenuItemState;", "backgroundFor-VIR8D2g", "(JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentFor", "contentFor-VIR8D2g", "iconTintFor", "iconTintFor-VIR8D2g", "keybindingTintFor", "keybindingTintFor-VIR8D2g", "Companion", "ui"})
/*     */ @Immutable
/*     */ public final class MenuItemColors {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long background;
/*     */   private final long backgroundDisabled;
/*     */   private final long backgroundFocused;
/*     */   private final long backgroundPressed;
/*     */   private final long backgroundHovered;
/*     */   private final long content;
/*     */   private final long contentDisabled;
/*     */   private final long contentFocused;
/*     */   private final long contentPressed;
/*     */   private final long contentHovered;
/*     */   private final long iconTint;
/*     */   private final long iconTintDisabled;
/*     */   private final long iconTintFocused;
/*     */   private final long iconTintPressed;
/*     */   private final long iconTintHovered;
/*     */   private final long keybindingTint;
/*     */   private final long keybindingTintDisabled;
/*     */   private final long keybindingTintFocused;
/*     */   private final long keybindingTintPressed;
/*     */   private final long keybindingTintHovered;
/*     */   private final long separator;
/*     */   public static final int $stable;
/*     */   
/*  44 */   private MenuItemColors(long background, long backgroundDisabled, long backgroundFocused, long backgroundPressed, long backgroundHovered, long content, long contentDisabled, long contentFocused, long contentPressed, long contentHovered, long iconTint, long iconTintDisabled, long iconTintFocused, long iconTintPressed, long iconTintHovered, long keybindingTint, long keybindingTintDisabled, long keybindingTintFocused, long keybindingTintPressed, long keybindingTintHovered, long separator) { this.background = background;
/*  45 */     this.backgroundDisabled = backgroundDisabled;
/*  46 */     this.backgroundFocused = backgroundFocused;
/*  47 */     this.backgroundPressed = backgroundPressed;
/*  48 */     this.backgroundHovered = backgroundHovered;
/*  49 */     this.content = content;
/*  50 */     this.contentDisabled = contentDisabled;
/*  51 */     this.contentFocused = contentFocused;
/*  52 */     this.contentPressed = contentPressed;
/*  53 */     this.contentHovered = contentHovered;
/*  54 */     this.iconTint = iconTint;
/*  55 */     this.iconTintDisabled = iconTintDisabled;
/*  56 */     this.iconTintFocused = iconTintFocused;
/*  57 */     this.iconTintPressed = iconTintPressed;
/*  58 */     this.iconTintHovered = iconTintHovered;
/*  59 */     this.keybindingTint = keybindingTint;
/*  60 */     this.keybindingTintDisabled = keybindingTintDisabled;
/*  61 */     this.keybindingTintFocused = keybindingTintFocused;
/*  62 */     this.keybindingTintPressed = keybindingTintPressed;
/*  63 */     this.keybindingTintHovered = keybindingTintHovered;
/*  64 */     this.separator = separator; } public final long getBackground-0d7_KjU() { return this.background; } public final long getBackgroundDisabled-0d7_KjU() { return this.backgroundDisabled; } public final long getBackgroundFocused-0d7_KjU() { return this.backgroundFocused; } public final long getBackgroundPressed-0d7_KjU() { return this.backgroundPressed; } public final long getBackgroundHovered-0d7_KjU() { return this.backgroundHovered; } public final long getContent-0d7_KjU() { return this.content; } public final long getContentDisabled-0d7_KjU() { return this.contentDisabled; } public final long getContentFocused-0d7_KjU() { return this.contentFocused; } public final long getContentPressed-0d7_KjU() { return this.contentPressed; } public final long getContentHovered-0d7_KjU() { return this.contentHovered; } public final long getSeparator-0d7_KjU() { return this.separator; }
/*     */   public final long getIconTint-0d7_KjU() { return this.iconTint; }
/*     */   public final long getIconTintDisabled-0d7_KjU() { return this.iconTintDisabled; }
/*     */   public final long getIconTintFocused-0d7_KjU() { return this.iconTintFocused; }
/*  68 */   public final long getIconTintPressed-0d7_KjU() { return this.iconTintPressed; } public final long getIconTintHovered-0d7_KjU() { return this.iconTintHovered; } public final long getKeybindingTint-0d7_KjU() { return this.keybindingTint; } public final long getKeybindingTintDisabled-0d7_KjU() { return this.keybindingTintDisabled; } public final long getKeybindingTintFocused-0d7_KjU() { return this.keybindingTintFocused; } public final long getKeybindingTintPressed-0d7_KjU() { return this.keybindingTintPressed; } public final long getKeybindingTintHovered-0d7_KjU() { return this.keybindingTintHovered; } @Composable @NotNull public final State<Color> backgroundFor-VIR8D2g(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-20791408); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-20791408, $changed, -1, "org.jetbrains.jewel.ui.component.styling.MenuItemColors.backgroundFor (MenuStyling.kt:67)");
/*     */     
/*  70 */     long l1 = this.background;
/*  71 */     long l2 = this.backgroundDisabled;
/*  72 */     long l3 = this.background;
/*  73 */     long l4 = this.backgroundFocused;
/*  74 */     long l5 = this.backgroundPressed;
/*  75 */     long l6 = this.backgroundHovered; State<Color> state1 = SnapshotStateKt.rememberUpdatedState(MenuItemState.chooseValue-impl(state, Color.box-impl(l1), Color.box-impl(l2), Color.box-impl(l4), Color.box-impl(l5), Color.box-impl(l6), Color.box-impl(l3), $composer, 0x380000 & $changed << 18), $composer, 0);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return state1; } @Composable
/*     */   @NotNull
/*  81 */   public final State<Color> contentFor-VIR8D2g(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-1196771327); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1196771327, $changed, -1, "org.jetbrains.jewel.ui.component.styling.MenuItemColors.contentFor (MenuStyling.kt:80)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/*  82 */         MenuItemState.chooseValue-impl(state, 
/*  83 */           Color.box-impl(this.content), 
/*  84 */           Color.box-impl(this.contentDisabled), 
/*  85 */           Color.box-impl(this.contentFocused), 
/*  86 */           Color.box-impl(this.contentPressed), 
/*  87 */           Color.box-impl(this.contentHovered), 
/*  88 */           Color.box-impl(this.content), $composer, 0x380000 & $changed << 18), $composer, 0);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return state1; } @Composable
/*     */   @NotNull
/*  94 */   public final State<Color> iconTintFor-VIR8D2g(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(1515243498); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1515243498, $changed, -1, "org.jetbrains.jewel.ui.component.styling.MenuItemColors.iconTintFor (MenuStyling.kt:93)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/*  95 */         MenuItemState.chooseValue-impl(state, 
/*  96 */           Color.box-impl(this.iconTint), 
/*  97 */           Color.box-impl(this.iconTintDisabled), 
/*  98 */           Color.box-impl(this.iconTintFocused), 
/*  99 */           Color.box-impl(this.iconTintPressed), 
/* 100 */           Color.box-impl(this.iconTintHovered), 
/* 101 */           Color.box-impl(this.iconTint), $composer, 0x380000 & $changed << 18), $composer, 0);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return state1; } @Composable
/*     */   @NotNull
/* 107 */   public final State<Color> keybindingTintFor-VIR8D2g(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-1737863363); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1737863363, $changed, -1, "org.jetbrains.jewel.ui.component.styling.MenuItemColors.keybindingTintFor (MenuStyling.kt:106)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/* 108 */         MenuItemState.chooseValue-impl(state, 
/* 109 */           Color.box-impl(this.keybindingTint), 
/* 110 */           Color.box-impl(this.keybindingTintDisabled), 
/* 111 */           Color.box-impl(this.keybindingTintFocused), 
/* 112 */           Color.box-impl(this.keybindingTintPressed), 
/* 113 */           Color.box-impl(this.keybindingTintHovered), 
/* 114 */           Color.box-impl(this.keybindingTint), $composer, 0x380000 & $changed << 18), $composer, 0);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return state1; }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof MenuItemColors))
/*     */       return false; 
/*     */     MenuItemColors menuItemColors = (MenuItemColors)other;
/*     */     return !Color.equals-impl0(this.background, menuItemColors.background) ? false : (!Color.equals-impl0(this.backgroundDisabled, menuItemColors.backgroundDisabled) ? false : (!Color.equals-impl0(this.backgroundFocused, menuItemColors.backgroundFocused) ? false : (!Color.equals-impl0(this.backgroundPressed, menuItemColors.backgroundPressed) ? false : (!Color.equals-impl0(this.backgroundHovered, menuItemColors.backgroundHovered) ? false : (!Color.equals-impl0(this.content, menuItemColors.content) ? false : (!Color.equals-impl0(this.contentDisabled, menuItemColors.contentDisabled) ? false : (!Color.equals-impl0(this.contentFocused, menuItemColors.contentFocused) ? false : (!Color.equals-impl0(this.contentPressed, menuItemColors.contentPressed) ? false : (!Color.equals-impl0(this.contentHovered, menuItemColors.contentHovered) ? false : (!Color.equals-impl0(this.iconTint, menuItemColors.iconTint) ? false : (!Color.equals-impl0(this.iconTintDisabled, menuItemColors.iconTintDisabled) ? false : (!Color.equals-impl0(this.iconTintFocused, menuItemColors.iconTintFocused) ? false : (!Color.equals-impl0(this.iconTintPressed, menuItemColors.iconTintPressed) ? false : (!Color.equals-impl0(this.iconTintHovered, menuItemColors.iconTintHovered) ? false : (!Color.equals-impl0(this.keybindingTint, menuItemColors.keybindingTint) ? false : (!Color.equals-impl0(this.keybindingTintDisabled, menuItemColors.keybindingTintDisabled) ? false : (!Color.equals-impl0(this.keybindingTintFocused, menuItemColors.keybindingTintFocused) ? false : (!Color.equals-impl0(this.keybindingTintPressed, menuItemColors.keybindingTintPressed) ? false : (!Color.equals-impl0(this.keybindingTintHovered, menuItemColors.keybindingTintHovered) ? false : (!!Color.equals-impl0(this.separator, menuItemColors.separator)))))))))))))))))))));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Color.hashCode-impl(this.background);
/*     */     result = result * 31 + Color.hashCode-impl(this.backgroundDisabled);
/*     */     result = result * 31 + Color.hashCode-impl(this.backgroundFocused);
/*     */     result = result * 31 + Color.hashCode-impl(this.backgroundPressed);
/*     */     result = result * 31 + Color.hashCode-impl(this.backgroundHovered);
/*     */     result = result * 31 + Color.hashCode-impl(this.content);
/*     */     result = result * 31 + Color.hashCode-impl(this.contentDisabled);
/*     */     result = result * 31 + Color.hashCode-impl(this.contentFocused);
/*     */     result = result * 31 + Color.hashCode-impl(this.contentPressed);
/*     */     result = result * 31 + Color.hashCode-impl(this.contentHovered);
/*     */     result = result * 31 + Color.hashCode-impl(this.iconTint);
/*     */     result = result * 31 + Color.hashCode-impl(this.iconTintDisabled);
/*     */     result = result * 31 + Color.hashCode-impl(this.iconTintFocused);
/*     */     result = result * 31 + Color.hashCode-impl(this.iconTintPressed);
/*     */     result = result * 31 + Color.hashCode-impl(this.iconTintHovered);
/*     */     result = result * 31 + Color.hashCode-impl(this.keybindingTint);
/*     */     result = result * 31 + Color.hashCode-impl(this.keybindingTintDisabled);
/*     */     result = result * 31 + Color.hashCode-impl(this.keybindingTintFocused);
/*     */     result = result * 31 + Color.hashCode-impl(this.keybindingTintPressed);
/*     */     result = result * 31 + Color.hashCode-impl(this.keybindingTintHovered);
/*     */     return result * 31 + Color.hashCode-impl(this.separator);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "MenuItemColors(background=" + Color.toString-impl(this.background) + ", backgroundDisabled=" + Color.toString-impl(this.backgroundDisabled) + ", backgroundFocused=" + Color.toString-impl(this.backgroundFocused) + ", backgroundPressed=" + Color.toString-impl(this.backgroundPressed) + ", backgroundHovered=" + Color.toString-impl(this.backgroundHovered) + ", content=" + Color.toString-impl(this.content) + ", contentDisabled=" + Color.toString-impl(this.contentDisabled) + ", contentFocused=" + Color.toString-impl(this.contentFocused) + ", contentPressed=" + Color.toString-impl(this.contentPressed) + ", contentHovered=" + Color.toString-impl(this.contentHovered) + ", iconTint=" + Color.toString-impl(this.iconTint) + ", iconTintDisabled=" + Color.toString-impl(this.iconTintDisabled) + ", iconTintFocused=" + Color.toString-impl(this.iconTintFocused) + ", iconTintPressed=" + Color.toString-impl(this.iconTintPressed) + ", iconTintHovered=" + Color.toString-impl(this.iconTintHovered) + ", keybindingTint=" + Color.toString-impl(this.keybindingTint) + ", keybindingTintDisabled=" + Color.toString-impl(this.keybindingTintDisabled) + ", keybindingTintFocused=" + Color.toString-impl(this.keybindingTintFocused) + ", keybindingTintPressed=" + Color.toString-impl(this.keybindingTintPressed) + ", keybindingTintHovered=" + Color.toString-impl(this.keybindingTintHovered) + ", separator=" + Color.toString-impl(this.separator) + ")";
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors$Companion;", "", "<init>", "()V", "ui"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\MenuItemColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */