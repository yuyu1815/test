/*     */ package org.jetbrains.jewel.ui.component.styling;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*     */ import org.jetbrains.jewel.ui.component.TabState;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @GenerateDataFunctions
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\027\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\007\030\000 \"2\0020\001:\001\"BW\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003\022\006\020\t\032\0020\003\022\006\020\n\032\0020\003\022\006\020\013\032\0020\003\022\006\020\f\032\0020\003¢\006\004\b\r\020\016J\035\020\032\032\b\022\004\022\0020\0030\0332\006\020\034\032\0020\035H\007¢\006\004\b\036\020\037J\035\020 \032\b\022\004\022\0020\0030\0332\006\020\034\032\0020\035H\007¢\006\004\b!\020\037R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\017\020\020R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\021\020\020R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\022\020\020R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\023\020\020R\021\020\007\032\0020\003¢\006\b\n\000\032\004\b\024\020\020R\021\020\b\032\0020\003¢\006\b\n\000\032\004\b\025\020\020R\021\020\t\032\0020\003¢\006\b\n\000\032\004\b\026\020\020R\021\020\n\032\0020\003¢\006\b\n\000\032\004\b\027\020\020R\021\020\013\032\0020\003¢\006\b\n\000\032\004\b\030\020\020R\021\020\f\032\0020\003¢\006\b\n\000\032\004\b\031\020\020¨\006#"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/TabContentAlpha;", "", "iconNormal", "", "iconDisabled", "iconPressed", "iconHovered", "iconSelected", "contentNormal", "contentDisabled", "contentPressed", "contentHovered", "contentSelected", "<init>", "(FFFFFFFFFF)V", "getIconNormal", "()F", "getIconDisabled", "getIconPressed", "getIconHovered", "getIconSelected", "getContentNormal", "getContentDisabled", "getContentPressed", "getContentHovered", "getContentSelected", "iconFor", "Landroidx/compose/runtime/State;", "state", "Lorg/jetbrains/jewel/ui/component/TabState;", "iconFor-UXw_FYk", "(JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentFor", "contentFor-UXw_FYk", "Companion", "ui"})
/*     */ @Immutable
/*     */ public final class TabContentAlpha
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final float iconNormal;
/*     */   private final float iconDisabled;
/*     */   private final float iconPressed;
/*     */   private final float iconHovered;
/*     */   private final float iconSelected;
/*     */   private final float contentNormal;
/*     */   private final float contentDisabled;
/*     */   private final float contentPressed;
/*     */   private final float contentHovered;
/*     */   private final float contentSelected;
/*     */   public static final int $stable;
/*     */   
/*     */   public final float getIconNormal() {
/*     */     return this.iconNormal;
/*     */   }
/*     */   
/*     */   public final float getIconDisabled() {
/*     */     return this.iconDisabled;
/*     */   }
/*     */   
/*     */   public final float getIconPressed() {
/*     */     return this.iconPressed;
/*     */   }
/*     */   
/*     */   public final float getIconHovered() {
/*     */     return this.iconHovered;
/*     */   }
/*     */   
/*     */   public final float getIconSelected() {
/*     */     return this.iconSelected;
/*     */   }
/*     */   
/*     */   public final float getContentNormal() {
/*     */     return this.contentNormal;
/*     */   }
/*     */   
/*     */   public final float getContentDisabled() {
/*     */     return this.contentDisabled;
/*     */   }
/*     */   
/*     */   public final float getContentPressed() {
/*     */     return this.contentPressed;
/*     */   }
/*     */   
/*     */   public final float getContentHovered() {
/*     */     return this.contentHovered;
/*     */   }
/*     */   
/*     */   public TabContentAlpha(float iconNormal, float iconDisabled, float iconPressed, float iconHovered, float iconSelected, float contentNormal, float contentDisabled, float contentPressed, float contentHovered, float contentSelected) {
/* 117 */     this.iconNormal = iconNormal;
/* 118 */     this.iconDisabled = iconDisabled;
/* 119 */     this.iconPressed = iconPressed;
/* 120 */     this.iconHovered = iconHovered;
/* 121 */     this.iconSelected = iconSelected;
/* 122 */     this.contentNormal = contentNormal;
/* 123 */     this.contentDisabled = contentDisabled;
/* 124 */     this.contentPressed = contentPressed;
/* 125 */     this.contentHovered = contentHovered;
/* 126 */     this.contentSelected = contentSelected; } public final float getContentSelected() { return this.contentSelected; }
/*     */   
/*     */   @Composable
/*     */   @NotNull
/* 130 */   public final State<Float> iconFor-UXw_FYk(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-2056285828); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-2056285828, $changed, -1, "org.jetbrains.jewel.ui.component.styling.TabContentAlpha.iconFor (TabStyling.kt:129)");  $composer.startReplaceGroup(699027949);
/* 131 */     float f = 
/* 132 */       TabState.isSelected-impl(state) ? this.iconSelected : (
/*     */       
/* 134 */       (Number)TabStylingKt.access$chooseValueIgnoreCompat-AU5ekdQ(state, 
/* 135 */         Float.valueOf(this.iconNormal), 
/* 136 */         Float.valueOf(this.iconDisabled), 
/* 137 */         Float.valueOf(this.iconPressed), 
/* 138 */         Float.valueOf(this.iconHovered), 
/* 139 */         Float.valueOf(this.iconNormal), $composer, 0xE & $changed)).floatValue();
/*     */     $composer.endReplaceGroup();
/*     */     State<Float> state1 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(f), $composer, 0);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return state1; } @Composable @NotNull
/* 146 */   public final State<Float> contentFor-UXw_FYk(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-1472279648); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1472279648, $changed, -1, "org.jetbrains.jewel.ui.component.styling.TabContentAlpha.contentFor (TabStyling.kt:145)");  $composer.startReplaceGroup(1923569507);
/* 147 */     float f = 
/* 148 */       TabState.isSelected-impl(state) ? this.contentSelected : (
/*     */       
/* 150 */       (Number)TabStylingKt.access$chooseValueIgnoreCompat-AU5ekdQ(state, 
/* 151 */         Float.valueOf(this.contentNormal), 
/* 152 */         Float.valueOf(this.contentDisabled), 
/* 153 */         Float.valueOf(this.contentPressed), 
/* 154 */         Float.valueOf(this.contentHovered), 
/* 155 */         Float.valueOf(this.contentNormal), $composer, 0xE & $changed)).floatValue();
/*     */     $composer.endReplaceGroup();
/*     */     State<Float> state1 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(f), $composer, 0);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return state1; }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof TabContentAlpha))
/*     */       return false; 
/*     */     TabContentAlpha tabContentAlpha = (TabContentAlpha)other;
/*     */     return (Float.compare(this.iconNormal, tabContentAlpha.iconNormal) != 0) ? false : ((Float.compare(this.iconDisabled, tabContentAlpha.iconDisabled) != 0) ? false : ((Float.compare(this.iconPressed, tabContentAlpha.iconPressed) != 0) ? false : ((Float.compare(this.iconHovered, tabContentAlpha.iconHovered) != 0) ? false : ((Float.compare(this.iconSelected, tabContentAlpha.iconSelected) != 0) ? false : ((Float.compare(this.contentNormal, tabContentAlpha.contentNormal) != 0) ? false : ((Float.compare(this.contentDisabled, tabContentAlpha.contentDisabled) != 0) ? false : ((Float.compare(this.contentPressed, tabContentAlpha.contentPressed) != 0) ? false : ((Float.compare(this.contentHovered, tabContentAlpha.contentHovered) != 0) ? false : (!(Float.compare(this.contentSelected, tabContentAlpha.contentSelected) != 0))))))))));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Float.hashCode(this.iconNormal);
/*     */     result = result * 31 + Float.hashCode(this.iconDisabled);
/*     */     result = result * 31 + Float.hashCode(this.iconPressed);
/*     */     result = result * 31 + Float.hashCode(this.iconHovered);
/*     */     result = result * 31 + Float.hashCode(this.iconSelected);
/*     */     result = result * 31 + Float.hashCode(this.contentNormal);
/*     */     result = result * 31 + Float.hashCode(this.contentDisabled);
/*     */     result = result * 31 + Float.hashCode(this.contentPressed);
/*     */     result = result * 31 + Float.hashCode(this.contentHovered);
/*     */     return result * 31 + Float.hashCode(this.contentSelected);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "TabContentAlpha(iconNormal=" + this.iconNormal + ", iconDisabled=" + this.iconDisabled + ", iconPressed=" + this.iconPressed + ", iconHovered=" + this.iconHovered + ", iconSelected=" + this.iconSelected + ", contentNormal=" + this.contentNormal + ", contentDisabled=" + this.contentDisabled + ", contentPressed=" + this.contentPressed + ", contentHovered=" + this.contentHovered + ", contentSelected=" + this.contentSelected + ")";
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/TabContentAlpha$Companion;", "", "<init>", "()V", "ui"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\TabContentAlpha.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */