/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.graphics.ColorFilter;
/*     */ import androidx.compose.ui.graphics.ImageBitmap;
/*     */ import androidx.compose.ui.graphics.painter.BitmapPainter;
/*     */ import androidx.compose.ui.graphics.painter.Painter;
/*     */ import androidx.compose.ui.graphics.vector.ImageVector;
/*     */ import androidx.compose.ui.graphics.vector.VectorPainter;
/*     */ import androidx.compose.ui.graphics.vector.VectorPainterKt;
/*     */ import androidx.compose.ui.platform.CompositionLocalsKt;
/*     */ import androidx.compose.ui.semantics.SemanticsPropertiesKt;
/*     */ import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import java.util.Arrays;
/*     */ import java.util.Locale;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.ApiStatus.ScheduledForRemoval;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.compose.resources.ImageDecodersKt;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ import org.jetbrains.jewel.ui.painter.PainterHint;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000j\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\n\n\002\020\022\n\002\b\004\n\002\020\013\n\002\030\002\n\002\b\004\032S\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0032\n\020\005\032\006\022\002\b\0030\0062\b\020\007\032\004\030\0010\b2\b\b\002\020\t\032\0020\n2\022\020\013\032\n\022\006\b\001\022\0020\r0\f\"\0020\rH\007¢\006\002\020\016\032G\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0032\n\020\005\032\006\022\002\b\0030\0062\b\020\007\032\004\030\0010\b2\b\b\002\020\t\032\0020\n2\006\020\017\032\0020\rH\007¢\006\002\020\020\032U\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0032\n\020\005\032\006\022\002\b\0030\0062\b\b\002\020\t\032\0020\n2\b\b\002\020\021\032\0020\0222\022\020\013\032\n\022\006\b\001\022\0020\r0\f\"\0020\rH\007¢\006\004\b\023\020\024\032I\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0032\n\020\005\032\006\022\002\b\0030\0062\b\b\002\020\t\032\0020\n2\b\b\002\020\021\032\0020\0222\006\020\017\032\0020\rH\007¢\006\004\b\023\020\025\032W\020\000\032\0020\0012\006\020\026\032\0020\0272\b\020\004\032\004\030\0010\0032\b\b\002\020\t\032\0020\n2\f\b\002\020\005\032\006\022\002\b\0030\0062\b\b\002\020\021\032\0020\0222\022\020\013\032\n\022\006\b\001\022\0020\r0\f\"\0020\rH\007¢\006\004\b\023\020\030\032K\020\000\032\0020\0012\006\020\026\032\0020\0272\b\020\004\032\004\030\0010\0032\b\b\002\020\t\032\0020\n2\f\b\002\020\005\032\006\022\002\b\0030\0062\b\b\002\020\021\032\0020\0222\006\020\017\032\0020\rH\007¢\006\004\b\023\020\031\032I\020\000\032\0020\0012\006\020\026\032\0020\0272\b\020\004\032\004\030\0010\0032\b\b\002\020\t\032\0020\n2\f\b\002\020\005\032\006\022\002\b\0030\0062\b\020\007\032\004\030\0010\b2\006\020\017\032\0020\rH\007¢\006\002\020\032\032U\020\000\032\0020\0012\006\020\026\032\0020\0272\b\020\004\032\004\030\0010\0032\b\b\002\020\t\032\0020\n2\f\b\002\020\005\032\006\022\002\b\0030\0062\b\020\007\032\004\030\0010\b2\022\020\013\032\n\022\006\b\001\022\0020\r0\f\"\0020\rH\007¢\006\002\020\033\0325\020\000\032\0020\0012\006\020\034\032\0020\0352\b\020\004\032\004\030\0010\0032\b\b\002\020\t\032\0020\n2\b\b\002\020\021\032\0020\022H\007¢\006\004\b\036\020\037\0325\020\000\032\0020\0012\006\020 \032\0020!2\b\020\004\032\004\030\0010\0032\b\b\002\020\t\032\0020\n2\b\b\002\020\021\032\0020\022H\007¢\006\004\b\036\020\"\0325\020\000\032\0020\0012\006\020#\032\0020$2\b\020\004\032\004\030\0010\0032\b\b\002\020\t\032\0020\n2\b\b\002\020\021\032\0020\022H\007¢\006\004\b\036\020%\0323\020\000\032\0020\0012\006\020#\032\0020$2\b\020\004\032\004\030\0010\0032\b\020\007\032\004\030\0010\b2\b\b\002\020\t\032\0020\nH\007¢\006\002\020&\032\025\020'\032\0020$2\006\020(\032\0020\003H\007¢\006\002\020)\032\025\020*\032\0020$2\006\020+\032\0020\003H\003¢\006\002\020)\032\025\020,\032\0020$2\006\020+\032\0020\003H\003¢\006\002\020)\032\025\020-\032\0020$2\006\020+\032\0020\003H\003¢\006\002\020)\032\035\020.\032\n 0*\004\030\0010/0/2\006\020(\032\0020\003H\002¢\006\002\0201\032\024\0202\032\0020\n*\0020\n2\006\020#\032\0020$H\002\032\023\0203\032\00204*\00205H\002¢\006\004\b6\0207\"\016\0208\032\0020\nX\004¢\006\002\n\000¨\0069²\006\n\020#\032\0020$X\002²\006\n\020#\032\0020$X\002²\006\n\020#\032\0020$X\002²\006\n\020#\032\0020$X\002²\006\n\020#\032\0020$X\002²\006\n\020#\032\0020$X\002²\006\n\020#\032\0020$X\002²\006\n\020#\032\0020$X\002"}, d2 = {"Icon", "", "resource", "", "contentDescription", "iconClass", "Ljava/lang/Class;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "modifier", "Landroidx/compose/ui/Modifier;", "hints", "", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Modifier;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V", "hint", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V", "tint", "Landroidx/compose/ui/graphics/Color;", "Icon-FHprtrg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/ui/Modifier;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/ui/Modifier;JLorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V", "key", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;JLorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;Landroidx/compose/ui/graphics/ColorFilter;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "painterResource", "resourcePath", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "rememberSvgResource", "path", "rememberVectorXmlResource", "rememberBitmapResource", "readResourceBytes", "", "kotlin.jvm.PlatformType", "(Ljava/lang/String;)[B", "defaultSizeFor", "isInfinite", "", "Landroidx/compose/ui/geometry/Size;", "isInfinite-uvyYCjk", "(J)Z", "DefaultIconSizeModifier", "ui"})
/*     */ @SourceDebugExtension({"SMAP\nIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icon.kt\norg/jetbrains/jewel/ui/component/IconKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 ModifierExtensions.kt\norg/jetbrains/jewel/ui/util/ModifierExtensionsKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,353:1\n1225#2,6:354\n1225#2,6:360\n1225#2,6:366\n1225#2,6:372\n1225#2,6:378\n1225#2,6:385\n1225#2,6:392\n1225#2,6:399\n1225#2,6:405\n696#3:384\n77#4:391\n77#4:398\n10#5:411\n81#6:412\n81#6:413\n81#6:414\n81#6:415\n81#6:416\n81#6:417\n81#6:418\n81#6:419\n149#7:420\n*S KotlinDebug\n*F\n+ 1 Icon.kt\norg/jetbrains/jewel/ui/component/IconKt\n*L\n148#1:354,6\n165#1:360,6\n183#1:366,6\n200#1:372,6\n249#1:378,6\n293#1:385,6\n322#1:392,6\n329#1:399,6\n336#1:405,6\n270#1:384\n321#1:391\n328#1:398\n347#1:411\n61#1:412\n85#1:413\n109#1:414\n133#1:415\n150#1:416\n168#1:417\n185#1:418\n202#1:419\n352#1:420\n*E\n"})
/*     */ public final class IconKt {
/*     */   @NotNull
/*     */   private static final Modifier DefaultIconSizeModifier;
/*     */   
/*     */   @Deprecated(message = "Use the IconKey-based API instead", replaceWith = @ReplaceWith(expression = "key = Icon(PathIconKey(resource, iconClass), contentDescription = contentDescription, colorFilter = colorFilter, modifier = modifier, hints)", imports = {"org.jetbrains.jewel.ui.icon.PathIconKey"}))
/*     */   @ScheduledForRemoval(inVersion = "Before 1.0")
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void Icon(@NotNull String resource, @Nullable String contentDescription, @NotNull Class iconClass, @Nullable ColorFilter colorFilter, @Nullable Modifier modifier, @NotNull PainterHint[] hints, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'resource'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'iconClass'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #5
/*     */     //   14: ldc 'hints'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #6
/*     */     //   21: ldc 1885702111
/*     */     //   23: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   28: astore #6
/*     */     //   30: iload #7
/*     */     //   32: istore #9
/*     */     //   34: iload #8
/*     */     //   36: iconst_1
/*     */     //   37: iand
/*     */     //   38: ifeq -> 51
/*     */     //   41: iload #9
/*     */     //   43: bipush #6
/*     */     //   45: ior
/*     */     //   46: istore #9
/*     */     //   48: goto -> 80
/*     */     //   51: iload #7
/*     */     //   53: bipush #6
/*     */     //   55: iand
/*     */     //   56: ifne -> 80
/*     */     //   59: iload #9
/*     */     //   61: aload #6
/*     */     //   63: aload_0
/*     */     //   64: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   69: ifeq -> 76
/*     */     //   72: iconst_4
/*     */     //   73: goto -> 77
/*     */     //   76: iconst_2
/*     */     //   77: ior
/*     */     //   78: istore #9
/*     */     //   80: iload #8
/*     */     //   82: iconst_2
/*     */     //   83: iand
/*     */     //   84: ifeq -> 97
/*     */     //   87: iload #9
/*     */     //   89: bipush #48
/*     */     //   91: ior
/*     */     //   92: istore #9
/*     */     //   94: goto -> 128
/*     */     //   97: iload #7
/*     */     //   99: bipush #48
/*     */     //   101: iand
/*     */     //   102: ifne -> 128
/*     */     //   105: iload #9
/*     */     //   107: aload #6
/*     */     //   109: aload_1
/*     */     //   110: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   115: ifeq -> 123
/*     */     //   118: bipush #32
/*     */     //   120: goto -> 125
/*     */     //   123: bipush #16
/*     */     //   125: ior
/*     */     //   126: istore #9
/*     */     //   128: iload #8
/*     */     //   130: iconst_4
/*     */     //   131: iand
/*     */     //   132: ifeq -> 146
/*     */     //   135: iload #9
/*     */     //   137: sipush #384
/*     */     //   140: ior
/*     */     //   141: istore #9
/*     */     //   143: goto -> 180
/*     */     //   146: iload #7
/*     */     //   148: sipush #384
/*     */     //   151: iand
/*     */     //   152: ifne -> 180
/*     */     //   155: iload #9
/*     */     //   157: aload #6
/*     */     //   159: aload_2
/*     */     //   160: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   165: ifeq -> 174
/*     */     //   168: sipush #256
/*     */     //   171: goto -> 177
/*     */     //   174: sipush #128
/*     */     //   177: ior
/*     */     //   178: istore #9
/*     */     //   180: iload #8
/*     */     //   182: bipush #8
/*     */     //   184: iand
/*     */     //   185: ifeq -> 199
/*     */     //   188: iload #9
/*     */     //   190: sipush #3072
/*     */     //   193: ior
/*     */     //   194: istore #9
/*     */     //   196: goto -> 233
/*     */     //   199: iload #7
/*     */     //   201: sipush #3072
/*     */     //   204: iand
/*     */     //   205: ifne -> 233
/*     */     //   208: iload #9
/*     */     //   210: aload #6
/*     */     //   212: aload_3
/*     */     //   213: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   218: ifeq -> 227
/*     */     //   221: sipush #2048
/*     */     //   224: goto -> 230
/*     */     //   227: sipush #1024
/*     */     //   230: ior
/*     */     //   231: istore #9
/*     */     //   233: iload #8
/*     */     //   235: bipush #16
/*     */     //   237: iand
/*     */     //   238: ifeq -> 252
/*     */     //   241: iload #9
/*     */     //   243: sipush #24576
/*     */     //   246: ior
/*     */     //   247: istore #9
/*     */     //   249: goto -> 287
/*     */     //   252: iload #7
/*     */     //   254: sipush #24576
/*     */     //   257: iand
/*     */     //   258: ifne -> 287
/*     */     //   261: iload #9
/*     */     //   263: aload #6
/*     */     //   265: aload #4
/*     */     //   267: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   272: ifeq -> 281
/*     */     //   275: sipush #16384
/*     */     //   278: goto -> 284
/*     */     //   281: sipush #8192
/*     */     //   284: ior
/*     */     //   285: istore #9
/*     */     //   287: aload #6
/*     */     //   289: ldc 781989584
/*     */     //   291: aload #5
/*     */     //   293: arraylength
/*     */     //   294: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   297: invokeinterface startMovableGroup : (ILjava/lang/Object;)V
/*     */     //   302: iconst_0
/*     */     //   303: istore #10
/*     */     //   305: aload #5
/*     */     //   307: arraylength
/*     */     //   308: istore #11
/*     */     //   310: iload #10
/*     */     //   312: iload #11
/*     */     //   314: if_icmpge -> 353
/*     */     //   317: aload #5
/*     */     //   319: iload #10
/*     */     //   321: aaload
/*     */     //   322: astore #12
/*     */     //   324: iload #9
/*     */     //   326: aload #6
/*     */     //   328: aload #12
/*     */     //   330: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   335: ifeq -> 343
/*     */     //   338: ldc 131072
/*     */     //   340: goto -> 344
/*     */     //   343: iconst_0
/*     */     //   344: ior
/*     */     //   345: istore #9
/*     */     //   347: iinc #10, 1
/*     */     //   350: goto -> 310
/*     */     //   353: aload #6
/*     */     //   355: invokeinterface endMovableGroup : ()V
/*     */     //   360: iload #9
/*     */     //   362: ldc 458752
/*     */     //   364: iand
/*     */     //   365: ifne -> 375
/*     */     //   368: iload #9
/*     */     //   370: ldc 65536
/*     */     //   372: ior
/*     */     //   373: istore #9
/*     */     //   375: iload #9
/*     */     //   377: ldc 74899
/*     */     //   379: iand
/*     */     //   380: ldc 74898
/*     */     //   382: if_icmpne -> 395
/*     */     //   385: aload #6
/*     */     //   387: invokeinterface getSkipping : ()Z
/*     */     //   392: ifne -> 522
/*     */     //   395: iload #8
/*     */     //   397: bipush #16
/*     */     //   399: iand
/*     */     //   400: ifeq -> 411
/*     */     //   403: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   406: checkcast androidx/compose/ui/Modifier
/*     */     //   409: astore #4
/*     */     //   411: invokestatic isTraceInProgress : ()Z
/*     */     //   414: ifeq -> 427
/*     */     //   417: ldc 1885702111
/*     */     //   419: iload #9
/*     */     //   421: iconst_m1
/*     */     //   422: ldc 'org.jetbrains.jewel.ui.component.Icon (Icon.kt:58)'
/*     */     //   424: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   427: aload_0
/*     */     //   428: aload_2
/*     */     //   429: aload #6
/*     */     //   431: bipush #14
/*     */     //   433: iload #9
/*     */     //   435: iand
/*     */     //   436: bipush #112
/*     */     //   438: iload #9
/*     */     //   440: iconst_3
/*     */     //   441: ishr
/*     */     //   442: iand
/*     */     //   443: ior
/*     */     //   444: invokestatic rememberResourcePainterProvider : (Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   447: astore #10
/*     */     //   449: aload #10
/*     */     //   451: aload #5
/*     */     //   453: aload #5
/*     */     //   455: arraylength
/*     */     //   456: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   459: checkcast [Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   462: aload #6
/*     */     //   464: iconst_0
/*     */     //   465: invokeinterface getPainter : ([Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   470: astore #11
/*     */     //   472: aload #11
/*     */     //   474: invokestatic Icon$lambda$0 : (Landroidx/compose/runtime/State;)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   477: aload_1
/*     */     //   478: aload_3
/*     */     //   479: aload #4
/*     */     //   481: aload #6
/*     */     //   483: bipush #112
/*     */     //   485: iload #9
/*     */     //   487: iand
/*     */     //   488: sipush #896
/*     */     //   491: iload #9
/*     */     //   493: iconst_3
/*     */     //   494: ishr
/*     */     //   495: iand
/*     */     //   496: ior
/*     */     //   497: sipush #7168
/*     */     //   500: iload #9
/*     */     //   502: iconst_3
/*     */     //   503: ishr
/*     */     //   504: iand
/*     */     //   505: ior
/*     */     //   506: iconst_0
/*     */     //   507: invokestatic Icon : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
/*     */     //   510: invokestatic isTraceInProgress : ()Z
/*     */     //   513: ifeq -> 529
/*     */     //   516: invokestatic traceEventEnd : ()V
/*     */     //   519: goto -> 529
/*     */     //   522: aload #6
/*     */     //   524: invokeinterface skipToGroupEnd : ()V
/*     */     //   529: aload #6
/*     */     //   531: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   536: dup
/*     */     //   537: ifnull -> 565
/*     */     //   540: aload_0
/*     */     //   541: aload_1
/*     */     //   542: aload_2
/*     */     //   543: aload_3
/*     */     //   544: aload #4
/*     */     //   546: aload #5
/*     */     //   548: iload #7
/*     */     //   550: iload #8
/*     */     //   552: <illegal opcode> invoke : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Modifier;[Lorg/jetbrains/jewel/ui/painter/PainterHint;II)Lkotlin/jvm/functions/Function2;
/*     */     //   557: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   562: goto -> 566
/*     */     //   565: pop
/*     */     //   566: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #59	-> 19
/*     */     //   #58	-> 297
/*     */     //   #59	-> 375
/*     */     //   #57	-> 403
/*     */     //   #59	-> 424
/*     */     //   #60	-> 427
/*     */     //   #61	-> 449
/*     */     //   #63	-> 472
/*     */     //   #64	-> 522
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   324	23	12	value	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   449	70	10	painterProvider	Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   472	47	11	painter$delegate	Landroidx/compose/runtime/State;
/*     */     //   34	533	9	$dirty	I
/*     */     //   0	567	0	resource	Ljava/lang/String;
/*     */     //   0	567	1	contentDescription	Ljava/lang/String;
/*     */     //   0	567	2	iconClass	Ljava/lang/Class;
/*     */     //   0	567	3	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	567	4	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	567	5	hints	[Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	567	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	567	7	$changed	I
/*     */   }
/*     */   
/*     */   @Deprecated(message = "Use the IconKey-based API instead", replaceWith = @ReplaceWith(expression = "key = Icon(PathIconKey(resource, iconClass), contentDescription = contentDescription, colorFilter = colorFilter, modifier = modifier, hint = hint)", imports = {"org.jetbrains.jewel.ui.icon.PathIconKey"}))
/*     */   @ScheduledForRemoval(inVersion = "Before 1.0")
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void Icon(@NotNull String resource, @Nullable String contentDescription, @NotNull Class iconClass, @Nullable ColorFilter colorFilter, @Nullable Modifier modifier, @NotNull PainterHint hint, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'resource'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'iconClass'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #5
/*     */     //   14: ldc 'hint'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #6
/*     */     //   21: ldc -491360218
/*     */     //   23: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   28: astore #6
/*     */     //   30: iload #7
/*     */     //   32: istore #9
/*     */     //   34: iload #8
/*     */     //   36: iconst_1
/*     */     //   37: iand
/*     */     //   38: ifeq -> 51
/*     */     //   41: iload #9
/*     */     //   43: bipush #6
/*     */     //   45: ior
/*     */     //   46: istore #9
/*     */     //   48: goto -> 80
/*     */     //   51: iload #7
/*     */     //   53: bipush #6
/*     */     //   55: iand
/*     */     //   56: ifne -> 80
/*     */     //   59: iload #9
/*     */     //   61: aload #6
/*     */     //   63: aload_0
/*     */     //   64: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   69: ifeq -> 76
/*     */     //   72: iconst_4
/*     */     //   73: goto -> 77
/*     */     //   76: iconst_2
/*     */     //   77: ior
/*     */     //   78: istore #9
/*     */     //   80: iload #8
/*     */     //   82: iconst_2
/*     */     //   83: iand
/*     */     //   84: ifeq -> 97
/*     */     //   87: iload #9
/*     */     //   89: bipush #48
/*     */     //   91: ior
/*     */     //   92: istore #9
/*     */     //   94: goto -> 128
/*     */     //   97: iload #7
/*     */     //   99: bipush #48
/*     */     //   101: iand
/*     */     //   102: ifne -> 128
/*     */     //   105: iload #9
/*     */     //   107: aload #6
/*     */     //   109: aload_1
/*     */     //   110: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   115: ifeq -> 123
/*     */     //   118: bipush #32
/*     */     //   120: goto -> 125
/*     */     //   123: bipush #16
/*     */     //   125: ior
/*     */     //   126: istore #9
/*     */     //   128: iload #8
/*     */     //   130: iconst_4
/*     */     //   131: iand
/*     */     //   132: ifeq -> 146
/*     */     //   135: iload #9
/*     */     //   137: sipush #384
/*     */     //   140: ior
/*     */     //   141: istore #9
/*     */     //   143: goto -> 180
/*     */     //   146: iload #7
/*     */     //   148: sipush #384
/*     */     //   151: iand
/*     */     //   152: ifne -> 180
/*     */     //   155: iload #9
/*     */     //   157: aload #6
/*     */     //   159: aload_2
/*     */     //   160: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   165: ifeq -> 174
/*     */     //   168: sipush #256
/*     */     //   171: goto -> 177
/*     */     //   174: sipush #128
/*     */     //   177: ior
/*     */     //   178: istore #9
/*     */     //   180: iload #8
/*     */     //   182: bipush #8
/*     */     //   184: iand
/*     */     //   185: ifeq -> 199
/*     */     //   188: iload #9
/*     */     //   190: sipush #3072
/*     */     //   193: ior
/*     */     //   194: istore #9
/*     */     //   196: goto -> 233
/*     */     //   199: iload #7
/*     */     //   201: sipush #3072
/*     */     //   204: iand
/*     */     //   205: ifne -> 233
/*     */     //   208: iload #9
/*     */     //   210: aload #6
/*     */     //   212: aload_3
/*     */     //   213: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   218: ifeq -> 227
/*     */     //   221: sipush #2048
/*     */     //   224: goto -> 230
/*     */     //   227: sipush #1024
/*     */     //   230: ior
/*     */     //   231: istore #9
/*     */     //   233: iload #8
/*     */     //   235: bipush #16
/*     */     //   237: iand
/*     */     //   238: ifeq -> 252
/*     */     //   241: iload #9
/*     */     //   243: sipush #24576
/*     */     //   246: ior
/*     */     //   247: istore #9
/*     */     //   249: goto -> 287
/*     */     //   252: iload #7
/*     */     //   254: sipush #24576
/*     */     //   257: iand
/*     */     //   258: ifne -> 287
/*     */     //   261: iload #9
/*     */     //   263: aload #6
/*     */     //   265: aload #4
/*     */     //   267: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   272: ifeq -> 281
/*     */     //   275: sipush #16384
/*     */     //   278: goto -> 284
/*     */     //   281: sipush #8192
/*     */     //   284: ior
/*     */     //   285: istore #9
/*     */     //   287: iload #8
/*     */     //   289: bipush #32
/*     */     //   291: iand
/*     */     //   292: ifeq -> 305
/*     */     //   295: iload #9
/*     */     //   297: ldc 196608
/*     */     //   299: ior
/*     */     //   300: istore #9
/*     */     //   302: goto -> 337
/*     */     //   305: iload #7
/*     */     //   307: ldc 196608
/*     */     //   309: iand
/*     */     //   310: ifne -> 337
/*     */     //   313: iload #9
/*     */     //   315: aload #6
/*     */     //   317: aload #5
/*     */     //   319: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   324: ifeq -> 332
/*     */     //   327: ldc 131072
/*     */     //   329: goto -> 334
/*     */     //   332: ldc 65536
/*     */     //   334: ior
/*     */     //   335: istore #9
/*     */     //   337: iload #9
/*     */     //   339: ldc 74899
/*     */     //   341: iand
/*     */     //   342: ldc 74898
/*     */     //   344: if_icmpne -> 357
/*     */     //   347: aload #6
/*     */     //   349: invokeinterface getSkipping : ()Z
/*     */     //   354: ifne -> 487
/*     */     //   357: iload #8
/*     */     //   359: bipush #16
/*     */     //   361: iand
/*     */     //   362: ifeq -> 373
/*     */     //   365: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   368: checkcast androidx/compose/ui/Modifier
/*     */     //   371: astore #4
/*     */     //   373: invokestatic isTraceInProgress : ()Z
/*     */     //   376: ifeq -> 389
/*     */     //   379: ldc -491360218
/*     */     //   381: iload #9
/*     */     //   383: iconst_m1
/*     */     //   384: ldc 'org.jetbrains.jewel.ui.component.Icon (Icon.kt:82)'
/*     */     //   386: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   389: aload_0
/*     */     //   390: aload_2
/*     */     //   391: aload #6
/*     */     //   393: bipush #14
/*     */     //   395: iload #9
/*     */     //   397: iand
/*     */     //   398: bipush #112
/*     */     //   400: iload #9
/*     */     //   402: iconst_3
/*     */     //   403: ishr
/*     */     //   404: iand
/*     */     //   405: ior
/*     */     //   406: invokestatic rememberResourcePainterProvider : (Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   409: astore #10
/*     */     //   411: aload #10
/*     */     //   413: iconst_1
/*     */     //   414: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   417: astore #12
/*     */     //   419: aload #12
/*     */     //   421: iconst_0
/*     */     //   422: aload #5
/*     */     //   424: aastore
/*     */     //   425: aload #12
/*     */     //   427: aload #6
/*     */     //   429: iconst_0
/*     */     //   430: invokeinterface getPainter : ([Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   435: astore #11
/*     */     //   437: aload #11
/*     */     //   439: invokestatic Icon$lambda$2 : (Landroidx/compose/runtime/State;)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   442: aload_1
/*     */     //   443: aload_3
/*     */     //   444: aload #4
/*     */     //   446: aload #6
/*     */     //   448: bipush #112
/*     */     //   450: iload #9
/*     */     //   452: iand
/*     */     //   453: sipush #896
/*     */     //   456: iload #9
/*     */     //   458: iconst_3
/*     */     //   459: ishr
/*     */     //   460: iand
/*     */     //   461: ior
/*     */     //   462: sipush #7168
/*     */     //   465: iload #9
/*     */     //   467: iconst_3
/*     */     //   468: ishr
/*     */     //   469: iand
/*     */     //   470: ior
/*     */     //   471: iconst_0
/*     */     //   472: invokestatic Icon : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
/*     */     //   475: invokestatic isTraceInProgress : ()Z
/*     */     //   478: ifeq -> 494
/*     */     //   481: invokestatic traceEventEnd : ()V
/*     */     //   484: goto -> 494
/*     */     //   487: aload #6
/*     */     //   489: invokeinterface skipToGroupEnd : ()V
/*     */     //   494: aload #6
/*     */     //   496: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   501: dup
/*     */     //   502: ifnull -> 530
/*     */     //   505: aload_0
/*     */     //   506: aload_1
/*     */     //   507: aload_2
/*     */     //   508: aload_3
/*     */     //   509: aload #4
/*     */     //   511: aload #5
/*     */     //   513: iload #7
/*     */     //   515: iload #8
/*     */     //   517: <illegal opcode> invoke : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/painter/PainterHint;II)Lkotlin/jvm/functions/Function2;
/*     */     //   522: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   527: goto -> 531
/*     */     //   530: pop
/*     */     //   531: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #83	-> 19
/*     */     //   #81	-> 365
/*     */     //   #83	-> 386
/*     */     //   #84	-> 389
/*     */     //   #85	-> 411
/*     */     //   #87	-> 437
/*     */     //   #88	-> 487
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   411	73	10	painterProvider	Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   437	47	11	painter$delegate	Landroidx/compose/runtime/State;
/*     */     //   34	498	9	$dirty	I
/*     */     //   0	532	0	resource	Ljava/lang/String;
/*     */     //   0	532	1	contentDescription	Ljava/lang/String;
/*     */     //   0	532	2	iconClass	Ljava/lang/Class;
/*     */     //   0	532	3	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	532	4	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	532	5	hint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	532	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	532	7	$changed	I
/*     */   }
/*     */   
/*  61 */   private static final Painter Icon$lambda$0(State $painter$delegate) { State state = $painter$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 412 */       (Painter)state.getValue(); }
/*     */   @Deprecated(message = "Use the IconKey-based API instead", replaceWith = @ReplaceWith(expression = "Icon(key = PathIconKey(resource, iconClass), contentDescription = contentDescription, tint = tint, modifier = modifier, hints = hints)", imports = {"org.jetbrains.jewel.ui.icon.PathIconKey"})) @ScheduledForRemoval(inVersion = "Before 1.0") @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void Icon-FHprtrg(@NotNull String resource, @Nullable String contentDescription, @NotNull Class iconClass, @Nullable Modifier modifier, long tint, @NotNull PainterHint[] hints, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'resource'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'iconClass'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #6
/*     */     //   14: ldc 'hints'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #7
/*     */     //   21: ldc 947931769
/*     */     //   23: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   28: astore #7
/*     */     //   30: iload #8
/*     */     //   32: istore #10
/*     */     //   34: iload #9
/*     */     //   36: iconst_1
/*     */     //   37: iand
/*     */     //   38: ifeq -> 51
/*     */     //   41: iload #10
/*     */     //   43: bipush #6
/*     */     //   45: ior
/*     */     //   46: istore #10
/*     */     //   48: goto -> 80
/*     */     //   51: iload #8
/*     */     //   53: bipush #6
/*     */     //   55: iand
/*     */     //   56: ifne -> 80
/*     */     //   59: iload #10
/*     */     //   61: aload #7
/*     */     //   63: aload_0
/*     */     //   64: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   69: ifeq -> 76
/*     */     //   72: iconst_4
/*     */     //   73: goto -> 77
/*     */     //   76: iconst_2
/*     */     //   77: ior
/*     */     //   78: istore #10
/*     */     //   80: iload #9
/*     */     //   82: iconst_2
/*     */     //   83: iand
/*     */     //   84: ifeq -> 97
/*     */     //   87: iload #10
/*     */     //   89: bipush #48
/*     */     //   91: ior
/*     */     //   92: istore #10
/*     */     //   94: goto -> 128
/*     */     //   97: iload #8
/*     */     //   99: bipush #48
/*     */     //   101: iand
/*     */     //   102: ifne -> 128
/*     */     //   105: iload #10
/*     */     //   107: aload #7
/*     */     //   109: aload_1
/*     */     //   110: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   115: ifeq -> 123
/*     */     //   118: bipush #32
/*     */     //   120: goto -> 125
/*     */     //   123: bipush #16
/*     */     //   125: ior
/*     */     //   126: istore #10
/*     */     //   128: iload #9
/*     */     //   130: iconst_4
/*     */     //   131: iand
/*     */     //   132: ifeq -> 146
/*     */     //   135: iload #10
/*     */     //   137: sipush #384
/*     */     //   140: ior
/*     */     //   141: istore #10
/*     */     //   143: goto -> 180
/*     */     //   146: iload #8
/*     */     //   148: sipush #384
/*     */     //   151: iand
/*     */     //   152: ifne -> 180
/*     */     //   155: iload #10
/*     */     //   157: aload #7
/*     */     //   159: aload_2
/*     */     //   160: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   165: ifeq -> 174
/*     */     //   168: sipush #256
/*     */     //   171: goto -> 177
/*     */     //   174: sipush #128
/*     */     //   177: ior
/*     */     //   178: istore #10
/*     */     //   180: iload #9
/*     */     //   182: bipush #8
/*     */     //   184: iand
/*     */     //   185: ifeq -> 199
/*     */     //   188: iload #10
/*     */     //   190: sipush #3072
/*     */     //   193: ior
/*     */     //   194: istore #10
/*     */     //   196: goto -> 233
/*     */     //   199: iload #8
/*     */     //   201: sipush #3072
/*     */     //   204: iand
/*     */     //   205: ifne -> 233
/*     */     //   208: iload #10
/*     */     //   210: aload #7
/*     */     //   212: aload_3
/*     */     //   213: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   218: ifeq -> 227
/*     */     //   221: sipush #2048
/*     */     //   224: goto -> 230
/*     */     //   227: sipush #1024
/*     */     //   230: ior
/*     */     //   231: istore #10
/*     */     //   233: iload #9
/*     */     //   235: bipush #16
/*     */     //   237: iand
/*     */     //   238: ifeq -> 252
/*     */     //   241: iload #10
/*     */     //   243: sipush #24576
/*     */     //   246: ior
/*     */     //   247: istore #10
/*     */     //   249: goto -> 287
/*     */     //   252: iload #8
/*     */     //   254: sipush #24576
/*     */     //   257: iand
/*     */     //   258: ifne -> 287
/*     */     //   261: iload #10
/*     */     //   263: aload #7
/*     */     //   265: lload #4
/*     */     //   267: invokeinterface changed : (J)Z
/*     */     //   272: ifeq -> 281
/*     */     //   275: sipush #16384
/*     */     //   278: goto -> 284
/*     */     //   281: sipush #8192
/*     */     //   284: ior
/*     */     //   285: istore #10
/*     */     //   287: aload #7
/*     */     //   289: ldc 782041360
/*     */     //   291: aload #6
/*     */     //   293: arraylength
/*     */     //   294: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   297: invokeinterface startMovableGroup : (ILjava/lang/Object;)V
/*     */     //   302: iconst_0
/*     */     //   303: istore #11
/*     */     //   305: aload #6
/*     */     //   307: arraylength
/*     */     //   308: istore #12
/*     */     //   310: iload #11
/*     */     //   312: iload #12
/*     */     //   314: if_icmpge -> 353
/*     */     //   317: aload #6
/*     */     //   319: iload #11
/*     */     //   321: aaload
/*     */     //   322: astore #13
/*     */     //   324: iload #10
/*     */     //   326: aload #7
/*     */     //   328: aload #13
/*     */     //   330: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   335: ifeq -> 343
/*     */     //   338: ldc 131072
/*     */     //   340: goto -> 344
/*     */     //   343: iconst_0
/*     */     //   344: ior
/*     */     //   345: istore #10
/*     */     //   347: iinc #11, 1
/*     */     //   350: goto -> 310
/*     */     //   353: aload #7
/*     */     //   355: invokeinterface endMovableGroup : ()V
/*     */     //   360: iload #10
/*     */     //   362: ldc 458752
/*     */     //   364: iand
/*     */     //   365: ifne -> 375
/*     */     //   368: iload #10
/*     */     //   370: ldc 65536
/*     */     //   372: ior
/*     */     //   373: istore #10
/*     */     //   375: iload #10
/*     */     //   377: ldc 74899
/*     */     //   379: iand
/*     */     //   380: ldc 74898
/*     */     //   382: if_icmpne -> 395
/*     */     //   385: aload #7
/*     */     //   387: invokeinterface getSkipping : ()Z
/*     */     //   392: ifne -> 537
/*     */     //   395: iload #9
/*     */     //   397: bipush #8
/*     */     //   399: iand
/*     */     //   400: ifeq -> 410
/*     */     //   403: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   406: checkcast androidx/compose/ui/Modifier
/*     */     //   409: astore_3
/*     */     //   410: iload #9
/*     */     //   412: bipush #16
/*     */     //   414: iand
/*     */     //   415: ifeq -> 426
/*     */     //   418: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   421: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   424: lstore #4
/*     */     //   426: invokestatic isTraceInProgress : ()Z
/*     */     //   429: ifeq -> 442
/*     */     //   432: ldc 947931769
/*     */     //   434: iload #10
/*     */     //   436: iconst_m1
/*     */     //   437: ldc 'org.jetbrains.jewel.ui.component.Icon (Icon.kt:106)'
/*     */     //   439: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   442: aload_0
/*     */     //   443: aload_2
/*     */     //   444: aload #7
/*     */     //   446: bipush #14
/*     */     //   448: iload #10
/*     */     //   450: iand
/*     */     //   451: bipush #112
/*     */     //   453: iload #10
/*     */     //   455: iconst_3
/*     */     //   456: ishr
/*     */     //   457: iand
/*     */     //   458: ior
/*     */     //   459: invokestatic rememberResourcePainterProvider : (Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   462: astore #11
/*     */     //   464: aload #11
/*     */     //   466: aload #6
/*     */     //   468: aload #6
/*     */     //   470: arraylength
/*     */     //   471: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   474: checkcast [Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   477: aload #7
/*     */     //   479: iconst_0
/*     */     //   480: invokeinterface getPainter : ([Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   485: astore #12
/*     */     //   487: aload #12
/*     */     //   489: invokestatic Icon_FHprtrg$lambda$4 : (Landroidx/compose/runtime/State;)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   492: aload_1
/*     */     //   493: aload_3
/*     */     //   494: lload #4
/*     */     //   496: aload #7
/*     */     //   498: bipush #112
/*     */     //   500: iload #10
/*     */     //   502: iand
/*     */     //   503: sipush #896
/*     */     //   506: iload #10
/*     */     //   508: iconst_3
/*     */     //   509: ishr
/*     */     //   510: iand
/*     */     //   511: ior
/*     */     //   512: sipush #7168
/*     */     //   515: iload #10
/*     */     //   517: iconst_3
/*     */     //   518: ishr
/*     */     //   519: iand
/*     */     //   520: ior
/*     */     //   521: iconst_0
/*     */     //   522: invokestatic Icon-ww6aTOc : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V
/*     */     //   525: invokestatic isTraceInProgress : ()Z
/*     */     //   528: ifeq -> 544
/*     */     //   531: invokestatic traceEventEnd : ()V
/*     */     //   534: goto -> 544
/*     */     //   537: aload #7
/*     */     //   539: invokeinterface skipToGroupEnd : ()V
/*     */     //   544: aload #7
/*     */     //   546: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   551: dup
/*     */     //   552: ifnull -> 580
/*     */     //   555: aload_0
/*     */     //   556: aload_1
/*     */     //   557: aload_2
/*     */     //   558: aload_3
/*     */     //   559: lload #4
/*     */     //   561: aload #6
/*     */     //   563: iload #8
/*     */     //   565: iload #9
/*     */     //   567: <illegal opcode> invoke : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/ui/Modifier;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;II)Lkotlin/jvm/functions/Function2;
/*     */     //   572: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   577: goto -> 581
/*     */     //   580: pop
/*     */     //   581: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #107	-> 19
/*     */     //   #106	-> 297
/*     */     //   #107	-> 375
/*     */     //   #104	-> 403
/*     */     //   #105	-> 418
/*     */     //   #107	-> 439
/*     */     //   #108	-> 442
/*     */     //   #109	-> 464
/*     */     //   #111	-> 487
/*     */     //   #112	-> 537
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   324	23	13	value	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   464	70	11	painterProvider	Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   487	47	12	painter$delegate	Landroidx/compose/runtime/State;
/*     */     //   34	548	10	$dirty	I
/*     */     //   0	582	0	resource	Ljava/lang/String;
/*     */     //   0	582	1	contentDescription	Ljava/lang/String;
/*     */     //   0	582	2	iconClass	Ljava/lang/Class;
/*     */     //   0	582	3	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	582	4	tint	J
/*     */     //   0	582	6	hints	[Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	582	7	$composer	Landroidx/compose/runtime/Composer;
/* 413 */     //   0	582	8	$changed	I } private static final Painter Icon$lambda$2(State $painter$delegate) { State state = $painter$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (Painter)state.getValue(); } private static final Painter Icon_FHprtrg$lambda$4(State $painter$delegate) { State state = $painter$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 414 */     return (Painter)state.getValue(); } @Deprecated(message = "Use the IconKey-based API instead", replaceWith = @ReplaceWith(expression = "Icon(key = PathIconKey(resource, iconClass), contentDescription = contentDescription, tint = tint, modifier = modifier, hint = hint)", imports = {"org.jetbrains.jewel.ui.icon.PathIconKey"})) @ScheduledForRemoval(inVersion = "Before 1.0") @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void Icon-FHprtrg(@NotNull String resource, @Nullable String contentDescription, @NotNull Class iconClass, @Nullable Modifier modifier, long tint, @NotNull PainterHint hint, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'resource'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'iconClass'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #6
/*     */     //   14: ldc 'hint'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #7
/*     */     //   21: ldc -88647872
/*     */     //   23: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   28: astore #7
/*     */     //   30: iload #8
/*     */     //   32: istore #10
/*     */     //   34: iload #9
/*     */     //   36: iconst_1
/*     */     //   37: iand
/*     */     //   38: ifeq -> 51
/*     */     //   41: iload #10
/*     */     //   43: bipush #6
/*     */     //   45: ior
/*     */     //   46: istore #10
/*     */     //   48: goto -> 80
/*     */     //   51: iload #8
/*     */     //   53: bipush #6
/*     */     //   55: iand
/*     */     //   56: ifne -> 80
/*     */     //   59: iload #10
/*     */     //   61: aload #7
/*     */     //   63: aload_0
/*     */     //   64: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   69: ifeq -> 76
/*     */     //   72: iconst_4
/*     */     //   73: goto -> 77
/*     */     //   76: iconst_2
/*     */     //   77: ior
/*     */     //   78: istore #10
/*     */     //   80: iload #9
/*     */     //   82: iconst_2
/*     */     //   83: iand
/*     */     //   84: ifeq -> 97
/*     */     //   87: iload #10
/*     */     //   89: bipush #48
/*     */     //   91: ior
/*     */     //   92: istore #10
/*     */     //   94: goto -> 128
/*     */     //   97: iload #8
/*     */     //   99: bipush #48
/*     */     //   101: iand
/*     */     //   102: ifne -> 128
/*     */     //   105: iload #10
/*     */     //   107: aload #7
/*     */     //   109: aload_1
/*     */     //   110: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   115: ifeq -> 123
/*     */     //   118: bipush #32
/*     */     //   120: goto -> 125
/*     */     //   123: bipush #16
/*     */     //   125: ior
/*     */     //   126: istore #10
/*     */     //   128: iload #9
/*     */     //   130: iconst_4
/*     */     //   131: iand
/*     */     //   132: ifeq -> 146
/*     */     //   135: iload #10
/*     */     //   137: sipush #384
/*     */     //   140: ior
/*     */     //   141: istore #10
/*     */     //   143: goto -> 180
/*     */     //   146: iload #8
/*     */     //   148: sipush #384
/*     */     //   151: iand
/*     */     //   152: ifne -> 180
/*     */     //   155: iload #10
/*     */     //   157: aload #7
/*     */     //   159: aload_2
/*     */     //   160: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   165: ifeq -> 174
/*     */     //   168: sipush #256
/*     */     //   171: goto -> 177
/*     */     //   174: sipush #128
/*     */     //   177: ior
/*     */     //   178: istore #10
/*     */     //   180: iload #9
/*     */     //   182: bipush #8
/*     */     //   184: iand
/*     */     //   185: ifeq -> 199
/*     */     //   188: iload #10
/*     */     //   190: sipush #3072
/*     */     //   193: ior
/*     */     //   194: istore #10
/*     */     //   196: goto -> 233
/*     */     //   199: iload #8
/*     */     //   201: sipush #3072
/*     */     //   204: iand
/*     */     //   205: ifne -> 233
/*     */     //   208: iload #10
/*     */     //   210: aload #7
/*     */     //   212: aload_3
/*     */     //   213: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   218: ifeq -> 227
/*     */     //   221: sipush #2048
/*     */     //   224: goto -> 230
/*     */     //   227: sipush #1024
/*     */     //   230: ior
/*     */     //   231: istore #10
/*     */     //   233: iload #9
/*     */     //   235: bipush #16
/*     */     //   237: iand
/*     */     //   238: ifeq -> 252
/*     */     //   241: iload #10
/*     */     //   243: sipush #24576
/*     */     //   246: ior
/*     */     //   247: istore #10
/*     */     //   249: goto -> 287
/*     */     //   252: iload #8
/*     */     //   254: sipush #24576
/*     */     //   257: iand
/*     */     //   258: ifne -> 287
/*     */     //   261: iload #10
/*     */     //   263: aload #7
/*     */     //   265: lload #4
/*     */     //   267: invokeinterface changed : (J)Z
/*     */     //   272: ifeq -> 281
/*     */     //   275: sipush #16384
/*     */     //   278: goto -> 284
/*     */     //   281: sipush #8192
/*     */     //   284: ior
/*     */     //   285: istore #10
/*     */     //   287: iload #9
/*     */     //   289: bipush #32
/*     */     //   291: iand
/*     */     //   292: ifeq -> 305
/*     */     //   295: iload #10
/*     */     //   297: ldc 196608
/*     */     //   299: ior
/*     */     //   300: istore #10
/*     */     //   302: goto -> 337
/*     */     //   305: iload #8
/*     */     //   307: ldc 196608
/*     */     //   309: iand
/*     */     //   310: ifne -> 337
/*     */     //   313: iload #10
/*     */     //   315: aload #7
/*     */     //   317: aload #6
/*     */     //   319: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   324: ifeq -> 332
/*     */     //   327: ldc 131072
/*     */     //   329: goto -> 334
/*     */     //   332: ldc 65536
/*     */     //   334: ior
/*     */     //   335: istore #10
/*     */     //   337: iload #10
/*     */     //   339: ldc 74899
/*     */     //   341: iand
/*     */     //   342: ldc 74898
/*     */     //   344: if_icmpne -> 357
/*     */     //   347: aload #7
/*     */     //   349: invokeinterface getSkipping : ()Z
/*     */     //   354: ifne -> 502
/*     */     //   357: iload #9
/*     */     //   359: bipush #8
/*     */     //   361: iand
/*     */     //   362: ifeq -> 372
/*     */     //   365: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   368: checkcast androidx/compose/ui/Modifier
/*     */     //   371: astore_3
/*     */     //   372: iload #9
/*     */     //   374: bipush #16
/*     */     //   376: iand
/*     */     //   377: ifeq -> 388
/*     */     //   380: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   383: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   386: lstore #4
/*     */     //   388: invokestatic isTraceInProgress : ()Z
/*     */     //   391: ifeq -> 404
/*     */     //   394: ldc -88647872
/*     */     //   396: iload #10
/*     */     //   398: iconst_m1
/*     */     //   399: ldc 'org.jetbrains.jewel.ui.component.Icon (Icon.kt:130)'
/*     */     //   401: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   404: aload_0
/*     */     //   405: aload_2
/*     */     //   406: aload #7
/*     */     //   408: bipush #14
/*     */     //   410: iload #10
/*     */     //   412: iand
/*     */     //   413: bipush #112
/*     */     //   415: iload #10
/*     */     //   417: iconst_3
/*     */     //   418: ishr
/*     */     //   419: iand
/*     */     //   420: ior
/*     */     //   421: invokestatic rememberResourcePainterProvider : (Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   424: astore #11
/*     */     //   426: aload #11
/*     */     //   428: iconst_1
/*     */     //   429: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   432: astore #13
/*     */     //   434: aload #13
/*     */     //   436: iconst_0
/*     */     //   437: aload #6
/*     */     //   439: aastore
/*     */     //   440: aload #13
/*     */     //   442: aload #7
/*     */     //   444: iconst_0
/*     */     //   445: invokeinterface getPainter : ([Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   450: astore #12
/*     */     //   452: aload #12
/*     */     //   454: invokestatic Icon_FHprtrg$lambda$6 : (Landroidx/compose/runtime/State;)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   457: aload_1
/*     */     //   458: aload_3
/*     */     //   459: lload #4
/*     */     //   461: aload #7
/*     */     //   463: bipush #112
/*     */     //   465: iload #10
/*     */     //   467: iand
/*     */     //   468: sipush #896
/*     */     //   471: iload #10
/*     */     //   473: iconst_3
/*     */     //   474: ishr
/*     */     //   475: iand
/*     */     //   476: ior
/*     */     //   477: sipush #7168
/*     */     //   480: iload #10
/*     */     //   482: iconst_3
/*     */     //   483: ishr
/*     */     //   484: iand
/*     */     //   485: ior
/*     */     //   486: iconst_0
/*     */     //   487: invokestatic Icon-ww6aTOc : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V
/*     */     //   490: invokestatic isTraceInProgress : ()Z
/*     */     //   493: ifeq -> 509
/*     */     //   496: invokestatic traceEventEnd : ()V
/*     */     //   499: goto -> 509
/*     */     //   502: aload #7
/*     */     //   504: invokeinterface skipToGroupEnd : ()V
/*     */     //   509: aload #7
/*     */     //   511: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   516: dup
/*     */     //   517: ifnull -> 545
/*     */     //   520: aload_0
/*     */     //   521: aload_1
/*     */     //   522: aload_2
/*     */     //   523: aload_3
/*     */     //   524: lload #4
/*     */     //   526: aload #6
/*     */     //   528: iload #8
/*     */     //   530: iload #9
/*     */     //   532: <illegal opcode> invoke : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/ui/Modifier;JLorg/jetbrains/jewel/ui/painter/PainterHint;II)Lkotlin/jvm/functions/Function2;
/*     */     //   537: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   542: goto -> 546
/*     */     //   545: pop
/*     */     //   546: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #131	-> 19
/*     */     //   #128	-> 365
/*     */     //   #129	-> 380
/*     */     //   #131	-> 401
/*     */     //   #132	-> 404
/*     */     //   #133	-> 426
/*     */     //   #135	-> 452
/*     */     //   #136	-> 502
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   426	73	11	painterProvider	Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   452	47	12	painter$delegate	Landroidx/compose/runtime/State;
/*     */     //   34	513	10	$dirty	I
/*     */     //   0	547	0	resource	Ljava/lang/String;
/*     */     //   0	547	1	contentDescription	Ljava/lang/String;
/*     */     //   0	547	2	iconClass	Ljava/lang/Class;
/*     */     //   0	547	3	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	547	4	tint	J
/*     */     //   0	547	6	hint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	547	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	547	8	$changed	I }
/* 415 */   private static final Painter Icon_FHprtrg$lambda$6(State $painter$delegate) { State state = $painter$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (Painter)state.getValue(); } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void Icon-FHprtrg(@NotNull IconKey key, @Nullable String contentDescription, @Nullable Modifier modifier, @Nullable Class iconClass, long tint, @NotNull PainterHint[] hints, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'key'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #6
/*     */     //   9: ldc 'hints'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload #7
/*     */     //   16: ldc_w 526972558
/*     */     //   19: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   24: astore #7
/*     */     //   26: iload #8
/*     */     //   28: istore #10
/*     */     //   30: iload #9
/*     */     //   32: iconst_1
/*     */     //   33: iand
/*     */     //   34: ifeq -> 47
/*     */     //   37: iload #10
/*     */     //   39: bipush #6
/*     */     //   41: ior
/*     */     //   42: istore #10
/*     */     //   44: goto -> 95
/*     */     //   47: iload #8
/*     */     //   49: bipush #6
/*     */     //   51: iand
/*     */     //   52: ifne -> 95
/*     */     //   55: iload #10
/*     */     //   57: iload #8
/*     */     //   59: bipush #8
/*     */     //   61: iand
/*     */     //   62: ifne -> 76
/*     */     //   65: aload #7
/*     */     //   67: aload_0
/*     */     //   68: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   73: goto -> 84
/*     */     //   76: aload #7
/*     */     //   78: aload_0
/*     */     //   79: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   84: ifeq -> 91
/*     */     //   87: iconst_4
/*     */     //   88: goto -> 92
/*     */     //   91: iconst_2
/*     */     //   92: ior
/*     */     //   93: istore #10
/*     */     //   95: iload #9
/*     */     //   97: iconst_2
/*     */     //   98: iand
/*     */     //   99: ifeq -> 112
/*     */     //   102: iload #10
/*     */     //   104: bipush #48
/*     */     //   106: ior
/*     */     //   107: istore #10
/*     */     //   109: goto -> 143
/*     */     //   112: iload #8
/*     */     //   114: bipush #48
/*     */     //   116: iand
/*     */     //   117: ifne -> 143
/*     */     //   120: iload #10
/*     */     //   122: aload #7
/*     */     //   124: aload_1
/*     */     //   125: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   130: ifeq -> 138
/*     */     //   133: bipush #32
/*     */     //   135: goto -> 140
/*     */     //   138: bipush #16
/*     */     //   140: ior
/*     */     //   141: istore #10
/*     */     //   143: iload #9
/*     */     //   145: iconst_4
/*     */     //   146: iand
/*     */     //   147: ifeq -> 161
/*     */     //   150: iload #10
/*     */     //   152: sipush #384
/*     */     //   155: ior
/*     */     //   156: istore #10
/*     */     //   158: goto -> 195
/*     */     //   161: iload #8
/*     */     //   163: sipush #384
/*     */     //   166: iand
/*     */     //   167: ifne -> 195
/*     */     //   170: iload #10
/*     */     //   172: aload #7
/*     */     //   174: aload_2
/*     */     //   175: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   180: ifeq -> 189
/*     */     //   183: sipush #256
/*     */     //   186: goto -> 192
/*     */     //   189: sipush #128
/*     */     //   192: ior
/*     */     //   193: istore #10
/*     */     //   195: iload #8
/*     */     //   197: sipush #3072
/*     */     //   200: iand
/*     */     //   201: ifne -> 237
/*     */     //   204: iload #10
/*     */     //   206: iload #9
/*     */     //   208: bipush #8
/*     */     //   210: iand
/*     */     //   211: ifne -> 231
/*     */     //   214: aload #7
/*     */     //   216: aload_3
/*     */     //   217: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   222: ifeq -> 231
/*     */     //   225: sipush #2048
/*     */     //   228: goto -> 234
/*     */     //   231: sipush #1024
/*     */     //   234: ior
/*     */     //   235: istore #10
/*     */     //   237: iload #9
/*     */     //   239: bipush #16
/*     */     //   241: iand
/*     */     //   242: ifeq -> 256
/*     */     //   245: iload #10
/*     */     //   247: sipush #24576
/*     */     //   250: ior
/*     */     //   251: istore #10
/*     */     //   253: goto -> 291
/*     */     //   256: iload #8
/*     */     //   258: sipush #24576
/*     */     //   261: iand
/*     */     //   262: ifne -> 291
/*     */     //   265: iload #10
/*     */     //   267: aload #7
/*     */     //   269: lload #4
/*     */     //   271: invokeinterface changed : (J)Z
/*     */     //   276: ifeq -> 285
/*     */     //   279: sipush #16384
/*     */     //   282: goto -> 288
/*     */     //   285: sipush #8192
/*     */     //   288: ior
/*     */     //   289: istore #10
/*     */     //   291: aload #7
/*     */     //   293: ldc_w 782081456
/*     */     //   296: aload #6
/*     */     //   298: arraylength
/*     */     //   299: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   302: invokeinterface startMovableGroup : (ILjava/lang/Object;)V
/*     */     //   307: iconst_0
/*     */     //   308: istore #11
/*     */     //   310: aload #6
/*     */     //   312: arraylength
/*     */     //   313: istore #12
/*     */     //   315: iload #11
/*     */     //   317: iload #12
/*     */     //   319: if_icmpge -> 358
/*     */     //   322: aload #6
/*     */     //   324: iload #11
/*     */     //   326: aaload
/*     */     //   327: astore #13
/*     */     //   329: iload #10
/*     */     //   331: aload #7
/*     */     //   333: aload #13
/*     */     //   335: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   340: ifeq -> 348
/*     */     //   343: ldc 131072
/*     */     //   345: goto -> 349
/*     */     //   348: iconst_0
/*     */     //   349: ior
/*     */     //   350: istore #10
/*     */     //   352: iinc #11, 1
/*     */     //   355: goto -> 315
/*     */     //   358: aload #7
/*     */     //   360: invokeinterface endMovableGroup : ()V
/*     */     //   365: iload #10
/*     */     //   367: ldc 458752
/*     */     //   369: iand
/*     */     //   370: ifne -> 380
/*     */     //   373: iload #10
/*     */     //   375: ldc 65536
/*     */     //   377: ior
/*     */     //   378: istore #10
/*     */     //   380: iload #10
/*     */     //   382: ldc 74899
/*     */     //   384: iand
/*     */     //   385: ldc 74898
/*     */     //   387: if_icmpne -> 400
/*     */     //   390: aload #7
/*     */     //   392: invokeinterface getSkipping : ()Z
/*     */     //   397: ifne -> 772
/*     */     //   400: aload #7
/*     */     //   402: invokeinterface startDefaults : ()V
/*     */     //   407: iload #8
/*     */     //   409: iconst_1
/*     */     //   410: iand
/*     */     //   411: ifeq -> 424
/*     */     //   414: aload #7
/*     */     //   416: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   421: ifeq -> 480
/*     */     //   424: iload #9
/*     */     //   426: iconst_4
/*     */     //   427: iand
/*     */     //   428: ifeq -> 438
/*     */     //   431: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   434: checkcast androidx/compose/ui/Modifier
/*     */     //   437: astore_2
/*     */     //   438: iload #9
/*     */     //   440: bipush #8
/*     */     //   442: iand
/*     */     //   443: ifeq -> 461
/*     */     //   446: aload_0
/*     */     //   447: invokeinterface getIconClass : ()Ljava/lang/Class;
/*     */     //   452: astore_3
/*     */     //   453: iload #10
/*     */     //   455: sipush #-7169
/*     */     //   458: iand
/*     */     //   459: istore #10
/*     */     //   461: iload #9
/*     */     //   463: bipush #16
/*     */     //   465: iand
/*     */     //   466: ifeq -> 503
/*     */     //   469: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   472: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   475: lstore #4
/*     */     //   477: goto -> 503
/*     */     //   480: aload #7
/*     */     //   482: invokeinterface skipToGroupEnd : ()V
/*     */     //   487: iload #9
/*     */     //   489: bipush #8
/*     */     //   491: iand
/*     */     //   492: ifeq -> 503
/*     */     //   495: iload #10
/*     */     //   497: sipush #-7169
/*     */     //   500: iand
/*     */     //   501: istore #10
/*     */     //   503: aload #7
/*     */     //   505: invokeinterface endDefaults : ()V
/*     */     //   510: invokestatic isTraceInProgress : ()Z
/*     */     //   513: ifeq -> 528
/*     */     //   516: ldc_w 526972558
/*     */     //   519: iload #10
/*     */     //   521: iconst_m1
/*     */     //   522: ldc_w 'org.jetbrains.jewel.ui.component.Icon (Icon.kt:145)'
/*     */     //   525: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   528: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   531: aload #7
/*     */     //   533: bipush #6
/*     */     //   535: invokestatic getNewUiChecker : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/icon/NewUiChecker;
/*     */     //   538: invokeinterface isNewUi : ()Z
/*     */     //   543: istore #11
/*     */     //   545: aload #7
/*     */     //   547: ldc_w 782084611
/*     */     //   550: invokeinterface startReplaceGroup : (I)V
/*     */     //   555: aload #7
/*     */     //   557: astore #14
/*     */     //   559: iload #10
/*     */     //   561: bipush #14
/*     */     //   563: iand
/*     */     //   564: iconst_4
/*     */     //   565: if_icmpeq -> 587
/*     */     //   568: iload #10
/*     */     //   570: bipush #8
/*     */     //   572: iand
/*     */     //   573: ifeq -> 591
/*     */     //   576: aload #7
/*     */     //   578: aload_0
/*     */     //   579: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   584: ifeq -> 591
/*     */     //   587: iconst_1
/*     */     //   588: goto -> 592
/*     */     //   591: iconst_0
/*     */     //   592: aload #7
/*     */     //   594: iload #11
/*     */     //   596: invokeinterface changed : (Z)Z
/*     */     //   601: ior
/*     */     //   602: istore #15
/*     */     //   604: iconst_0
/*     */     //   605: istore #16
/*     */     //   607: aload #14
/*     */     //   609: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   614: astore #17
/*     */     //   616: iconst_0
/*     */     //   617: istore #18
/*     */     //   619: iload #15
/*     */     //   621: ifne -> 635
/*     */     //   624: aload #17
/*     */     //   626: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   629: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   632: if_acmpne -> 662
/*     */     //   635: iconst_0
/*     */     //   636: istore #19
/*     */     //   638: aload_0
/*     */     //   639: iload #11
/*     */     //   641: invokeinterface path : (Z)Ljava/lang/String;
/*     */     //   646: astore #20
/*     */     //   648: aload #14
/*     */     //   650: aload #20
/*     */     //   652: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   657: aload #20
/*     */     //   659: goto -> 664
/*     */     //   662: aload #17
/*     */     //   664: nop
/*     */     //   665: nop
/*     */     //   666: nop
/*     */     //   667: checkcast java/lang/String
/*     */     //   670: astore #13
/*     */     //   672: aload #7
/*     */     //   674: invokeinterface endReplaceGroup : ()V
/*     */     //   679: aload #13
/*     */     //   681: astore #12
/*     */     //   683: aload #12
/*     */     //   685: aload_3
/*     */     //   686: aload #7
/*     */     //   688: bipush #112
/*     */     //   690: iload #10
/*     */     //   692: bipush #6
/*     */     //   694: ishr
/*     */     //   695: iand
/*     */     //   696: invokestatic rememberResourcePainterProvider : (Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   699: astore #13
/*     */     //   701: aload #13
/*     */     //   703: aload #6
/*     */     //   705: aload #6
/*     */     //   707: arraylength
/*     */     //   708: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   711: checkcast [Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   714: aload #7
/*     */     //   716: iconst_0
/*     */     //   717: invokeinterface getPainter : ([Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   722: astore #14
/*     */     //   724: aload #14
/*     */     //   726: invokestatic Icon_FHprtrg$lambda$9 : (Landroidx/compose/runtime/State;)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   729: aload_1
/*     */     //   730: aload_2
/*     */     //   731: lload #4
/*     */     //   733: aload #7
/*     */     //   735: bipush #112
/*     */     //   737: iload #10
/*     */     //   739: iand
/*     */     //   740: sipush #896
/*     */     //   743: iload #10
/*     */     //   745: iand
/*     */     //   746: ior
/*     */     //   747: sipush #7168
/*     */     //   750: iload #10
/*     */     //   752: iconst_3
/*     */     //   753: ishr
/*     */     //   754: iand
/*     */     //   755: ior
/*     */     //   756: iconst_0
/*     */     //   757: invokestatic Icon-ww6aTOc : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V
/*     */     //   760: invokestatic isTraceInProgress : ()Z
/*     */     //   763: ifeq -> 779
/*     */     //   766: invokestatic traceEventEnd : ()V
/*     */     //   769: goto -> 779
/*     */     //   772: aload #7
/*     */     //   774: invokeinterface skipToGroupEnd : ()V
/*     */     //   779: aload #7
/*     */     //   781: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   786: dup
/*     */     //   787: ifnull -> 815
/*     */     //   790: aload_0
/*     */     //   791: aload_1
/*     */     //   792: aload_2
/*     */     //   793: aload_3
/*     */     //   794: lload #4
/*     */     //   796: aload #6
/*     */     //   798: iload #8
/*     */     //   800: iload #9
/*     */     //   802: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;II)Lkotlin/jvm/functions/Function2;
/*     */     //   807: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   812: goto -> 816
/*     */     //   815: pop
/*     */     //   816: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #146	-> 14
/*     */     //   #145	-> 302
/*     */     //   #146	-> 380
/*     */     //   #142	-> 431
/*     */     //   #143	-> 446
/*     */     //   #144	-> 469
/*     */     //   #146	-> 525
/*     */     //   #147	-> 528
/*     */     //   #148	-> 578
/*     */     //   #354	-> 607
/*     */     //   #355	-> 619
/*     */     //   #356	-> 635
/*     */     //   #148	-> 638
/*     */     //   #356	-> 646
/*     */     //   #357	-> 648
/*     */     //   #358	-> 657
/*     */     //   #359	-> 662
/*     */     //   #355	-> 664
/*     */     //   #354	-> 665
/*     */     //   #354	-> 666
/*     */     //   #148	-> 667
/*     */     //   #149	-> 683
/*     */     //   #150	-> 701
/*     */     //   #152	-> 724
/*     */     //   #153	-> 772
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   329	23	13	value	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   638	8	19	$i$a$-cache-IconKt$Icon$path$1	I
/*     */     //   648	11	20	value$iv	Ljava/lang/Object;
/*     */     //   619	46	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   616	49	17	it$iv	Ljava/lang/Object;
/*     */     //   607	60	16	$i$f$cache	I
/*     */     //   604	63	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   604	63	15	invalid$iv	Z
/*     */     //   545	224	11	isNewUi	Z
/*     */     //   683	86	12	path	Ljava/lang/String;
/*     */     //   701	68	13	painterProvider	Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   724	45	14	painter$delegate	Landroidx/compose/runtime/State;
/*     */     //   30	787	10	$dirty	I
/*     */     //   0	817	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	817	1	contentDescription	Ljava/lang/String;
/*     */     //   0	817	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	817	3	iconClass	Ljava/lang/Class;
/*     */     //   0	817	4	tint	J
/*     */     //   0	817	6	hints	[Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	817	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	817	8	$changed	I }
/* 416 */   private static final Painter Icon_FHprtrg$lambda$9(State $painter$delegate) { State state = $painter$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (Painter)state.getValue(); } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void Icon-FHprtrg(@NotNull IconKey key, @Nullable String contentDescription, @Nullable Modifier modifier, @Nullable Class iconClass, long tint, @NotNull PainterHint hint, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'key'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #6
/*     */     //   9: ldc 'hint'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload #7
/*     */     //   16: ldc_w 441573269
/*     */     //   19: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   24: astore #7
/*     */     //   26: iload #8
/*     */     //   28: istore #10
/*     */     //   30: iload #9
/*     */     //   32: iconst_1
/*     */     //   33: iand
/*     */     //   34: ifeq -> 47
/*     */     //   37: iload #10
/*     */     //   39: bipush #6
/*     */     //   41: ior
/*     */     //   42: istore #10
/*     */     //   44: goto -> 95
/*     */     //   47: iload #8
/*     */     //   49: bipush #6
/*     */     //   51: iand
/*     */     //   52: ifne -> 95
/*     */     //   55: iload #10
/*     */     //   57: iload #8
/*     */     //   59: bipush #8
/*     */     //   61: iand
/*     */     //   62: ifne -> 76
/*     */     //   65: aload #7
/*     */     //   67: aload_0
/*     */     //   68: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   73: goto -> 84
/*     */     //   76: aload #7
/*     */     //   78: aload_0
/*     */     //   79: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   84: ifeq -> 91
/*     */     //   87: iconst_4
/*     */     //   88: goto -> 92
/*     */     //   91: iconst_2
/*     */     //   92: ior
/*     */     //   93: istore #10
/*     */     //   95: iload #9
/*     */     //   97: iconst_2
/*     */     //   98: iand
/*     */     //   99: ifeq -> 112
/*     */     //   102: iload #10
/*     */     //   104: bipush #48
/*     */     //   106: ior
/*     */     //   107: istore #10
/*     */     //   109: goto -> 143
/*     */     //   112: iload #8
/*     */     //   114: bipush #48
/*     */     //   116: iand
/*     */     //   117: ifne -> 143
/*     */     //   120: iload #10
/*     */     //   122: aload #7
/*     */     //   124: aload_1
/*     */     //   125: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   130: ifeq -> 138
/*     */     //   133: bipush #32
/*     */     //   135: goto -> 140
/*     */     //   138: bipush #16
/*     */     //   140: ior
/*     */     //   141: istore #10
/*     */     //   143: iload #9
/*     */     //   145: iconst_4
/*     */     //   146: iand
/*     */     //   147: ifeq -> 161
/*     */     //   150: iload #10
/*     */     //   152: sipush #384
/*     */     //   155: ior
/*     */     //   156: istore #10
/*     */     //   158: goto -> 195
/*     */     //   161: iload #8
/*     */     //   163: sipush #384
/*     */     //   166: iand
/*     */     //   167: ifne -> 195
/*     */     //   170: iload #10
/*     */     //   172: aload #7
/*     */     //   174: aload_2
/*     */     //   175: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   180: ifeq -> 189
/*     */     //   183: sipush #256
/*     */     //   186: goto -> 192
/*     */     //   189: sipush #128
/*     */     //   192: ior
/*     */     //   193: istore #10
/*     */     //   195: iload #8
/*     */     //   197: sipush #3072
/*     */     //   200: iand
/*     */     //   201: ifne -> 237
/*     */     //   204: iload #10
/*     */     //   206: iload #9
/*     */     //   208: bipush #8
/*     */     //   210: iand
/*     */     //   211: ifne -> 231
/*     */     //   214: aload #7
/*     */     //   216: aload_3
/*     */     //   217: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   222: ifeq -> 231
/*     */     //   225: sipush #2048
/*     */     //   228: goto -> 234
/*     */     //   231: sipush #1024
/*     */     //   234: ior
/*     */     //   235: istore #10
/*     */     //   237: iload #9
/*     */     //   239: bipush #16
/*     */     //   241: iand
/*     */     //   242: ifeq -> 256
/*     */     //   245: iload #10
/*     */     //   247: sipush #24576
/*     */     //   250: ior
/*     */     //   251: istore #10
/*     */     //   253: goto -> 291
/*     */     //   256: iload #8
/*     */     //   258: sipush #24576
/*     */     //   261: iand
/*     */     //   262: ifne -> 291
/*     */     //   265: iload #10
/*     */     //   267: aload #7
/*     */     //   269: lload #4
/*     */     //   271: invokeinterface changed : (J)Z
/*     */     //   276: ifeq -> 285
/*     */     //   279: sipush #16384
/*     */     //   282: goto -> 288
/*     */     //   285: sipush #8192
/*     */     //   288: ior
/*     */     //   289: istore #10
/*     */     //   291: iload #9
/*     */     //   293: bipush #32
/*     */     //   295: iand
/*     */     //   296: ifeq -> 309
/*     */     //   299: iload #10
/*     */     //   301: ldc 196608
/*     */     //   303: ior
/*     */     //   304: istore #10
/*     */     //   306: goto -> 341
/*     */     //   309: iload #8
/*     */     //   311: ldc 196608
/*     */     //   313: iand
/*     */     //   314: ifne -> 341
/*     */     //   317: iload #10
/*     */     //   319: aload #7
/*     */     //   321: aload #6
/*     */     //   323: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   328: ifeq -> 336
/*     */     //   331: ldc 131072
/*     */     //   333: goto -> 338
/*     */     //   336: ldc 65536
/*     */     //   338: ior
/*     */     //   339: istore #10
/*     */     //   341: iload #10
/*     */     //   343: ldc 74899
/*     */     //   345: iand
/*     */     //   346: ldc 74898
/*     */     //   348: if_icmpne -> 361
/*     */     //   351: aload #7
/*     */     //   353: invokeinterface getSkipping : ()Z
/*     */     //   358: ifne -> 736
/*     */     //   361: aload #7
/*     */     //   363: invokeinterface startDefaults : ()V
/*     */     //   368: iload #8
/*     */     //   370: iconst_1
/*     */     //   371: iand
/*     */     //   372: ifeq -> 385
/*     */     //   375: aload #7
/*     */     //   377: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   382: ifeq -> 441
/*     */     //   385: iload #9
/*     */     //   387: iconst_4
/*     */     //   388: iand
/*     */     //   389: ifeq -> 399
/*     */     //   392: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   395: checkcast androidx/compose/ui/Modifier
/*     */     //   398: astore_2
/*     */     //   399: iload #9
/*     */     //   401: bipush #8
/*     */     //   403: iand
/*     */     //   404: ifeq -> 422
/*     */     //   407: aload_0
/*     */     //   408: invokeinterface getIconClass : ()Ljava/lang/Class;
/*     */     //   413: astore_3
/*     */     //   414: iload #10
/*     */     //   416: sipush #-7169
/*     */     //   419: iand
/*     */     //   420: istore #10
/*     */     //   422: iload #9
/*     */     //   424: bipush #16
/*     */     //   426: iand
/*     */     //   427: ifeq -> 464
/*     */     //   430: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   433: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   436: lstore #4
/*     */     //   438: goto -> 464
/*     */     //   441: aload #7
/*     */     //   443: invokeinterface skipToGroupEnd : ()V
/*     */     //   448: iload #9
/*     */     //   450: bipush #8
/*     */     //   452: iand
/*     */     //   453: ifeq -> 464
/*     */     //   456: iload #10
/*     */     //   458: sipush #-7169
/*     */     //   461: iand
/*     */     //   462: istore #10
/*     */     //   464: aload #7
/*     */     //   466: invokeinterface endDefaults : ()V
/*     */     //   471: invokestatic isTraceInProgress : ()Z
/*     */     //   474: ifeq -> 489
/*     */     //   477: ldc_w 441573269
/*     */     //   480: iload #10
/*     */     //   482: iconst_m1
/*     */     //   483: ldc_w 'org.jetbrains.jewel.ui.component.Icon (Icon.kt:162)'
/*     */     //   486: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   489: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   492: aload #7
/*     */     //   494: bipush #6
/*     */     //   496: invokestatic getNewUiChecker : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/icon/NewUiChecker;
/*     */     //   499: invokeinterface isNewUi : ()Z
/*     */     //   504: istore #11
/*     */     //   506: aload #7
/*     */     //   508: ldc_w 782102787
/*     */     //   511: invokeinterface startReplaceGroup : (I)V
/*     */     //   516: aload #7
/*     */     //   518: astore #14
/*     */     //   520: iload #10
/*     */     //   522: bipush #14
/*     */     //   524: iand
/*     */     //   525: iconst_4
/*     */     //   526: if_icmpeq -> 548
/*     */     //   529: iload #10
/*     */     //   531: bipush #8
/*     */     //   533: iand
/*     */     //   534: ifeq -> 552
/*     */     //   537: aload #7
/*     */     //   539: aload_0
/*     */     //   540: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   545: ifeq -> 552
/*     */     //   548: iconst_1
/*     */     //   549: goto -> 553
/*     */     //   552: iconst_0
/*     */     //   553: aload #7
/*     */     //   555: iload #11
/*     */     //   557: invokeinterface changed : (Z)Z
/*     */     //   562: ior
/*     */     //   563: istore #15
/*     */     //   565: iconst_0
/*     */     //   566: istore #16
/*     */     //   568: aload #14
/*     */     //   570: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   575: astore #17
/*     */     //   577: iconst_0
/*     */     //   578: istore #18
/*     */     //   580: iload #15
/*     */     //   582: ifne -> 596
/*     */     //   585: aload #17
/*     */     //   587: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   590: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   593: if_acmpne -> 623
/*     */     //   596: iconst_0
/*     */     //   597: istore #19
/*     */     //   599: aload_0
/*     */     //   600: iload #11
/*     */     //   602: invokeinterface path : (Z)Ljava/lang/String;
/*     */     //   607: astore #20
/*     */     //   609: aload #14
/*     */     //   611: aload #20
/*     */     //   613: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   618: aload #20
/*     */     //   620: goto -> 625
/*     */     //   623: aload #17
/*     */     //   625: nop
/*     */     //   626: nop
/*     */     //   627: nop
/*     */     //   628: checkcast java/lang/String
/*     */     //   631: astore #13
/*     */     //   633: aload #7
/*     */     //   635: invokeinterface endReplaceGroup : ()V
/*     */     //   640: aload #13
/*     */     //   642: astore #12
/*     */     //   644: aload #12
/*     */     //   646: aload_3
/*     */     //   647: aload #7
/*     */     //   649: bipush #112
/*     */     //   651: iload #10
/*     */     //   653: bipush #6
/*     */     //   655: ishr
/*     */     //   656: iand
/*     */     //   657: invokestatic rememberResourcePainterProvider : (Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   660: astore #13
/*     */     //   662: aload #13
/*     */     //   664: iconst_1
/*     */     //   665: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   668: astore #15
/*     */     //   670: aload #15
/*     */     //   672: iconst_0
/*     */     //   673: aload #6
/*     */     //   675: aastore
/*     */     //   676: aload #15
/*     */     //   678: aload #7
/*     */     //   680: iconst_0
/*     */     //   681: invokeinterface getPainter : ([Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   686: astore #14
/*     */     //   688: aload #14
/*     */     //   690: invokestatic Icon_FHprtrg$lambda$12 : (Landroidx/compose/runtime/State;)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   693: aload_1
/*     */     //   694: aload_2
/*     */     //   695: lload #4
/*     */     //   697: aload #7
/*     */     //   699: bipush #112
/*     */     //   701: iload #10
/*     */     //   703: iand
/*     */     //   704: sipush #896
/*     */     //   707: iload #10
/*     */     //   709: iand
/*     */     //   710: ior
/*     */     //   711: sipush #7168
/*     */     //   714: iload #10
/*     */     //   716: iconst_3
/*     */     //   717: ishr
/*     */     //   718: iand
/*     */     //   719: ior
/*     */     //   720: iconst_0
/*     */     //   721: invokestatic Icon-ww6aTOc : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V
/*     */     //   724: invokestatic isTraceInProgress : ()Z
/*     */     //   727: ifeq -> 743
/*     */     //   730: invokestatic traceEventEnd : ()V
/*     */     //   733: goto -> 743
/*     */     //   736: aload #7
/*     */     //   738: invokeinterface skipToGroupEnd : ()V
/*     */     //   743: aload #7
/*     */     //   745: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   750: dup
/*     */     //   751: ifnull -> 779
/*     */     //   754: aload_0
/*     */     //   755: aload_1
/*     */     //   756: aload_2
/*     */     //   757: aload_3
/*     */     //   758: lload #4
/*     */     //   760: aload #6
/*     */     //   762: iload #8
/*     */     //   764: iload #9
/*     */     //   766: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;JLorg/jetbrains/jewel/ui/painter/PainterHint;II)Lkotlin/jvm/functions/Function2;
/*     */     //   771: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   776: goto -> 780
/*     */     //   779: pop
/*     */     //   780: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #163	-> 14
/*     */     //   #159	-> 392
/*     */     //   #160	-> 407
/*     */     //   #161	-> 430
/*     */     //   #163	-> 486
/*     */     //   #164	-> 489
/*     */     //   #165	-> 539
/*     */     //   #360	-> 568
/*     */     //   #361	-> 580
/*     */     //   #362	-> 596
/*     */     //   #165	-> 599
/*     */     //   #362	-> 607
/*     */     //   #363	-> 609
/*     */     //   #364	-> 618
/*     */     //   #365	-> 623
/*     */     //   #361	-> 625
/*     */     //   #360	-> 626
/*     */     //   #360	-> 627
/*     */     //   #165	-> 628
/*     */     //   #167	-> 644
/*     */     //   #168	-> 662
/*     */     //   #170	-> 688
/*     */     //   #171	-> 736
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   599	8	19	$i$a$-cache-IconKt$Icon$path$2	I
/*     */     //   609	11	20	value$iv	Ljava/lang/Object;
/*     */     //   580	46	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   577	49	17	it$iv	Ljava/lang/Object;
/*     */     //   568	60	16	$i$f$cache	I
/*     */     //   565	63	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   565	63	15	invalid$iv	Z
/*     */     //   506	227	11	isNewUi	Z
/*     */     //   644	89	12	path	Ljava/lang/String;
/*     */     //   662	71	13	painterProvider	Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   688	45	14	painter$delegate	Landroidx/compose/runtime/State;
/*     */     //   30	751	10	$dirty	I
/*     */     //   0	781	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	781	1	contentDescription	Ljava/lang/String;
/*     */     //   0	781	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	781	3	iconClass	Ljava/lang/Class;
/*     */     //   0	781	4	tint	J
/*     */     //   0	781	6	hint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	781	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	781	8	$changed	I }
/* 417 */   private static final Painter Icon_FHprtrg$lambda$12(State $painter$delegate) { State state = $painter$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (Painter)state.getValue(); } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void Icon(@NotNull IconKey key, @Nullable String contentDescription, @Nullable Modifier modifier, @Nullable Class iconClass, @Nullable ColorFilter colorFilter, @NotNull PainterHint hint, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'key'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #5
/*     */     //   9: ldc 'hint'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload #6
/*     */     //   16: ldc_w 777210749
/*     */     //   19: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   24: astore #6
/*     */     //   26: iload #7
/*     */     //   28: istore #9
/*     */     //   30: iload #8
/*     */     //   32: iconst_1
/*     */     //   33: iand
/*     */     //   34: ifeq -> 47
/*     */     //   37: iload #9
/*     */     //   39: bipush #6
/*     */     //   41: ior
/*     */     //   42: istore #9
/*     */     //   44: goto -> 95
/*     */     //   47: iload #7
/*     */     //   49: bipush #6
/*     */     //   51: iand
/*     */     //   52: ifne -> 95
/*     */     //   55: iload #9
/*     */     //   57: iload #7
/*     */     //   59: bipush #8
/*     */     //   61: iand
/*     */     //   62: ifne -> 76
/*     */     //   65: aload #6
/*     */     //   67: aload_0
/*     */     //   68: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   73: goto -> 84
/*     */     //   76: aload #6
/*     */     //   78: aload_0
/*     */     //   79: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   84: ifeq -> 91
/*     */     //   87: iconst_4
/*     */     //   88: goto -> 92
/*     */     //   91: iconst_2
/*     */     //   92: ior
/*     */     //   93: istore #9
/*     */     //   95: iload #8
/*     */     //   97: iconst_2
/*     */     //   98: iand
/*     */     //   99: ifeq -> 112
/*     */     //   102: iload #9
/*     */     //   104: bipush #48
/*     */     //   106: ior
/*     */     //   107: istore #9
/*     */     //   109: goto -> 143
/*     */     //   112: iload #7
/*     */     //   114: bipush #48
/*     */     //   116: iand
/*     */     //   117: ifne -> 143
/*     */     //   120: iload #9
/*     */     //   122: aload #6
/*     */     //   124: aload_1
/*     */     //   125: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   130: ifeq -> 138
/*     */     //   133: bipush #32
/*     */     //   135: goto -> 140
/*     */     //   138: bipush #16
/*     */     //   140: ior
/*     */     //   141: istore #9
/*     */     //   143: iload #8
/*     */     //   145: iconst_4
/*     */     //   146: iand
/*     */     //   147: ifeq -> 161
/*     */     //   150: iload #9
/*     */     //   152: sipush #384
/*     */     //   155: ior
/*     */     //   156: istore #9
/*     */     //   158: goto -> 195
/*     */     //   161: iload #7
/*     */     //   163: sipush #384
/*     */     //   166: iand
/*     */     //   167: ifne -> 195
/*     */     //   170: iload #9
/*     */     //   172: aload #6
/*     */     //   174: aload_2
/*     */     //   175: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   180: ifeq -> 189
/*     */     //   183: sipush #256
/*     */     //   186: goto -> 192
/*     */     //   189: sipush #128
/*     */     //   192: ior
/*     */     //   193: istore #9
/*     */     //   195: iload #7
/*     */     //   197: sipush #3072
/*     */     //   200: iand
/*     */     //   201: ifne -> 237
/*     */     //   204: iload #9
/*     */     //   206: iload #8
/*     */     //   208: bipush #8
/*     */     //   210: iand
/*     */     //   211: ifne -> 231
/*     */     //   214: aload #6
/*     */     //   216: aload_3
/*     */     //   217: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   222: ifeq -> 231
/*     */     //   225: sipush #2048
/*     */     //   228: goto -> 234
/*     */     //   231: sipush #1024
/*     */     //   234: ior
/*     */     //   235: istore #9
/*     */     //   237: iload #8
/*     */     //   239: bipush #16
/*     */     //   241: iand
/*     */     //   242: ifeq -> 256
/*     */     //   245: iload #9
/*     */     //   247: sipush #24576
/*     */     //   250: ior
/*     */     //   251: istore #9
/*     */     //   253: goto -> 291
/*     */     //   256: iload #7
/*     */     //   258: sipush #24576
/*     */     //   261: iand
/*     */     //   262: ifne -> 291
/*     */     //   265: iload #9
/*     */     //   267: aload #6
/*     */     //   269: aload #4
/*     */     //   271: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   276: ifeq -> 285
/*     */     //   279: sipush #16384
/*     */     //   282: goto -> 288
/*     */     //   285: sipush #8192
/*     */     //   288: ior
/*     */     //   289: istore #9
/*     */     //   291: iload #8
/*     */     //   293: bipush #32
/*     */     //   295: iand
/*     */     //   296: ifeq -> 309
/*     */     //   299: iload #9
/*     */     //   301: ldc 196608
/*     */     //   303: ior
/*     */     //   304: istore #9
/*     */     //   306: goto -> 341
/*     */     //   309: iload #7
/*     */     //   311: ldc 196608
/*     */     //   313: iand
/*     */     //   314: ifne -> 341
/*     */     //   317: iload #9
/*     */     //   319: aload #6
/*     */     //   321: aload #5
/*     */     //   323: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   328: ifeq -> 336
/*     */     //   331: ldc 131072
/*     */     //   333: goto -> 338
/*     */     //   336: ldc 65536
/*     */     //   338: ior
/*     */     //   339: istore #9
/*     */     //   341: iload #9
/*     */     //   343: ldc 74899
/*     */     //   345: iand
/*     */     //   346: ldc 74898
/*     */     //   348: if_icmpne -> 361
/*     */     //   351: aload #6
/*     */     //   353: invokeinterface getSkipping : ()Z
/*     */     //   358: ifne -> 723
/*     */     //   361: aload #6
/*     */     //   363: invokeinterface startDefaults : ()V
/*     */     //   368: iload #7
/*     */     //   370: iconst_1
/*     */     //   371: iand
/*     */     //   372: ifeq -> 385
/*     */     //   375: aload #6
/*     */     //   377: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   382: ifeq -> 425
/*     */     //   385: iload #8
/*     */     //   387: iconst_4
/*     */     //   388: iand
/*     */     //   389: ifeq -> 399
/*     */     //   392: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   395: checkcast androidx/compose/ui/Modifier
/*     */     //   398: astore_2
/*     */     //   399: iload #8
/*     */     //   401: bipush #8
/*     */     //   403: iand
/*     */     //   404: ifeq -> 448
/*     */     //   407: aload_0
/*     */     //   408: invokeinterface getIconClass : ()Ljava/lang/Class;
/*     */     //   413: astore_3
/*     */     //   414: iload #9
/*     */     //   416: sipush #-7169
/*     */     //   419: iand
/*     */     //   420: istore #9
/*     */     //   422: goto -> 448
/*     */     //   425: aload #6
/*     */     //   427: invokeinterface skipToGroupEnd : ()V
/*     */     //   432: iload #8
/*     */     //   434: bipush #8
/*     */     //   436: iand
/*     */     //   437: ifeq -> 448
/*     */     //   440: iload #9
/*     */     //   442: sipush #-7169
/*     */     //   445: iand
/*     */     //   446: istore #9
/*     */     //   448: aload #6
/*     */     //   450: invokeinterface endDefaults : ()V
/*     */     //   455: invokestatic isTraceInProgress : ()Z
/*     */     //   458: ifeq -> 473
/*     */     //   461: ldc_w 777210749
/*     */     //   464: iload #9
/*     */     //   466: iconst_m1
/*     */     //   467: ldc_w 'org.jetbrains.jewel.ui.component.Icon (Icon.kt:180)'
/*     */     //   470: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   473: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   476: aload #6
/*     */     //   478: bipush #6
/*     */     //   480: invokestatic getNewUiChecker : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/icon/NewUiChecker;
/*     */     //   483: invokeinterface isNewUi : ()Z
/*     */     //   488: istore #10
/*     */     //   490: aload #6
/*     */     //   492: ldc_w 782120739
/*     */     //   495: invokeinterface startReplaceGroup : (I)V
/*     */     //   500: aload #6
/*     */     //   502: astore #13
/*     */     //   504: iload #9
/*     */     //   506: bipush #14
/*     */     //   508: iand
/*     */     //   509: iconst_4
/*     */     //   510: if_icmpeq -> 532
/*     */     //   513: iload #9
/*     */     //   515: bipush #8
/*     */     //   517: iand
/*     */     //   518: ifeq -> 536
/*     */     //   521: aload #6
/*     */     //   523: aload_0
/*     */     //   524: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   529: ifeq -> 536
/*     */     //   532: iconst_1
/*     */     //   533: goto -> 537
/*     */     //   536: iconst_0
/*     */     //   537: aload #6
/*     */     //   539: iload #10
/*     */     //   541: invokeinterface changed : (Z)Z
/*     */     //   546: ior
/*     */     //   547: istore #14
/*     */     //   549: iconst_0
/*     */     //   550: istore #15
/*     */     //   552: aload #13
/*     */     //   554: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   559: astore #16
/*     */     //   561: iconst_0
/*     */     //   562: istore #17
/*     */     //   564: iload #14
/*     */     //   566: ifne -> 580
/*     */     //   569: aload #16
/*     */     //   571: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   574: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   577: if_acmpne -> 607
/*     */     //   580: iconst_0
/*     */     //   581: istore #18
/*     */     //   583: aload_0
/*     */     //   584: iload #10
/*     */     //   586: invokeinterface path : (Z)Ljava/lang/String;
/*     */     //   591: astore #19
/*     */     //   593: aload #13
/*     */     //   595: aload #19
/*     */     //   597: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   602: aload #19
/*     */     //   604: goto -> 609
/*     */     //   607: aload #16
/*     */     //   609: nop
/*     */     //   610: nop
/*     */     //   611: nop
/*     */     //   612: checkcast java/lang/String
/*     */     //   615: astore #12
/*     */     //   617: aload #6
/*     */     //   619: invokeinterface endReplaceGroup : ()V
/*     */     //   624: aload #12
/*     */     //   626: astore #11
/*     */     //   628: aload #11
/*     */     //   630: aload_3
/*     */     //   631: aload #6
/*     */     //   633: bipush #112
/*     */     //   635: iload #9
/*     */     //   637: bipush #6
/*     */     //   639: ishr
/*     */     //   640: iand
/*     */     //   641: invokestatic rememberResourcePainterProvider : (Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   644: astore #12
/*     */     //   646: aload #12
/*     */     //   648: iconst_1
/*     */     //   649: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   652: astore #14
/*     */     //   654: aload #14
/*     */     //   656: iconst_0
/*     */     //   657: aload #5
/*     */     //   659: aastore
/*     */     //   660: aload #14
/*     */     //   662: aload #6
/*     */     //   664: iconst_0
/*     */     //   665: invokeinterface getPainter : ([Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   670: astore #13
/*     */     //   672: aload #13
/*     */     //   674: invokestatic Icon$lambda$15 : (Landroidx/compose/runtime/State;)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   677: aload_1
/*     */     //   678: aload #4
/*     */     //   680: aload_2
/*     */     //   681: aload #6
/*     */     //   683: bipush #112
/*     */     //   685: iload #9
/*     */     //   687: iand
/*     */     //   688: sipush #896
/*     */     //   691: iload #9
/*     */     //   693: bipush #6
/*     */     //   695: ishr
/*     */     //   696: iand
/*     */     //   697: ior
/*     */     //   698: sipush #7168
/*     */     //   701: iload #9
/*     */     //   703: iconst_3
/*     */     //   704: ishl
/*     */     //   705: iand
/*     */     //   706: ior
/*     */     //   707: iconst_0
/*     */     //   708: invokestatic Icon : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
/*     */     //   711: invokestatic isTraceInProgress : ()Z
/*     */     //   714: ifeq -> 730
/*     */     //   717: invokestatic traceEventEnd : ()V
/*     */     //   720: goto -> 730
/*     */     //   723: aload #6
/*     */     //   725: invokeinterface skipToGroupEnd : ()V
/*     */     //   730: aload #6
/*     */     //   732: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   737: dup
/*     */     //   738: ifnull -> 766
/*     */     //   741: aload_0
/*     */     //   742: aload_1
/*     */     //   743: aload_2
/*     */     //   744: aload_3
/*     */     //   745: aload #4
/*     */     //   747: aload #5
/*     */     //   749: iload #7
/*     */     //   751: iload #8
/*     */     //   753: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;II)Lkotlin/jvm/functions/Function2;
/*     */     //   758: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   763: goto -> 767
/*     */     //   766: pop
/*     */     //   767: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #181	-> 14
/*     */     //   #177	-> 392
/*     */     //   #178	-> 407
/*     */     //   #181	-> 470
/*     */     //   #182	-> 473
/*     */     //   #183	-> 523
/*     */     //   #366	-> 552
/*     */     //   #367	-> 564
/*     */     //   #368	-> 580
/*     */     //   #183	-> 583
/*     */     //   #368	-> 591
/*     */     //   #369	-> 593
/*     */     //   #370	-> 602
/*     */     //   #371	-> 607
/*     */     //   #367	-> 609
/*     */     //   #366	-> 610
/*     */     //   #366	-> 611
/*     */     //   #183	-> 612
/*     */     //   #184	-> 628
/*     */     //   #185	-> 646
/*     */     //   #187	-> 672
/*     */     //   #188	-> 723
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   583	8	18	$i$a$-cache-IconKt$Icon$path$3	I
/*     */     //   593	11	19	value$iv	Ljava/lang/Object;
/*     */     //   564	46	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   561	49	16	it$iv	Ljava/lang/Object;
/*     */     //   552	60	15	$i$f$cache	I
/*     */     //   549	63	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   549	63	14	invalid$iv	Z
/*     */     //   490	230	10	isNewUi	Z
/*     */     //   628	92	11	path	Ljava/lang/String;
/*     */     //   646	74	12	painterProvider	Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   672	48	13	painter$delegate	Landroidx/compose/runtime/State;
/*     */     //   30	738	9	$dirty	I
/*     */     //   0	768	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	768	1	contentDescription	Ljava/lang/String;
/*     */     //   0	768	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	768	3	iconClass	Ljava/lang/Class;
/*     */     //   0	768	4	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	768	5	hint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	768	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	768	7	$changed	I }
/* 418 */   private static final Painter Icon$lambda$15(State $painter$delegate) { State state = $painter$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (Painter)state.getValue(); } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void Icon(@NotNull IconKey key, @Nullable String contentDescription, @Nullable Modifier modifier, @Nullable Class iconClass, @Nullable ColorFilter colorFilter, @NotNull PainterHint[] hints, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'key'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #5
/*     */     //   9: ldc 'hints'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload #6
/*     */     //   16: ldc_w -62689162
/*     */     //   19: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   24: astore #6
/*     */     //   26: iload #7
/*     */     //   28: istore #9
/*     */     //   30: iload #8
/*     */     //   32: iconst_1
/*     */     //   33: iand
/*     */     //   34: ifeq -> 47
/*     */     //   37: iload #9
/*     */     //   39: bipush #6
/*     */     //   41: ior
/*     */     //   42: istore #9
/*     */     //   44: goto -> 95
/*     */     //   47: iload #7
/*     */     //   49: bipush #6
/*     */     //   51: iand
/*     */     //   52: ifne -> 95
/*     */     //   55: iload #9
/*     */     //   57: iload #7
/*     */     //   59: bipush #8
/*     */     //   61: iand
/*     */     //   62: ifne -> 76
/*     */     //   65: aload #6
/*     */     //   67: aload_0
/*     */     //   68: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   73: goto -> 84
/*     */     //   76: aload #6
/*     */     //   78: aload_0
/*     */     //   79: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   84: ifeq -> 91
/*     */     //   87: iconst_4
/*     */     //   88: goto -> 92
/*     */     //   91: iconst_2
/*     */     //   92: ior
/*     */     //   93: istore #9
/*     */     //   95: iload #8
/*     */     //   97: iconst_2
/*     */     //   98: iand
/*     */     //   99: ifeq -> 112
/*     */     //   102: iload #9
/*     */     //   104: bipush #48
/*     */     //   106: ior
/*     */     //   107: istore #9
/*     */     //   109: goto -> 143
/*     */     //   112: iload #7
/*     */     //   114: bipush #48
/*     */     //   116: iand
/*     */     //   117: ifne -> 143
/*     */     //   120: iload #9
/*     */     //   122: aload #6
/*     */     //   124: aload_1
/*     */     //   125: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   130: ifeq -> 138
/*     */     //   133: bipush #32
/*     */     //   135: goto -> 140
/*     */     //   138: bipush #16
/*     */     //   140: ior
/*     */     //   141: istore #9
/*     */     //   143: iload #8
/*     */     //   145: iconst_4
/*     */     //   146: iand
/*     */     //   147: ifeq -> 161
/*     */     //   150: iload #9
/*     */     //   152: sipush #384
/*     */     //   155: ior
/*     */     //   156: istore #9
/*     */     //   158: goto -> 195
/*     */     //   161: iload #7
/*     */     //   163: sipush #384
/*     */     //   166: iand
/*     */     //   167: ifne -> 195
/*     */     //   170: iload #9
/*     */     //   172: aload #6
/*     */     //   174: aload_2
/*     */     //   175: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   180: ifeq -> 189
/*     */     //   183: sipush #256
/*     */     //   186: goto -> 192
/*     */     //   189: sipush #128
/*     */     //   192: ior
/*     */     //   193: istore #9
/*     */     //   195: iload #7
/*     */     //   197: sipush #3072
/*     */     //   200: iand
/*     */     //   201: ifne -> 237
/*     */     //   204: iload #9
/*     */     //   206: iload #8
/*     */     //   208: bipush #8
/*     */     //   210: iand
/*     */     //   211: ifne -> 231
/*     */     //   214: aload #6
/*     */     //   216: aload_3
/*     */     //   217: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   222: ifeq -> 231
/*     */     //   225: sipush #2048
/*     */     //   228: goto -> 234
/*     */     //   231: sipush #1024
/*     */     //   234: ior
/*     */     //   235: istore #9
/*     */     //   237: iload #8
/*     */     //   239: bipush #16
/*     */     //   241: iand
/*     */     //   242: ifeq -> 256
/*     */     //   245: iload #9
/*     */     //   247: sipush #24576
/*     */     //   250: ior
/*     */     //   251: istore #9
/*     */     //   253: goto -> 291
/*     */     //   256: iload #7
/*     */     //   258: sipush #24576
/*     */     //   261: iand
/*     */     //   262: ifne -> 291
/*     */     //   265: iload #9
/*     */     //   267: aload #6
/*     */     //   269: aload #4
/*     */     //   271: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   276: ifeq -> 285
/*     */     //   279: sipush #16384
/*     */     //   282: goto -> 288
/*     */     //   285: sipush #8192
/*     */     //   288: ior
/*     */     //   289: istore #9
/*     */     //   291: aload #6
/*     */     //   293: ldc_w 782136208
/*     */     //   296: aload #5
/*     */     //   298: arraylength
/*     */     //   299: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   302: invokeinterface startMovableGroup : (ILjava/lang/Object;)V
/*     */     //   307: iconst_0
/*     */     //   308: istore #10
/*     */     //   310: aload #5
/*     */     //   312: arraylength
/*     */     //   313: istore #11
/*     */     //   315: iload #10
/*     */     //   317: iload #11
/*     */     //   319: if_icmpge -> 358
/*     */     //   322: aload #5
/*     */     //   324: iload #10
/*     */     //   326: aaload
/*     */     //   327: astore #12
/*     */     //   329: iload #9
/*     */     //   331: aload #6
/*     */     //   333: aload #12
/*     */     //   335: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   340: ifeq -> 348
/*     */     //   343: ldc 131072
/*     */     //   345: goto -> 349
/*     */     //   348: iconst_0
/*     */     //   349: ior
/*     */     //   350: istore #9
/*     */     //   352: iinc #10, 1
/*     */     //   355: goto -> 315
/*     */     //   358: aload #6
/*     */     //   360: invokeinterface endMovableGroup : ()V
/*     */     //   365: iload #9
/*     */     //   367: ldc 458752
/*     */     //   369: iand
/*     */     //   370: ifne -> 380
/*     */     //   373: iload #9
/*     */     //   375: ldc 65536
/*     */     //   377: ior
/*     */     //   378: istore #9
/*     */     //   380: iload #9
/*     */     //   382: ldc 74899
/*     */     //   384: iand
/*     */     //   385: ldc 74898
/*     */     //   387: if_icmpne -> 400
/*     */     //   390: aload #6
/*     */     //   392: invokeinterface getSkipping : ()Z
/*     */     //   397: ifne -> 759
/*     */     //   400: aload #6
/*     */     //   402: invokeinterface startDefaults : ()V
/*     */     //   407: iload #7
/*     */     //   409: iconst_1
/*     */     //   410: iand
/*     */     //   411: ifeq -> 424
/*     */     //   414: aload #6
/*     */     //   416: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   421: ifeq -> 464
/*     */     //   424: iload #8
/*     */     //   426: iconst_4
/*     */     //   427: iand
/*     */     //   428: ifeq -> 438
/*     */     //   431: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   434: checkcast androidx/compose/ui/Modifier
/*     */     //   437: astore_2
/*     */     //   438: iload #8
/*     */     //   440: bipush #8
/*     */     //   442: iand
/*     */     //   443: ifeq -> 487
/*     */     //   446: aload_0
/*     */     //   447: invokeinterface getIconClass : ()Ljava/lang/Class;
/*     */     //   452: astore_3
/*     */     //   453: iload #9
/*     */     //   455: sipush #-7169
/*     */     //   458: iand
/*     */     //   459: istore #9
/*     */     //   461: goto -> 487
/*     */     //   464: aload #6
/*     */     //   466: invokeinterface skipToGroupEnd : ()V
/*     */     //   471: iload #8
/*     */     //   473: bipush #8
/*     */     //   475: iand
/*     */     //   476: ifeq -> 487
/*     */     //   479: iload #9
/*     */     //   481: sipush #-7169
/*     */     //   484: iand
/*     */     //   485: istore #9
/*     */     //   487: aload #6
/*     */     //   489: invokeinterface endDefaults : ()V
/*     */     //   494: invokestatic isTraceInProgress : ()Z
/*     */     //   497: ifeq -> 512
/*     */     //   500: ldc_w -62689162
/*     */     //   503: iload #9
/*     */     //   505: iconst_m1
/*     */     //   506: ldc_w 'org.jetbrains.jewel.ui.component.Icon (Icon.kt:197)'
/*     */     //   509: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   512: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   515: aload #6
/*     */     //   517: bipush #6
/*     */     //   519: invokestatic getNewUiChecker : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/icon/NewUiChecker;
/*     */     //   522: invokeinterface isNewUi : ()Z
/*     */     //   527: istore #10
/*     */     //   529: aload #6
/*     */     //   531: ldc_w 782139363
/*     */     //   534: invokeinterface startReplaceGroup : (I)V
/*     */     //   539: aload #6
/*     */     //   541: astore #13
/*     */     //   543: iload #9
/*     */     //   545: bipush #14
/*     */     //   547: iand
/*     */     //   548: iconst_4
/*     */     //   549: if_icmpeq -> 571
/*     */     //   552: iload #9
/*     */     //   554: bipush #8
/*     */     //   556: iand
/*     */     //   557: ifeq -> 575
/*     */     //   560: aload #6
/*     */     //   562: aload_0
/*     */     //   563: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   568: ifeq -> 575
/*     */     //   571: iconst_1
/*     */     //   572: goto -> 576
/*     */     //   575: iconst_0
/*     */     //   576: aload #6
/*     */     //   578: iload #10
/*     */     //   580: invokeinterface changed : (Z)Z
/*     */     //   585: ior
/*     */     //   586: istore #14
/*     */     //   588: iconst_0
/*     */     //   589: istore #15
/*     */     //   591: aload #13
/*     */     //   593: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   598: astore #16
/*     */     //   600: iconst_0
/*     */     //   601: istore #17
/*     */     //   603: iload #14
/*     */     //   605: ifne -> 619
/*     */     //   608: aload #16
/*     */     //   610: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   613: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   616: if_acmpne -> 646
/*     */     //   619: iconst_0
/*     */     //   620: istore #18
/*     */     //   622: aload_0
/*     */     //   623: iload #10
/*     */     //   625: invokeinterface path : (Z)Ljava/lang/String;
/*     */     //   630: astore #19
/*     */     //   632: aload #13
/*     */     //   634: aload #19
/*     */     //   636: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   641: aload #19
/*     */     //   643: goto -> 648
/*     */     //   646: aload #16
/*     */     //   648: nop
/*     */     //   649: nop
/*     */     //   650: nop
/*     */     //   651: checkcast java/lang/String
/*     */     //   654: astore #12
/*     */     //   656: aload #6
/*     */     //   658: invokeinterface endReplaceGroup : ()V
/*     */     //   663: aload #12
/*     */     //   665: astore #11
/*     */     //   667: aload #11
/*     */     //   669: aload_3
/*     */     //   670: aload #6
/*     */     //   672: bipush #112
/*     */     //   674: iload #9
/*     */     //   676: bipush #6
/*     */     //   678: ishr
/*     */     //   679: iand
/*     */     //   680: invokestatic rememberResourcePainterProvider : (Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   683: astore #12
/*     */     //   685: aload #12
/*     */     //   687: aload #5
/*     */     //   689: aload #5
/*     */     //   691: arraylength
/*     */     //   692: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   695: checkcast [Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   698: aload #6
/*     */     //   700: iconst_0
/*     */     //   701: invokeinterface getPainter : ([Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   706: astore #13
/*     */     //   708: aload #13
/*     */     //   710: invokestatic Icon$lambda$18 : (Landroidx/compose/runtime/State;)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   713: aload_1
/*     */     //   714: aload #4
/*     */     //   716: aload_2
/*     */     //   717: aload #6
/*     */     //   719: bipush #112
/*     */     //   721: iload #9
/*     */     //   723: iand
/*     */     //   724: sipush #896
/*     */     //   727: iload #9
/*     */     //   729: bipush #6
/*     */     //   731: ishr
/*     */     //   732: iand
/*     */     //   733: ior
/*     */     //   734: sipush #7168
/*     */     //   737: iload #9
/*     */     //   739: iconst_3
/*     */     //   740: ishl
/*     */     //   741: iand
/*     */     //   742: ior
/*     */     //   743: iconst_0
/*     */     //   744: invokestatic Icon : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
/*     */     //   747: invokestatic isTraceInProgress : ()Z
/*     */     //   750: ifeq -> 766
/*     */     //   753: invokestatic traceEventEnd : ()V
/*     */     //   756: goto -> 766
/*     */     //   759: aload #6
/*     */     //   761: invokeinterface skipToGroupEnd : ()V
/*     */     //   766: aload #6
/*     */     //   768: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   773: dup
/*     */     //   774: ifnull -> 802
/*     */     //   777: aload_0
/*     */     //   778: aload_1
/*     */     //   779: aload_2
/*     */     //   780: aload_3
/*     */     //   781: aload #4
/*     */     //   783: aload #5
/*     */     //   785: iload #7
/*     */     //   787: iload #8
/*     */     //   789: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;Landroidx/compose/ui/graphics/ColorFilter;[Lorg/jetbrains/jewel/ui/painter/PainterHint;II)Lkotlin/jvm/functions/Function2;
/*     */     //   794: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   799: goto -> 803
/*     */     //   802: pop
/*     */     //   803: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #198	-> 14
/*     */     //   #197	-> 302
/*     */     //   #198	-> 380
/*     */     //   #194	-> 431
/*     */     //   #195	-> 446
/*     */     //   #198	-> 509
/*     */     //   #199	-> 512
/*     */     //   #200	-> 562
/*     */     //   #372	-> 591
/*     */     //   #373	-> 603
/*     */     //   #374	-> 619
/*     */     //   #200	-> 622
/*     */     //   #374	-> 630
/*     */     //   #375	-> 632
/*     */     //   #376	-> 641
/*     */     //   #377	-> 646
/*     */     //   #373	-> 648
/*     */     //   #372	-> 649
/*     */     //   #372	-> 650
/*     */     //   #200	-> 651
/*     */     //   #201	-> 667
/*     */     //   #202	-> 685
/*     */     //   #204	-> 708
/*     */     //   #205	-> 759
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   329	23	12	value	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   622	8	18	$i$a$-cache-IconKt$Icon$path$4	I
/*     */     //   632	11	19	value$iv	Ljava/lang/Object;
/*     */     //   603	46	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   600	49	16	it$iv	Ljava/lang/Object;
/*     */     //   591	60	15	$i$f$cache	I
/*     */     //   588	63	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   588	63	14	invalid$iv	Z
/*     */     //   529	227	10	isNewUi	Z
/*     */     //   667	89	11	path	Ljava/lang/String;
/*     */     //   685	71	12	painterProvider	Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   708	48	13	painter$delegate	Landroidx/compose/runtime/State;
/*     */     //   30	774	9	$dirty	I
/*     */     //   0	804	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	804	1	contentDescription	Ljava/lang/String;
/*     */     //   0	804	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	804	3	iconClass	Ljava/lang/Class;
/*     */     //   0	804	4	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	804	5	hints	[Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	804	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	804	7	$changed	I }
/* 419 */   private static final Painter Icon$lambda$18(State $painter$delegate) { State state = $painter$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (Painter)state.getValue(); } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void Icon-ww6aTOc(@NotNull ImageVector imageVector, @Nullable String contentDescription, @Nullable Modifier modifier, long tint, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'imageVector'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #5
/*     */     //   9: ldc_w -67202993
/*     */     //   12: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   17: astore #5
/*     */     //   19: iload #6
/*     */     //   21: istore #8
/*     */     //   23: iload #7
/*     */     //   25: iconst_1
/*     */     //   26: iand
/*     */     //   27: ifeq -> 40
/*     */     //   30: iload #8
/*     */     //   32: bipush #6
/*     */     //   34: ior
/*     */     //   35: istore #8
/*     */     //   37: goto -> 69
/*     */     //   40: iload #6
/*     */     //   42: bipush #6
/*     */     //   44: iand
/*     */     //   45: ifne -> 69
/*     */     //   48: iload #8
/*     */     //   50: aload #5
/*     */     //   52: aload_0
/*     */     //   53: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   58: ifeq -> 65
/*     */     //   61: iconst_4
/*     */     //   62: goto -> 66
/*     */     //   65: iconst_2
/*     */     //   66: ior
/*     */     //   67: istore #8
/*     */     //   69: iload #7
/*     */     //   71: iconst_2
/*     */     //   72: iand
/*     */     //   73: ifeq -> 86
/*     */     //   76: iload #8
/*     */     //   78: bipush #48
/*     */     //   80: ior
/*     */     //   81: istore #8
/*     */     //   83: goto -> 117
/*     */     //   86: iload #6
/*     */     //   88: bipush #48
/*     */     //   90: iand
/*     */     //   91: ifne -> 117
/*     */     //   94: iload #8
/*     */     //   96: aload #5
/*     */     //   98: aload_1
/*     */     //   99: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   104: ifeq -> 112
/*     */     //   107: bipush #32
/*     */     //   109: goto -> 114
/*     */     //   112: bipush #16
/*     */     //   114: ior
/*     */     //   115: istore #8
/*     */     //   117: iload #7
/*     */     //   119: iconst_4
/*     */     //   120: iand
/*     */     //   121: ifeq -> 135
/*     */     //   124: iload #8
/*     */     //   126: sipush #384
/*     */     //   129: ior
/*     */     //   130: istore #8
/*     */     //   132: goto -> 169
/*     */     //   135: iload #6
/*     */     //   137: sipush #384
/*     */     //   140: iand
/*     */     //   141: ifne -> 169
/*     */     //   144: iload #8
/*     */     //   146: aload #5
/*     */     //   148: aload_2
/*     */     //   149: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   154: ifeq -> 163
/*     */     //   157: sipush #256
/*     */     //   160: goto -> 166
/*     */     //   163: sipush #128
/*     */     //   166: ior
/*     */     //   167: istore #8
/*     */     //   169: iload #7
/*     */     //   171: bipush #8
/*     */     //   173: iand
/*     */     //   174: ifeq -> 188
/*     */     //   177: iload #8
/*     */     //   179: sipush #3072
/*     */     //   182: ior
/*     */     //   183: istore #8
/*     */     //   185: goto -> 222
/*     */     //   188: iload #6
/*     */     //   190: sipush #3072
/*     */     //   193: iand
/*     */     //   194: ifne -> 222
/*     */     //   197: iload #8
/*     */     //   199: aload #5
/*     */     //   201: lload_3
/*     */     //   202: invokeinterface changed : (J)Z
/*     */     //   207: ifeq -> 216
/*     */     //   210: sipush #2048
/*     */     //   213: goto -> 219
/*     */     //   216: sipush #1024
/*     */     //   219: ior
/*     */     //   220: istore #8
/*     */     //   222: iload #8
/*     */     //   224: sipush #1171
/*     */     //   227: iand
/*     */     //   228: sipush #1170
/*     */     //   231: if_icmpne -> 244
/*     */     //   234: aload #5
/*     */     //   236: invokeinterface getSkipping : ()Z
/*     */     //   241: ifne -> 349
/*     */     //   244: iload #7
/*     */     //   246: iconst_4
/*     */     //   247: iand
/*     */     //   248: ifeq -> 258
/*     */     //   251: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   254: checkcast androidx/compose/ui/Modifier
/*     */     //   257: astore_2
/*     */     //   258: iload #7
/*     */     //   260: bipush #8
/*     */     //   262: iand
/*     */     //   263: ifeq -> 273
/*     */     //   266: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   269: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   272: lstore_3
/*     */     //   273: invokestatic isTraceInProgress : ()Z
/*     */     //   276: ifeq -> 291
/*     */     //   279: ldc_w -67202993
/*     */     //   282: iload #8
/*     */     //   284: iconst_m1
/*     */     //   285: ldc_w 'org.jetbrains.jewel.ui.component.Icon (Icon.kt:222)'
/*     */     //   288: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   291: aload_0
/*     */     //   292: aload #5
/*     */     //   294: bipush #14
/*     */     //   296: iload #8
/*     */     //   298: iand
/*     */     //   299: invokestatic rememberVectorPainter : (Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/VectorPainter;
/*     */     //   302: checkcast androidx/compose/ui/graphics/painter/Painter
/*     */     //   305: aload_1
/*     */     //   306: aload_2
/*     */     //   307: lload_3
/*     */     //   308: aload #5
/*     */     //   310: getstatic androidx/compose/ui/graphics/vector/VectorPainter.$stable : I
/*     */     //   313: bipush #112
/*     */     //   315: iload #8
/*     */     //   317: iand
/*     */     //   318: ior
/*     */     //   319: sipush #896
/*     */     //   322: iload #8
/*     */     //   324: iand
/*     */     //   325: ior
/*     */     //   326: sipush #7168
/*     */     //   329: iload #8
/*     */     //   331: iand
/*     */     //   332: ior
/*     */     //   333: iconst_0
/*     */     //   334: invokestatic Icon-ww6aTOc : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V
/*     */     //   337: invokestatic isTraceInProgress : ()Z
/*     */     //   340: ifeq -> 356
/*     */     //   343: invokestatic traceEventEnd : ()V
/*     */     //   346: goto -> 356
/*     */     //   349: aload #5
/*     */     //   351: invokeinterface skipToGroupEnd : ()V
/*     */     //   356: aload #5
/*     */     //   358: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   363: dup
/*     */     //   364: ifnull -> 388
/*     */     //   367: aload_0
/*     */     //   368: aload_1
/*     */     //   369: aload_2
/*     */     //   370: lload_3
/*     */     //   371: iload #6
/*     */     //   373: iload #7
/*     */     //   375: <illegal opcode> invoke : (Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JII)Lkotlin/jvm/functions/Function2;
/*     */     //   380: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   385: goto -> 389
/*     */     //   388: pop
/*     */     //   389: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #223	-> 7
/*     */     //   #221	-> 251
/*     */     //   #222	-> 266
/*     */     //   #223	-> 288
/*     */     //   #225	-> 291
/*     */     //   #226	-> 305
/*     */     //   #227	-> 306
/*     */     //   #228	-> 307
/*     */     //   #224	-> 334
/*     */     //   #230	-> 349
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   23	367	8	$dirty	I
/*     */     //   0	390	0	imageVector	Landroidx/compose/ui/graphics/vector/ImageVector;
/*     */     //   0	390	1	contentDescription	Ljava/lang/String;
/*     */     //   0	390	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	390	3	tint	J
/*     */     //   0	390	5	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	390	6	$changed	I }
/* 420 */   static { int $this$dp$iv = 16, $i$f$getDp = 0; DefaultIconSizeModifier = SizeKt.size-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv)); }
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void Icon-ww6aTOc(@NotNull ImageBitmap bitmap, @Nullable String contentDescription, @Nullable Modifier modifier, long tint, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'bitmap'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #5
/*     */     //   9: ldc_w -515956765
/*     */     //   12: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   17: astore #5
/*     */     //   19: iload #6
/*     */     //   21: istore #8
/*     */     //   23: iload #7
/*     */     //   25: iconst_1
/*     */     //   26: iand
/*     */     //   27: ifeq -> 40
/*     */     //   30: iload #8
/*     */     //   32: bipush #6
/*     */     //   34: ior
/*     */     //   35: istore #8
/*     */     //   37: goto -> 69
/*     */     //   40: iload #6
/*     */     //   42: bipush #6
/*     */     //   44: iand
/*     */     //   45: ifne -> 69
/*     */     //   48: iload #8
/*     */     //   50: aload #5
/*     */     //   52: aload_0
/*     */     //   53: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   58: ifeq -> 65
/*     */     //   61: iconst_4
/*     */     //   62: goto -> 66
/*     */     //   65: iconst_2
/*     */     //   66: ior
/*     */     //   67: istore #8
/*     */     //   69: iload #7
/*     */     //   71: iconst_2
/*     */     //   72: iand
/*     */     //   73: ifeq -> 86
/*     */     //   76: iload #8
/*     */     //   78: bipush #48
/*     */     //   80: ior
/*     */     //   81: istore #8
/*     */     //   83: goto -> 117
/*     */     //   86: iload #6
/*     */     //   88: bipush #48
/*     */     //   90: iand
/*     */     //   91: ifne -> 117
/*     */     //   94: iload #8
/*     */     //   96: aload #5
/*     */     //   98: aload_1
/*     */     //   99: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   104: ifeq -> 112
/*     */     //   107: bipush #32
/*     */     //   109: goto -> 114
/*     */     //   112: bipush #16
/*     */     //   114: ior
/*     */     //   115: istore #8
/*     */     //   117: iload #7
/*     */     //   119: iconst_4
/*     */     //   120: iand
/*     */     //   121: ifeq -> 135
/*     */     //   124: iload #8
/*     */     //   126: sipush #384
/*     */     //   129: ior
/*     */     //   130: istore #8
/*     */     //   132: goto -> 169
/*     */     //   135: iload #6
/*     */     //   137: sipush #384
/*     */     //   140: iand
/*     */     //   141: ifne -> 169
/*     */     //   144: iload #8
/*     */     //   146: aload #5
/*     */     //   148: aload_2
/*     */     //   149: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   154: ifeq -> 163
/*     */     //   157: sipush #256
/*     */     //   160: goto -> 166
/*     */     //   163: sipush #128
/*     */     //   166: ior
/*     */     //   167: istore #8
/*     */     //   169: iload #7
/*     */     //   171: bipush #8
/*     */     //   173: iand
/*     */     //   174: ifeq -> 188
/*     */     //   177: iload #8
/*     */     //   179: sipush #3072
/*     */     //   182: ior
/*     */     //   183: istore #8
/*     */     //   185: goto -> 222
/*     */     //   188: iload #6
/*     */     //   190: sipush #3072
/*     */     //   193: iand
/*     */     //   194: ifne -> 222
/*     */     //   197: iload #8
/*     */     //   199: aload #5
/*     */     //   201: lload_3
/*     */     //   202: invokeinterface changed : (J)Z
/*     */     //   207: ifeq -> 216
/*     */     //   210: sipush #2048
/*     */     //   213: goto -> 219
/*     */     //   216: sipush #1024
/*     */     //   219: ior
/*     */     //   220: istore #8
/*     */     //   222: iload #8
/*     */     //   224: sipush #1171
/*     */     //   227: iand
/*     */     //   228: sipush #1170
/*     */     //   231: if_icmpne -> 244
/*     */     //   234: aload #5
/*     */     //   236: invokeinterface getSkipping : ()Z
/*     */     //   241: ifne -> 444
/*     */     //   244: iload #7
/*     */     //   246: iconst_4
/*     */     //   247: iand
/*     */     //   248: ifeq -> 258
/*     */     //   251: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   254: checkcast androidx/compose/ui/Modifier
/*     */     //   257: astore_2
/*     */     //   258: iload #7
/*     */     //   260: bipush #8
/*     */     //   262: iand
/*     */     //   263: ifeq -> 273
/*     */     //   266: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   269: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   272: lstore_3
/*     */     //   273: invokestatic isTraceInProgress : ()Z
/*     */     //   276: ifeq -> 291
/*     */     //   279: ldc_w -515956765
/*     */     //   282: iload #8
/*     */     //   284: iconst_m1
/*     */     //   285: ldc_w 'org.jetbrains.jewel.ui.component.Icon (Icon.kt:247)'
/*     */     //   288: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   291: aload #5
/*     */     //   293: ldc_w 782202689
/*     */     //   296: invokeinterface startReplaceGroup : (I)V
/*     */     //   301: aload #5
/*     */     //   303: astore #11
/*     */     //   305: aload #5
/*     */     //   307: aload_0
/*     */     //   308: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   313: istore #12
/*     */     //   315: iconst_0
/*     */     //   316: istore #13
/*     */     //   318: aload #11
/*     */     //   320: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   325: astore #14
/*     */     //   327: iconst_0
/*     */     //   328: istore #15
/*     */     //   330: iload #12
/*     */     //   332: ifne -> 346
/*     */     //   335: aload #14
/*     */     //   337: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   340: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   343: if_acmpne -> 378
/*     */     //   346: iconst_0
/*     */     //   347: istore #16
/*     */     //   349: new androidx/compose/ui/graphics/painter/BitmapPainter
/*     */     //   352: dup
/*     */     //   353: aload_0
/*     */     //   354: lconst_0
/*     */     //   355: lconst_0
/*     */     //   356: bipush #6
/*     */     //   358: aconst_null
/*     */     //   359: invokespecial <init> : (Landroidx/compose/ui/graphics/ImageBitmap;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   362: astore #17
/*     */     //   364: aload #11
/*     */     //   366: aload #17
/*     */     //   368: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   373: aload #17
/*     */     //   375: goto -> 380
/*     */     //   378: aload #14
/*     */     //   380: nop
/*     */     //   381: nop
/*     */     //   382: nop
/*     */     //   383: checkcast androidx/compose/ui/graphics/painter/BitmapPainter
/*     */     //   386: astore #10
/*     */     //   388: aload #5
/*     */     //   390: invokeinterface endReplaceGroup : ()V
/*     */     //   395: aload #10
/*     */     //   397: astore #9
/*     */     //   399: aload #9
/*     */     //   401: checkcast androidx/compose/ui/graphics/painter/Painter
/*     */     //   404: aload_1
/*     */     //   405: aload_2
/*     */     //   406: lload_3
/*     */     //   407: aload #5
/*     */     //   409: bipush #112
/*     */     //   411: iload #8
/*     */     //   413: iand
/*     */     //   414: sipush #896
/*     */     //   417: iload #8
/*     */     //   419: iand
/*     */     //   420: ior
/*     */     //   421: sipush #7168
/*     */     //   424: iload #8
/*     */     //   426: iand
/*     */     //   427: ior
/*     */     //   428: iconst_0
/*     */     //   429: invokestatic Icon-ww6aTOc : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V
/*     */     //   432: invokestatic isTraceInProgress : ()Z
/*     */     //   435: ifeq -> 451
/*     */     //   438: invokestatic traceEventEnd : ()V
/*     */     //   441: goto -> 451
/*     */     //   444: aload #5
/*     */     //   446: invokeinterface skipToGroupEnd : ()V
/*     */     //   451: aload #5
/*     */     //   453: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   458: dup
/*     */     //   459: ifnull -> 483
/*     */     //   462: aload_0
/*     */     //   463: aload_1
/*     */     //   464: aload_2
/*     */     //   465: lload_3
/*     */     //   466: iload #6
/*     */     //   468: iload #7
/*     */     //   470: <illegal opcode> invoke : (Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JII)Lkotlin/jvm/functions/Function2;
/*     */     //   475: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   480: goto -> 484
/*     */     //   483: pop
/*     */     //   484: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #248	-> 7
/*     */     //   #246	-> 251
/*     */     //   #247	-> 266
/*     */     //   #248	-> 288
/*     */     //   #249	-> 307
/*     */     //   #378	-> 318
/*     */     //   #379	-> 330
/*     */     //   #380	-> 346
/*     */     //   #249	-> 349
/*     */     //   #380	-> 362
/*     */     //   #381	-> 364
/*     */     //   #382	-> 373
/*     */     //   #383	-> 378
/*     */     //   #379	-> 380
/*     */     //   #378	-> 381
/*     */     //   #378	-> 382
/*     */     //   #249	-> 383
/*     */     //   #250	-> 399
/*     */     //   #251	-> 444
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   349	13	16	$i$a$-cache-IconKt$Icon$painter$9	I
/*     */     //   364	11	17	value$iv	Ljava/lang/Object;
/*     */     //   330	51	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   327	54	14	it$iv	Ljava/lang/Object;
/*     */     //   318	65	13	$i$f$cache	I
/*     */     //   315	68	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   315	68	12	invalid$iv	Z
/*     */     //   399	42	9	painter	Landroidx/compose/ui/graphics/painter/BitmapPainter;
/*     */     //   23	462	8	$dirty	I
/*     */     //   0	485	0	bitmap	Landroidx/compose/ui/graphics/ImageBitmap;
/*     */     //   0	485	1	contentDescription	Ljava/lang/String;
/*     */     //   0	485	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	485	3	tint	J
/*     */     //   0	485	5	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	485	6	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void Icon-ww6aTOc(@NotNull Painter painter, @Nullable String contentDescription, @Nullable Modifier modifier, long tint, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'painter'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #5
/*     */     //   9: ldc_w 311926498
/*     */     //   12: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   17: astore #5
/*     */     //   19: iload #6
/*     */     //   21: istore #8
/*     */     //   23: iload #7
/*     */     //   25: iconst_1
/*     */     //   26: iand
/*     */     //   27: ifeq -> 40
/*     */     //   30: iload #8
/*     */     //   32: bipush #6
/*     */     //   34: ior
/*     */     //   35: istore #8
/*     */     //   37: goto -> 69
/*     */     //   40: iload #6
/*     */     //   42: bipush #6
/*     */     //   44: iand
/*     */     //   45: ifne -> 69
/*     */     //   48: iload #8
/*     */     //   50: aload #5
/*     */     //   52: aload_0
/*     */     //   53: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   58: ifeq -> 65
/*     */     //   61: iconst_4
/*     */     //   62: goto -> 66
/*     */     //   65: iconst_2
/*     */     //   66: ior
/*     */     //   67: istore #8
/*     */     //   69: iload #7
/*     */     //   71: iconst_2
/*     */     //   72: iand
/*     */     //   73: ifeq -> 86
/*     */     //   76: iload #8
/*     */     //   78: bipush #48
/*     */     //   80: ior
/*     */     //   81: istore #8
/*     */     //   83: goto -> 117
/*     */     //   86: iload #6
/*     */     //   88: bipush #48
/*     */     //   90: iand
/*     */     //   91: ifne -> 117
/*     */     //   94: iload #8
/*     */     //   96: aload #5
/*     */     //   98: aload_1
/*     */     //   99: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   104: ifeq -> 112
/*     */     //   107: bipush #32
/*     */     //   109: goto -> 114
/*     */     //   112: bipush #16
/*     */     //   114: ior
/*     */     //   115: istore #8
/*     */     //   117: iload #7
/*     */     //   119: iconst_4
/*     */     //   120: iand
/*     */     //   121: ifeq -> 135
/*     */     //   124: iload #8
/*     */     //   126: sipush #384
/*     */     //   129: ior
/*     */     //   130: istore #8
/*     */     //   132: goto -> 169
/*     */     //   135: iload #6
/*     */     //   137: sipush #384
/*     */     //   140: iand
/*     */     //   141: ifne -> 169
/*     */     //   144: iload #8
/*     */     //   146: aload #5
/*     */     //   148: aload_2
/*     */     //   149: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   154: ifeq -> 163
/*     */     //   157: sipush #256
/*     */     //   160: goto -> 166
/*     */     //   163: sipush #128
/*     */     //   166: ior
/*     */     //   167: istore #8
/*     */     //   169: iload #7
/*     */     //   171: bipush #8
/*     */     //   173: iand
/*     */     //   174: ifeq -> 188
/*     */     //   177: iload #8
/*     */     //   179: sipush #3072
/*     */     //   182: ior
/*     */     //   183: istore #8
/*     */     //   185: goto -> 222
/*     */     //   188: iload #6
/*     */     //   190: sipush #3072
/*     */     //   193: iand
/*     */     //   194: ifne -> 222
/*     */     //   197: iload #8
/*     */     //   199: aload #5
/*     */     //   201: lload_3
/*     */     //   202: invokeinterface changed : (J)Z
/*     */     //   207: ifeq -> 216
/*     */     //   210: sipush #2048
/*     */     //   213: goto -> 219
/*     */     //   216: sipush #1024
/*     */     //   219: ior
/*     */     //   220: istore #8
/*     */     //   222: iload #8
/*     */     //   224: sipush #1171
/*     */     //   227: iand
/*     */     //   228: sipush #1170
/*     */     //   231: if_icmpne -> 244
/*     */     //   234: aload #5
/*     */     //   236: invokeinterface getSkipping : ()Z
/*     */     //   241: ifne -> 373
/*     */     //   244: iload #7
/*     */     //   246: iconst_4
/*     */     //   247: iand
/*     */     //   248: ifeq -> 258
/*     */     //   251: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   254: checkcast androidx/compose/ui/Modifier
/*     */     //   257: astore_2
/*     */     //   258: iload #7
/*     */     //   260: bipush #8
/*     */     //   262: iand
/*     */     //   263: ifeq -> 273
/*     */     //   266: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   269: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   272: lstore_3
/*     */     //   273: invokestatic isTraceInProgress : ()Z
/*     */     //   276: ifeq -> 291
/*     */     //   279: ldc_w 311926498
/*     */     //   282: iload #8
/*     */     //   284: iconst_m1
/*     */     //   285: ldc_w 'org.jetbrains.jewel.ui.component.Icon (Icon.kt:268)'
/*     */     //   288: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   291: lload_3
/*     */     //   292: lstore #10
/*     */     //   294: iconst_0
/*     */     //   295: istore #12
/*     */     //   297: lload #10
/*     */     //   299: ldc2_w 16
/*     */     //   302: lcmp
/*     */     //   303: ifeq -> 310
/*     */     //   306: iconst_1
/*     */     //   307: goto -> 311
/*     */     //   310: iconst_0
/*     */     //   311: ifeq -> 327
/*     */     //   314: getstatic androidx/compose/ui/graphics/ColorFilter.Companion : Landroidx/compose/ui/graphics/ColorFilter$Companion;
/*     */     //   317: lload_3
/*     */     //   318: iconst_0
/*     */     //   319: iconst_2
/*     */     //   320: aconst_null
/*     */     //   321: invokestatic tint-xETnrds$default : (Landroidx/compose/ui/graphics/ColorFilter$Companion;JIILjava/lang/Object;)Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   324: goto -> 328
/*     */     //   327: aconst_null
/*     */     //   328: astore #9
/*     */     //   330: aload_0
/*     */     //   331: aload_1
/*     */     //   332: aload #9
/*     */     //   334: aload_2
/*     */     //   335: aload #5
/*     */     //   337: bipush #14
/*     */     //   339: iload #8
/*     */     //   341: iand
/*     */     //   342: bipush #112
/*     */     //   344: iload #8
/*     */     //   346: iand
/*     */     //   347: ior
/*     */     //   348: sipush #7168
/*     */     //   351: iload #8
/*     */     //   353: iconst_3
/*     */     //   354: ishl
/*     */     //   355: iand
/*     */     //   356: ior
/*     */     //   357: iconst_0
/*     */     //   358: invokestatic Icon : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
/*     */     //   361: invokestatic isTraceInProgress : ()Z
/*     */     //   364: ifeq -> 380
/*     */     //   367: invokestatic traceEventEnd : ()V
/*     */     //   370: goto -> 380
/*     */     //   373: aload #5
/*     */     //   375: invokeinterface skipToGroupEnd : ()V
/*     */     //   380: aload #5
/*     */     //   382: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   387: dup
/*     */     //   388: ifnull -> 412
/*     */     //   391: aload_0
/*     */     //   392: aload_1
/*     */     //   393: aload_2
/*     */     //   394: lload_3
/*     */     //   395: iload #6
/*     */     //   397: iload #7
/*     */     //   399: <illegal opcode> invoke : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JII)Lkotlin/jvm/functions/Function2;
/*     */     //   404: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   409: goto -> 413
/*     */     //   412: pop
/*     */     //   413: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #269	-> 7
/*     */     //   #267	-> 251
/*     */     //   #268	-> 266
/*     */     //   #269	-> 288
/*     */     //   #270	-> 291
/*     */     //   #384	-> 297
/*     */     //   #270	-> 311
/*     */     //   #271	-> 330
/*     */     //   #272	-> 373
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   297	14	12	$i$f$isSpecified-8_81llA	I
/*     */     //   294	17	10	$this$isSpecified$iv	J
/*     */     //   330	40	9	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   23	391	8	$dirty	I
/*     */     //   0	414	0	painter	Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   0	414	1	contentDescription	Ljava/lang/String;
/*     */     //   0	414	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	414	3	tint	J
/*     */     //   0	414	5	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	414	6	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void Icon(@NotNull Painter painter, @Nullable String contentDescription, @Nullable ColorFilter colorFilter, @Nullable Modifier modifier, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'painter'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #4
/*     */     //   9: ldc_w -568749112
/*     */     //   12: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   17: astore #4
/*     */     //   19: iload #5
/*     */     //   21: istore #7
/*     */     //   23: iload #6
/*     */     //   25: iconst_1
/*     */     //   26: iand
/*     */     //   27: ifeq -> 40
/*     */     //   30: iload #7
/*     */     //   32: bipush #6
/*     */     //   34: ior
/*     */     //   35: istore #7
/*     */     //   37: goto -> 69
/*     */     //   40: iload #5
/*     */     //   42: bipush #6
/*     */     //   44: iand
/*     */     //   45: ifne -> 69
/*     */     //   48: iload #7
/*     */     //   50: aload #4
/*     */     //   52: aload_0
/*     */     //   53: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   58: ifeq -> 65
/*     */     //   61: iconst_4
/*     */     //   62: goto -> 66
/*     */     //   65: iconst_2
/*     */     //   66: ior
/*     */     //   67: istore #7
/*     */     //   69: iload #6
/*     */     //   71: iconst_2
/*     */     //   72: iand
/*     */     //   73: ifeq -> 86
/*     */     //   76: iload #7
/*     */     //   78: bipush #48
/*     */     //   80: ior
/*     */     //   81: istore #7
/*     */     //   83: goto -> 117
/*     */     //   86: iload #5
/*     */     //   88: bipush #48
/*     */     //   90: iand
/*     */     //   91: ifne -> 117
/*     */     //   94: iload #7
/*     */     //   96: aload #4
/*     */     //   98: aload_1
/*     */     //   99: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   104: ifeq -> 112
/*     */     //   107: bipush #32
/*     */     //   109: goto -> 114
/*     */     //   112: bipush #16
/*     */     //   114: ior
/*     */     //   115: istore #7
/*     */     //   117: iload #6
/*     */     //   119: iconst_4
/*     */     //   120: iand
/*     */     //   121: ifeq -> 135
/*     */     //   124: iload #7
/*     */     //   126: sipush #384
/*     */     //   129: ior
/*     */     //   130: istore #7
/*     */     //   132: goto -> 169
/*     */     //   135: iload #5
/*     */     //   137: sipush #384
/*     */     //   140: iand
/*     */     //   141: ifne -> 169
/*     */     //   144: iload #7
/*     */     //   146: aload #4
/*     */     //   148: aload_2
/*     */     //   149: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   154: ifeq -> 163
/*     */     //   157: sipush #256
/*     */     //   160: goto -> 166
/*     */     //   163: sipush #128
/*     */     //   166: ior
/*     */     //   167: istore #7
/*     */     //   169: iload #6
/*     */     //   171: bipush #8
/*     */     //   173: iand
/*     */     //   174: ifeq -> 188
/*     */     //   177: iload #7
/*     */     //   179: sipush #3072
/*     */     //   182: ior
/*     */     //   183: istore #7
/*     */     //   185: goto -> 222
/*     */     //   188: iload #5
/*     */     //   190: sipush #3072
/*     */     //   193: iand
/*     */     //   194: ifne -> 222
/*     */     //   197: iload #7
/*     */     //   199: aload #4
/*     */     //   201: aload_3
/*     */     //   202: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   207: ifeq -> 216
/*     */     //   210: sipush #2048
/*     */     //   213: goto -> 219
/*     */     //   216: sipush #1024
/*     */     //   219: ior
/*     */     //   220: istore #7
/*     */     //   222: iload #7
/*     */     //   224: sipush #1171
/*     */     //   227: iand
/*     */     //   228: sipush #1170
/*     */     //   231: if_icmpne -> 244
/*     */     //   234: aload #4
/*     */     //   236: invokeinterface getSkipping : ()Z
/*     */     //   241: ifne -> 501
/*     */     //   244: iload #6
/*     */     //   246: bipush #8
/*     */     //   248: iand
/*     */     //   249: ifeq -> 259
/*     */     //   252: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   255: checkcast androidx/compose/ui/Modifier
/*     */     //   258: astore_3
/*     */     //   259: invokestatic isTraceInProgress : ()Z
/*     */     //   262: ifeq -> 277
/*     */     //   265: ldc_w -568749112
/*     */     //   268: iload #7
/*     */     //   270: iconst_m1
/*     */     //   271: ldc_w 'org.jetbrains.jewel.ui.component.Icon (Icon.kt:289)'
/*     */     //   274: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   277: aload #4
/*     */     //   279: ldc_w 782257531
/*     */     //   282: invokeinterface startReplaceGroup : (I)V
/*     */     //   287: aload_1
/*     */     //   288: ifnull -> 424
/*     */     //   291: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   294: checkcast androidx/compose/ui/Modifier
/*     */     //   297: iconst_0
/*     */     //   298: aload #4
/*     */     //   300: ldc_w 782259498
/*     */     //   303: invokeinterface startReplaceGroup : (I)V
/*     */     //   308: aload #4
/*     */     //   310: astore #11
/*     */     //   312: iload #7
/*     */     //   314: bipush #112
/*     */     //   316: iand
/*     */     //   317: bipush #32
/*     */     //   319: if_icmpne -> 326
/*     */     //   322: iconst_1
/*     */     //   323: goto -> 327
/*     */     //   326: iconst_0
/*     */     //   327: istore #12
/*     */     //   329: iconst_0
/*     */     //   330: istore #13
/*     */     //   332: aload #11
/*     */     //   334: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   339: astore #14
/*     */     //   341: iconst_0
/*     */     //   342: istore #15
/*     */     //   344: iload #12
/*     */     //   346: ifne -> 360
/*     */     //   349: aload #14
/*     */     //   351: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   354: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   357: if_acmpne -> 397
/*     */     //   360: istore #19
/*     */     //   362: astore #18
/*     */     //   364: iconst_0
/*     */     //   365: istore #16
/*     */     //   367: aload_1
/*     */     //   368: <illegal opcode> invoke : (Ljava/lang/String;)Lkotlin/jvm/functions/Function1;
/*     */     //   373: astore #20
/*     */     //   375: aload #18
/*     */     //   377: iload #19
/*     */     //   379: aload #20
/*     */     //   381: astore #17
/*     */     //   383: aload #11
/*     */     //   385: aload #17
/*     */     //   387: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   392: aload #17
/*     */     //   394: goto -> 399
/*     */     //   397: aload #14
/*     */     //   399: nop
/*     */     //   400: nop
/*     */     //   401: nop
/*     */     //   402: checkcast kotlin/jvm/functions/Function1
/*     */     //   405: astore #10
/*     */     //   407: aload #4
/*     */     //   409: invokeinterface endReplaceGroup : ()V
/*     */     //   414: aload #10
/*     */     //   416: iconst_1
/*     */     //   417: aconst_null
/*     */     //   418: invokestatic semantics$default : (Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   421: goto -> 430
/*     */     //   424: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   427: checkcast androidx/compose/ui/Modifier
/*     */     //   430: astore #9
/*     */     //   432: aload #4
/*     */     //   434: invokeinterface endReplaceGroup : ()V
/*     */     //   439: aload #9
/*     */     //   441: astore #8
/*     */     //   443: aload_3
/*     */     //   444: invokestatic toolingGraphicsLayer : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   447: aload_0
/*     */     //   448: invokestatic defaultSizeFor : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;)Landroidx/compose/ui/Modifier;
/*     */     //   451: astore #9
/*     */     //   453: getstatic androidx/compose/ui/layout/ContentScale.Companion : Landroidx/compose/ui/layout/ContentScale$Companion;
/*     */     //   456: invokevirtual getFit : ()Landroidx/compose/ui/layout/ContentScale;
/*     */     //   459: astore #10
/*     */     //   461: aload #9
/*     */     //   463: aload_0
/*     */     //   464: iconst_0
/*     */     //   465: aconst_null
/*     */     //   466: aload #10
/*     */     //   468: fconst_0
/*     */     //   469: aload_2
/*     */     //   470: bipush #22
/*     */     //   472: aconst_null
/*     */     //   473: invokestatic paint$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   476: aload #8
/*     */     //   478: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   483: aload #4
/*     */     //   485: iconst_0
/*     */     //   486: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   489: invokestatic isTraceInProgress : ()Z
/*     */     //   492: ifeq -> 508
/*     */     //   495: invokestatic traceEventEnd : ()V
/*     */     //   498: goto -> 508
/*     */     //   501: aload #4
/*     */     //   503: invokeinterface skipToGroupEnd : ()V
/*     */     //   508: aload #4
/*     */     //   510: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   515: dup
/*     */     //   516: ifnull -> 540
/*     */     //   519: aload_0
/*     */     //   520: aload_1
/*     */     //   521: aload_2
/*     */     //   522: aload_3
/*     */     //   523: iload #5
/*     */     //   525: iload #6
/*     */     //   527: <illegal opcode> invoke : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Modifier;II)Lkotlin/jvm/functions/Function2;
/*     */     //   532: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   537: goto -> 541
/*     */     //   540: pop
/*     */     //   541: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #290	-> 7
/*     */     //   #289	-> 252
/*     */     //   #290	-> 274
/*     */     //   #292	-> 287
/*     */     //   #293	-> 291
/*     */     //   #385	-> 332
/*     */     //   #386	-> 344
/*     */     //   #387	-> 360
/*     */     //   #293	-> 367
/*     */     //   #387	-> 381
/*     */     //   #388	-> 383
/*     */     //   #389	-> 392
/*     */     //   #390	-> 397
/*     */     //   #386	-> 399
/*     */     //   #385	-> 400
/*     */     //   #385	-> 401
/*     */     //   #293	-> 402
/*     */     //   #298	-> 424
/*     */     //   #292	-> 430
/*     */     //   #291	-> 441
/*     */     //   #302	-> 443
/*     */     //   #303	-> 444
/*     */     //   #304	-> 447
/*     */     //   #305	-> 453
/*     */     //   #304	-> 461
/*     */     //   #305	-> 463
/*     */     //   #306	-> 476
/*     */     //   #301	-> 486
/*     */     //   #308	-> 501
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   367	6	16	$i$a$-cache-IconKt$Icon$semantics$1	I
/*     */     //   383	11	17	value$iv	Ljava/lang/Object;
/*     */     //   344	56	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   341	59	14	it$iv	Ljava/lang/Object;
/*     */     //   332	70	13	$i$f$cache	I
/*     */     //   329	73	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   329	73	12	invalid$iv	Z
/*     */     //   443	55	8	semantics	Landroidx/compose/ui/Modifier;
/*     */     //   23	519	7	$dirty	I
/*     */     //   0	542	0	painter	Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   0	542	1	contentDescription	Ljava/lang/String;
/*     */     //   0	542	2	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	542	3	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	542	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	542	5	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit Icon$lambda$25$lambda$24(String $contentDescription, SemanticsPropertyReceiver $this$semantics) {
/*     */     Intrinsics.checkNotNullParameter($this$semantics, "$this$semantics");
/*     */     SemanticsPropertiesKt.setContentDescription($this$semantics, $contentDescription);
/*     */     SemanticsPropertiesKt.setRole-kuIjeqM($this$semantics, Role.Companion.getImage-o7Vup1c());
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final Painter painterResource(@NotNull String resourcePath, @Nullable Composer $composer, int $changed) {
/*     */     Intrinsics.checkNotNullParameter(resourcePath, "resourcePath");
/*     */     $composer.startReplaceGroup(1527270348);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(1527270348, $changed, -1, "org.jetbrains.jewel.ui.component.painterResource (Icon.kt:311)"); 
/*     */     Intrinsics.checkNotNullExpressionValue(StringsKt.substringAfterLast$default(resourcePath, ".", null, 2, null).toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*     */     String str = StringsKt.substringAfterLast$default(resourcePath, ".", null, 2, null).toLowerCase(Locale.ROOT);
/*     */     $composer.startReplaceGroup(-66373732);
/*     */     Painter painter2 = rememberSvgResource(resourcePath, $composer, 0xE & $changed);
/*     */     $composer.endReplaceGroup();
/*     */     $composer.startReplaceGroup(-66372094);
/*     */     painter2 = rememberVectorXmlResource(resourcePath, $composer, 0xE & $changed);
/*     */     $composer.endReplaceGroup();
/*     */     $composer.startReplaceGroup(-66370305);
/*     */     painter2 = rememberBitmapResource(resourcePath, $composer, 0xE & $changed);
/*     */     $composer.endReplaceGroup();
/*     */     Painter painter1 = Intrinsics.areEqual(str, "svg") ? painter2 : (Intrinsics.areEqual(str, "xml") ? painter2 : painter2);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return painter1;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   private static final Painter rememberSvgResource(String path, Composer $composer, int $changed) {
/*     */     $composer.startReplaceGroup(-164032704);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-164032704, $changed, -1, "org.jetbrains.jewel.ui.component.rememberSvgResource (Icon.kt:319)"); 
/*     */     CompositionLocal compositionLocal = (CompositionLocal)CompositionLocalsKt.getLocalDensity();
/*     */     int $changed$iv = 0, $i$f$getCurrent = 0;
/*     */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
/*     */     Object object1 = $composer.consume(compositionLocal);
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     Density density = (Density)object1;
/*     */     $composer.startReplaceGroup(-198446730);
/*     */     Composer composer = $composer;
/*     */     int i = $composer.changed(density) | (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(path)) || ($changed & 0x6) == 4) ? 1 : 0), $i$f$cache = 0;
/*     */     Object it$iv = composer.rememberedValue();
/*     */     int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/*     */       int $i$a$-cache-IconKt$rememberSvgResource$1 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(readResourceBytes(path), "readResourceBytes(...)");
/*     */       Object value$iv = ImageDecoders_skikoKt.decodeToSvgPainter(readResourceBytes(path), density);
/*     */       composer.updateRememberedValue(value$iv);
/*     */     } 
/*     */     Painter painter2 = (Painter)it$iv;
/*     */     $composer.endReplaceGroup();
/*     */     Painter painter1 = painter2;
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return painter1;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   private static final Painter rememberVectorXmlResource(String path, Composer $composer, int $changed) {
/*     */     $composer.startReplaceGroup(271640464);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(271640464, $changed, -1, "org.jetbrains.jewel.ui.component.rememberVectorXmlResource (Icon.kt:326)"); 
/*     */     CompositionLocal compositionLocal = (CompositionLocal)CompositionLocalsKt.getLocalDensity();
/*     */     int $changed$iv = 0, $i$f$getCurrent = 0;
/*     */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
/*     */     Object object1 = $composer.consume(compositionLocal);
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     Density density = (Density)object1;
/*     */     $composer.startReplaceGroup(1438977895);
/*     */     Composer composer = $composer;
/*     */     int i = $composer.changed(density) | (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(path)) || ($changed & 0x6) == 4) ? 1 : 0), $i$f$cache = 0;
/*     */     Object it$iv = composer.rememberedValue();
/*     */     int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/*     */       int $i$a$-cache-IconKt$rememberVectorXmlResource$imageVector$1 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(readResourceBytes(path), "readResourceBytes(...)");
/*     */       Object value$iv = ImageDecodersKt.decodeToImageVector(readResourceBytes(path), density);
/*     */       composer.updateRememberedValue(value$iv);
/*     */     } 
/*     */     ImageVector imageVector1 = (ImageVector)it$iv;
/*     */     $composer.endReplaceGroup();
/*     */     ImageVector imageVector = imageVector1;
/*     */     VectorPainter vectorPainter = VectorPainterKt.rememberVectorPainter(imageVector, $composer, 0);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return (Painter)vectorPainter;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   private static final Painter rememberBitmapResource(String path, Composer $composer, int $changed) {
/*     */     $composer.startReplaceGroup(-1010737793);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-1010737793, $changed, -1, "org.jetbrains.jewel.ui.component.rememberBitmapResource (Icon.kt:335)"); 
/*     */     $composer.startReplaceGroup(855034903);
/*     */     Composer composer = $composer;
/*     */     boolean invalid$iv = ((($changed & 0xE ^ 0x6) > 4 && $composer.changed(path)) || ($changed & 0x6) == 4);
/*     */     int $i$f$cache = 0;
/*     */     Object it$iv = composer.rememberedValue();
/*     */     int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/*     */       int $i$a$-cache-IconKt$rememberBitmapResource$1 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(readResourceBytes(path), "readResourceBytes(...)");
/*     */       Object value$iv = new BitmapPainter(ImageDecodersKt.decodeToImageBitmap(readResourceBytes(path)), 0L, 0L, 6, null);
/*     */       composer.updateRememberedValue(value$iv);
/*     */     } 
/*     */     BitmapPainter bitmapPainter2 = (BitmapPainter)it$iv;
/*     */     $composer.endReplaceGroup();
/*     */     BitmapPainter bitmapPainter1 = bitmapPainter2;
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return (Painter)bitmapPainter1;
/*     */   }
/*     */   
/*     */   private static final byte[] readResourceBytes(String resourcePath) {
/*     */     if (ResourceLoader.INSTANCE.getClass().getClassLoader().getResourceAsStream(resourcePath) == null) {
/*     */       ResourceLoader.INSTANCE.getClass().getClassLoader().getResourceAsStream(resourcePath);
/*     */       int $i$a$-checkNotNull-IconKt$readResourceBytes$1 = 0;
/*     */       String str = "Could not load resource " + resourcePath + ": it does not exist or can't be read.";
/*     */       throw new IllegalStateException(str.toString());
/*     */     } 
/*     */     return ResourceLoader.INSTANCE.getClass().getClassLoader().getResourceAsStream(resourcePath).readAllBytes();
/*     */   }
/*     */   
/*     */   private static final Modifier defaultSizeFor(Modifier $this$defaultSizeFor, Painter painter) {
/*     */     Modifier modifier = $this$defaultSizeFor;
/*     */     boolean precondition$iv = (Size.equals-impl0(painter.getIntrinsicSize-NH-jbRc(), Size.Companion.getUnspecified-NH-jbRc()) || isInfinite-uvyYCjk(painter.getIntrinsicSize-NH-jbRc()));
/*     */     int $i$f$thenIf = 0;
/*     */     if (precondition$iv) {
/*     */       Modifier $this$defaultSizeFor_u24lambda_u2431 = modifier;
/*     */       int $i$a$-thenIf-IconKt$defaultSizeFor$1 = 0;
/*     */     } 
/*     */     return modifier;
/*     */   }
/*     */   
/*     */   private static final boolean isInfinite-uvyYCjk(long $this$isInfinite_u2duvyYCjk) {
/*     */     return (Float.isInfinite(Size.getWidth-impl($this$isInfinite_u2duvyYCjk)) && Float.isInfinite(Size.getHeight-impl($this$isInfinite_u2duvyYCjk)));
/*     */   }
/*     */   
/*     */   private static final Unit Icon$lambda$1(String $resource, String $contentDescription, Class<?> $iconClass, ColorFilter $colorFilter, Modifier $modifier, PainterHint[] $hints, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Icon($resource, $contentDescription, $iconClass, $colorFilter, $modifier, Arrays.<PainterHint>copyOf($hints, $hints.length), $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Icon$lambda$3(String $resource, String $contentDescription, Class<?> $iconClass, ColorFilter $colorFilter, Modifier $modifier, PainterHint $hint, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Icon($resource, $contentDescription, $iconClass, $colorFilter, $modifier, $hint, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Icon_FHprtrg$lambda$5(String $resource, String $contentDescription, Class<?> $iconClass, Modifier $modifier, long $tint, PainterHint[] $hints, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Icon-FHprtrg($resource, $contentDescription, $iconClass, $modifier, $tint, Arrays.<PainterHint>copyOf($hints, $hints.length), $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Icon_FHprtrg$lambda$7(String $resource, String $contentDescription, Class<?> $iconClass, Modifier $modifier, long $tint, PainterHint $hint, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Icon-FHprtrg($resource, $contentDescription, $iconClass, $modifier, $tint, $hint, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Icon_FHprtrg$lambda$10(IconKey $key, String $contentDescription, Modifier $modifier, Class<?> $iconClass, long $tint, PainterHint[] $hints, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Icon-FHprtrg($key, $contentDescription, $modifier, $iconClass, $tint, Arrays.<PainterHint>copyOf($hints, $hints.length), $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Icon_FHprtrg$lambda$13(IconKey $key, String $contentDescription, Modifier $modifier, Class<?> $iconClass, long $tint, PainterHint $hint, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Icon-FHprtrg($key, $contentDescription, $modifier, $iconClass, $tint, $hint, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Icon$lambda$16(IconKey $key, String $contentDescription, Modifier $modifier, Class<?> $iconClass, ColorFilter $colorFilter, PainterHint $hint, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Icon($key, $contentDescription, $modifier, $iconClass, $colorFilter, $hint, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Icon$lambda$19(IconKey $key, String $contentDescription, Modifier $modifier, Class<?> $iconClass, ColorFilter $colorFilter, PainterHint[] $hints, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Icon($key, $contentDescription, $modifier, $iconClass, $colorFilter, Arrays.<PainterHint>copyOf($hints, $hints.length), $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Icon_ww6aTOc$lambda$20(ImageVector $imageVector, String $contentDescription, Modifier $modifier, long $tint, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Icon-ww6aTOc($imageVector, $contentDescription, $modifier, $tint, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Icon_ww6aTOc$lambda$22(ImageBitmap $bitmap, String $contentDescription, Modifier $modifier, long $tint, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Icon-ww6aTOc($bitmap, $contentDescription, $modifier, $tint, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Icon_ww6aTOc$lambda$23(Painter $painter, String $contentDescription, Modifier $modifier, long $tint, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Icon-ww6aTOc($painter, $contentDescription, $modifier, $tint, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Icon$lambda$26(Painter $painter, String $contentDescription, ColorFilter $colorFilter, Modifier $modifier, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Icon($painter, $contentDescription, $colorFilter, $modifier, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\IconKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */