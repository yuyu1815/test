/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import androidx.compose.ui.graphics.Shadow;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*     */ import androidx.compose.ui.text.PlaceholderVerticalAlign;
/*     */ import androidx.compose.ui.text.SpanStyle;
/*     */ import androidx.compose.ui.text.TextDecorationLineStyle;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.text.WeakKeysCache;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.font.FontStyle;
/*     */ import androidx.compose.ui.text.font.FontSynthesis;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import androidx.compose.ui.text.style.LineHeightStyle;
/*     */ import androidx.compose.ui.text.style.ResolvedTextDirection;
/*     */ import androidx.compose.ui.text.style.TextAlign;
/*     */ import androidx.compose.ui.text.style.TextDecoration;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.TextUnit;
/*     */ import androidx.compose.ui.unit.TextUnitKt;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.skia.FontStyle;
/*     */ import org.jetbrains.skia.paragraph.Alignment;
/*     */ import org.jetbrains.skia.paragraph.DecorationLineStyle;
/*     */ import org.jetbrains.skia.paragraph.DecorationStyle;
/*     */ import org.jetbrains.skia.paragraph.Direction;
/*     */ import org.jetbrains.skia.paragraph.HeightMode;
/*     */ import org.jetbrains.skia.paragraph.PlaceholderAlignment;
/*     */ import org.jetbrains.skia.paragraph.Shadow;
/*     */ import org.jetbrains.skia.paragraph.TextBox;
/*     */ import org.jetbrains.skia.paragraph.TextStyle;
/*     */ 


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\SkiaParagraph_skikoKt__ParagraphBuilder_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */