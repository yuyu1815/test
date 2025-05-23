/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\b\007\030\000 \0172\0020\001:\001\017B\007\b\026¢\006\002\020\002B\021\b\027\022\b\b\002\020\003\032\0020\004¢\006\002\020\005J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001H\002J\b\020\f\032\0020\rH\026J\020\020\016\032\0020\0002\b\020\013\032\004\030\0010\000R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\b¨\006\020"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle;", "", "()V", "fontRasterizationSettings", "Landroidx/compose/ui/text/FontRasterizationSettings;", "(Landroidx/compose/ui/text/FontRasterizationSettings;)V", "getFontRasterizationSettings$annotations", "getFontRasterizationSettings", "()Landroidx/compose/ui/text/FontRasterizationSettings;", "equals", "", "other", "hashCode", "", "merge", "Companion", "ui-text"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class PlatformParagraphStyle
/*     */ {
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getDefault", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "ui-text"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final PlatformParagraphStyle getDefault() {
/*  79 */       return PlatformParagraphStyle.Default; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final FontRasterizationSettings fontRasterizationSettings; public static final int $stable; @NotNull private static final PlatformParagraphStyle Default = new PlatformParagraphStyle();
/*     */   
/*     */   @NotNull
/*     */   public final FontRasterizationSettings getFontRasterizationSettings() {
/*  83 */     return this.fontRasterizationSettings;
/*     */   }
/*     */   public PlatformParagraphStyle() {
/*  86 */     this.fontRasterizationSettings = FontRasterizationSettings.Companion.getPlatformDefault();
/*     */   }
/*     */   
/*     */   @ExperimentalTextApi
/*     */   public PlatformParagraphStyle(@NotNull FontRasterizationSettings fontRasterizationSettings) {
/*  91 */     this.fontRasterizationSettings = fontRasterizationSettings;
/*     */   }
/*     */   @NotNull
/*     */   public final PlatformParagraphStyle merge(@Nullable PlatformParagraphStyle other) {
/*  95 */     if (other == null) return this;
/*     */     
/*  97 */     return other;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 101 */     if (this == other) return true; 
/* 102 */     if (!(other instanceof PlatformParagraphStyle)) return false; 
/* 103 */     if (!Intrinsics.areEqual(this.fontRasterizationSettings, ((PlatformParagraphStyle)other).fontRasterizationSettings)) return false; 
/* 104 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 108 */     return this.fontRasterizationSettings.hashCode();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\PlatformParagraphStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */