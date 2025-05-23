/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.platform.DesktopFont_desktopKt;
/*     */ import androidx.compose.ui.text.platform.Platform;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\f\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\007\030\000 \0272\0020\001:\001\027B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007¢\006\002\020\tJ\023\020\021\032\0020\0072\b\020\022\032\004\030\0010\001H\002J\b\020\023\032\0020\024H\026J\b\020\025\032\0020\026H\026R\021\020\b\032\0020\007¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\013¨\006\030"}, d2 = {"Landroidx/compose/ui/text/FontRasterizationSettings;", "", "smoothing", "Landroidx/compose/ui/text/FontSmoothing;", "hinting", "Landroidx/compose/ui/text/FontHinting;", "subpixelPositioning", "", "autoHintingForced", "(Landroidx/compose/ui/text/FontSmoothing;Landroidx/compose/ui/text/FontHinting;ZZ)V", "getAutoHintingForced", "()Z", "getHinting", "()Landroidx/compose/ui/text/FontHinting;", "getSmoothing", "()Landroidx/compose/ui/text/FontSmoothing;", "getSubpixelPositioning", "equals", "other", "hashCode", "", "toString", "", "Companion", "ui-text"})
/*     */ @ExperimentalTextApi
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class FontRasterizationSettings
/*     */ {
/*     */   @NotNull
/*     */   public final FontSmoothing getSmoothing() {
/*     */     return this.smoothing;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final FontHinting getHinting() {
/*     */     return this.hinting;
/*     */   }
/*     */   
/*     */   public FontRasterizationSettings(@NotNull FontSmoothing smoothing, @NotNull FontHinting hinting, boolean subpixelPositioning, boolean autoHintingForced) {
/*  72 */     this.smoothing = smoothing;
/*  73 */     this.hinting = hinting;
/*  74 */     this.subpixelPositioning = subpixelPositioning;
/*  75 */     this.autoHintingForced = autoHintingForced; } public final boolean getSubpixelPositioning() { return this.subpixelPositioning; } public final boolean getAutoHintingForced() { return this.autoHintingForced; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\033\020\003\032\0020\0048FX\002¢\006\f\n\004\b\007\020\b\032\004\b\005\020\006¨\006\t"}, d2 = {"Landroidx/compose/ui/text/FontRasterizationSettings$Companion;", "", "()V", "PlatformDefault", "Landroidx/compose/ui/text/FontRasterizationSettings;", "getPlatformDefault", "()Landroidx/compose/ui/text/FontRasterizationSettings;", "PlatformDefault$delegate", "Lkotlin/Lazy;", "ui-text"})
/*     */   public static final class Companion { private Companion() {}
/*     */     @NotNull
/*  78 */     public final FontRasterizationSettings getPlatformDefault() { Lazy lazy = FontRasterizationSettings.PlatformDefault$delegate; return (FontRasterizationSettings)lazy.getValue(); } } @NotNull private final FontSmoothing smoothing; @NotNull private final FontHinting hinting; private final boolean subpixelPositioning; @NotNull public static final Companion Companion = new Companion(null); private final boolean autoHintingForced; public static final int $stable; @NotNull private static final Lazy<FontRasterizationSettings> PlatformDefault$delegate = LazyKt.lazy(FontRasterizationSettings$Companion$PlatformDefault$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/FontRasterizationSettings;", "invoke"}) static final class FontRasterizationSettings$Companion$PlatformDefault$2 extends Lambda implements Function0<FontRasterizationSettings> { public static final FontRasterizationSettings$Companion$PlatformDefault$2 INSTANCE = new FontRasterizationSettings$Companion$PlatformDefault$2(); @NotNull public final FontRasterizationSettings invoke() { FontSmoothing fontSmoothing; FontHinting fontHinting;
/*  79 */       switch (WhenMappings.$EnumSwitchMapping$0[DesktopFont_desktopKt.currentPlatform().ordinal()]) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         case 1:
/*  85 */           fontSmoothing = FontSmoothing.AntiAlias;
/*  86 */           fontHinting = FontHinting.Normal; return new FontRasterizationSettings(fontSmoothing, fontHinting, true, 
/*  87 */               false);
/*     */ 
/*     */         
/*     */         case 2:
/*     */         case 3:
/*  92 */           fontSmoothing = FontSmoothing.AntiAlias;
/*  93 */           fontHinting = FontHinting.Slight; return new FontRasterizationSettings(fontSmoothing, fontHinting, true, 
/*  94 */               false);
/*     */ 
/*     */ 
/*     */         
/*     */         case 4:
/*  99 */           fontSmoothing = FontSmoothing.AntiAlias;
/* 100 */           fontHinting = FontHinting.Slight; return new FontRasterizationSettings(fontSmoothing, fontHinting, true, 
/* 101 */               false);
/*     */         case 5:
/*     */         case 6:
/*     */         case 7:
/*     */         case 8:
/* 106 */           fontSmoothing = FontSmoothing.AntiAlias;
/* 107 */           fontHinting = FontHinting.Normal; return new FontRasterizationSettings(fontSmoothing, fontHinting, true, 
/* 108 */               false);
/*     */       } 
/*     */       throw new NoWhenBranchMatchedException(); }
/*     */      FontRasterizationSettings$Companion$PlatformDefault$2() {
/*     */       super(0);
/*     */     } }
/*     */   public boolean equals(@Nullable Object other) {
/* 115 */     if (this == other) return true; 
/* 116 */     if (other == null || getClass() != other.getClass()) return false;
/*     */     
/* 118 */     (FontRasterizationSettings)other;
/*     */     
/* 120 */     if (this.smoothing != ((FontRasterizationSettings)other).smoothing) return false; 
/* 121 */     if (this.hinting != ((FontRasterizationSettings)other).hinting) return false; 
/* 122 */     if (this.subpixelPositioning != ((FontRasterizationSettings)other).subpixelPositioning) return false; 
/* 123 */     return (this.autoHintingForced == ((FontRasterizationSettings)other).autoHintingForced);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 127 */     int result = this.smoothing.hashCode();
/* 128 */     result = 31 * result + this.hinting.hashCode();
/* 129 */     result = 31 * result + Boolean.hashCode(this.subpixelPositioning);
/* 130 */     result = 31 * result + Boolean.hashCode(this.autoHintingForced);
/* 131 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 135 */     return "FontRasterizationSettings(smoothing=" + this.smoothing + ", hinting=" + 
/* 136 */       this.hinting + ", subpixelPositioning=" + 
/* 137 */       this.subpixelPositioning + ", autoHintingForced=" + 
/* 138 */       this.autoHintingForced + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\FontRasterizationSettings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */