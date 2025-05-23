/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ import androidx.compose.ui.text.TextStyle;
/*    */ import androidx.compose.ui.unit.TextUnit;
/*    */ import androidx.compose.ui.unit.TextUnitKt;
/*    */ import com.intellij.openapi.editor.colors.EditorColorsScheme;
/*    */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\003\032\006\020\000\032\0020\001\032\006\020\002\032\0020\001\032\006\020\003\032\0020\001¨\006\004"}, d2 = {"retrieveDefaultTextStyle", "Landroidx/compose/ui/text/TextStyle;", "retrieveEditorTextStyle", "retrieveConsoleTextStyle", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nIntUiBridgeText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeText.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeTextKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,49:1\n147#2,2:50\n147#2,2:52\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeText.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeTextKt\n*L\n25#1:50,2\n45#1:52,2\n*E\n"})
/*    */ public final class IntUiBridgeTextKt {
/*    */   @NotNull
/*    */   public static final TextStyle retrieveDefaultTextStyle() {
/* 13 */     return BridgeUtilsKt.retrieveTextStyle-tD9LlGs$default("Label.font", "Label.foreground", 0L, false, 0, 0L, 60, null);
/*    */   }
/*    */   
/*    */   @NotNull
/* 17 */   public static final TextStyle retrieveEditorTextStyle() { EditorColorsScheme editorColorScheme = BridgeUtilsKt.retrieveEditorColorScheme();
/*    */     
/* 19 */     long fontSize = TextUnitKt.getSp(editorColorScheme.getEditorFontSize());
/* 20 */     TextStyle textStyle = retrieveDefaultTextStyle();
/*    */     
/* 22 */     Intrinsics.checkNotNullExpressionValue(editorColorScheme.getDefaultForeground(), "getDefaultForeground(...)"); long l1 = BridgeUtilsKt.toComposeColor(editorColorScheme.getDefaultForeground());
/* 23 */     Intrinsics.checkNotNullExpressionValue(editorColorScheme.getFont(EditorFontType.PLAIN), "getFont(...)"); FontFamily fontFamily = AwtFontInteropKt.asComposeFontFamily(editorColorScheme.getFont(EditorFontType.PLAIN));
/*    */     
/* 25 */     float other$iv = editorColorScheme.getLineSpacing(); int $i$f$times-kPz2Gy4 = 0;
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
/* 50 */     TextUnitKt.checkArithmetic--R2X_6o(fontSize);
/* 51 */     long l2 = TextUnitKt.pack(TextUnit.getRawType-impl(fontSize), TextUnit.getValue-impl(fontSize) * other$iv); String str = !editorColorScheme.isUseLigatures() ? "liga 0" : "liga 1"; return TextStyle.copy-p1EtxEg$default(textStyle, l1, fontSize, null, null, null, fontFamily, str, 0L, null, null, null, 0L, null, null, null, 0, 0, l2, null, null, null, 0, 0, null, 16646044, null); } @NotNull public static final TextStyle retrieveConsoleTextStyle() { EditorColorsScheme editorColorScheme = BridgeUtilsKt.retrieveEditorColorScheme(); if (editorColorScheme.isUseEditorFontPreferencesInConsole())
/* 52 */       return retrieveEditorTextStyle();  long fontSize = TextUnitKt.getSp(editorColorScheme.getConsoleFontSize()); if (editorColorScheme.getColor(ColorKey.createColorKey("BLOCK_TERMINAL_DEFAULT_FOREGROUND")) == null) { editorColorScheme.getColor(ColorKey.createColorKey("BLOCK_TERMINAL_DEFAULT_FOREGROUND")); Intrinsics.checkNotNullExpressionValue(editorColorScheme.getDefaultForeground(), "getDefaultForeground(...)"); }  Color fontColor = editorColorScheme.getDefaultForeground(); TextStyle textStyle = retrieveDefaultTextStyle(); long l1 = BridgeUtilsKt.toComposeColor(fontColor); Intrinsics.checkNotNullExpressionValue(editorColorScheme.getFont(EditorFontType.CONSOLE_PLAIN), "getFont(...)"); FontFamily fontFamily = AwtFontInteropKt.asComposeFontFamily(editorColorScheme.getFont(EditorFontType.CONSOLE_PLAIN)); float other$iv = editorColorScheme.getLineSpacing(); int $i$f$times-kPz2Gy4 = 0; TextUnitKt.checkArithmetic--R2X_6o(fontSize);
/* 53 */     long l2 = TextUnitKt.pack(TextUnit.getRawType-impl(fontSize), TextUnit.getValue-impl(fontSize) * other$iv);
/*    */     String str = !editorColorScheme.isUseLigatures() ? "liga 0" : "liga 1";
/*    */     return TextStyle.copy-p1EtxEg$default(textStyle, l1, fontSize, null, null, null, fontFamily, str, 0L, null, null, null, 0L, null, null, null, 0, 0, l2, null, null, null, 0, 0, null, 16646044, null); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeTextKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */