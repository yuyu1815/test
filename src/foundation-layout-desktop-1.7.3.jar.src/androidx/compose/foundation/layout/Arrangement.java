/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\024\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\b\n\000\n\002\020\025\n\002\b\002\n\002\020\013\n\002\b\r\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\006\bÇ\002\030\0002\0020\001:\005EFGHIB\007\b\002¢\006\002\020\002J\020\020!\032\0020\0162\006\020\"\032\0020#H\007J\020\020!\032\0020\0042\006\020\"\032\0020$H\007J-\020%\032\0020&2\006\020'\032\0020(2\006\020)\032\0020*2\006\020+\032\0020*2\006\020,\032\0020-H\000¢\006\002\b.J%\020/\032\0020&2\006\020)\032\0020*2\006\020+\032\0020*2\006\020,\032\0020-H\000¢\006\002\b0J-\0201\032\0020&2\006\020'\032\0020(2\006\020)\032\0020*2\006\020+\032\0020*2\006\020,\032\0020-H\000¢\006\002\b2J-\0203\032\0020&2\006\020'\032\0020(2\006\020)\032\0020*2\006\020+\032\0020*2\006\020,\032\0020-H\000¢\006\002\b4J-\0205\032\0020&2\006\020'\032\0020(2\006\020)\032\0020*2\006\020+\032\0020*2\006\020,\032\0020-H\000¢\006\002\b6J-\0207\032\0020&2\006\020'\032\0020(2\006\020)\032\0020*2\006\020+\032\0020*2\006\020,\032\0020-H\000¢\006\002\b8J\032\0209\032\0020\t2\006\020:\032\0020;H\007ø\001\000¢\006\004\b<\020=J\"\0209\032\0020\0162\006\020:\032\0020;2\006\020\"\032\0020#H\007ø\001\000¢\006\004\b>\020?J\"\0209\032\0020\0042\006\020:\032\0020;2\006\020\"\032\0020$H\007ø\001\000¢\006\004\b>\020@J/\020A\032\0020&*\0020*2\006\020B\032\0020-2\030\020C\032\024\022\004\022\0020(\022\004\022\0020(\022\004\022\0020&0DH\bR\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\034\020\b\032\0020\t8\006X\004¢\006\016\n\000\022\004\b\n\020\002\032\004\b\013\020\fR\034\020\r\032\0020\0168\006X\004¢\006\016\n\000\022\004\b\017\020\002\032\004\b\020\020\021R\034\020\022\032\0020\t8\006X\004¢\006\016\n\000\022\004\b\023\020\002\032\004\b\024\020\fR\034\020\025\032\0020\t8\006X\004¢\006\016\n\000\022\004\b\026\020\002\032\004\b\027\020\fR\034\020\030\032\0020\t8\006X\004¢\006\016\n\000\022\004\b\031\020\002\032\004\b\032\020\fR\034\020\033\032\0020\0168\006X\004¢\006\016\n\000\022\004\b\034\020\002\032\004\b\035\020\021R\034\020\036\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\037\020\002\032\004\b \020\007\002\007\n\005\b¡\0360\001¨\006J"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement;", "", "()V", "Bottom", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getBottom$annotations", "getBottom", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Center", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter$annotations", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "End", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getEnd$annotations", "getEnd", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "SpaceAround", "getSpaceAround$annotations", "getSpaceAround", "SpaceBetween", "getSpaceBetween$annotations", "getSpaceBetween", "SpaceEvenly", "getSpaceEvenly$annotations", "getSpaceEvenly", "Start", "getStart$annotations", "getStart", "Top", "getTop$annotations", "getTop", "aligned", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "placeCenter", "", "totalSize", "", "size", "", "outPosition", "reverseInput", "", "placeCenter$foundation_layout", "placeLeftOrTop", "placeLeftOrTop$foundation_layout", "placeRightOrBottom", "placeRightOrBottom$foundation_layout", "placeSpaceAround", "placeSpaceAround$foundation_layout", "placeSpaceBetween", "placeSpaceBetween$foundation_layout", "placeSpaceEvenly", "placeSpaceEvenly$foundation_layout", "spacedBy", "space", "Landroidx/compose/ui/unit/Dp;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "forEachIndexed", "reversed", "action", "Lkotlin/Function2;", "Absolute", "Horizontal", "HorizontalOrVertical", "SpacedAligned", "Vertical", "foundation-layout"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,715:1\n706#1,2:721\n709#1,5:726\n706#1,2:731\n709#1,5:736\n706#1,2:744\n709#1,5:750\n706#1,2:758\n709#1,5:764\n706#1,2:772\n709#1,5:778\n706#1,2:786\n709#1,5:792\n149#2:716\n149#2:717\n12762#3,3:718\n13404#3,3:723\n13404#3,3:733\n12762#3,3:741\n13404#3,2:746\n13406#3:749\n12762#3,3:755\n13404#3,2:760\n13406#3:763\n12762#3,3:769\n13404#3,2:774\n13406#3:777\n12762#3,3:783\n13404#3,2:788\n13406#3:791\n13404#3,3:797\n26#4:748\n26#4:762\n26#4:776\n26#4:790\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n619#1:721,2\n619#1:726,5\n627#1:731,2\n627#1:736,5\n641#1:744,2\n641#1:750,5\n656#1:758,2\n656#1:764,5\n680#1:772,2\n680#1:778,5\n699#1:786,2\n699#1:792,5\n355#1:716\n367#1:717\n617#1:718,3\n619#1:723,3\n627#1:733,3\n639#1:741,3\n641#1:746,2\n641#1:749\n653#1:755,3\n656#1:760,2\n656#1:763\n670#1:769,3\n680#1:774,2\n680#1:777\n692#1:783,3\n699#1:788,2\n699#1:791\n707#1:797,3\n642#1:748\n657#1:762\n681#1:776\n700#1:790\n*E\n"})
/*     */ public final class Arrangement
/*     */ {
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\000\n\002\030\002\n\002\b\002\bg\030\0002\0020\001J,\020\006\032\0020\007*\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\fH&R\032\020\002\032\0020\0038VX\004ø\001\000ø\001\001¢\006\006\032\004\b\004\020\005ø\001\002\002\021\n\005\b¡\0360\001\n\002\b!\n\004\b!0\001¨\006\020À\006\003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout"})
/*     */   @Stable
/*     */   @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n*L\n51#1:716\n*E\n"})
/*     */   public static interface Horizontal
/*     */   {
/*     */     void arrange(@NotNull Density param1Density, int param1Int, @NotNull int[] param1ArrayOfint1, @NotNull LayoutDirection param1LayoutDirection, @NotNull int[] param1ArrayOfint2);
/*     */     
/*     */     default float getSpacing-D9Ej5fM() {
/*  51 */       int $this$dp$iv = 0, $i$f$getDp = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 716 */         Dp.constructor-impl($this$dp$iv); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48) public static final class DefaultImpls { @Deprecated public static float getSpacing-D9Ej5fM(@NotNull Arrangement.Horizontal $this) { return Arrangement.Horizontal.access$getSpacing-D9Ej5fM$jd($this); } } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\002\b\002\bg\030\0002\0020\001J$\020\006\032\0020\007*\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\fH&R\032\020\002\032\0020\0038VX\004ø\001\000ø\001\001¢\006\006\032\004\b\004\020\005ø\001\002\002\021\n\005\b¡\0360\001\n\002\b!\n\004\b!0\001¨\006\016À\006\003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "outPositions", "foundation-layout"}) @Stable @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n*L\n80#1:716\n*E\n"}) public static interface Vertical { void arrange(@NotNull Density param1Density, int param1Int, @NotNull int[] param1ArrayOfint1, @NotNull int[] param1ArrayOfint2); default float getSpacing-D9Ej5fM() { int $this$dp$iv = 0, $i$f$getDp = 0; return Dp.constructor-impl($this$dp$iv); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48) public static final class DefaultImpls { @Deprecated public static float getSpacing-D9Ej5fM(@NotNull Arrangement.Vertical $this) { return Arrangement.Vertical.access$getSpacing-D9Ej5fM$jd($this); } } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bg\030\0002\0020\0012\0020\002R\032\020\003\032\0020\0048VX\004ø\001\000ø\001\001¢\006\006\032\004\b\005\020\006ø\001\002\002\021\n\005\b¡\0360\001\n\002\b!\n\004\b!0\001¨\006\007À\006\003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "foundation-layout"}) @Stable @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n*L\n108#1:716\n*E\n"}) public static interface HorizontalOrVertical extends Horizontal, Vertical { @Metadata(mv = {1, 9, 0}, k = 3, xi = 48) public static final class DefaultImpls { @Deprecated public static float getSpacing-D9Ej5fM(@NotNull Arrangement.HorizontalOrVertical $this) { return Arrangement.HorizontalOrVertical.access$getSpacing-D9Ej5fM$jd($this); } } default float getSpacing-D9Ej5fM() { int $this$dp$iv = 0, $i$f$getDp = 0; return Dp.constructor-impl($this$dp$iv); } } @NotNull public static final Arrangement INSTANCE = new Arrangement(); @NotNull private static final Horizontal Start = new Arrangement$Start$1(); @NotNull public final Horizontal getStart() { return Start; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000/\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J,\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\nH\026¨\006\016"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Start$1", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout"}) public static final class Arrangement$Start$1 implements Horizontal { public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) { Intrinsics.checkNotNullParameter($this$arrange, "<this>"); Intrinsics.checkNotNullParameter(sizes, "sizes"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(outPositions, "outPositions"); if (layoutDirection == LayoutDirection.Ltr) { Arrangement.INSTANCE.placeLeftOrTop$foundation_layout(sizes, outPositions, false); } else { Arrangement.INSTANCE.placeRightOrBottom$foundation_layout(totalSize, sizes, outPositions, true); }  } @NotNull public String toString() { return "Arrangement#Start"; } } @NotNull private static final Horizontal End = new Arrangement$End$1(); @NotNull public final Horizontal getEnd() { return End; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000/\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J,\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\nH\026¨\006\016"}, d2 = {"androidx/compose/foundation/layout/Arrangement$End$1", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout"}) public static final class Arrangement$End$1 implements Horizontal { public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) { Intrinsics.checkNotNullParameter($this$arrange, "<this>"); Intrinsics.checkNotNullParameter(sizes, "sizes"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(outPositions, "outPositions"); if (layoutDirection == LayoutDirection.Ltr) { Arrangement.INSTANCE.placeRightOrBottom$foundation_layout(totalSize, sizes, outPositions, false); } else { Arrangement.INSTANCE.placeLeftOrTop$foundation_layout(sizes, outPositions, true); }  } @NotNull public String toString() { return "Arrangement#End"; } } @NotNull private static final Vertical Top = new Arrangement$Top$1(); @NotNull public final Vertical getTop() { return Top; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000)\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J$\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\nH\026¨\006\f"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Top$1", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "outPositions", "foundation-layout"}) public static final class Arrangement$Top$1 implements Vertical { public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull int[] outPositions) { Intrinsics.checkNotNullParameter($this$arrange, "<this>"); Intrinsics.checkNotNullParameter(sizes, "sizes"); Intrinsics.checkNotNullParameter(outPositions, "outPositions"); Arrangement.INSTANCE.placeLeftOrTop$foundation_layout(sizes, outPositions, false); } @NotNull public String toString() { return "Arrangement#Top"; } } @NotNull private static final Vertical Bottom = new Arrangement$Bottom$1(); @NotNull public final Vertical getBottom() { return Bottom; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000)\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J$\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\nH\026¨\006\f"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Bottom$1", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "outPositions", "foundation-layout"}) public static final class Arrangement$Bottom$1 implements Vertical { public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull int[] outPositions) { Intrinsics.checkNotNullParameter($this$arrange, "<this>"); Intrinsics.checkNotNullParameter(sizes, "sizes"); Intrinsics.checkNotNullParameter(outPositions, "outPositions"); Arrangement.INSTANCE.placeRightOrBottom$foundation_layout(totalSize, sizes, outPositions, false); } @NotNull public String toString() { return "Arrangement#Bottom"; } } @NotNull private static final HorizontalOrVertical Center = new Arrangement$Center$1(); @NotNull public final HorizontalOrVertical getCenter() { return Center; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0007\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\007\032\0020\bH\026J,\020\t\032\0020\n*\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\017H\026J$\020\t\032\0020\n*\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\022\032\0020\017H\026R\034\020\002\032\0020\003X\004ø\001\000ø\001\001¢\006\n\n\002\020\006\032\004\b\004\020\005\002\013\n\005\b¡\0360\001\n\002\b!¨\006\023"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Center$1", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "F", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout"}) @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n*L\n191#1:716\n*E\n"}) public static final class Arrangement$Center$1 implements HorizontalOrVertical { private final float spacing; Arrangement$Center$1() { int $this$dp$iv = 0, $i$f$getDp = 0; this.spacing = Dp.constructor-impl($this$dp$iv); } public float getSpacing-D9Ej5fM() { return this.spacing; } public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) { Intrinsics.checkNotNullParameter($this$arrange, "<this>"); Intrinsics.checkNotNullParameter(sizes, "sizes"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(outPositions, "outPositions"); if (layoutDirection == LayoutDirection.Ltr) { Arrangement.INSTANCE.placeCenter$foundation_layout(totalSize, sizes, outPositions, false); } else { Arrangement.INSTANCE.placeCenter$foundation_layout(totalSize, sizes, outPositions, true); }  } public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull int[] outPositions) { Intrinsics.checkNotNullParameter($this$arrange, "<this>"); Intrinsics.checkNotNullParameter(sizes, "sizes"); Intrinsics.checkNotNullParameter(outPositions, "outPositions"); Arrangement.INSTANCE.placeCenter$foundation_layout(totalSize, sizes, outPositions, false); } @NotNull public String toString() { return "Arrangement#Center"; } } @NotNull private static final HorizontalOrVertical SpaceEvenly = new Arrangement$SpaceEvenly$1(); @NotNull public final HorizontalOrVertical getSpaceEvenly() { return SpaceEvenly; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0007\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\007\032\0020\bH\026J,\020\t\032\0020\n*\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\017H\026J$\020\t\032\0020\n*\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\022\032\0020\017H\026R\034\020\002\032\0020\003X\004ø\001\000ø\001\001¢\006\n\n\002\020\006\032\004\b\004\020\005\002\013\n\005\b¡\0360\001\n\002\b!¨\006\023"}, d2 = {"androidx/compose/foundation/layout/Arrangement$SpaceEvenly$1", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "F", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout"}) @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1\n*L\n220#1:716\n*E\n"}) public static final class Arrangement$SpaceEvenly$1 implements HorizontalOrVertical { private final float spacing; Arrangement$SpaceEvenly$1() { int $this$dp$iv = 0, $i$f$getDp = 0; this.spacing = Dp.constructor-impl($this$dp$iv); } public float getSpacing-D9Ej5fM() { return this.spacing; } public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) { Intrinsics.checkNotNullParameter($this$arrange, "<this>"); Intrinsics.checkNotNullParameter(sizes, "sizes"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(outPositions, "outPositions"); if (layoutDirection == LayoutDirection.Ltr) { Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout(totalSize, sizes, outPositions, false); } else { Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout(totalSize, sizes, outPositions, true); }  } public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull int[] outPositions) { Intrinsics.checkNotNullParameter($this$arrange, "<this>"); Intrinsics.checkNotNullParameter(sizes, "sizes"); Intrinsics.checkNotNullParameter(outPositions, "outPositions"); Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout(totalSize, sizes, outPositions, false); } @NotNull public String toString() { return "Arrangement#SpaceEvenly"; } } @NotNull private static final HorizontalOrVertical SpaceBetween = new Arrangement$SpaceBetween$1(); @NotNull public final HorizontalOrVertical getSpaceBetween() { return SpaceBetween; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0007\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\007\032\0020\bH\026J,\020\t\032\0020\n*\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\017H\026J$\020\t\032\0020\n*\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\022\032\0020\017H\026R\034\020\002\032\0020\003X\004ø\001\000ø\001\001¢\006\n\n\002\020\006\032\004\b\004\020\005\002\013\n\005\b¡\0360\001\n\002\b!¨\006\023"}, d2 = {"androidx/compose/foundation/layout/Arrangement$SpaceBetween$1", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "F", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout"}) @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceBetween$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceBetween$1\n*L\n249#1:716\n*E\n"}) public static final class Arrangement$SpaceBetween$1 implements HorizontalOrVertical { private final float spacing; Arrangement$SpaceBetween$1() { int $this$dp$iv = 0, $i$f$getDp = 0; this.spacing = Dp.constructor-impl($this$dp$iv); } public float getSpacing-D9Ej5fM() { return this.spacing; } public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) { Intrinsics.checkNotNullParameter($this$arrange, "<this>"); Intrinsics.checkNotNullParameter(sizes, "sizes"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(outPositions, "outPositions"); if (layoutDirection == LayoutDirection.Ltr) { Arrangement.INSTANCE.placeSpaceBetween$foundation_layout(totalSize, sizes, outPositions, false); } else { Arrangement.INSTANCE.placeSpaceBetween$foundation_layout(totalSize, sizes, outPositions, true); }  } public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull int[] outPositions) { Intrinsics.checkNotNullParameter($this$arrange, "<this>"); Intrinsics.checkNotNullParameter(sizes, "sizes"); Intrinsics.checkNotNullParameter(outPositions, "outPositions"); Arrangement.INSTANCE.placeSpaceBetween$foundation_layout(totalSize, sizes, outPositions, false); } @NotNull public String toString() { return "Arrangement#SpaceBetween"; } } @NotNull private static final HorizontalOrVertical SpaceAround = new Arrangement$SpaceAround$1(); public static final int $stable; @NotNull public final HorizontalOrVertical getSpaceAround() { return SpaceAround; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0007\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\007\032\0020\bH\026J,\020\t\032\0020\n*\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\017H\026J$\020\t\032\0020\n*\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\022\032\0020\017H\026R\034\020\002\032\0020\003X\004ø\001\000ø\001\001¢\006\n\n\002\020\006\032\004\b\004\020\005\002\013\n\005\b¡\0360\001\n\002\b!¨\006\023"}, d2 = {"androidx/compose/foundation/layout/Arrangement$SpaceAround$1", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "F", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout"}) @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceAround$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceAround$1\n*L\n279#1:716\n*E\n"}) public static final class Arrangement$SpaceAround$1 implements HorizontalOrVertical { private final float spacing; Arrangement$SpaceAround$1() { int $this$dp$iv = 0, $i$f$getDp = 0; this.spacing = Dp.constructor-impl($this$dp$iv); } public float getSpacing-D9Ej5fM() { return this.spacing; } public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) { Intrinsics.checkNotNullParameter($this$arrange, "<this>"); Intrinsics.checkNotNullParameter(sizes, "sizes"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(outPositions, "outPositions"); if (layoutDirection == LayoutDirection.Ltr) { Arrangement.INSTANCE.placeSpaceAround$foundation_layout(totalSize, sizes, outPositions, false); } else { Arrangement.INSTANCE.placeSpaceAround$foundation_layout(totalSize, sizes, outPositions, true); }  } public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull int[] outPositions) { Intrinsics.checkNotNullParameter($this$arrange, "<this>"); Intrinsics.checkNotNullParameter(sizes, "sizes"); Intrinsics.checkNotNullParameter(outPositions, "outPositions"); Arrangement.INSTANCE.placeSpaceAround$foundation_layout(totalSize, sizes, outPositions, false); } @NotNull public String toString() { return "Arrangement#SpaceAround"; } } @Stable @NotNull public final HorizontalOrVertical spacedBy-0680j_4(float space) { return new SpacedAligned(space, true, Arrangement$spacedBy$1.INSTANCE, null); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;"}) static final class Arrangement$spacedBy$1 extends Lambda implements Function2<Integer, LayoutDirection, Integer> { public static final Arrangement$spacedBy$1 INSTANCE = new Arrangement$spacedBy$1(); @NotNull public final Integer invoke(int size, @NotNull LayoutDirection layoutDirection) { Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); return Integer.valueOf(Alignment.Companion.getStart().align(0, size, layoutDirection)); } Arrangement$spacedBy$1() { super(2); } } @Stable @NotNull public final Horizontal spacedBy-D5KLDUw(float space, @NotNull Alignment.Horizontal alignment) { Intrinsics.checkNotNullParameter(alignment, "alignment"); return new SpacedAligned(space, true, new Arrangement$spacedBy$2(alignment), null); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;"}) static final class Arrangement$spacedBy$2 extends Lambda implements Function2<Integer, LayoutDirection, Integer> { @NotNull public final Integer invoke(int size, @NotNull LayoutDirection layoutDirection) { Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); return Integer.valueOf(this.$alignment.align(0, size, layoutDirection)); } Arrangement$spacedBy$2(Alignment.Horizontal $alignment) { super(2); } } @Stable @NotNull public final Vertical spacedBy-D5KLDUw(float space, @NotNull Alignment.Vertical alignment) { Intrinsics.checkNotNullParameter(alignment, "alignment"); return new SpacedAligned(space, false, new Arrangement$spacedBy$3(alignment), null); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "size", "<anonymous parameter 1>", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;"}) static final class Arrangement$spacedBy$3 extends Lambda implements Function2<Integer, LayoutDirection, Integer> { Arrangement$spacedBy$3(Alignment.Vertical $alignment) { super(2); } @NotNull public final Integer invoke(int size, @NotNull LayoutDirection param1LayoutDirection) { Intrinsics.checkNotNullParameter(param1LayoutDirection, "<anonymous parameter 1>"); return Integer.valueOf(this.$alignment.align(0, size)); } } @Stable @NotNull public final Horizontal aligned(@NotNull Alignment.Horizontal alignment) { Intrinsics.checkNotNullParameter(alignment, "alignment"); int $this$dp$iv = 0, $i$f$getDp = 0; return new SpacedAligned(Dp.constructor-impl($this$dp$iv), true, new Arrangement$aligned$1(alignment), null); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;"}) static final class Arrangement$aligned$1 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {
/* 717 */     @NotNull public final Integer invoke(int size, @NotNull LayoutDirection layoutDirection) { Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); return Integer.valueOf(this.$alignment.align(0, size, layoutDirection)); } Arrangement$aligned$1(Alignment.Horizontal $alignment) { super(2); } } @Stable @NotNull public final Vertical aligned(@NotNull Alignment.Vertical alignment) { Intrinsics.checkNotNullParameter(alignment, "alignment"); int $this$dp$iv = 0, $i$f$getDp = 0; return new SpacedAligned(Dp.constructor-impl($this$dp$iv), false, new Arrangement$aligned$2(alignment), null); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "size", "<anonymous parameter 1>", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;"})
/*     */   static final class Arrangement$aligned$2
/*     */     extends Lambda
/*     */     implements Function2<Integer, LayoutDirection, Integer>
/*     */   {
/*     */     Arrangement$aligned$2(Alignment.Vertical $alignment) {
/*     */       super(2);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Integer invoke(int size, @NotNull LayoutDirection param1LayoutDirection) {
/*     */       Intrinsics.checkNotNullParameter(param1LayoutDirection, "<anonymous parameter 1>");
/*     */       return Integer.valueOf(this.$alignment.align(0, size));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void forEachIndexed(int[] $this$forEachIndexed, boolean reversed, Function2 action) {
/*     */     int $i$f$forEachIndexed = 0;
/*     */     int $this$forEachIndexed$iv[] = $this$forEachIndexed, j = 0;
/* 797 */     int index$iv = 0; byte b; int k;
/* 798 */     for (b = 0, k = $this$forEachIndexed$iv.length; b < k; ) { int item$iv = $this$forEachIndexed$iv[b]; action.invoke(Integer.valueOf(index$iv++), Integer.valueOf(item$iv)); b++; }
/*     */     
/*     */     for (int i = $this$forEachIndexed.length - 1; -1 < i; i--)
/*     */       action.invoke(Integer.valueOf(i), Integer.valueOf($this$forEachIndexed[i])); 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\024\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\002\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\027\032\0020\0042\006\020\030\032\0020\031H\007J\032\020\032\032\0020\0332\006\020\034\032\0020\035H\007ø\001\000¢\006\004\b\036\020\037J\"\020\032\032\0020\0042\006\020\034\032\0020\0352\006\020\030\032\0020\031H\007ø\001\000¢\006\004\b \020!J\"\020\032\032\0020\"2\006\020\034\032\0020\0352\006\020\030\032\0020#H\007ø\001\000¢\006\004\b \020$R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\034\020\b\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\007R\034\020\013\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\f\020\002\032\004\b\r\020\007R\034\020\016\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\017\020\002\032\004\b\020\020\007R\034\020\021\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\022\020\002\032\004\b\023\020\007R\034\020\024\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\025\020\002\032\004\b\026\020\007\002\007\n\005\b¡\0360\001¨\006%"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Absolute;", "", "()V", "Center", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getCenter$annotations", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Left", "getLeft$annotations", "getLeft", "Right", "getRight$annotations", "getRight", "SpaceAround", "getSpaceAround$annotations", "getSpaceAround", "SpaceBetween", "getSpaceBetween$annotations", "getSpaceBetween", "SpaceEvenly", "getSpaceEvenly$annotations", "getSpaceEvenly", "aligned", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "spacedBy", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "space", "Landroidx/compose/ui/unit/Dp;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "foundation-layout"})
/*     */   @Immutable
/*     */   @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n*L\n556#1:716\n*E\n"})
/*     */   public static final class Absolute {
/*     */     @NotNull
/*     */     public static final Absolute INSTANCE = new Absolute();
/*     */     @NotNull
/*     */     private static final Arrangement.Horizontal Left = new Arrangement$Absolute$Left$1();
/*     */     
/*     */     @NotNull
/*     */     public final Arrangement.Horizontal getLeft() {
/*     */       return Left;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000/\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J,\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\nH\026¨\006\016"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Absolute$Left$1", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout"})
/*     */     public static final class Arrangement$Absolute$Left$1 implements Arrangement.Horizontal {
/*     */       public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
/*     */         Intrinsics.checkNotNullParameter($this$arrange, "<this>");
/*     */         Intrinsics.checkNotNullParameter(sizes, "sizes");
/*     */         Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */         Intrinsics.checkNotNullParameter(outPositions, "outPositions");
/*     */         Arrangement.INSTANCE.placeLeftOrTop$foundation_layout(sizes, outPositions, false);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "AbsoluteArrangement#Left";
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final Arrangement.Horizontal Center = new Arrangement$Absolute$Center$1();
/*     */     
/*     */     @NotNull
/*     */     public final Arrangement.Horizontal getCenter() {
/*     */       return Center;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000/\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J,\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\nH\026¨\006\016"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Absolute$Center$1", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout"})
/*     */     public static final class Arrangement$Absolute$Center$1 implements Arrangement.Horizontal {
/*     */       public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
/*     */         Intrinsics.checkNotNullParameter($this$arrange, "<this>");
/*     */         Intrinsics.checkNotNullParameter(sizes, "sizes");
/*     */         Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */         Intrinsics.checkNotNullParameter(outPositions, "outPositions");
/*     */         Arrangement.INSTANCE.placeCenter$foundation_layout(totalSize, sizes, outPositions, false);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "AbsoluteArrangement#Center";
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final Arrangement.Horizontal Right = new Arrangement$Absolute$Right$1();
/*     */     
/*     */     @NotNull
/*     */     public final Arrangement.Horizontal getRight() {
/*     */       return Right;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000/\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J,\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\nH\026¨\006\016"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Absolute$Right$1", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout"})
/*     */     public static final class Arrangement$Absolute$Right$1 implements Arrangement.Horizontal {
/*     */       public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
/*     */         Intrinsics.checkNotNullParameter($this$arrange, "<this>");
/*     */         Intrinsics.checkNotNullParameter(sizes, "sizes");
/*     */         Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */         Intrinsics.checkNotNullParameter(outPositions, "outPositions");
/*     */         Arrangement.INSTANCE.placeRightOrBottom$foundation_layout(totalSize, sizes, outPositions, false);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "AbsoluteArrangement#Right";
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final Arrangement.Horizontal SpaceBetween = new Arrangement$Absolute$SpaceBetween$1();
/*     */     
/*     */     @NotNull
/*     */     public final Arrangement.Horizontal getSpaceBetween() {
/*     */       return SpaceBetween;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000/\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J,\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\nH\026¨\006\016"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Absolute$SpaceBetween$1", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout"})
/*     */     public static final class Arrangement$Absolute$SpaceBetween$1 implements Arrangement.Horizontal {
/*     */       public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
/*     */         Intrinsics.checkNotNullParameter($this$arrange, "<this>");
/*     */         Intrinsics.checkNotNullParameter(sizes, "sizes");
/*     */         Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */         Intrinsics.checkNotNullParameter(outPositions, "outPositions");
/*     */         Arrangement.INSTANCE.placeSpaceBetween$foundation_layout(totalSize, sizes, outPositions, false);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "AbsoluteArrangement#SpaceBetween";
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final Arrangement.Horizontal SpaceEvenly = new Arrangement$Absolute$SpaceEvenly$1();
/*     */     
/*     */     @NotNull
/*     */     public final Arrangement.Horizontal getSpaceEvenly() {
/*     */       return SpaceEvenly;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000/\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J,\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\nH\026¨\006\016"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Absolute$SpaceEvenly$1", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout"})
/*     */     public static final class Arrangement$Absolute$SpaceEvenly$1 implements Arrangement.Horizontal {
/*     */       public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
/*     */         Intrinsics.checkNotNullParameter($this$arrange, "<this>");
/*     */         Intrinsics.checkNotNullParameter(sizes, "sizes");
/*     */         Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */         Intrinsics.checkNotNullParameter(outPositions, "outPositions");
/*     */         Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout(totalSize, sizes, outPositions, false);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "AbsoluteArrangement#SpaceEvenly";
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final Arrangement.Horizontal SpaceAround = new Arrangement$Absolute$SpaceAround$1();
/*     */     public static final int $stable;
/*     */     
/*     */     @NotNull
/*     */     public final Arrangement.Horizontal getSpaceAround() {
/*     */       return SpaceAround;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000/\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J,\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\nH\026¨\006\016"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Absolute$SpaceAround$1", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout"})
/*     */     public static final class Arrangement$Absolute$SpaceAround$1 implements Arrangement.Horizontal {
/*     */       public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
/*     */         Intrinsics.checkNotNullParameter($this$arrange, "<this>");
/*     */         Intrinsics.checkNotNullParameter(sizes, "sizes");
/*     */         Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */         Intrinsics.checkNotNullParameter(outPositions, "outPositions");
/*     */         Arrangement.INSTANCE.placeSpaceAround$foundation_layout(totalSize, sizes, outPositions, false);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "AbsoluteArrangement#SpaceAround";
/*     */       }
/*     */     }
/*     */     
/*     */     @Stable
/*     */     @NotNull
/*     */     public final Arrangement.HorizontalOrVertical spacedBy-0680j_4(float space) {
/*     */       return new Arrangement.SpacedAligned(space, false, null, null);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     @NotNull
/*     */     public final Arrangement.Horizontal spacedBy-D5KLDUw(float space, @NotNull Alignment.Horizontal alignment) {
/*     */       Intrinsics.checkNotNullParameter(alignment, "alignment");
/*     */       return new Arrangement.SpacedAligned(space, false, new Arrangement$Absolute$spacedBy$1(alignment), null);
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;"})
/*     */     static final class Arrangement$Absolute$spacedBy$1 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {
/*     */       @NotNull
/*     */       public final Integer invoke(int size, @NotNull LayoutDirection layoutDirection) {
/*     */         Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */         return Integer.valueOf(this.$alignment.align(0, size, layoutDirection));
/*     */       }
/*     */       
/*     */       Arrangement$Absolute$spacedBy$1(Alignment.Horizontal $alignment) {
/*     */         super(2);
/*     */       }
/*     */     }
/*     */     
/*     */     @Stable
/*     */     @NotNull
/*     */     public final Arrangement.Vertical spacedBy-D5KLDUw(float space, @NotNull Alignment.Vertical alignment) {
/*     */       Intrinsics.checkNotNullParameter(alignment, "alignment");
/*     */       return new Arrangement.SpacedAligned(space, false, new Arrangement$Absolute$spacedBy$2(alignment), null);
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "size", "<anonymous parameter 1>", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;"})
/*     */     static final class Arrangement$Absolute$spacedBy$2 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {
/*     */       Arrangement$Absolute$spacedBy$2(Alignment.Vertical $alignment) {
/*     */         super(2);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Integer invoke(int size, @NotNull LayoutDirection param2LayoutDirection) {
/*     */         Intrinsics.checkNotNullParameter(param2LayoutDirection, "<anonymous parameter 1>");
/*     */         return Integer.valueOf(this.$alignment.align(0, size));
/*     */       }
/*     */     }
/*     */     
/*     */     @Stable
/*     */     @NotNull
/*     */     public final Arrangement.Horizontal aligned(@NotNull Alignment.Horizontal alignment) {
/*     */       Intrinsics.checkNotNullParameter(alignment, "alignment");
/*     */       int $this$dp$iv = 0, $i$f$getDp = 0;
/*     */       return new Arrangement.SpacedAligned(Dp.constructor-impl($this$dp$iv), false, new Arrangement$Absolute$aligned$1(alignment), null);
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;"})
/*     */     static final class Arrangement$Absolute$aligned$1 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {
/*     */       @NotNull
/*     */       public final Integer invoke(int size, @NotNull LayoutDirection layoutDirection) {
/*     */         Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */         return Integer.valueOf(this.$alignment.align(0, size, layoutDirection));
/*     */       }
/*     */       
/*     */       Arrangement$Absolute$aligned$1(Alignment.Horizontal $alignment) {
/*     */         super(2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\002\b\023\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\002\b\002\n\002\020\025\n\002\b\003\b\b\030\0002\0020\001B1\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\032\020\006\032\026\022\004\022\0020\b\022\004\022\0020\t\022\004\022\0020\b\030\0010\007¢\006\002\020\nJ\026\020\024\032\0020\003HÆ\003ø\001\001ø\001\000¢\006\004\b\025\020\020J\t\020\026\032\0020\005HÆ\003J\035\020\027\032\026\022\004\022\0020\b\022\004\022\0020\t\022\004\022\0020\b\030\0010\007HÆ\003JE\020\030\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\034\b\002\020\006\032\026\022\004\022\0020\b\022\004\022\0020\t\022\004\022\0020\b\030\0010\007HÆ\001ø\001\000¢\006\004\b\031\020\032J\023\020\033\032\0020\0052\b\020\034\032\004\030\0010\035HÖ\003J\t\020\036\032\0020\bHÖ\001J\b\020\037\032\0020 H\026J,\020!\032\0020\"*\0020#2\006\020$\032\0020\b2\006\020%\032\0020&2\006\020'\032\0020\t2\006\020(\032\0020&H\026J$\020!\032\0020\"*\0020#2\006\020$\032\0020\b2\006\020%\032\0020&2\006\020(\032\0020&H\026R%\020\006\032\026\022\004\022\0020\b\022\004\022\0020\t\022\004\022\0020\b\030\0010\007¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\031\020\002\032\0020\003ø\001\000ø\001\001¢\006\n\n\002\020\021\032\004\b\017\020\020R\034\020\022\032\0020\003X\004ø\001\000ø\001\001¢\006\n\n\002\020\021\032\004\b\023\020\020\002\013\n\005\b¡\0360\001\n\002\b!¨\006)"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "space", "Landroidx/compose/ui/unit/Dp;", "rtlMirror", "", "alignment", "Lkotlin/Function2;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlignment", "()Lkotlin/jvm/functions/Function2;", "getRtlMirror", "()Z", "getSpace-D9Ej5fM", "()F", "F", "spacing", "getSpacing-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component3", "copy", "copy-8Feqmps", "(FZLkotlin/jvm/functions/Function2;)Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "equals", "other", "", "hashCode", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "sizes", "", "layoutDirection", "outPositions", "foundation-layout"})
/*     */   @Immutable
/*     */   @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n+ 2 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,715:1\n706#2,2:716\n709#2,5:721\n13404#3,3:718\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n*L\n586#1:716,2\n586#1:721,5\n586#1:718,3\n*E\n"})
/*     */   public static final class SpacedAligned implements HorizontalOrVertical {
/*     */     private final float space;
/*     */     private final boolean rtlMirror;
/*     */     @Nullable
/*     */     private final Function2<Integer, LayoutDirection, Integer> alignment;
/*     */     private final float spacing;
/*     */     public static final int $stable;
/*     */     
/*     */     private SpacedAligned(float space, boolean rtlMirror, Function2<Integer, LayoutDirection, Integer> alignment) {
/*     */       this.space = space;
/*     */       this.rtlMirror = rtlMirror;
/*     */       this.alignment = alignment;
/*     */       this.spacing = this.space;
/*     */     }
/*     */     
/*     */     public final float getSpace-D9Ej5fM() {
/*     */       return this.space;
/*     */     }
/*     */     
/*     */     public final boolean getRtlMirror() {
/*     */       return this.rtlMirror;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Function2<Integer, LayoutDirection, Integer> getAlignment() {
/*     */       return this.alignment;
/*     */     }
/*     */     
/*     */     public float getSpacing-D9Ej5fM() {
/*     */       return this.spacing;
/*     */     }
/*     */     
/*     */     public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '<this>'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_3
/*     */       //   7: ldc 'sizes'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload #4
/*     */       //   14: ldc 'layoutDirection'
/*     */       //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   19: aload #5
/*     */       //   21: ldc 'outPositions'
/*     */       //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   26: aload_3
/*     */       //   27: arraylength
/*     */       //   28: ifne -> 35
/*     */       //   31: iconst_1
/*     */       //   32: goto -> 36
/*     */       //   35: iconst_0
/*     */       //   36: ifeq -> 40
/*     */       //   39: return
/*     */       //   40: aload_1
/*     */       //   41: aload_0
/*     */       //   42: getfield space : F
/*     */       //   45: invokeinterface roundToPx-0680j_4 : (F)I
/*     */       //   50: istore #6
/*     */       //   52: iconst_0
/*     */       //   53: istore #7
/*     */       //   55: iconst_0
/*     */       //   56: istore #8
/*     */       //   58: aload_0
/*     */       //   59: getfield rtlMirror : Z
/*     */       //   62: ifeq -> 77
/*     */       //   65: aload #4
/*     */       //   67: getstatic androidx/compose/ui/unit/LayoutDirection.Rtl : Landroidx/compose/ui/unit/LayoutDirection;
/*     */       //   70: if_acmpne -> 77
/*     */       //   73: iconst_1
/*     */       //   74: goto -> 78
/*     */       //   77: iconst_0
/*     */       //   78: istore #9
/*     */       //   80: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */       //   83: astore #10
/*     */       //   85: aload_3
/*     */       //   86: astore #11
/*     */       //   88: iconst_0
/*     */       //   89: istore #12
/*     */       //   91: iload #9
/*     */       //   93: ifne -> 198
/*     */       //   96: aload #11
/*     */       //   98: astore #13
/*     */       //   100: iconst_0
/*     */       //   101: istore #14
/*     */       //   103: iconst_0
/*     */       //   104: istore #15
/*     */       //   106: iconst_0
/*     */       //   107: istore #16
/*     */       //   109: aload #13
/*     */       //   111: arraylength
/*     */       //   112: istore #17
/*     */       //   114: iload #16
/*     */       //   116: iload #17
/*     */       //   118: if_icmpge -> 194
/*     */       //   121: aload #13
/*     */       //   123: iload #16
/*     */       //   125: iaload
/*     */       //   126: istore #18
/*     */       //   128: iload #15
/*     */       //   130: iinc #15, 1
/*     */       //   133: iload #18
/*     */       //   135: istore #19
/*     */       //   137: istore #20
/*     */       //   139: iconst_0
/*     */       //   140: istore #21
/*     */       //   142: aload #5
/*     */       //   144: iload #20
/*     */       //   146: iload #7
/*     */       //   148: iload_2
/*     */       //   149: iload #19
/*     */       //   151: isub
/*     */       //   152: invokestatic min : (II)I
/*     */       //   155: iastore
/*     */       //   156: iload #6
/*     */       //   158: iload_2
/*     */       //   159: aload #5
/*     */       //   161: iload #20
/*     */       //   163: iaload
/*     */       //   164: isub
/*     */       //   165: iload #19
/*     */       //   167: isub
/*     */       //   168: invokestatic min : (II)I
/*     */       //   171: istore #8
/*     */       //   173: aload #5
/*     */       //   175: iload #20
/*     */       //   177: iaload
/*     */       //   178: iload #19
/*     */       //   180: iadd
/*     */       //   181: iload #8
/*     */       //   183: iadd
/*     */       //   184: istore #7
/*     */       //   186: nop
/*     */       //   187: nop
/*     */       //   188: iinc #16, 1
/*     */       //   191: goto -> 114
/*     */       //   194: nop
/*     */       //   195: goto -> 277
/*     */       //   198: aload #11
/*     */       //   200: arraylength
/*     */       //   201: iconst_1
/*     */       //   202: isub
/*     */       //   203: istore #13
/*     */       //   205: iconst_m1
/*     */       //   206: iload #13
/*     */       //   208: if_icmpge -> 277
/*     */       //   211: iload #13
/*     */       //   213: aload #11
/*     */       //   215: iload #13
/*     */       //   217: iaload
/*     */       //   218: istore #19
/*     */       //   220: istore #20
/*     */       //   222: iconst_0
/*     */       //   223: istore #21
/*     */       //   225: aload #5
/*     */       //   227: iload #20
/*     */       //   229: iload #7
/*     */       //   231: iload_2
/*     */       //   232: iload #19
/*     */       //   234: isub
/*     */       //   235: invokestatic min : (II)I
/*     */       //   238: iastore
/*     */       //   239: iload #6
/*     */       //   241: iload_2
/*     */       //   242: aload #5
/*     */       //   244: iload #20
/*     */       //   246: iaload
/*     */       //   247: isub
/*     */       //   248: iload #19
/*     */       //   250: isub
/*     */       //   251: invokestatic min : (II)I
/*     */       //   254: istore #8
/*     */       //   256: aload #5
/*     */       //   258: iload #20
/*     */       //   260: iaload
/*     */       //   261: iload #19
/*     */       //   263: iadd
/*     */       //   264: iload #8
/*     */       //   266: iadd
/*     */       //   267: istore #7
/*     */       //   269: nop
/*     */       //   270: nop
/*     */       //   271: iinc #13, -1
/*     */       //   274: goto -> 205
/*     */       //   277: nop
/*     */       //   278: iload #7
/*     */       //   280: iload #8
/*     */       //   282: isub
/*     */       //   283: istore #7
/*     */       //   285: aload_0
/*     */       //   286: getfield alignment : Lkotlin/jvm/functions/Function2;
/*     */       //   289: ifnull -> 362
/*     */       //   292: iload #7
/*     */       //   294: iload_2
/*     */       //   295: if_icmpge -> 362
/*     */       //   298: aload_0
/*     */       //   299: getfield alignment : Lkotlin/jvm/functions/Function2;
/*     */       //   302: iload_2
/*     */       //   303: iload #7
/*     */       //   305: isub
/*     */       //   306: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   309: aload #4
/*     */       //   311: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   316: checkcast java/lang/Number
/*     */       //   319: invokevirtual intValue : ()I
/*     */       //   322: istore #10
/*     */       //   324: iconst_0
/*     */       //   325: istore #11
/*     */       //   327: aload #5
/*     */       //   329: arraylength
/*     */       //   330: istore #12
/*     */       //   332: iload #11
/*     */       //   334: iload #12
/*     */       //   336: if_icmpge -> 362
/*     */       //   339: iload #11
/*     */       //   341: istore #13
/*     */       //   343: aload #5
/*     */       //   345: iload #13
/*     */       //   347: aload #5
/*     */       //   349: iload #13
/*     */       //   351: iaload
/*     */       //   352: iload #10
/*     */       //   354: iadd
/*     */       //   355: iastore
/*     */       //   356: iinc #11, 1
/*     */       //   359: goto -> 332
/*     */       //   362: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #580	-> 26
/*     */       //   #580	-> 36
/*     */       //   #581	-> 40
/*     */       //   #583	-> 52
/*     */       //   #584	-> 55
/*     */       //   #585	-> 58
/*     */       //   #586	-> 80
/*     */       //   #716	-> 91
/*     */       //   #717	-> 96
/*     */       //   #718	-> 103
/*     */       //   #719	-> 106
/*     */       //   #587	-> 142
/*     */       //   #588	-> 156
/*     */       //   #588	-> 171
/*     */       //   #589	-> 173
/*     */       //   #590	-> 186
/*     */       //   #719	-> 187
/*     */       //   #720	-> 194
/*     */       //   #721	-> 198
/*     */       //   #722	-> 211
/*     */       //   #587	-> 225
/*     */       //   #588	-> 239
/*     */       //   #588	-> 254
/*     */       //   #589	-> 256
/*     */       //   #590	-> 269
/*     */       //   #722	-> 270
/*     */       //   #721	-> 271
/*     */       //   #725	-> 277
/*     */       //   #591	-> 278
/*     */       //   #593	-> 285
/*     */       //   #594	-> 298
/*     */       //   #595	-> 324
/*     */       //   #596	-> 339
/*     */       //   #595	-> 356
/*     */       //   #599	-> 362
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   142	45	21	$i$a$-forEachIndexed-Arrangement$SpacedAligned$arrange$1	I
/*     */       //   139	48	20	index	I
/*     */       //   139	48	19	it	I
/*     */       //   225	45	21	$i$a$-forEachIndexed-Arrangement$SpacedAligned$arrange$1	I
/*     */       //   222	48	20	index	I
/*     */       //   222	48	19	it	I
/*     */       //   128	60	18	item$iv$iv	I
/*     */       //   103	92	14	$i$f$forEachIndexed	I
/*     */       //   106	89	15	index$iv$iv	I
/*     */       //   100	95	13	$this$forEachIndexed$iv$iv	[I
/*     */       //   205	72	13	i$iv	I
/*     */       //   91	187	12	$i$f$forEachIndexed	I
/*     */       //   88	190	10	this_$iv	Landroidx/compose/foundation/layout/Arrangement;
/*     */       //   88	190	11	$this$forEachIndexed$iv	[I
/*     */       //   327	35	11	index	I
/*     */       //   324	38	10	groupPosition	I
/*     */       //   52	311	6	spacePx	I
/*     */       //   55	308	7	occupied	I
/*     */       //   58	305	8	lastSpace	I
/*     */       //   80	283	9	reversed	Z
/*     */       //   0	363	0	this	Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;
/*     */       //   0	363	1	$this$arrange	Landroidx/compose/ui/unit/Density;
/*     */       //   0	363	2	totalSize	I
/*     */       //   0	363	3	sizes	[I
/*     */       //   0	363	4	layoutDirection	Landroidx/compose/ui/unit/LayoutDirection;
/*     */       //   0	363	5	outPositions	[I
/*     */     }
/*     */     
/*     */     public void arrange(@NotNull Density $this$arrange, int totalSize, @NotNull int[] sizes, @NotNull int[] outPositions) {
/*     */       Intrinsics.checkNotNullParameter($this$arrange, "<this>");
/*     */       Intrinsics.checkNotNullParameter(sizes, "sizes");
/*     */       Intrinsics.checkNotNullParameter(outPositions, "outPositions");
/*     */       arrange($this$arrange, totalSize, sizes, LayoutDirection.Ltr, outPositions);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return (this.rtlMirror ? "" : "Absolute") + "Arrangement#spacedAligned(" + Dp.toString-impl(this.space) + ", " + this.alignment + ')';
/*     */     }
/*     */     
/*     */     public final float component1-D9Ej5fM() {
/*     */       return this.space;
/*     */     }
/*     */     
/*     */     public final boolean component2() {
/*     */       return this.rtlMirror;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Function2<Integer, LayoutDirection, Integer> component3() {
/*     */       return this.alignment;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SpacedAligned copy-8Feqmps(float space, boolean rtlMirror, @Nullable Function2 alignment) {
/*     */       return new SpacedAligned(space, rtlMirror, alignment, null);
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = Dp.hashCode-impl(this.space);
/*     */       result = result * 31 + Boolean.hashCode(this.rtlMirror);
/*     */       return result * 31 + ((this.alignment == null) ? 0 : this.alignment.hashCode());
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof SpacedAligned))
/*     */         return false; 
/*     */       SpacedAligned spacedAligned = (SpacedAligned)other;
/*     */       return !Dp.equals-impl0(this.space, spacedAligned.space) ? false : ((this.rtlMirror != spacedAligned.rtlMirror) ? false : (!!Intrinsics.areEqual(this.alignment, spacedAligned.alignment)));
/*     */     }
/*     */   }
/*     */   
/*     */   public final void placeRightOrBottom$foundation_layout(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc 'size'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_3
/*     */     //   7: ldc 'outPosition'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: astore #6
/*     */     //   15: iconst_0
/*     */     //   16: istore #7
/*     */     //   18: iconst_0
/*     */     //   19: istore #8
/*     */     //   21: iload #7
/*     */     //   23: istore #9
/*     */     //   25: iconst_0
/*     */     //   26: istore #10
/*     */     //   28: aload #6
/*     */     //   30: arraylength
/*     */     //   31: istore #11
/*     */     //   33: iload #10
/*     */     //   35: iload #11
/*     */     //   37: if_icmpge -> 71
/*     */     //   40: aload #6
/*     */     //   42: iload #10
/*     */     //   44: iaload
/*     */     //   45: istore #12
/*     */     //   47: iload #9
/*     */     //   49: iload #12
/*     */     //   51: istore #13
/*     */     //   53: istore #14
/*     */     //   55: iconst_0
/*     */     //   56: istore #15
/*     */     //   58: iload #14
/*     */     //   60: iload #13
/*     */     //   62: iadd
/*     */     //   63: istore #9
/*     */     //   65: iinc #10, 1
/*     */     //   68: goto -> 33
/*     */     //   71: iload #9
/*     */     //   73: istore #5
/*     */     //   75: iconst_0
/*     */     //   76: istore #6
/*     */     //   78: iload_1
/*     */     //   79: iload #5
/*     */     //   81: isub
/*     */     //   82: istore #6
/*     */     //   84: aload_0
/*     */     //   85: astore #7
/*     */     //   87: aload_2
/*     */     //   88: astore #8
/*     */     //   90: iconst_0
/*     */     //   91: istore #9
/*     */     //   93: iload #4
/*     */     //   95: ifne -> 169
/*     */     //   98: aload #8
/*     */     //   100: astore #10
/*     */     //   102: iconst_0
/*     */     //   103: istore #11
/*     */     //   105: iconst_0
/*     */     //   106: istore #12
/*     */     //   108: iconst_0
/*     */     //   109: istore #13
/*     */     //   111: aload #10
/*     */     //   113: arraylength
/*     */     //   114: istore #14
/*     */     //   116: iload #13
/*     */     //   118: iload #14
/*     */     //   120: if_icmpge -> 165
/*     */     //   123: aload #10
/*     */     //   125: iload #13
/*     */     //   127: iaload
/*     */     //   128: istore #15
/*     */     //   130: iload #12
/*     */     //   132: iinc #12, 1
/*     */     //   135: iload #15
/*     */     //   137: istore #16
/*     */     //   139: istore #17
/*     */     //   141: iconst_0
/*     */     //   142: istore #18
/*     */     //   144: aload_3
/*     */     //   145: iload #17
/*     */     //   147: iload #6
/*     */     //   149: iastore
/*     */     //   150: iload #6
/*     */     //   152: iload #16
/*     */     //   154: iadd
/*     */     //   155: istore #6
/*     */     //   157: nop
/*     */     //   158: nop
/*     */     //   159: iinc #13, 1
/*     */     //   162: goto -> 116
/*     */     //   165: nop
/*     */     //   166: goto -> 217
/*     */     //   169: aload #8
/*     */     //   171: arraylength
/*     */     //   172: iconst_1
/*     */     //   173: isub
/*     */     //   174: istore #10
/*     */     //   176: iconst_m1
/*     */     //   177: iload #10
/*     */     //   179: if_icmpge -> 217
/*     */     //   182: iload #10
/*     */     //   184: aload #8
/*     */     //   186: iload #10
/*     */     //   188: iaload
/*     */     //   189: istore #16
/*     */     //   191: istore #17
/*     */     //   193: iconst_0
/*     */     //   194: istore #18
/*     */     //   196: aload_3
/*     */     //   197: iload #17
/*     */     //   199: iload #6
/*     */     //   201: iastore
/*     */     //   202: iload #6
/*     */     //   204: iload #16
/*     */     //   206: iadd
/*     */     //   207: istore #6
/*     */     //   209: nop
/*     */     //   210: nop
/*     */     //   211: iinc #10, -1
/*     */     //   214: goto -> 176
/*     */     //   217: nop
/*     */     //   218: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #617	-> 12
/*     */     //   #718	-> 21
/*     */     //   #719	-> 25
/*     */     //   #617	-> 58
/*     */     //   #719	-> 63
/*     */     //   #720	-> 71
/*     */     //   #617	-> 73
/*     */     //   #618	-> 75
/*     */     //   #619	-> 84
/*     */     //   #721	-> 93
/*     */     //   #722	-> 98
/*     */     //   #723	-> 105
/*     */     //   #724	-> 108
/*     */     //   #620	-> 144
/*     */     //   #621	-> 150
/*     */     //   #622	-> 157
/*     */     //   #724	-> 158
/*     */     //   #725	-> 165
/*     */     //   #726	-> 169
/*     */     //   #727	-> 182
/*     */     //   #620	-> 196
/*     */     //   #621	-> 202
/*     */     //   #622	-> 209
/*     */     //   #727	-> 210
/*     */     //   #726	-> 211
/*     */     //   #730	-> 217
/*     */     //   #623	-> 218
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   58	5	15	$i$a$-fold-Arrangement$placeRightOrBottom$consumedSize$1	I
/*     */     //   55	8	14	a	I
/*     */     //   55	8	13	b	I
/*     */     //   47	18	12	element$iv	I
/*     */     //   21	52	8	$i$f$fold	I
/*     */     //   25	48	9	accumulator$iv	I
/*     */     //   18	55	6	$this$fold$iv	[I
/*     */     //   18	55	7	initial$iv	I
/*     */     //   144	14	18	$i$a$-forEachIndexed-Arrangement$placeRightOrBottom$1	I
/*     */     //   141	17	17	index	I
/*     */     //   141	17	16	it	I
/*     */     //   196	14	18	$i$a$-forEachIndexed-Arrangement$placeRightOrBottom$1	I
/*     */     //   193	17	17	index	I
/*     */     //   193	17	16	it	I
/*     */     //   130	29	15	item$iv$iv	I
/*     */     //   105	61	11	$i$f$forEachIndexed	I
/*     */     //   108	58	12	index$iv$iv	I
/*     */     //   102	64	10	$this$forEachIndexed$iv$iv	[I
/*     */     //   176	41	10	i$iv	I
/*     */     //   93	125	9	$i$f$forEachIndexed	I
/*     */     //   90	128	7	this_$iv	Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   90	128	8	$this$forEachIndexed$iv	[I
/*     */     //   75	144	5	consumedSize	I
/*     */     //   78	141	6	current	I
/*     */     //   0	219	0	this	Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   0	219	1	totalSize	I
/*     */     //   0	219	2	size	[I
/*     */     //   0	219	3	outPosition	[I
/*     */     //   0	219	4	reverseInput	Z
/*     */   }
/*     */   
/*     */   public final void placeLeftOrTop$foundation_layout(@NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'size'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'outPosition'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: iconst_0
/*     */     //   13: istore #4
/*     */     //   15: aload_0
/*     */     //   16: astore #5
/*     */     //   18: aload_1
/*     */     //   19: astore #6
/*     */     //   21: iconst_0
/*     */     //   22: istore #7
/*     */     //   24: iload_3
/*     */     //   25: ifne -> 99
/*     */     //   28: aload #6
/*     */     //   30: astore #8
/*     */     //   32: iconst_0
/*     */     //   33: istore #9
/*     */     //   35: iconst_0
/*     */     //   36: istore #10
/*     */     //   38: iconst_0
/*     */     //   39: istore #11
/*     */     //   41: aload #8
/*     */     //   43: arraylength
/*     */     //   44: istore #12
/*     */     //   46: iload #11
/*     */     //   48: iload #12
/*     */     //   50: if_icmpge -> 95
/*     */     //   53: aload #8
/*     */     //   55: iload #11
/*     */     //   57: iaload
/*     */     //   58: istore #13
/*     */     //   60: iload #10
/*     */     //   62: iinc #10, 1
/*     */     //   65: iload #13
/*     */     //   67: istore #14
/*     */     //   69: istore #15
/*     */     //   71: iconst_0
/*     */     //   72: istore #16
/*     */     //   74: aload_2
/*     */     //   75: iload #15
/*     */     //   77: iload #4
/*     */     //   79: iastore
/*     */     //   80: iload #4
/*     */     //   82: iload #14
/*     */     //   84: iadd
/*     */     //   85: istore #4
/*     */     //   87: nop
/*     */     //   88: nop
/*     */     //   89: iinc #11, 1
/*     */     //   92: goto -> 46
/*     */     //   95: nop
/*     */     //   96: goto -> 147
/*     */     //   99: aload #6
/*     */     //   101: arraylength
/*     */     //   102: iconst_1
/*     */     //   103: isub
/*     */     //   104: istore #8
/*     */     //   106: iconst_m1
/*     */     //   107: iload #8
/*     */     //   109: if_icmpge -> 147
/*     */     //   112: iload #8
/*     */     //   114: aload #6
/*     */     //   116: iload #8
/*     */     //   118: iaload
/*     */     //   119: istore #14
/*     */     //   121: istore #15
/*     */     //   123: iconst_0
/*     */     //   124: istore #16
/*     */     //   126: aload_2
/*     */     //   127: iload #15
/*     */     //   129: iload #4
/*     */     //   131: iastore
/*     */     //   132: iload #4
/*     */     //   134: iload #14
/*     */     //   136: iadd
/*     */     //   137: istore #4
/*     */     //   139: nop
/*     */     //   140: nop
/*     */     //   141: iinc #8, -1
/*     */     //   144: goto -> 106
/*     */     //   147: nop
/*     */     //   148: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #626	-> 12
/*     */     //   #627	-> 15
/*     */     //   #731	-> 24
/*     */     //   #732	-> 28
/*     */     //   #733	-> 35
/*     */     //   #734	-> 38
/*     */     //   #628	-> 74
/*     */     //   #629	-> 80
/*     */     //   #630	-> 87
/*     */     //   #734	-> 88
/*     */     //   #735	-> 95
/*     */     //   #736	-> 99
/*     */     //   #737	-> 112
/*     */     //   #628	-> 126
/*     */     //   #629	-> 132
/*     */     //   #630	-> 139
/*     */     //   #737	-> 140
/*     */     //   #736	-> 141
/*     */     //   #740	-> 147
/*     */     //   #631	-> 148
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   74	14	16	$i$a$-forEachIndexed-Arrangement$placeLeftOrTop$1	I
/*     */     //   71	17	15	index	I
/*     */     //   71	17	14	it	I
/*     */     //   126	14	16	$i$a$-forEachIndexed-Arrangement$placeLeftOrTop$1	I
/*     */     //   123	17	15	index	I
/*     */     //   123	17	14	it	I
/*     */     //   60	29	13	item$iv$iv	I
/*     */     //   35	61	9	$i$f$forEachIndexed	I
/*     */     //   38	58	10	index$iv$iv	I
/*     */     //   32	64	8	$this$forEachIndexed$iv$iv	[I
/*     */     //   106	41	8	i$iv	I
/*     */     //   24	124	7	$i$f$forEachIndexed	I
/*     */     //   21	127	5	this_$iv	Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   21	127	6	$this$forEachIndexed$iv	[I
/*     */     //   15	134	4	current	I
/*     */     //   0	149	0	this	Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   0	149	1	size	[I
/*     */     //   0	149	2	outPosition	[I
/*     */     //   0	149	3	reverseInput	Z
/*     */   }
/*     */   
/*     */   public final void placeCenter$foundation_layout(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc 'size'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_3
/*     */     //   7: ldc 'outPosition'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: astore #6
/*     */     //   15: iconst_0
/*     */     //   16: istore #7
/*     */     //   18: iconst_0
/*     */     //   19: istore #8
/*     */     //   21: iload #7
/*     */     //   23: istore #9
/*     */     //   25: iconst_0
/*     */     //   26: istore #10
/*     */     //   28: aload #6
/*     */     //   30: arraylength
/*     */     //   31: istore #11
/*     */     //   33: iload #10
/*     */     //   35: iload #11
/*     */     //   37: if_icmpge -> 71
/*     */     //   40: aload #6
/*     */     //   42: iload #10
/*     */     //   44: iaload
/*     */     //   45: istore #12
/*     */     //   47: iload #9
/*     */     //   49: iload #12
/*     */     //   51: istore #13
/*     */     //   53: istore #14
/*     */     //   55: iconst_0
/*     */     //   56: istore #15
/*     */     //   58: iload #14
/*     */     //   60: iload #13
/*     */     //   62: iadd
/*     */     //   63: istore #9
/*     */     //   65: iinc #10, 1
/*     */     //   68: goto -> 33
/*     */     //   71: iload #9
/*     */     //   73: istore #5
/*     */     //   75: fconst_0
/*     */     //   76: fstore #6
/*     */     //   78: iload_1
/*     */     //   79: iload #5
/*     */     //   81: isub
/*     */     //   82: i2f
/*     */     //   83: iconst_2
/*     */     //   84: i2f
/*     */     //   85: fdiv
/*     */     //   86: fstore #6
/*     */     //   88: aload_0
/*     */     //   89: astore #7
/*     */     //   91: aload_2
/*     */     //   92: astore #8
/*     */     //   94: iconst_0
/*     */     //   95: istore #9
/*     */     //   97: iload #4
/*     */     //   99: ifne -> 184
/*     */     //   102: aload #8
/*     */     //   104: astore #10
/*     */     //   106: iconst_0
/*     */     //   107: istore #11
/*     */     //   109: iconst_0
/*     */     //   110: istore #12
/*     */     //   112: iconst_0
/*     */     //   113: istore #13
/*     */     //   115: aload #10
/*     */     //   117: arraylength
/*     */     //   118: istore #14
/*     */     //   120: iload #13
/*     */     //   122: iload #14
/*     */     //   124: if_icmpge -> 180
/*     */     //   127: aload #10
/*     */     //   129: iload #13
/*     */     //   131: iaload
/*     */     //   132: istore #15
/*     */     //   134: iload #12
/*     */     //   136: iinc #12, 1
/*     */     //   139: iload #15
/*     */     //   141: istore #16
/*     */     //   143: istore #17
/*     */     //   145: iconst_0
/*     */     //   146: istore #18
/*     */     //   148: aload_3
/*     */     //   149: iload #17
/*     */     //   151: fload #6
/*     */     //   153: fstore #19
/*     */     //   155: iconst_0
/*     */     //   156: istore #20
/*     */     //   158: fload #19
/*     */     //   160: invokestatic round : (F)I
/*     */     //   163: iastore
/*     */     //   164: fload #6
/*     */     //   166: iload #16
/*     */     //   168: i2f
/*     */     //   169: fadd
/*     */     //   170: fstore #6
/*     */     //   172: nop
/*     */     //   173: nop
/*     */     //   174: iinc #13, 1
/*     */     //   177: goto -> 120
/*     */     //   180: nop
/*     */     //   181: goto -> 243
/*     */     //   184: aload #8
/*     */     //   186: arraylength
/*     */     //   187: iconst_1
/*     */     //   188: isub
/*     */     //   189: istore #10
/*     */     //   191: iconst_m1
/*     */     //   192: iload #10
/*     */     //   194: if_icmpge -> 243
/*     */     //   197: iload #10
/*     */     //   199: aload #8
/*     */     //   201: iload #10
/*     */     //   203: iaload
/*     */     //   204: istore #16
/*     */     //   206: istore #17
/*     */     //   208: iconst_0
/*     */     //   209: istore #18
/*     */     //   211: aload_3
/*     */     //   212: iload #17
/*     */     //   214: fload #6
/*     */     //   216: fstore #19
/*     */     //   218: iconst_0
/*     */     //   219: istore #20
/*     */     //   221: fload #19
/*     */     //   223: invokestatic round : (F)I
/*     */     //   226: iastore
/*     */     //   227: fload #6
/*     */     //   229: iload #16
/*     */     //   231: i2f
/*     */     //   232: fadd
/*     */     //   233: fstore #6
/*     */     //   235: nop
/*     */     //   236: nop
/*     */     //   237: iinc #10, -1
/*     */     //   240: goto -> 191
/*     */     //   243: nop
/*     */     //   244: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #639	-> 12
/*     */     //   #741	-> 21
/*     */     //   #742	-> 25
/*     */     //   #639	-> 58
/*     */     //   #742	-> 63
/*     */     //   #743	-> 71
/*     */     //   #639	-> 73
/*     */     //   #640	-> 75
/*     */     //   #641	-> 88
/*     */     //   #744	-> 97
/*     */     //   #745	-> 102
/*     */     //   #746	-> 109
/*     */     //   #747	-> 112
/*     */     //   #642	-> 148
/*     */     //   #748	-> 158
/*     */     //   #643	-> 164
/*     */     //   #644	-> 172
/*     */     //   #747	-> 173
/*     */     //   #749	-> 180
/*     */     //   #750	-> 184
/*     */     //   #751	-> 197
/*     */     //   #642	-> 211
/*     */     //   #748	-> 221
/*     */     //   #643	-> 227
/*     */     //   #644	-> 235
/*     */     //   #751	-> 236
/*     */     //   #750	-> 237
/*     */     //   #754	-> 243
/*     */     //   #645	-> 244
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   58	5	15	$i$a$-fold-Arrangement$placeCenter$consumedSize$1	I
/*     */     //   55	8	14	a	I
/*     */     //   55	8	13	b	I
/*     */     //   47	18	12	element$iv	I
/*     */     //   21	52	8	$i$f$fold	I
/*     */     //   25	48	9	accumulator$iv	I
/*     */     //   18	55	6	$this$fold$iv	[I
/*     */     //   18	55	7	initial$iv	I
/*     */     //   158	5	20	$i$f$fastRoundToInt	I
/*     */     //   155	8	19	$this$fastRoundToInt$iv	F
/*     */     //   148	25	18	$i$a$-forEachIndexed-Arrangement$placeCenter$1	I
/*     */     //   145	28	17	index	I
/*     */     //   145	28	16	it	I
/*     */     //   221	5	20	$i$f$fastRoundToInt	I
/*     */     //   218	8	19	$this$fastRoundToInt$iv	F
/*     */     //   211	25	18	$i$a$-forEachIndexed-Arrangement$placeCenter$1	I
/*     */     //   208	28	17	index	I
/*     */     //   208	28	16	it	I
/*     */     //   134	40	15	item$iv$iv	I
/*     */     //   109	72	11	$i$f$forEachIndexed	I
/*     */     //   112	69	12	index$iv$iv	I
/*     */     //   106	75	10	$this$forEachIndexed$iv$iv	[I
/*     */     //   191	52	10	i$iv	I
/*     */     //   97	147	9	$i$f$forEachIndexed	I
/*     */     //   94	150	7	this_$iv	Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   94	150	8	$this$forEachIndexed$iv	[I
/*     */     //   75	170	5	consumedSize	I
/*     */     //   78	167	6	current	F
/*     */     //   0	245	0	this	Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   0	245	1	totalSize	I
/*     */     //   0	245	2	size	[I
/*     */     //   0	245	3	outPosition	[I
/*     */     //   0	245	4	reverseInput	Z
/*     */   }
/*     */   
/*     */   public final void placeSpaceEvenly$foundation_layout(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc 'size'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_3
/*     */     //   7: ldc 'outPosition'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: astore #6
/*     */     //   15: iconst_0
/*     */     //   16: istore #7
/*     */     //   18: iconst_0
/*     */     //   19: istore #8
/*     */     //   21: iload #7
/*     */     //   23: istore #9
/*     */     //   25: iconst_0
/*     */     //   26: istore #10
/*     */     //   28: aload #6
/*     */     //   30: arraylength
/*     */     //   31: istore #11
/*     */     //   33: iload #10
/*     */     //   35: iload #11
/*     */     //   37: if_icmpge -> 71
/*     */     //   40: aload #6
/*     */     //   42: iload #10
/*     */     //   44: iaload
/*     */     //   45: istore #12
/*     */     //   47: iload #9
/*     */     //   49: iload #12
/*     */     //   51: istore #13
/*     */     //   53: istore #14
/*     */     //   55: iconst_0
/*     */     //   56: istore #15
/*     */     //   58: iload #14
/*     */     //   60: iload #13
/*     */     //   62: iadd
/*     */     //   63: istore #9
/*     */     //   65: iinc #10, 1
/*     */     //   68: goto -> 33
/*     */     //   71: iload #9
/*     */     //   73: istore #5
/*     */     //   75: iload_1
/*     */     //   76: iload #5
/*     */     //   78: isub
/*     */     //   79: i2f
/*     */     //   80: aload_2
/*     */     //   81: arraylength
/*     */     //   82: iconst_1
/*     */     //   83: iadd
/*     */     //   84: i2f
/*     */     //   85: fdiv
/*     */     //   86: fstore #6
/*     */     //   88: fconst_0
/*     */     //   89: fstore #7
/*     */     //   91: fload #6
/*     */     //   93: fstore #7
/*     */     //   95: aload_0
/*     */     //   96: astore #8
/*     */     //   98: aload_2
/*     */     //   99: astore #9
/*     */     //   101: iconst_0
/*     */     //   102: istore #10
/*     */     //   104: iload #4
/*     */     //   106: ifne -> 194
/*     */     //   109: aload #9
/*     */     //   111: astore #11
/*     */     //   113: iconst_0
/*     */     //   114: istore #12
/*     */     //   116: iconst_0
/*     */     //   117: istore #13
/*     */     //   119: iconst_0
/*     */     //   120: istore #14
/*     */     //   122: aload #11
/*     */     //   124: arraylength
/*     */     //   125: istore #15
/*     */     //   127: iload #14
/*     */     //   129: iload #15
/*     */     //   131: if_icmpge -> 190
/*     */     //   134: aload #11
/*     */     //   136: iload #14
/*     */     //   138: iaload
/*     */     //   139: istore #16
/*     */     //   141: iload #13
/*     */     //   143: iinc #13, 1
/*     */     //   146: iload #16
/*     */     //   148: istore #17
/*     */     //   150: istore #18
/*     */     //   152: iconst_0
/*     */     //   153: istore #19
/*     */     //   155: aload_3
/*     */     //   156: iload #18
/*     */     //   158: fload #7
/*     */     //   160: fstore #20
/*     */     //   162: iconst_0
/*     */     //   163: istore #21
/*     */     //   165: fload #20
/*     */     //   167: invokestatic round : (F)I
/*     */     //   170: iastore
/*     */     //   171: fload #7
/*     */     //   173: iload #17
/*     */     //   175: i2f
/*     */     //   176: fload #6
/*     */     //   178: fadd
/*     */     //   179: fadd
/*     */     //   180: fstore #7
/*     */     //   182: nop
/*     */     //   183: nop
/*     */     //   184: iinc #14, 1
/*     */     //   187: goto -> 127
/*     */     //   190: nop
/*     */     //   191: goto -> 256
/*     */     //   194: aload #9
/*     */     //   196: arraylength
/*     */     //   197: iconst_1
/*     */     //   198: isub
/*     */     //   199: istore #11
/*     */     //   201: iconst_m1
/*     */     //   202: iload #11
/*     */     //   204: if_icmpge -> 256
/*     */     //   207: iload #11
/*     */     //   209: aload #9
/*     */     //   211: iload #11
/*     */     //   213: iaload
/*     */     //   214: istore #17
/*     */     //   216: istore #18
/*     */     //   218: iconst_0
/*     */     //   219: istore #19
/*     */     //   221: aload_3
/*     */     //   222: iload #18
/*     */     //   224: fload #7
/*     */     //   226: fstore #20
/*     */     //   228: iconst_0
/*     */     //   229: istore #21
/*     */     //   231: fload #20
/*     */     //   233: invokestatic round : (F)I
/*     */     //   236: iastore
/*     */     //   237: fload #7
/*     */     //   239: iload #17
/*     */     //   241: i2f
/*     */     //   242: fload #6
/*     */     //   244: fadd
/*     */     //   245: fadd
/*     */     //   246: fstore #7
/*     */     //   248: nop
/*     */     //   249: nop
/*     */     //   250: iinc #11, -1
/*     */     //   253: goto -> 201
/*     */     //   256: nop
/*     */     //   257: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #653	-> 12
/*     */     //   #755	-> 21
/*     */     //   #756	-> 25
/*     */     //   #653	-> 58
/*     */     //   #756	-> 63
/*     */     //   #757	-> 71
/*     */     //   #653	-> 73
/*     */     //   #654	-> 75
/*     */     //   #655	-> 88
/*     */     //   #656	-> 95
/*     */     //   #758	-> 104
/*     */     //   #759	-> 109
/*     */     //   #760	-> 116
/*     */     //   #761	-> 119
/*     */     //   #657	-> 155
/*     */     //   #762	-> 165
/*     */     //   #658	-> 171
/*     */     //   #659	-> 182
/*     */     //   #761	-> 183
/*     */     //   #763	-> 190
/*     */     //   #764	-> 194
/*     */     //   #765	-> 207
/*     */     //   #657	-> 221
/*     */     //   #762	-> 231
/*     */     //   #658	-> 237
/*     */     //   #659	-> 248
/*     */     //   #765	-> 249
/*     */     //   #764	-> 250
/*     */     //   #768	-> 256
/*     */     //   #660	-> 257
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   58	5	15	$i$a$-fold-Arrangement$placeSpaceEvenly$consumedSize$1	I
/*     */     //   55	8	14	a	I
/*     */     //   55	8	13	b	I
/*     */     //   47	18	12	element$iv	I
/*     */     //   21	52	8	$i$f$fold	I
/*     */     //   25	48	9	accumulator$iv	I
/*     */     //   18	55	6	$this$fold$iv	[I
/*     */     //   18	55	7	initial$iv	I
/*     */     //   165	5	21	$i$f$fastRoundToInt	I
/*     */     //   162	8	20	$this$fastRoundToInt$iv	F
/*     */     //   155	28	19	$i$a$-forEachIndexed-Arrangement$placeSpaceEvenly$1	I
/*     */     //   152	31	18	index	I
/*     */     //   152	31	17	it	I
/*     */     //   231	5	21	$i$f$fastRoundToInt	I
/*     */     //   228	8	20	$this$fastRoundToInt$iv	F
/*     */     //   221	28	19	$i$a$-forEachIndexed-Arrangement$placeSpaceEvenly$1	I
/*     */     //   218	31	18	index	I
/*     */     //   218	31	17	it	I
/*     */     //   141	43	16	item$iv$iv	I
/*     */     //   116	75	12	$i$f$forEachIndexed	I
/*     */     //   119	72	13	index$iv$iv	I
/*     */     //   113	78	11	$this$forEachIndexed$iv$iv	[I
/*     */     //   201	55	11	i$iv	I
/*     */     //   104	153	10	$i$f$forEachIndexed	I
/*     */     //   101	156	8	this_$iv	Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   101	156	9	$this$forEachIndexed$iv	[I
/*     */     //   75	183	5	consumedSize	I
/*     */     //   88	170	6	gapSize	F
/*     */     //   91	167	7	current	F
/*     */     //   0	258	0	this	Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   0	258	1	totalSize	I
/*     */     //   0	258	2	size	[I
/*     */     //   0	258	3	outPosition	[I
/*     */     //   0	258	4	reverseInput	Z
/*     */   }
/*     */   
/*     */   public final void placeSpaceBetween$foundation_layout(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc 'size'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_3
/*     */     //   7: ldc 'outPosition'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: arraylength
/*     */     //   14: ifne -> 21
/*     */     //   17: iconst_1
/*     */     //   18: goto -> 22
/*     */     //   21: iconst_0
/*     */     //   22: ifeq -> 26
/*     */     //   25: return
/*     */     //   26: aload_2
/*     */     //   27: astore #6
/*     */     //   29: iconst_0
/*     */     //   30: istore #7
/*     */     //   32: iconst_0
/*     */     //   33: istore #8
/*     */     //   35: iload #7
/*     */     //   37: istore #9
/*     */     //   39: iconst_0
/*     */     //   40: istore #10
/*     */     //   42: aload #6
/*     */     //   44: arraylength
/*     */     //   45: istore #11
/*     */     //   47: iload #10
/*     */     //   49: iload #11
/*     */     //   51: if_icmpge -> 85
/*     */     //   54: aload #6
/*     */     //   56: iload #10
/*     */     //   58: iaload
/*     */     //   59: istore #12
/*     */     //   61: iload #9
/*     */     //   63: iload #12
/*     */     //   65: istore #13
/*     */     //   67: istore #14
/*     */     //   69: iconst_0
/*     */     //   70: istore #15
/*     */     //   72: iload #14
/*     */     //   74: iload #13
/*     */     //   76: iadd
/*     */     //   77: istore #9
/*     */     //   79: iinc #10, 1
/*     */     //   82: goto -> 47
/*     */     //   85: iload #9
/*     */     //   87: istore #5
/*     */     //   89: aload_2
/*     */     //   90: invokestatic getLastIndex : ([I)I
/*     */     //   93: iconst_1
/*     */     //   94: invokestatic max : (II)I
/*     */     //   97: istore #6
/*     */     //   99: iload_1
/*     */     //   100: iload #5
/*     */     //   102: isub
/*     */     //   103: i2f
/*     */     //   104: iload #6
/*     */     //   106: i2f
/*     */     //   107: fdiv
/*     */     //   108: fstore #7
/*     */     //   110: fconst_0
/*     */     //   111: fstore #8
/*     */     //   113: iload #4
/*     */     //   115: ifeq -> 128
/*     */     //   118: aload_2
/*     */     //   119: arraylength
/*     */     //   120: iconst_1
/*     */     //   121: if_icmpne -> 128
/*     */     //   124: fload #7
/*     */     //   126: fstore #8
/*     */     //   128: aload_0
/*     */     //   129: astore #9
/*     */     //   131: aload_2
/*     */     //   132: astore #10
/*     */     //   134: iconst_0
/*     */     //   135: istore #11
/*     */     //   137: iload #4
/*     */     //   139: ifne -> 227
/*     */     //   142: aload #10
/*     */     //   144: astore #12
/*     */     //   146: iconst_0
/*     */     //   147: istore #13
/*     */     //   149: iconst_0
/*     */     //   150: istore #14
/*     */     //   152: iconst_0
/*     */     //   153: istore #15
/*     */     //   155: aload #12
/*     */     //   157: arraylength
/*     */     //   158: istore #16
/*     */     //   160: iload #15
/*     */     //   162: iload #16
/*     */     //   164: if_icmpge -> 223
/*     */     //   167: aload #12
/*     */     //   169: iload #15
/*     */     //   171: iaload
/*     */     //   172: istore #17
/*     */     //   174: iload #14
/*     */     //   176: iinc #14, 1
/*     */     //   179: iload #17
/*     */     //   181: istore #18
/*     */     //   183: istore #19
/*     */     //   185: iconst_0
/*     */     //   186: istore #20
/*     */     //   188: aload_3
/*     */     //   189: iload #19
/*     */     //   191: fload #8
/*     */     //   193: fstore #21
/*     */     //   195: iconst_0
/*     */     //   196: istore #22
/*     */     //   198: fload #21
/*     */     //   200: invokestatic round : (F)I
/*     */     //   203: iastore
/*     */     //   204: fload #8
/*     */     //   206: iload #18
/*     */     //   208: i2f
/*     */     //   209: fload #7
/*     */     //   211: fadd
/*     */     //   212: fadd
/*     */     //   213: fstore #8
/*     */     //   215: nop
/*     */     //   216: nop
/*     */     //   217: iinc #15, 1
/*     */     //   220: goto -> 160
/*     */     //   223: nop
/*     */     //   224: goto -> 289
/*     */     //   227: aload #10
/*     */     //   229: arraylength
/*     */     //   230: iconst_1
/*     */     //   231: isub
/*     */     //   232: istore #12
/*     */     //   234: iconst_m1
/*     */     //   235: iload #12
/*     */     //   237: if_icmpge -> 289
/*     */     //   240: iload #12
/*     */     //   242: aload #10
/*     */     //   244: iload #12
/*     */     //   246: iaload
/*     */     //   247: istore #18
/*     */     //   249: istore #19
/*     */     //   251: iconst_0
/*     */     //   252: istore #20
/*     */     //   254: aload_3
/*     */     //   255: iload #19
/*     */     //   257: fload #8
/*     */     //   259: fstore #21
/*     */     //   261: iconst_0
/*     */     //   262: istore #22
/*     */     //   264: fload #21
/*     */     //   266: invokestatic round : (F)I
/*     */     //   269: iastore
/*     */     //   270: fload #8
/*     */     //   272: iload #18
/*     */     //   274: i2f
/*     */     //   275: fload #7
/*     */     //   277: fadd
/*     */     //   278: fadd
/*     */     //   279: fstore #8
/*     */     //   281: nop
/*     */     //   282: nop
/*     */     //   283: iinc #12, -1
/*     */     //   286: goto -> 234
/*     */     //   289: nop
/*     */     //   290: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #668	-> 12
/*     */     //   #668	-> 22
/*     */     //   #670	-> 26
/*     */     //   #769	-> 35
/*     */     //   #770	-> 39
/*     */     //   #670	-> 72
/*     */     //   #770	-> 77
/*     */     //   #771	-> 85
/*     */     //   #670	-> 87
/*     */     //   #671	-> 89
/*     */     //   #671	-> 97
/*     */     //   #672	-> 99
/*     */     //   #674	-> 110
/*     */     //   #675	-> 113
/*     */     //   #678	-> 124
/*     */     //   #680	-> 128
/*     */     //   #772	-> 137
/*     */     //   #773	-> 142
/*     */     //   #774	-> 149
/*     */     //   #775	-> 152
/*     */     //   #681	-> 188
/*     */     //   #776	-> 198
/*     */     //   #682	-> 204
/*     */     //   #683	-> 215
/*     */     //   #775	-> 216
/*     */     //   #777	-> 223
/*     */     //   #778	-> 227
/*     */     //   #779	-> 240
/*     */     //   #681	-> 254
/*     */     //   #776	-> 264
/*     */     //   #682	-> 270
/*     */     //   #683	-> 281
/*     */     //   #779	-> 282
/*     */     //   #778	-> 283
/*     */     //   #782	-> 289
/*     */     //   #684	-> 290
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   72	5	15	$i$a$-fold-Arrangement$placeSpaceBetween$consumedSize$1	I
/*     */     //   69	8	14	a	I
/*     */     //   69	8	13	b	I
/*     */     //   61	18	12	element$iv	I
/*     */     //   35	52	8	$i$f$fold	I
/*     */     //   39	48	9	accumulator$iv	I
/*     */     //   32	55	6	$this$fold$iv	[I
/*     */     //   32	55	7	initial$iv	I
/*     */     //   198	5	22	$i$f$fastRoundToInt	I
/*     */     //   195	8	21	$this$fastRoundToInt$iv	F
/*     */     //   188	28	20	$i$a$-forEachIndexed-Arrangement$placeSpaceBetween$1	I
/*     */     //   185	31	19	index	I
/*     */     //   185	31	18	it	I
/*     */     //   264	5	22	$i$f$fastRoundToInt	I
/*     */     //   261	8	21	$this$fastRoundToInt$iv	F
/*     */     //   254	28	20	$i$a$-forEachIndexed-Arrangement$placeSpaceBetween$1	I
/*     */     //   251	31	19	index	I
/*     */     //   251	31	18	it	I
/*     */     //   174	43	17	item$iv$iv	I
/*     */     //   149	75	13	$i$f$forEachIndexed	I
/*     */     //   152	72	14	index$iv$iv	I
/*     */     //   146	78	12	$this$forEachIndexed$iv$iv	[I
/*     */     //   234	55	12	i$iv	I
/*     */     //   137	153	11	$i$f$forEachIndexed	I
/*     */     //   134	156	9	this_$iv	Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   134	156	10	$this$forEachIndexed$iv	[I
/*     */     //   89	202	5	consumedSize	I
/*     */     //   99	192	6	noOfGaps	I
/*     */     //   110	181	7	gapSize	F
/*     */     //   113	178	8	current	F
/*     */     //   0	291	0	this	Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   0	291	1	totalSize	I
/*     */     //   0	291	2	size	[I
/*     */     //   0	291	3	outPosition	[I
/*     */     //   0	291	4	reverseInput	Z
/*     */   }
/*     */   
/*     */   public final void placeSpaceAround$foundation_layout(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc 'size'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_3
/*     */     //   7: ldc 'outPosition'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: astore #6
/*     */     //   15: iconst_0
/*     */     //   16: istore #7
/*     */     //   18: iconst_0
/*     */     //   19: istore #8
/*     */     //   21: iload #7
/*     */     //   23: istore #9
/*     */     //   25: iconst_0
/*     */     //   26: istore #10
/*     */     //   28: aload #6
/*     */     //   30: arraylength
/*     */     //   31: istore #11
/*     */     //   33: iload #10
/*     */     //   35: iload #11
/*     */     //   37: if_icmpge -> 71
/*     */     //   40: aload #6
/*     */     //   42: iload #10
/*     */     //   44: iaload
/*     */     //   45: istore #12
/*     */     //   47: iload #9
/*     */     //   49: iload #12
/*     */     //   51: istore #13
/*     */     //   53: istore #14
/*     */     //   55: iconst_0
/*     */     //   56: istore #15
/*     */     //   58: iload #14
/*     */     //   60: iload #13
/*     */     //   62: iadd
/*     */     //   63: istore #9
/*     */     //   65: iinc #10, 1
/*     */     //   68: goto -> 33
/*     */     //   71: iload #9
/*     */     //   73: istore #5
/*     */     //   75: aload_2
/*     */     //   76: arraylength
/*     */     //   77: ifne -> 84
/*     */     //   80: iconst_1
/*     */     //   81: goto -> 85
/*     */     //   84: iconst_0
/*     */     //   85: ifne -> 92
/*     */     //   88: iconst_1
/*     */     //   89: goto -> 93
/*     */     //   92: iconst_0
/*     */     //   93: ifeq -> 108
/*     */     //   96: iload_1
/*     */     //   97: iload #5
/*     */     //   99: isub
/*     */     //   100: i2f
/*     */     //   101: aload_2
/*     */     //   102: arraylength
/*     */     //   103: i2f
/*     */     //   104: fdiv
/*     */     //   105: goto -> 109
/*     */     //   108: fconst_0
/*     */     //   109: fstore #6
/*     */     //   111: fconst_0
/*     */     //   112: fstore #7
/*     */     //   114: fload #6
/*     */     //   116: iconst_2
/*     */     //   117: i2f
/*     */     //   118: fdiv
/*     */     //   119: fstore #7
/*     */     //   121: aload_0
/*     */     //   122: astore #8
/*     */     //   124: aload_2
/*     */     //   125: astore #9
/*     */     //   127: iconst_0
/*     */     //   128: istore #10
/*     */     //   130: iload #4
/*     */     //   132: ifne -> 220
/*     */     //   135: aload #9
/*     */     //   137: astore #11
/*     */     //   139: iconst_0
/*     */     //   140: istore #12
/*     */     //   142: iconst_0
/*     */     //   143: istore #13
/*     */     //   145: iconst_0
/*     */     //   146: istore #14
/*     */     //   148: aload #11
/*     */     //   150: arraylength
/*     */     //   151: istore #15
/*     */     //   153: iload #14
/*     */     //   155: iload #15
/*     */     //   157: if_icmpge -> 216
/*     */     //   160: aload #11
/*     */     //   162: iload #14
/*     */     //   164: iaload
/*     */     //   165: istore #16
/*     */     //   167: iload #13
/*     */     //   169: iinc #13, 1
/*     */     //   172: iload #16
/*     */     //   174: istore #17
/*     */     //   176: istore #18
/*     */     //   178: iconst_0
/*     */     //   179: istore #19
/*     */     //   181: aload_3
/*     */     //   182: iload #18
/*     */     //   184: fload #7
/*     */     //   186: fstore #20
/*     */     //   188: iconst_0
/*     */     //   189: istore #21
/*     */     //   191: fload #20
/*     */     //   193: invokestatic round : (F)I
/*     */     //   196: iastore
/*     */     //   197: fload #7
/*     */     //   199: iload #17
/*     */     //   201: i2f
/*     */     //   202: fload #6
/*     */     //   204: fadd
/*     */     //   205: fadd
/*     */     //   206: fstore #7
/*     */     //   208: nop
/*     */     //   209: nop
/*     */     //   210: iinc #14, 1
/*     */     //   213: goto -> 153
/*     */     //   216: nop
/*     */     //   217: goto -> 282
/*     */     //   220: aload #9
/*     */     //   222: arraylength
/*     */     //   223: iconst_1
/*     */     //   224: isub
/*     */     //   225: istore #11
/*     */     //   227: iconst_m1
/*     */     //   228: iload #11
/*     */     //   230: if_icmpge -> 282
/*     */     //   233: iload #11
/*     */     //   235: aload #9
/*     */     //   237: iload #11
/*     */     //   239: iaload
/*     */     //   240: istore #17
/*     */     //   242: istore #18
/*     */     //   244: iconst_0
/*     */     //   245: istore #19
/*     */     //   247: aload_3
/*     */     //   248: iload #18
/*     */     //   250: fload #7
/*     */     //   252: fstore #20
/*     */     //   254: iconst_0
/*     */     //   255: istore #21
/*     */     //   257: fload #20
/*     */     //   259: invokestatic round : (F)I
/*     */     //   262: iastore
/*     */     //   263: fload #7
/*     */     //   265: iload #17
/*     */     //   267: i2f
/*     */     //   268: fload #6
/*     */     //   270: fadd
/*     */     //   271: fadd
/*     */     //   272: fstore #7
/*     */     //   274: nop
/*     */     //   275: nop
/*     */     //   276: iinc #11, -1
/*     */     //   279: goto -> 227
/*     */     //   282: nop
/*     */     //   283: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #692	-> 12
/*     */     //   #783	-> 21
/*     */     //   #784	-> 25
/*     */     //   #692	-> 58
/*     */     //   #784	-> 63
/*     */     //   #785	-> 71
/*     */     //   #692	-> 73
/*     */     //   #693	-> 75
/*     */     //   #693	-> 93
/*     */     //   #694	-> 96
/*     */     //   #696	-> 108
/*     */     //   #693	-> 109
/*     */     //   #698	-> 111
/*     */     //   #699	-> 121
/*     */     //   #786	-> 130
/*     */     //   #787	-> 135
/*     */     //   #788	-> 142
/*     */     //   #789	-> 145
/*     */     //   #700	-> 181
/*     */     //   #790	-> 191
/*     */     //   #701	-> 197
/*     */     //   #702	-> 208
/*     */     //   #789	-> 209
/*     */     //   #791	-> 216
/*     */     //   #792	-> 220
/*     */     //   #793	-> 233
/*     */     //   #700	-> 247
/*     */     //   #790	-> 257
/*     */     //   #701	-> 263
/*     */     //   #702	-> 274
/*     */     //   #793	-> 275
/*     */     //   #792	-> 276
/*     */     //   #796	-> 282
/*     */     //   #703	-> 283
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   58	5	15	$i$a$-fold-Arrangement$placeSpaceAround$consumedSize$1	I
/*     */     //   55	8	14	a	I
/*     */     //   55	8	13	b	I
/*     */     //   47	18	12	element$iv	I
/*     */     //   21	52	8	$i$f$fold	I
/*     */     //   25	48	9	accumulator$iv	I
/*     */     //   18	55	6	$this$fold$iv	[I
/*     */     //   18	55	7	initial$iv	I
/*     */     //   191	5	21	$i$f$fastRoundToInt	I
/*     */     //   188	8	20	$this$fastRoundToInt$iv	F
/*     */     //   181	28	19	$i$a$-forEachIndexed-Arrangement$placeSpaceAround$1	I
/*     */     //   178	31	18	index	I
/*     */     //   178	31	17	it	I
/*     */     //   257	5	21	$i$f$fastRoundToInt	I
/*     */     //   254	8	20	$this$fastRoundToInt$iv	F
/*     */     //   247	28	19	$i$a$-forEachIndexed-Arrangement$placeSpaceAround$1	I
/*     */     //   244	31	18	index	I
/*     */     //   244	31	17	it	I
/*     */     //   167	43	16	item$iv$iv	I
/*     */     //   142	75	12	$i$f$forEachIndexed	I
/*     */     //   145	72	13	index$iv$iv	I
/*     */     //   139	78	11	$this$forEachIndexed$iv$iv	[I
/*     */     //   227	55	11	i$iv	I
/*     */     //   130	153	10	$i$f$forEachIndexed	I
/*     */     //   127	156	8	this_$iv	Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   127	156	9	$this$forEachIndexed$iv	[I
/*     */     //   75	209	5	consumedSize	I
/*     */     //   111	173	6	gapSize	F
/*     */     //   114	170	7	current	F
/*     */     //   0	284	0	this	Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   0	284	1	totalSize	I
/*     */     //   0	284	2	size	[I
/*     */     //   0	284	3	outPosition	[I
/*     */     //   0	284	4	reverseInput	Z
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\Arrangement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */