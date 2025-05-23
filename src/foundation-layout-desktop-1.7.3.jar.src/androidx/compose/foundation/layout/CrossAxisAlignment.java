/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.layout.AlignmentLine;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b1\030\000 \0252\0020\001:\007\023\024\025\026\027\030\031B\007\b\004¢\006\002\020\002J-\020\007\032\0020\b2\006\020\t\032\0020\b2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\bH ¢\006\002\b\017J\031\020\020\032\004\030\0010\b2\006\020\f\032\0020\rH\020¢\006\004\b\021\020\022R\024\020\003\032\0020\0048PX\004¢\006\006\032\004\b\005\020\006\001\006\032\033\034\035\036\037¨\006 "}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment;", "", "()V", "isRelative", "", "isRelative$foundation_layout", "()Z", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$foundation_layout", "calculateAlignmentLinePosition", "calculateAlignmentLinePosition$foundation_layout", "(Landroidx/compose/ui/layout/Placeable;)Ljava/lang/Integer;", "AlignmentLineCrossAxisAlignment", "CenterCrossAxisAlignment", "Companion", "EndCrossAxisAlignment", "HorizontalCrossAxisAlignment", "StartCrossAxisAlignment", "VerticalCrossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment$AlignmentLineCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$CenterCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$EndCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$StartCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$VerticalCrossAxisAlignment;", "foundation-layout"})
/*     */ @Immutable
/*     */ public abstract class CrossAxisAlignment
/*     */ {
/*     */   private CrossAxisAlignment() {}
/*     */   
/*     */   public boolean isRelative$foundation_layout() {
/*  76 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Integer calculateAlignmentLinePosition$foundation_layout(@NotNull Placeable placeable) {
/*  82 */     Intrinsics.checkNotNullParameter(placeable, "placeable"); return null;
/*     */   }
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\016\032\0020\0042\006\020\017\032\0020\020J\025\020\021\032\0020\0042\006\020\022\032\0020\023H\000¢\006\002\b\024J\025\020\025\032\0020\0042\006\020\025\032\0020\026H\000¢\006\002\b\027J\025\020\030\032\0020\0042\006\020\030\032\0020\031H\000¢\006\002\b\032R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\034\020\b\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\007R\034\020\013\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\f\020\002\032\004\b\r\020\007¨\006\033"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;", "", "()V", "Center", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCenter$annotations", "getCenter", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "End", "getEnd$annotations", "getEnd", "Start", "getStart$annotations", "getStart", "AlignmentLine", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "Relative", "alignmentLineProvider", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "Relative$foundation_layout", "horizontal", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontal$foundation_layout", "vertical", "Landroidx/compose/ui/Alignment$Vertical;", "vertical$foundation_layout", "foundation-layout"})
/*     */   public static final class Companion { private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final CrossAxisAlignment getCenter() {
/*  89 */       return CrossAxisAlignment.Center;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final CrossAxisAlignment getStart() {
/*  96 */       return CrossAxisAlignment.Start;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final CrossAxisAlignment getEnd() {
/* 103 */       return CrossAxisAlignment.End;
/*     */     }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final CrossAxisAlignment AlignmentLine(@NotNull AlignmentLine alignmentLine) {
/* 109 */       Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine"); return new CrossAxisAlignment.AlignmentLineCrossAxisAlignment(new AlignmentLineProvider.Value(alignmentLine));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final CrossAxisAlignment Relative$foundation_layout(@NotNull AlignmentLineProvider alignmentLineProvider) {
/* 116 */       Intrinsics.checkNotNullParameter(alignmentLineProvider, "alignmentLineProvider"); return new CrossAxisAlignment.AlignmentLineCrossAxisAlignment(alignmentLineProvider);
/*     */     }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final CrossAxisAlignment vertical$foundation_layout(@NotNull Alignment.Vertical vertical) {
/* 122 */       Intrinsics.checkNotNullParameter(vertical, "vertical"); return new CrossAxisAlignment.VerticalCrossAxisAlignment(vertical);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final CrossAxisAlignment horizontal$foundation_layout(@NotNull Alignment.Horizontal horizontal)
/*     */     {
/* 128 */       Intrinsics.checkNotNullParameter(horizontal, "horizontal"); return new CrossAxisAlignment.HorizontalCrossAxisAlignment(horizontal); } } @NotNull public static final Companion Companion = new Companion(null); public static final int $stable; @NotNull private static final CrossAxisAlignment Center = CenterCrossAxisAlignment.INSTANCE; @NotNull
/*     */   private static final CrossAxisAlignment Start = StartCrossAxisAlignment.INSTANCE; @NotNull
/*     */   private static final CrossAxisAlignment End = EndCrossAxisAlignment.INSTANCE; public abstract int align$foundation_layout(int paramInt1, @NotNull LayoutDirection paramLayoutDirection, @NotNull Placeable paramPlaceable, int paramInt2); @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bÂ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J-\020\003\032\0020\0042\006\020\005\032\0020\0042\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\004H\020¢\006\002\b\013¨\006\f"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$CenterCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "()V", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$foundation_layout", "foundation-layout"})
/* 131 */   private static final class CenterCrossAxisAlignment extends CrossAxisAlignment { private CenterCrossAxisAlignment() { super(null); }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public static final CenterCrossAxisAlignment INSTANCE = new CenterCrossAxisAlignment();
/*     */     
/*     */     public int align$foundation_layout(int size, @NotNull LayoutDirection layoutDirection, @NotNull Placeable placeable, int beforeCrossAxisAlignmentLine) {
/* 138 */       Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(placeable, "placeable"); return size / 2;
/*     */     } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bÂ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J-\020\003\032\0020\0042\006\020\005\032\0020\0042\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\004H\020¢\006\002\b\013¨\006\f"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$StartCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "()V", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$foundation_layout", "foundation-layout"})
/*     */   private static final class StartCrossAxisAlignment extends CrossAxisAlignment { @NotNull
/*     */     public static final StartCrossAxisAlignment INSTANCE = new StartCrossAxisAlignment(); private StartCrossAxisAlignment() {
/* 142 */       super(null);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int align$foundation_layout(int size, @NotNull LayoutDirection layoutDirection, @NotNull Placeable placeable, int beforeCrossAxisAlignmentLine) {
/* 149 */       Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(placeable, "placeable"); return (layoutDirection == LayoutDirection.Ltr) ? 0 : size;
/*     */     } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bÂ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J-\020\003\032\0020\0042\006\020\005\032\0020\0042\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\004H\020¢\006\002\b\013¨\006\f"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$EndCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "()V", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$foundation_layout", "foundation-layout"})
/*     */   private static final class EndCrossAxisAlignment extends CrossAxisAlignment { @NotNull
/*     */     public static final EndCrossAxisAlignment INSTANCE = new EndCrossAxisAlignment(); private EndCrossAxisAlignment() {
/* 153 */       super(null);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int align$foundation_layout(int size, @NotNull LayoutDirection layoutDirection, @NotNull Placeable placeable, int beforeCrossAxisAlignmentLine) {
/* 160 */       Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(placeable, "placeable"); return (layoutDirection == LayoutDirection.Ltr) ? size : 0;
/*     */     } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J-\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\fH\020¢\006\002\b\023J\027\020\024\032\0020\f2\006\020\020\032\0020\021H\020¢\006\004\b\025\020\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\0020\b8PX\004¢\006\006\032\004\b\t\020\n¨\006\027"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$AlignmentLineCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "alignmentLineProvider", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "(Landroidx/compose/foundation/layout/AlignmentLineProvider;)V", "getAlignmentLineProvider", "()Landroidx/compose/foundation/layout/AlignmentLineProvider;", "isRelative", "", "isRelative$foundation_layout", "()Z", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$foundation_layout", "calculateAlignmentLinePosition", "calculateAlignmentLinePosition$foundation_layout", "(Landroidx/compose/ui/layout/Placeable;)Ljava/lang/Integer;", "foundation-layout"})
/*     */   private static final class AlignmentLineCrossAxisAlignment extends CrossAxisAlignment { @NotNull
/*     */     private final AlignmentLineProvider alignmentLineProvider;
/*     */     @NotNull
/* 165 */     public final AlignmentLineProvider getAlignmentLineProvider() { return this.alignmentLineProvider; }
/* 166 */     public AlignmentLineCrossAxisAlignment(@NotNull AlignmentLineProvider alignmentLineProvider) { super(null);
/*     */       this.alignmentLineProvider = alignmentLineProvider; } public boolean isRelative$foundation_layout() {
/* 168 */       return true;
/*     */     } @NotNull
/*     */     public Integer calculateAlignmentLinePosition$foundation_layout(@NotNull Placeable placeable) {
/* 171 */       Intrinsics.checkNotNullParameter(placeable, "placeable"); return Integer.valueOf(this.alignmentLineProvider.calculateAlignmentLinePosition(placeable));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int align$foundation_layout(int size, @NotNull LayoutDirection layoutDirection, @NotNull Placeable placeable, int beforeCrossAxisAlignmentLine) {
/* 181 */       Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(placeable, "placeable"); int alignmentLinePosition = this.alignmentLineProvider.calculateAlignmentLinePosition(placeable);
/*     */       
/* 183 */       int line = beforeCrossAxisAlignmentLine - alignmentLinePosition;
/* 184 */       return (alignmentLinePosition != Integer.MIN_VALUE) ? ((layoutDirection == LayoutDirection.Rtl) ? (
/* 185 */         size - line) : 
/*     */         
/* 187 */         line) : 
/*     */ 
/*     */         
/* 190 */         0;
/*     */     } }
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J-\020\007\032\0020\b2\006\020\t\032\0020\b2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\bH\020¢\006\002\b\017J\t\020\020\032\0020\003HÆ\003J\023\020\021\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\025HÖ\003J\t\020\026\032\0020\bHÖ\001J\t\020\027\032\0020\030HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\031"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$VerticalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "vertical", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Alignment$Vertical;)V", "getVertical", "()Landroidx/compose/ui/Alignment$Vertical;", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$foundation_layout", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "foundation-layout"})
/*     */   private static final class VerticalCrossAxisAlignment extends CrossAxisAlignment { @NotNull
/*     */     private final Alignment.Vertical vertical;
/*     */     @NotNull
/* 196 */     public final Alignment.Vertical getVertical() { return this.vertical; }
/* 197 */     public VerticalCrossAxisAlignment(@NotNull Alignment.Vertical vertical) { super(null);
/*     */       this.vertical = vertical; } @NotNull public final Alignment.Vertical component1() { return this.vertical; }
/*     */     @NotNull
/*     */     public final VerticalCrossAxisAlignment copy(@NotNull Alignment.Vertical vertical) { Intrinsics.checkNotNullParameter(vertical, "vertical");
/*     */       return new VerticalCrossAxisAlignment(vertical); }
/*     */     @NotNull
/*     */     public String toString() { return "VerticalCrossAxisAlignment(vertical=" + this.vertical + ')'; }
/* 204 */     public int align$foundation_layout(int size, @NotNull LayoutDirection layoutDirection, @NotNull Placeable placeable, int beforeCrossAxisAlignmentLine) { Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(placeable, "placeable"); return this.vertical.align(0, size); } public int hashCode() { return this.vertical.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other)
/*     */         return true;  if (!(other instanceof VerticalCrossAxisAlignment))
/*     */         return false;  VerticalCrossAxisAlignment verticalCrossAxisAlignment = (VerticalCrossAxisAlignment)other;
/*     */       return !!Intrinsics.areEqual(this.vertical, verticalCrossAxisAlignment.vertical); } }
/*     */    @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J-\020\007\032\0020\b2\006\020\t\032\0020\b2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\bH\020¢\006\002\b\017J\t\020\020\032\0020\003HÆ\003J\023\020\021\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\025HÖ\003J\t\020\026\032\0020\bHÖ\001J\t\020\027\032\0020\030HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\031"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "horizontal", "Landroidx/compose/ui/Alignment$Horizontal;", "(Landroidx/compose/ui/Alignment$Horizontal;)V", "getHorizontal", "()Landroidx/compose/ui/Alignment$Horizontal;", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$foundation_layout", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "foundation-layout"}) private static final class HorizontalCrossAxisAlignment extends CrossAxisAlignment {
/* 209 */     @NotNull public final Alignment.Horizontal getHorizontal() { return this.horizontal; } @NotNull
/* 210 */     private final Alignment.Horizontal horizontal; public HorizontalCrossAxisAlignment(@NotNull Alignment.Horizontal horizontal) { super(null);
/*     */       this.horizontal = horizontal; }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int align$foundation_layout(int size, @NotNull LayoutDirection layoutDirection, @NotNull Placeable placeable, int beforeCrossAxisAlignmentLine) {
/* 217 */       Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(placeable, "placeable"); return this.horizontal.align(0, size, layoutDirection);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Alignment.Horizontal component1() {
/*     */       return this.horizontal;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final HorizontalCrossAxisAlignment copy(@NotNull Alignment.Horizontal horizontal) {
/*     */       Intrinsics.checkNotNullParameter(horizontal, "horizontal");
/*     */       return new HorizontalCrossAxisAlignment(horizontal);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "HorizontalCrossAxisAlignment(horizontal=" + this.horizontal + ')';
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       return this.horizontal.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof HorizontalCrossAxisAlignment))
/*     */         return false; 
/*     */       HorizontalCrossAxisAlignment horizontalCrossAxisAlignment = (HorizontalCrossAxisAlignment)other;
/*     */       return !!Intrinsics.areEqual(this.horizontal, horizontalCrossAxisAlignment.horizontal);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\CrossAxisAlignment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */