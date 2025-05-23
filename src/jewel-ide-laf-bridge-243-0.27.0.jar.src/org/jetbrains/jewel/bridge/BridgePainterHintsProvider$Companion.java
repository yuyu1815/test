/*     */ package org.jetbrains.jewel.bridge;
/*     */ 
/*     */ import com.intellij.ide.ui.UITheme;
/*     */ import com.intellij.ide.ui.laf.UIThemeExportableBean;
/*     */ import com.intellij.ide.ui.laf.UIThemeLookAndFeelInfo;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.ui.painter.PalettePainterHintsProvider;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\"\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\021\020\006\032\0020\0072\006\020\b\032\0020\tH\002R\016\020\004\032\0020\005X\004¢\006\002\n\000R\024\020\n\032\b\022\004\022\0020\f0\013X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lorg/jetbrains/jewel/bridge/BridgePainterHintsProvider$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "invoke", "Lorg/jetbrains/jewel/ui/painter/PalettePainterHintsProvider;", "isDark", "", "supportedCheckboxKeys", "", "", "ide-laf-bridge"})
/*     */ @SourceDebugExtension({"SMAP\nBridgePainterHintsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgePainterHintsProvider.kt\norg/jetbrains/jewel/bridge/BridgePainterHintsProvider$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n462#2:146\n412#2:147\n462#2:152\n412#2:153\n1246#3,4:148\n1246#3,4:154\n*S KotlinDebug\n*F\n+ 1 BridgePainterHintsProvider.kt\norg/jetbrains/jewel/bridge/BridgePainterHintsProvider$Companion\n*L\n113#1:146\n113#1:147\n121#1:152\n121#1:153\n113#1:148,4\n121#1:154,4\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final PalettePainterHintsProvider invoke(boolean isDark) {
/*     */     UIThemeLookAndFeelInfo uiTheme;
/* 108 */     if (UiThemeExtensionsKt.currentUiThemeOrNull() == null) { UiThemeExtensionsKt.currentUiThemeOrNull(); return new BridgePainterHintsProvider(isDark, null, null, null, 14, null); }
/* 109 */      BridgePainterHintsProvider.access$getLogger$cp().info("Parsing theme info from theme " + uiTheme.getName() + " (id: " + uiTheme.getId() + ", isDark: " + uiTheme.isDark() + ")");
/*     */     
/* 111 */     UIThemeExportableBean bean = uiTheme.describe();
/*     */     
/* 113 */     Intrinsics.checkNotNull(bean.getColorPalette(), "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"); Map $this$mapValues$iv = bean.getColorPalette(); int $i$f$mapValues = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 146 */     Map map2 = $this$mapValues$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(MapsKt.mapCapacity($this$mapValues$iv.size())); int $i$f$mapValuesTo = 0;
/* 147 */     Iterable $this$associateByTo$iv$iv$iv = map2.entrySet(); int $i$f$associateByTo = 0;
/* 148 */     for (Object element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
/* 149 */       Map.Entry entry1 = (Map.Entry)element$iv$iv$iv; Map<Object, Object> map5 = destination$iv$iv; int $i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv = 0; Map.Entry entry2 = (Map.Entry)element$iv$iv$iv; Object object1 = entry1.getKey(); Map<Object, Object> map6 = map5; int $i$a$-mapValues-BridgePainterHintsProvider$Companion$invoke$iconColorPalette$1 = 0;
/*     */     } 
/* 151 */     Map<Object, Object> iconColorPalette = destination$iv$iv; Map keyPalette = UITheme.Companion.getColorPalette(); Map map1 = bean.getColors(); int i = 0;
/* 152 */     Map map3 = map1; Map<Object, Object> map4 = new LinkedHashMap<>(MapsKt.mapCapacity(map1.size())); int j = 0;
/* 153 */     Iterable iterable1 = map3.entrySet(); int k = 0;
/* 154 */     for (Object element$iv$iv$iv : iterable1) {
/* 155 */       Map.Entry entry = (Map.Entry)element$iv$iv$iv; Map<Object, Object> map5 = map4; int $i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv = 0; Object value = element$iv$iv$iv, object1 = entry.getKey(); Map<Object, Object> map6 = map5; int $i$a$-mapValues-BridgePainterHintsProvider$Companion$invoke$themeColors$1 = 0;
/*     */     } 
/* 157 */     Map<Object, Object> themeColors = map4;
/*     */     return new BridgePainterHintsProvider(isDark, keyPalette, iconColorPalette, themeColors, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\BridgePainterHintsProvider$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */