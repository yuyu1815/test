/*    */ package org.jetbrains.jewel.ui.painter.hints;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import kotlin.Pair;
/*    */ import kotlin.TuplesKt;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.painter.PainterHint;
/*    */ import org.w3c.dom.Element;
/*    */ import org.w3c.dom.Node;
/*    */ import org.w3c.dom.NodeList;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000*\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\032 \020\000\032\0020\001*\0020\0022\022\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\004H\002\032\034\020\007\032\016\022\004\022\0020\005\022\004\022\0020\0050\b2\006\020\t\032\0020\005H\002\032#\020\n\032\0020\001*\0020\0022\006\020\013\032\0020\0052\b\020\f\032\004\030\0010\006H\002¢\006\002\b\r\032\032\020\016\032\0020\0172\022\020\020\032\016\022\004\022\0020\005\022\004\022\0020\0060\004¨\006\021"}, d2 = {"patchPalette", "", "Lorg/w3c/dom/Element;", "replacementColors", "", "", "Landroidx/compose/ui/graphics/Color;", "parseKeysFromId", "Lkotlin/Pair;", "id", "patchColorAttribute", "attrName", "newColor", "patchColorAttribute-t9lfQc4", "KeyBasedPaletteReplacement", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "paletteMap", "ui"})
/*    */ @SourceDebugExtension({"SMAP\nKeyBasedPaletteReplacement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyBasedPaletteReplacement.kt\norg/jetbrains/jewel/ui/painter/hints/KeyBasedPaletteReplacementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/*    */ public final class KeyBasedPaletteReplacementKt {
/*    */   private static final void patchPalette(Element $this$patchPalette, Map<String, Color> replacementColors) {
/* 21 */     CharSequence charSequence = $this$patchPalette.getAttribute("id");
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
/* 68 */     int $i$a$-ifEmpty-KeyBasedPaletteReplacementKt$patchPalette$id$1 = 0;
/*    */     String id = ((charSequence.length() == 0)) ? null : (String)charSequence;
/*    */     if (id != null) {
/*    */       Pair<String, String> pair = parseKeysFromId(id);
/*    */       String fillKey = (String)pair.component1(), strokeKey = (String)pair.component2();
/*    */       patchColorAttribute-t9lfQc4($this$patchPalette, "fill", (Color)replacementColors.get(fillKey));
/*    */       patchColorAttribute-t9lfQc4($this$patchPalette, "stroke", (Color)replacementColors.get(strokeKey));
/*    */     } 
/*    */     NodeList nodes = $this$patchPalette.getChildNodes();
/*    */     int length = nodes.getLength();
/*    */     for (int i = 0; i < length; i++) {
/*    */       Node item = nodes.item(i);
/*    */       if (item instanceof Element)
/*    */         patchPalette((Element)item, replacementColors); 
/*    */     } 
/*    */   }
/*    */   
/*    */   private static final Pair<String, String> parseKeysFromId(String id) {
/*    */     char[] arrayOfChar = new char[1];
/*    */     arrayOfChar[0] = '_';
/*    */     List parts = StringsKt.split$default(id, arrayOfChar, false, 0, 6, null);
/*    */     return (parts.size() == 2) ? TuplesKt.to(CollectionsKt.first(parts), CollectionsKt.last(parts)) : TuplesKt.to(id, id);
/*    */   }
/*    */   
/*    */   private static final void patchColorAttribute-t9lfQc4(Element $this$patchColorAttribute_u2dt9lfQc4, String attrName, Color newColor) {
/*    */     if (newColor == null)
/*    */       return; 
/*    */     if (!$this$patchColorAttribute_u2dt9lfQc4.hasAttribute(attrName))
/*    */       return; 
/*    */     $this$patchColorAttribute_u2dt9lfQc4.setAttribute(attrName, ColorExtensionsKt.toRgbaHexString-8_81llA(Color.copy-wmQWz5c$default(newColor.unbox-impl(), 1.0F, 0.0F, 0.0F, 0.0F, 14, null)));
/*    */     if (!((Color.getAlpha-impl(newColor.unbox-impl()) == 1.0F) ? 1 : 0)) {
/*    */       $this$patchColorAttribute_u2dt9lfQc4.setAttribute(attrName + "-opacity", String.valueOf(Color.getAlpha-impl(newColor.unbox-impl())));
/*    */     } else {
/*    */       $this$patchColorAttribute_u2dt9lfQc4.removeAttribute(attrName + "-opacity");
/*    */     } 
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final PainterHint KeyBasedPaletteReplacement(@NotNull Map<String, Color> paletteMap) {
/*    */     Intrinsics.checkNotNullParameter(paletteMap, "paletteMap");
/*    */     return paletteMap.isEmpty() ? (PainterHint)PainterHint.None : (PainterHint)new KeyBasedReplacementPainterSvgPatchHint(paletteMap);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\KeyBasedPaletteReplacementKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */