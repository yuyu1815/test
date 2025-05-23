/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.animation.core.AnimationSpecKt;
/*     */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*     */ import androidx.compose.animation.core.Transition;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.GraphicsLayerScope;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000@\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\020\007\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\n\002\b\003\032N\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\0022\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\027\020\t\032\023\022\004\022\002H\002\022\004\022\0020\0010\n¢\006\002\b\013H\007¢\006\002\020\f\032X\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\0022\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\b\b\002\020\r\032\0020\0162\027\020\t\032\023\022\004\022\002H\002\022\004\022\0020\0010\n¢\006\002\b\013H\007¢\006\002\020\017\032\001\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0202\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072%\b\002\020\021\032\037\022\023\022\021H\002¢\006\f\b\022\022\b\b\023\022\004\b\b(\003\022\006\022\004\030\0010\0240\n2&\020\t\032\"\022\023\022\021H\002¢\006\f\b\022\022\b\b\023\022\004\b\b(\003\022\004\022\0020\0010\n¢\006\002\b\013H\007¢\006\002\020\025¨\006\026²\006\020\020\027\032\0020\b\"\004\b\000\020\002X\002"}, d2 = {"Crossfade", "", "T", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "label", "", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "contentKey", "Lkotlin/ParameterName;", "name", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animation", "alpha"})
/*     */ @SourceDebugExtension({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,146:1\n1225#2,3:147\n1228#2,3:151\n1225#2,6:154\n1225#2,6:160\n1#3:150\n350#4,7:166\n33#5,6:173\n33#5,6:215\n71#6:179\n68#6,6:180\n74#6:214\n78#6:224\n79#7,6:186\n86#7,4:201\n90#7,2:211\n94#7:223\n368#8,9:192\n377#8:213\n378#8,2:221\n4034#9,6:205\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n*L\n105#1:147,3\n105#1:151,3\n106#1:154,6\n111#1:160,6\n117#1:166,7\n126#1:173,6\n139#1:215,6\n138#1:179\n138#1:180,6\n138#1:214\n138#1:224\n138#1:186,6\n138#1:201,4\n138#1:211,2\n138#1:223\n138#1:192,9\n138#1:213\n138#1:221,2\n138#1:205,6\n*E\n"})
/*     */ public final class CrossfadeKt
/*     */ {
/*     */   @Composable
/*     */   public static final <T> void Crossfade(Object targetState, @Nullable Modifier modifier, @Nullable FiniteAnimationSpec<Float> animationSpec, @Nullable String label, @NotNull Function3<? super T, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*  56 */     Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(-310686752); ComposerKt.sourceInformation($composer, "C(Crossfade)P(4,3!1,2)56@2327L36,57@2379L53:Crossfade.kt#xbi5r1"); int $dirty = $changed; if ((paramInt1 & 0x1) != 0) { $dirty |= 0x6; } else if (($changed & 0x6) == 0) { $dirty |= ((($changed & 0x8) == 0) ? $composer.changed(targetState) : $composer.changedInstance(targetState)) ? 4 : 2; }  if ((paramInt1 & 0x2) != 0) { $dirty |= 0x30; } else if (($changed & 0x30) == 0) { $dirty |= $composer.changed(modifier) ? 32 : 16; }  if ((paramInt1 & 0x4) != 0) { $dirty |= 0x180; } else if (($changed & 0x180) == 0) { $dirty |= $composer.changedInstance(animationSpec) ? 256 : 128; }  if ((paramInt1 & 0x8) != 0) { $dirty |= 0xC00; } else if (($changed & 0xC00) == 0) { $dirty |= $composer.changed(label) ? 2048 : 1024; }  if ((paramInt1 & 0x10) != 0) { $dirty |= 0x6000; } else if (($changed & 0x6000) == 0) { $dirty |= $composer.changedInstance(content) ? 16384 : 8192; }  if (($dirty & 0x2493) != 9362 || !$composer.getSkipping()) { if ((paramInt1 & 0x2) != 0)
/*     */         modifier = (Modifier)Modifier.Companion;  if ((paramInt1 & 0x4) != 0)
/*     */         animationSpec = (FiniteAnimationSpec)AnimationSpecKt.tween$default(0, 0, null, 7, null);  }
/*  59 */      $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new CrossfadeKt$Crossfade$1((T)targetState, modifier, animationSpec, label, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
/*     */   
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
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class CrossfadeKt$Crossfade$3
/*     */     extends Lambda
/*     */     implements Function1<T, T>
/*     */   {
/*     */     public static final CrossfadeKt$Crossfade$3 INSTANCE = new CrossfadeKt$Crossfade$3();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     CrossfadeKt$Crossfade$3() {
/*     */       super(1);
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
/*     */     public final T invoke(Object it) {
/* 102 */       return (T)it;
/*     */     } } @ExperimentalAnimationApi
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final <T> void Crossfade(@NotNull Transition $this$Crossfade, @Nullable Modifier modifier, @Nullable FiniteAnimationSpec animationSpec, @Nullable Function1 contentKey, @NotNull Function3 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #4
/*     */     //   8: ldc 'content'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #5
/*     */     //   15: ldc 679005231
/*     */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   22: astore #5
/*     */     //   24: aload #5
/*     */     //   26: ldc 'C(Crossfade)P(3!1,2)104@4422L64,105@4508L61,137@5785L159:Crossfade.kt#xbi5r1'
/*     */     //   28: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   31: iload #6
/*     */     //   33: istore #8
/*     */     //   35: iload #7
/*     */     //   37: ldc -2147483648
/*     */     //   39: iand
/*     */     //   40: ifeq -> 53
/*     */     //   43: iload #8
/*     */     //   45: bipush #6
/*     */     //   47: ior
/*     */     //   48: istore #8
/*     */     //   50: goto -> 82
/*     */     //   53: iload #6
/*     */     //   55: bipush #6
/*     */     //   57: iand
/*     */     //   58: ifne -> 82
/*     */     //   61: iload #8
/*     */     //   63: aload #5
/*     */     //   65: aload_0
/*     */     //   66: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   71: ifeq -> 78
/*     */     //   74: iconst_4
/*     */     //   75: goto -> 79
/*     */     //   78: iconst_2
/*     */     //   79: ior
/*     */     //   80: istore #8
/*     */     //   82: iload #7
/*     */     //   84: iconst_1
/*     */     //   85: iand
/*     */     //   86: ifeq -> 99
/*     */     //   89: iload #8
/*     */     //   91: bipush #48
/*     */     //   93: ior
/*     */     //   94: istore #8
/*     */     //   96: goto -> 130
/*     */     //   99: iload #6
/*     */     //   101: bipush #48
/*     */     //   103: iand
/*     */     //   104: ifne -> 130
/*     */     //   107: iload #8
/*     */     //   109: aload #5
/*     */     //   111: aload_1
/*     */     //   112: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   117: ifeq -> 125
/*     */     //   120: bipush #32
/*     */     //   122: goto -> 127
/*     */     //   125: bipush #16
/*     */     //   127: ior
/*     */     //   128: istore #8
/*     */     //   130: iload #7
/*     */     //   132: iconst_2
/*     */     //   133: iand
/*     */     //   134: ifeq -> 148
/*     */     //   137: iload #8
/*     */     //   139: sipush #384
/*     */     //   142: ior
/*     */     //   143: istore #8
/*     */     //   145: goto -> 182
/*     */     //   148: iload #6
/*     */     //   150: sipush #384
/*     */     //   153: iand
/*     */     //   154: ifne -> 182
/*     */     //   157: iload #8
/*     */     //   159: aload #5
/*     */     //   161: aload_2
/*     */     //   162: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   167: ifeq -> 176
/*     */     //   170: sipush #256
/*     */     //   173: goto -> 179
/*     */     //   176: sipush #128
/*     */     //   179: ior
/*     */     //   180: istore #8
/*     */     //   182: iload #7
/*     */     //   184: iconst_4
/*     */     //   185: iand
/*     */     //   186: ifeq -> 200
/*     */     //   189: iload #8
/*     */     //   191: sipush #3072
/*     */     //   194: ior
/*     */     //   195: istore #8
/*     */     //   197: goto -> 234
/*     */     //   200: iload #6
/*     */     //   202: sipush #3072
/*     */     //   205: iand
/*     */     //   206: ifne -> 234
/*     */     //   209: iload #8
/*     */     //   211: aload #5
/*     */     //   213: aload_3
/*     */     //   214: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   219: ifeq -> 228
/*     */     //   222: sipush #2048
/*     */     //   225: goto -> 231
/*     */     //   228: sipush #1024
/*     */     //   231: ior
/*     */     //   232: istore #8
/*     */     //   234: iload #7
/*     */     //   236: bipush #8
/*     */     //   238: iand
/*     */     //   239: ifeq -> 253
/*     */     //   242: iload #8
/*     */     //   244: sipush #24576
/*     */     //   247: ior
/*     */     //   248: istore #8
/*     */     //   250: goto -> 288
/*     */     //   253: iload #6
/*     */     //   255: sipush #24576
/*     */     //   258: iand
/*     */     //   259: ifne -> 288
/*     */     //   262: iload #8
/*     */     //   264: aload #5
/*     */     //   266: aload #4
/*     */     //   268: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   273: ifeq -> 282
/*     */     //   276: sipush #16384
/*     */     //   279: goto -> 285
/*     */     //   282: sipush #8192
/*     */     //   285: ior
/*     */     //   286: istore #8
/*     */     //   288: iload #8
/*     */     //   290: sipush #9363
/*     */     //   293: iand
/*     */     //   294: sipush #9362
/*     */     //   297: if_icmpne -> 310
/*     */     //   300: aload #5
/*     */     //   302: invokeinterface getSkipping : ()Z
/*     */     //   307: ifne -> 1565
/*     */     //   310: iload #7
/*     */     //   312: iconst_1
/*     */     //   313: iand
/*     */     //   314: ifeq -> 324
/*     */     //   317: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   320: checkcast androidx/compose/ui/Modifier
/*     */     //   323: astore_1
/*     */     //   324: iload #7
/*     */     //   326: iconst_2
/*     */     //   327: iand
/*     */     //   328: ifeq -> 344
/*     */     //   331: iconst_0
/*     */     //   332: iconst_0
/*     */     //   333: aconst_null
/*     */     //   334: bipush #7
/*     */     //   336: aconst_null
/*     */     //   337: invokestatic tween$default : (IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;
/*     */     //   340: checkcast androidx/compose/animation/core/FiniteAnimationSpec
/*     */     //   343: astore_2
/*     */     //   344: iload #7
/*     */     //   346: iconst_4
/*     */     //   347: iand
/*     */     //   348: ifeq -> 358
/*     */     //   351: getstatic androidx/compose/animation/CrossfadeKt$Crossfade$3.INSTANCE : Landroidx/compose/animation/CrossfadeKt$Crossfade$3;
/*     */     //   354: checkcast kotlin/jvm/functions/Function1
/*     */     //   357: astore_3
/*     */     //   358: invokestatic isTraceInProgress : ()Z
/*     */     //   361: ifeq -> 374
/*     */     //   364: ldc 679005231
/*     */     //   366: iload #8
/*     */     //   368: iconst_m1
/*     */     //   369: ldc 'androidx.compose.animation.Crossfade (Crossfade.kt:103)'
/*     */     //   371: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   374: aload #5
/*     */     //   376: ldc 1274683025
/*     */     //   378: ldc 'CC(remember):Crossfade.kt#9igjgp'
/*     */     //   380: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   383: aload #5
/*     */     //   385: astore #11
/*     */     //   387: iconst_0
/*     */     //   388: istore #12
/*     */     //   390: iconst_0
/*     */     //   391: istore #13
/*     */     //   393: aload #11
/*     */     //   395: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   400: astore #14
/*     */     //   402: iconst_0
/*     */     //   403: istore #15
/*     */     //   405: aload #14
/*     */     //   407: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   410: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   413: if_acmpne -> 460
/*     */     //   416: iconst_0
/*     */     //   417: istore #16
/*     */     //   419: invokestatic mutableStateListOf : ()Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*     */     //   422: astore #17
/*     */     //   424: aload #17
/*     */     //   426: astore #18
/*     */     //   428: iconst_0
/*     */     //   429: istore #19
/*     */     //   431: aload #18
/*     */     //   433: aload_0
/*     */     //   434: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   437: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   440: pop
/*     */     //   441: aload #17
/*     */     //   443: nop
/*     */     //   444: astore #20
/*     */     //   446: aload #11
/*     */     //   448: aload #20
/*     */     //   450: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   455: aload #20
/*     */     //   457: goto -> 462
/*     */     //   460: aload #14
/*     */     //   462: nop
/*     */     //   463: nop
/*     */     //   464: nop
/*     */     //   465: checkcast androidx/compose/runtime/snapshots/SnapshotStateList
/*     */     //   468: astore #10
/*     */     //   470: aload #5
/*     */     //   472: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   475: aload #10
/*     */     //   477: astore #9
/*     */     //   479: aload #5
/*     */     //   481: ldc 1274685774
/*     */     //   483: ldc 'CC(remember):Crossfade.kt#9igjgp'
/*     */     //   485: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   488: aload #5
/*     */     //   490: astore #12
/*     */     //   492: iconst_0
/*     */     //   493: istore #13
/*     */     //   495: iconst_0
/*     */     //   496: istore #14
/*     */     //   498: aload #12
/*     */     //   500: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   505: astore #15
/*     */     //   507: iconst_0
/*     */     //   508: istore #16
/*     */     //   510: aload #15
/*     */     //   512: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   515: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   518: if_acmpne -> 543
/*     */     //   521: iconst_0
/*     */     //   522: istore #17
/*     */     //   524: invokestatic mutableScatterMapOf : ()Landroidx/collection/MutableScatterMap;
/*     */     //   527: astore #17
/*     */     //   529: aload #12
/*     */     //   531: aload #17
/*     */     //   533: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   538: aload #17
/*     */     //   540: goto -> 545
/*     */     //   543: aload #15
/*     */     //   545: nop
/*     */     //   546: nop
/*     */     //   547: nop
/*     */     //   548: checkcast androidx/collection/MutableScatterMap
/*     */     //   551: astore #11
/*     */     //   553: aload #5
/*     */     //   555: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   558: aload #11
/*     */     //   560: astore #10
/*     */     //   562: aload #5
/*     */     //   564: ldc 1274688202
/*     */     //   566: invokeinterface startReplaceGroup : (I)V
/*     */     //   571: aload #5
/*     */     //   573: ldc '110@4883L21'
/*     */     //   575: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   578: aload_0
/*     */     //   579: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   582: aload_0
/*     */     //   583: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   586: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   589: ifeq -> 743
/*     */     //   592: aload #9
/*     */     //   594: invokevirtual size : ()I
/*     */     //   597: iconst_1
/*     */     //   598: if_icmpne -> 617
/*     */     //   601: aload #9
/*     */     //   603: iconst_0
/*     */     //   604: invokevirtual get : (I)Ljava/lang/Object;
/*     */     //   607: aload_0
/*     */     //   608: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   611: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   614: ifne -> 743
/*     */     //   617: aload #9
/*     */     //   619: checkcast java/util/List
/*     */     //   622: aload #5
/*     */     //   624: ldc 1274697734
/*     */     //   626: ldc 'CC(remember):Crossfade.kt#9igjgp'
/*     */     //   628: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   631: aload #5
/*     */     //   633: astore #12
/*     */     //   635: iload #8
/*     */     //   637: bipush #14
/*     */     //   639: iand
/*     */     //   640: iconst_4
/*     */     //   641: if_icmpne -> 648
/*     */     //   644: iconst_1
/*     */     //   645: goto -> 649
/*     */     //   648: iconst_0
/*     */     //   649: istore #13
/*     */     //   651: iconst_0
/*     */     //   652: istore #14
/*     */     //   654: aload #12
/*     */     //   656: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   661: astore #15
/*     */     //   663: iconst_0
/*     */     //   664: istore #16
/*     */     //   666: iload #13
/*     */     //   668: ifne -> 682
/*     */     //   671: aload #15
/*     */     //   673: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   676: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   679: if_acmpne -> 717
/*     */     //   682: astore #44
/*     */     //   684: iconst_0
/*     */     //   685: istore #17
/*     */     //   687: new androidx/compose/animation/CrossfadeKt$Crossfade$4$1
/*     */     //   690: dup
/*     */     //   691: aload_0
/*     */     //   692: invokespecial <init> : (Landroidx/compose/animation/core/Transition;)V
/*     */     //   695: checkcast kotlin/jvm/functions/Function1
/*     */     //   698: aload #44
/*     */     //   700: swap
/*     */     //   701: astore #18
/*     */     //   703: aload #12
/*     */     //   705: aload #18
/*     */     //   707: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   712: aload #18
/*     */     //   714: goto -> 719
/*     */     //   717: aload #15
/*     */     //   719: nop
/*     */     //   720: nop
/*     */     //   721: nop
/*     */     //   722: checkcast kotlin/jvm/functions/Function1
/*     */     //   725: astore #11
/*     */     //   727: aload #5
/*     */     //   729: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   732: aload #11
/*     */     //   734: invokestatic removeAll : (Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z
/*     */     //   737: pop
/*     */     //   738: aload #10
/*     */     //   740: invokevirtual clear : ()V
/*     */     //   743: aload #5
/*     */     //   745: invokeinterface endReplaceGroup : ()V
/*     */     //   750: aload #5
/*     */     //   752: ldc_w 1274700872
/*     */     //   755: invokeinterface startReplaceGroup : (I)V
/*     */     //   760: aload #5
/*     */     //   762: ldc_w '*126@5458L305'
/*     */     //   765: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   768: aload #10
/*     */     //   770: aload_0
/*     */     //   771: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   774: invokevirtual contains : (Ljava/lang/Object;)Z
/*     */     //   777: ifne -> 990
/*     */     //   780: aload #9
/*     */     //   782: checkcast java/util/List
/*     */     //   785: astore #12
/*     */     //   787: iconst_0
/*     */     //   788: istore #13
/*     */     //   790: iconst_0
/*     */     //   791: istore #14
/*     */     //   793: aload #12
/*     */     //   795: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   800: astore #15
/*     */     //   802: aload #15
/*     */     //   804: invokeinterface hasNext : ()Z
/*     */     //   809: ifeq -> 863
/*     */     //   812: aload #15
/*     */     //   814: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   819: astore #16
/*     */     //   821: aload #16
/*     */     //   823: astore #17
/*     */     //   825: iconst_0
/*     */     //   826: istore #18
/*     */     //   828: aload_3
/*     */     //   829: aload #17
/*     */     //   831: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   836: aload_3
/*     */     //   837: aload_0
/*     */     //   838: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   841: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   846: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   849: ifeq -> 857
/*     */     //   852: iload #14
/*     */     //   854: goto -> 864
/*     */     //   857: iinc #14, 1
/*     */     //   860: goto -> 802
/*     */     //   863: iconst_m1
/*     */     //   864: istore #11
/*     */     //   866: iload #11
/*     */     //   868: iconst_m1
/*     */     //   869: if_icmpne -> 885
/*     */     //   872: aload #9
/*     */     //   874: aload_0
/*     */     //   875: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   878: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   881: pop
/*     */     //   882: goto -> 897
/*     */     //   885: aload #9
/*     */     //   887: iload #11
/*     */     //   889: aload_0
/*     */     //   890: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   893: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   896: pop
/*     */     //   897: aload #10
/*     */     //   899: invokevirtual clear : ()V
/*     */     //   902: aload #9
/*     */     //   904: checkcast java/util/List
/*     */     //   907: astore #12
/*     */     //   909: iconst_0
/*     */     //   910: istore #13
/*     */     //   912: nop
/*     */     //   913: iconst_0
/*     */     //   914: istore #14
/*     */     //   916: aload #12
/*     */     //   918: invokeinterface size : ()I
/*     */     //   923: istore #15
/*     */     //   925: iload #14
/*     */     //   927: iload #15
/*     */     //   929: if_icmpge -> 989
/*     */     //   932: aload #12
/*     */     //   934: iload #14
/*     */     //   936: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   941: astore #16
/*     */     //   943: aload #16
/*     */     //   945: astore #17
/*     */     //   947: iconst_0
/*     */     //   948: istore #18
/*     */     //   950: aload #10
/*     */     //   952: aload #17
/*     */     //   954: ldc_w -1426421288
/*     */     //   957: iconst_1
/*     */     //   958: new androidx/compose/animation/CrossfadeKt$Crossfade$5$1
/*     */     //   961: dup
/*     */     //   962: aload_0
/*     */     //   963: aload_2
/*     */     //   964: aload #17
/*     */     //   966: aload #4
/*     */     //   968: invokespecial <init> : (Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V
/*     */     //   971: aload #5
/*     */     //   973: bipush #54
/*     */     //   975: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   978: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   981: nop
/*     */     //   982: nop
/*     */     //   983: iinc #14, 1
/*     */     //   986: goto -> 925
/*     */     //   989: nop
/*     */     //   990: aload #5
/*     */     //   992: invokeinterface endReplaceGroup : ()V
/*     */     //   997: bipush #14
/*     */     //   999: iload #8
/*     */     //   1001: iconst_3
/*     */     //   1002: ishr
/*     */     //   1003: iand
/*     */     //   1004: istore #13
/*     */     //   1006: nop
/*     */     //   1007: iconst_0
/*     */     //   1008: istore #14
/*     */     //   1010: aload #5
/*     */     //   1012: ldc_w 733328855
/*     */     //   1015: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1018: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1021: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1024: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   1027: astore #11
/*     */     //   1029: iconst_0
/*     */     //   1030: istore #12
/*     */     //   1032: aload #11
/*     */     //   1034: iload #12
/*     */     //   1036: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1039: astore #15
/*     */     //   1041: bipush #112
/*     */     //   1043: iload #13
/*     */     //   1045: iconst_3
/*     */     //   1046: ishl
/*     */     //   1047: iand
/*     */     //   1048: istore #16
/*     */     //   1050: nop
/*     */     //   1051: iconst_0
/*     */     //   1052: istore #17
/*     */     //   1054: aload #5
/*     */     //   1056: ldc_w -1323940314
/*     */     //   1059: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1062: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1065: aload #5
/*     */     //   1067: iconst_0
/*     */     //   1068: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1071: istore #18
/*     */     //   1073: aload #5
/*     */     //   1075: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1080: astore #19
/*     */     //   1082: aload #5
/*     */     //   1084: aload_1
/*     */     //   1085: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1088: astore #20
/*     */     //   1090: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1093: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1096: astore #21
/*     */     //   1098: bipush #6
/*     */     //   1100: sipush #896
/*     */     //   1103: iload #16
/*     */     //   1105: bipush #6
/*     */     //   1107: ishl
/*     */     //   1108: iand
/*     */     //   1109: ior
/*     */     //   1110: istore #22
/*     */     //   1112: nop
/*     */     //   1113: iconst_0
/*     */     //   1114: istore #23
/*     */     //   1116: aload #5
/*     */     //   1118: ldc_w -692256719
/*     */     //   1121: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1124: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1127: aload #5
/*     */     //   1129: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1134: instanceof androidx/compose/runtime/Applier
/*     */     //   1137: ifne -> 1143
/*     */     //   1140: invokestatic invalidApplier : ()V
/*     */     //   1143: aload #5
/*     */     //   1145: invokeinterface startReusableNode : ()V
/*     */     //   1150: aload #5
/*     */     //   1152: invokeinterface getInserting : ()Z
/*     */     //   1157: ifeq -> 1172
/*     */     //   1160: aload #5
/*     */     //   1162: aload #21
/*     */     //   1164: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1169: goto -> 1179
/*     */     //   1172: aload #5
/*     */     //   1174: invokeinterface useNode : ()V
/*     */     //   1179: aload #5
/*     */     //   1181: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1184: astore #24
/*     */     //   1186: iconst_0
/*     */     //   1187: istore #25
/*     */     //   1189: aload #24
/*     */     //   1191: aload #15
/*     */     //   1193: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1196: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1199: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1202: aload #24
/*     */     //   1204: aload #19
/*     */     //   1206: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1209: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1212: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1215: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1218: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1221: astore #26
/*     */     //   1223: iconst_0
/*     */     //   1224: istore #27
/*     */     //   1226: aload #24
/*     */     //   1228: astore #28
/*     */     //   1230: iconst_0
/*     */     //   1231: istore #29
/*     */     //   1233: aload #28
/*     */     //   1235: invokeinterface getInserting : ()Z
/*     */     //   1240: ifne -> 1261
/*     */     //   1243: aload #28
/*     */     //   1245: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1250: iload #18
/*     */     //   1252: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1255: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1258: ifne -> 1287
/*     */     //   1261: aload #28
/*     */     //   1263: iload #18
/*     */     //   1265: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1268: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1273: aload #24
/*     */     //   1275: iload #18
/*     */     //   1277: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1280: aload #26
/*     */     //   1282: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1287: nop
/*     */     //   1288: nop
/*     */     //   1289: nop
/*     */     //   1290: aload #24
/*     */     //   1292: aload #20
/*     */     //   1294: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1297: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1300: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1303: nop
/*     */     //   1304: nop
/*     */     //   1305: aload #5
/*     */     //   1307: bipush #14
/*     */     //   1309: iload #22
/*     */     //   1311: bipush #6
/*     */     //   1313: ishr
/*     */     //   1314: iand
/*     */     //   1315: istore #30
/*     */     //   1317: astore #31
/*     */     //   1319: iconst_0
/*     */     //   1320: istore #32
/*     */     //   1322: aload #31
/*     */     //   1324: ldc_w -2146769399
/*     */     //   1327: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1330: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1333: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1336: aload #31
/*     */     //   1338: bipush #6
/*     */     //   1340: bipush #112
/*     */     //   1342: iload #13
/*     */     //   1344: bipush #6
/*     */     //   1346: ishr
/*     */     //   1347: iand
/*     */     //   1348: ior
/*     */     //   1349: istore #33
/*     */     //   1351: astore #34
/*     */     //   1353: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1356: astore #35
/*     */     //   1358: iconst_0
/*     */     //   1359: istore #36
/*     */     //   1361: aload #34
/*     */     //   1363: ldc_w -1517004430
/*     */     //   1366: ldc_w 'C:Crossfade.kt#xbi5r1'
/*     */     //   1369: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1372: aload #34
/*     */     //   1374: ldc_w -187482432
/*     */     //   1377: invokeinterface startReplaceGroup : (I)V
/*     */     //   1382: aload #34
/*     */     //   1384: ldc_w ''
/*     */     //   1387: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   1390: aload #9
/*     */     //   1392: checkcast java/util/List
/*     */     //   1395: astore #37
/*     */     //   1397: iconst_0
/*     */     //   1398: istore #38
/*     */     //   1400: nop
/*     */     //   1401: iconst_0
/*     */     //   1402: istore #39
/*     */     //   1404: aload #37
/*     */     //   1406: invokeinterface size : ()I
/*     */     //   1411: istore #40
/*     */     //   1413: iload #39
/*     */     //   1415: iload #40
/*     */     //   1417: if_icmpge -> 1509
/*     */     //   1420: aload #37
/*     */     //   1422: iload #39
/*     */     //   1424: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1429: astore #41
/*     */     //   1431: aload #41
/*     */     //   1433: astore #42
/*     */     //   1435: iconst_0
/*     */     //   1436: istore #43
/*     */     //   1438: aload #34
/*     */     //   1440: ldc_w -1081873445
/*     */     //   1443: aload_3
/*     */     //   1444: aload #42
/*     */     //   1446: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1451: invokeinterface startMovableGroup : (ILjava/lang/Object;)V
/*     */     //   1456: aload #34
/*     */     //   1458: ldc_w '140@5906L8'
/*     */     //   1461: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   1464: aload #10
/*     */     //   1466: aload #42
/*     */     //   1468: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1471: checkcast kotlin/jvm/functions/Function2
/*     */     //   1474: dup
/*     */     //   1475: ifnonnull -> 1482
/*     */     //   1478: pop
/*     */     //   1479: goto -> 1494
/*     */     //   1482: aload #34
/*     */     //   1484: iconst_0
/*     */     //   1485: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1488: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1493: pop
/*     */     //   1494: aload #34
/*     */     //   1496: invokeinterface endMovableGroup : ()V
/*     */     //   1501: nop
/*     */     //   1502: nop
/*     */     //   1503: iinc #39, 1
/*     */     //   1506: goto -> 1413
/*     */     //   1509: nop
/*     */     //   1510: aload #34
/*     */     //   1512: invokeinterface endReplaceGroup : ()V
/*     */     //   1517: aload #34
/*     */     //   1519: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1522: nop
/*     */     //   1523: aload #31
/*     */     //   1525: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1528: aload #5
/*     */     //   1530: invokeinterface endNode : ()V
/*     */     //   1535: aload #5
/*     */     //   1537: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1540: nop
/*     */     //   1541: aload #5
/*     */     //   1543: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1546: nop
/*     */     //   1547: aload #5
/*     */     //   1549: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1552: nop
/*     */     //   1553: invokestatic isTraceInProgress : ()Z
/*     */     //   1556: ifeq -> 1572
/*     */     //   1559: invokestatic traceEventEnd : ()V
/*     */     //   1562: goto -> 1572
/*     */     //   1565: aload #5
/*     */     //   1567: invokeinterface skipToGroupEnd : ()V
/*     */     //   1572: aload #5
/*     */     //   1574: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1579: dup
/*     */     //   1580: ifnull -> 1611
/*     */     //   1583: new androidx/compose/animation/CrossfadeKt$Crossfade$7
/*     */     //   1586: dup
/*     */     //   1587: aload_0
/*     */     //   1588: aload_1
/*     */     //   1589: aload_2
/*     */     //   1590: aload_3
/*     */     //   1591: aload #4
/*     */     //   1593: iload #6
/*     */     //   1595: iload #7
/*     */     //   1597: invokespecial <init> : (Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;II)V
/*     */     //   1600: checkcast kotlin/jvm/functions/Function2
/*     */     //   1603: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1608: goto -> 1612
/*     */     //   1611: pop
/*     */     //   1612: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #104	-> 13
/*     */     //   #100	-> 317
/*     */     //   #101	-> 331
/*     */     //   #102	-> 351
/*     */     //   #104	-> 371
/*     */     //   #105	-> 380
/*     */     //   #147	-> 393
/*     */     //   #148	-> 405
/*     */     //   #149	-> 416
/*     */     //   #105	-> 419
/*     */     //   #150	-> 428
/*     */     //   #105	-> 431
/*     */     //   #105	-> 441
/*     */     //   #105	-> 443
/*     */     //   #149	-> 444
/*     */     //   #151	-> 446
/*     */     //   #152	-> 455
/*     */     //   #153	-> 460
/*     */     //   #148	-> 462
/*     */     //   #147	-> 463
/*     */     //   #147	-> 464
/*     */     //   #105	-> 465
/*     */     //   #106	-> 485
/*     */     //   #154	-> 498
/*     */     //   #155	-> 510
/*     */     //   #156	-> 521
/*     */     //   #106	-> 524
/*     */     //   #156	-> 527
/*     */     //   #157	-> 529
/*     */     //   #158	-> 538
/*     */     //   #159	-> 543
/*     */     //   #155	-> 545
/*     */     //   #154	-> 546
/*     */     //   #154	-> 547
/*     */     //   #106	-> 548
/*     */     //   #107	-> 578
/*     */     //   #109	-> 592
/*     */     //   #111	-> 617
/*     */     //   #160	-> 654
/*     */     //   #161	-> 666
/*     */     //   #162	-> 682
/*     */     //   #111	-> 687
/*     */     //   #162	-> 701
/*     */     //   #163	-> 703
/*     */     //   #164	-> 712
/*     */     //   #165	-> 717
/*     */     //   #161	-> 719
/*     */     //   #160	-> 720
/*     */     //   #160	-> 721
/*     */     //   #111	-> 722
/*     */     //   #112	-> 738
/*     */     //   #115	-> 768
/*     */     //   #117	-> 780
/*     */     //   #166	-> 790
/*     */     //   #167	-> 793
/*     */     //   #168	-> 821
/*     */     //   #118	-> 828
/*     */     //   #168	-> 849
/*     */     //   #169	-> 852
/*     */     //   #170	-> 857
/*     */     //   #172	-> 863
/*     */     //   #117	-> 864
/*     */     //   #120	-> 866
/*     */     //   #121	-> 872
/*     */     //   #123	-> 885
/*     */     //   #125	-> 897
/*     */     //   #126	-> 902
/*     */     //   #173	-> 912
/*     */     //   #174	-> 913
/*     */     //   #175	-> 932
/*     */     //   #176	-> 943
/*     */     //   #127	-> 950
/*     */     //   #135	-> 981
/*     */     //   #176	-> 982
/*     */     //   #174	-> 983
/*     */     //   #178	-> 989
/*     */     //   #138	-> 1006
/*     */     //   #179	-> 1018
/*     */     //   #180	-> 1021
/*     */     //   #181	-> 1029
/*     */     //   #184	-> 1032
/*     */     //   #185	-> 1050
/*     */     //   #186	-> 1062
/*     */     //   #187	-> 1068
/*     */     //   #188	-> 1075
/*     */     //   #189	-> 1084
/*     */     //   #191	-> 1090
/*     */     //   #190	-> 1112
/*     */     //   #192	-> 1124
/*     */     //   #193	-> 1127
/*     */     //   #194	-> 1145
/*     */     //   #195	-> 1150
/*     */     //   #196	-> 1162
/*     */     //   #198	-> 1174
/*     */     //   #200	-> 1179
/*     */     //   #201	-> 1189
/*     */     //   #202	-> 1202
/*     */     //   #204	-> 1215
/*     */     //   #205	-> 1226
/*     */     //   #206	-> 1233
/*     */     //   #207	-> 1261
/*     */     //   #208	-> 1273
/*     */     //   #210	-> 1287
/*     */     //   #205	-> 1288
/*     */     //   #210	-> 1289
/*     */     //   #211	-> 1290
/*     */     //   #212	-> 1303
/*     */     //   #200	-> 1304
/*     */     //   #213	-> 1305
/*     */     //   #214	-> 1330
/*     */     //   #139	-> 1369
/*     */     //   #215	-> 1400
/*     */     //   #216	-> 1401
/*     */     //   #217	-> 1420
/*     */     //   #218	-> 1431
/*     */     //   #140	-> 1443
/*     */     //   #141	-> 1464
/*     */     //   #143	-> 1501
/*     */     //   #218	-> 1502
/*     */     //   #216	-> 1503
/*     */     //   #220	-> 1509
/*     */     //   #139	-> 1519
/*     */     //   #144	-> 1522
/*     */     //   #214	-> 1523
/*     */     //   #213	-> 1528
/*     */     //   #221	-> 1530
/*     */     //   #192	-> 1537
/*     */     //   #222	-> 1540
/*     */     //   #186	-> 1543
/*     */     //   #223	-> 1546
/*     */     //   #179	-> 1549
/*     */     //   #224	-> 1552
/*     */     //   #145	-> 1565
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   431	10	19	$i$a$-apply-CrossfadeKt$Crossfade$currentlyVisible$1$1	I
/*     */     //   428	13	18	$this$Crossfade_u24lambda_u241_u24lambda_u240	Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*     */     //   419	25	16	$i$a$-cache-CrossfadeKt$Crossfade$currentlyVisible$1	I
/*     */     //   446	11	20	value$iv	Ljava/lang/Object;
/*     */     //   405	58	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   402	61	14	it$iv	Ljava/lang/Object;
/*     */     //   393	72	13	$i$f$cache	I
/*     */     //   390	75	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   390	75	12	invalid$iv	Z
/*     */     //   524	3	17	$i$a$-cache-CrossfadeKt$Crossfade$contentMap$1	I
/*     */     //   529	11	17	value$iv	Ljava/lang/Object;
/*     */     //   510	36	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   507	39	15	it$iv	Ljava/lang/Object;
/*     */     //   498	50	14	$i$f$cache	I
/*     */     //   495	53	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   495	53	13	invalid$iv	Z
/*     */     //   687	11	17	$i$a$-cache-CrossfadeKt$Crossfade$4	I
/*     */     //   703	11	18	value$iv	Ljava/lang/Object;
/*     */     //   666	54	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   663	57	15	it$iv	Ljava/lang/Object;
/*     */     //   654	68	14	$i$f$cache	I
/*     */     //   651	71	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   651	71	13	invalid$iv	Z
/*     */     //   828	21	18	$i$a$-indexOfFirst-CrossfadeKt$Crossfade$replacementId$1	I
/*     */     //   825	24	17	it	Ljava/lang/Object;
/*     */     //   821	39	16	item$iv	Ljava/lang/Object;
/*     */     //   790	74	13	$i$f$indexOfFirst	I
/*     */     //   793	71	14	index$iv	I
/*     */     //   787	77	12	$this$indexOfFirst$iv	Ljava/util/List;
/*     */     //   950	32	18	$i$a$-fastForEach-CrossfadeKt$Crossfade$5	I
/*     */     //   947	35	17	stateForContent	Ljava/lang/Object;
/*     */     //   943	40	16	item$iv	Ljava/lang/Object;
/*     */     //   916	73	14	index$iv	I
/*     */     //   912	78	13	$i$f$fastForEach	I
/*     */     //   909	81	12	$this$fastForEach$iv	Ljava/util/List;
/*     */     //   866	124	11	replacementId	I
/*     */     //   1438	64	43	$i$a$-fastForEach-CrossfadeKt$Crossfade$6$1	I
/*     */     //   1435	67	42	it	Ljava/lang/Object;
/*     */     //   1431	72	41	item$iv	Ljava/lang/Object;
/*     */     //   1404	105	39	index$iv	I
/*     */     //   1400	110	38	$i$f$fastForEach	I
/*     */     //   1397	113	37	$this$fastForEach$iv	Ljava/util/List;
/*     */     //   1361	162	36	$i$a$-Box-CrossfadeKt$Crossfade$6	I
/*     */     //   1358	165	35	$this$Crossfade_u24lambda_u247	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1358	165	34	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1358	165	33	$changed	I
/*     */     //   1322	206	32	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1319	209	31	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1319	209	30	$changed$iv	I
/*     */     //   1233	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1230	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1226	64	27	$i$f$set-impl	I
/*     */     //   1223	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1189	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1186	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1116	425	23	$i$f$ReusableComposeNode	I
/*     */     //   1113	428	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1113	428	22	$changed$iv$iv$iv	I
/*     */     //   1054	493	17	$i$f$Layout	I
/*     */     //   1073	474	18	compositeKeyHash$iv$iv	I
/*     */     //   1082	465	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1090	457	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1051	496	16	$changed$iv$iv	I
/*     */     //   1010	543	14	$i$f$Box	I
/*     */     //   1041	512	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1029	524	11	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1032	521	12	propagateMinConstraints$iv	Z
/*     */     //   1007	546	13	$changed$iv	I
/*     */     //   479	1083	9	currentlyVisible	Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*     */     //   562	1000	10	contentMap	Landroidx/collection/MutableScatterMap;
/*     */     //   35	1578	8	$dirty	I
/*     */     //   0	1613	0	$this$Crossfade	Landroidx/compose/animation/core/Transition;
/*     */     //   0	1613	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1613	2	animationSpec	Landroidx/compose/animation/core/FiniteAnimationSpec;
/*     */     //   0	1613	3	contentKey	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1613	4	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	1613	5	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1613	6	$changed	I
/*     */   } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\002H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"})
/*     */   static final class CrossfadeKt$Crossfade$4$1 extends Lambda implements Function1<T, Boolean> { @NotNull
/*     */     public final Boolean invoke(Object it) {
/* 111 */       return Boolean.valueOf(!Intrinsics.areEqual(it, this.$this_Crossfade.getTargetState()));
/*     */     }
/*     */ 
/*     */     
/*     */     CrossfadeKt$Crossfade$4$1(Transition<T> $receiver) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\003\020\000\032\0020\001\"\004\b\000\020\002H\013¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "T", "invoke", "(Landroidx/compose/runtime/Composer;I)V"})
/*     */   @SourceDebugExtension({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,146:1\n1970#2:147\n1967#2:148\n1885#2,7:149\n1225#3,6:156\n71#4:162\n68#4,6:163\n74#4:197\n78#4:201\n79#5,6:169\n86#5,4:184\n90#5,2:194\n94#5:200\n368#6,9:175\n377#6:196\n378#6,2:198\n4034#7,6:188\n81#8:202\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n*L\n128#1:147\n128#1:148\n128#1:149,7\n131#1:156,6\n131#1:162\n131#1:163,6\n131#1:197\n131#1:201\n131#1:169,6\n131#1:184,4\n131#1:194,2\n131#1:200\n131#1:175,9\n131#1:196\n131#1:198,2\n131#1:188,6\n128#1:202\n*E\n"})
/*     */   static final class CrossfadeKt$Crossfade$5$1
/*     */     extends Lambda
/*     */     implements Function2<Composer, Integer, Unit>
/*     */   {
/*     */     private static final float invoke$lambda$1(State $alpha$delegate) {
/* 128 */       State state = $alpha$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 202 */         (Number)state.getValue()).floatValue();
/*     */     }
/*     */     
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(@Nullable Composer $composer, int $changed) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'C127@5489L128,130@5661L22,130@5634L115:Crossfade.kt#xbi5r1'
/*     */       //   3: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */       //   6: iload_2
/*     */       //   7: iconst_3
/*     */       //   8: iand
/*     */       //   9: iconst_2
/*     */       //   10: if_icmpne -> 22
/*     */       //   13: aload_1
/*     */       //   14: invokeinterface getSkipping : ()Z
/*     */       //   19: ifne -> 949
/*     */       //   22: invokestatic isTraceInProgress : ()Z
/*     */       //   25: ifeq -> 37
/*     */       //   28: ldc -1426421288
/*     */       //   30: iload_2
/*     */       //   31: iconst_m1
/*     */       //   32: ldc 'androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)'
/*     */       //   34: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   37: aload_0
/*     */       //   38: getfield $this_Crossfade : Landroidx/compose/animation/core/Transition;
/*     */       //   41: astore #4
/*     */       //   43: new androidx/compose/animation/CrossfadeKt$Crossfade$5$1$alpha$2
/*     */       //   46: dup
/*     */       //   47: aload_0
/*     */       //   48: getfield $animationSpec : Landroidx/compose/animation/core/FiniteAnimationSpec;
/*     */       //   51: invokespecial <init> : (Landroidx/compose/animation/core/FiniteAnimationSpec;)V
/*     */       //   54: checkcast kotlin/jvm/functions/Function3
/*     */       //   57: astore #5
/*     */       //   59: aload_0
/*     */       //   60: getfield $stateForContent : Ljava/lang/Object;
/*     */       //   63: astore #7
/*     */       //   65: iconst_0
/*     */       //   66: istore #8
/*     */       //   68: iconst_0
/*     */       //   69: istore #9
/*     */       //   71: aload_1
/*     */       //   72: ldc -1338768149
/*     */       //   74: ldc 'CC(animateFloat)P(2)1969@80624L78:Transition.kt#pdpnli'
/*     */       //   76: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   79: ldc 'FloatAnimation'
/*     */       //   81: astore #6
/*     */       //   83: aload #4
/*     */       //   85: astore #10
/*     */       //   87: getstatic kotlin/jvm/internal/FloatCompanionObject.INSTANCE : Lkotlin/jvm/internal/FloatCompanionObject;
/*     */       //   90: invokestatic getVectorConverter : (Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;
/*     */       //   93: astore #11
/*     */       //   95: bipush #14
/*     */       //   97: iload #8
/*     */       //   99: iand
/*     */       //   100: sipush #896
/*     */       //   103: iload #8
/*     */       //   105: iconst_3
/*     */       //   106: ishl
/*     */       //   107: iand
/*     */       //   108: ior
/*     */       //   109: sipush #7168
/*     */       //   112: iload #8
/*     */       //   114: iconst_3
/*     */       //   115: ishl
/*     */       //   116: iand
/*     */       //   117: ior
/*     */       //   118: ldc 57344
/*     */       //   120: iload #8
/*     */       //   122: iconst_3
/*     */       //   123: ishl
/*     */       //   124: iand
/*     */       //   125: ior
/*     */       //   126: istore #12
/*     */       //   128: iconst_0
/*     */       //   129: istore #13
/*     */       //   131: aload_1
/*     */       //   132: ldc -142660079
/*     */       //   134: ldc 'CC(animateValue)P(3,2)1886@77187L32,1887@77242L31,1888@77298L23,1890@77334L89:Transition.kt#pdpnli'
/*     */       //   136: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   139: aload #10
/*     */       //   141: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */       //   144: aload_1
/*     */       //   145: bipush #112
/*     */       //   147: iload #12
/*     */       //   149: bipush #9
/*     */       //   151: ishr
/*     */       //   152: iand
/*     */       //   153: istore #14
/*     */       //   155: astore #15
/*     */       //   157: astore #16
/*     */       //   159: iconst_0
/*     */       //   160: istore #17
/*     */       //   162: aload #15
/*     */       //   164: ldc -438678252
/*     */       //   166: invokeinterface startReplaceGroup : (I)V
/*     */       //   171: aload #15
/*     */       //   173: ldc 'C:Crossfade.kt#xbi5r1'
/*     */       //   175: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */       //   178: invokestatic isTraceInProgress : ()Z
/*     */       //   181: ifeq -> 194
/*     */       //   184: ldc -438678252
/*     */       //   186: iload #14
/*     */       //   188: iconst_m1
/*     */       //   189: ldc 'androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)'
/*     */       //   191: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   194: aload #16
/*     */       //   196: aload #7
/*     */       //   198: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   201: ifeq -> 208
/*     */       //   204: fconst_1
/*     */       //   205: goto -> 209
/*     */       //   208: fconst_0
/*     */       //   209: fstore #18
/*     */       //   211: invokestatic isTraceInProgress : ()Z
/*     */       //   214: ifeq -> 220
/*     */       //   217: invokestatic traceEventEnd : ()V
/*     */       //   220: aload #15
/*     */       //   222: invokeinterface endReplaceGroup : ()V
/*     */       //   227: fload #18
/*     */       //   229: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */       //   232: astore #19
/*     */       //   234: aload #10
/*     */       //   236: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */       //   239: aload_1
/*     */       //   240: bipush #112
/*     */       //   242: iload #12
/*     */       //   244: bipush #9
/*     */       //   246: ishr
/*     */       //   247: iand
/*     */       //   248: istore #14
/*     */       //   250: astore #15
/*     */       //   252: astore #16
/*     */       //   254: iconst_0
/*     */       //   255: istore #17
/*     */       //   257: aload #15
/*     */       //   259: ldc -438678252
/*     */       //   261: invokeinterface startReplaceGroup : (I)V
/*     */       //   266: aload #15
/*     */       //   268: ldc 'C:Crossfade.kt#xbi5r1'
/*     */       //   270: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */       //   273: invokestatic isTraceInProgress : ()Z
/*     */       //   276: ifeq -> 289
/*     */       //   279: ldc -438678252
/*     */       //   281: iload #14
/*     */       //   283: iconst_m1
/*     */       //   284: ldc 'androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)'
/*     */       //   286: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   289: aload #16
/*     */       //   291: aload #7
/*     */       //   293: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   296: ifeq -> 303
/*     */       //   299: fconst_1
/*     */       //   300: goto -> 304
/*     */       //   303: fconst_0
/*     */       //   304: fstore #18
/*     */       //   306: invokestatic isTraceInProgress : ()Z
/*     */       //   309: ifeq -> 315
/*     */       //   312: invokestatic traceEventEnd : ()V
/*     */       //   315: aload #15
/*     */       //   317: invokeinterface endReplaceGroup : ()V
/*     */       //   322: fload #18
/*     */       //   324: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */       //   327: astore #16
/*     */       //   329: aload #5
/*     */       //   331: aload #10
/*     */       //   333: invokevirtual getSegment : ()Landroidx/compose/animation/core/Transition$Segment;
/*     */       //   336: aload_1
/*     */       //   337: bipush #112
/*     */       //   339: iload #12
/*     */       //   341: iconst_3
/*     */       //   342: ishr
/*     */       //   343: iand
/*     */       //   344: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   347: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   352: checkcast androidx/compose/animation/core/FiniteAnimationSpec
/*     */       //   355: astore #15
/*     */       //   357: aload #10
/*     */       //   359: aload #19
/*     */       //   361: aload #16
/*     */       //   363: aload #15
/*     */       //   365: aload #11
/*     */       //   367: aload #6
/*     */       //   369: aload_1
/*     */       //   370: bipush #14
/*     */       //   372: iload #12
/*     */       //   374: iand
/*     */       //   375: ldc 57344
/*     */       //   377: iload #12
/*     */       //   379: bipush #9
/*     */       //   381: ishl
/*     */       //   382: iand
/*     */       //   383: ior
/*     */       //   384: ldc 458752
/*     */       //   386: iload #12
/*     */       //   388: bipush #6
/*     */       //   390: ishl
/*     */       //   391: iand
/*     */       //   392: ior
/*     */       //   393: invokestatic createTransitionAnimation : (Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */       //   396: astore #14
/*     */       //   398: aload_1
/*     */       //   399: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   402: aload #14
/*     */       //   404: nop
/*     */       //   405: astore #20
/*     */       //   407: aload_1
/*     */       //   408: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   411: aload #20
/*     */       //   413: astore_3
/*     */       //   414: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   417: checkcast androidx/compose/ui/Modifier
/*     */       //   420: aload_1
/*     */       //   421: ldc -1081879611
/*     */       //   423: ldc 'CC(remember):Crossfade.kt#9igjgp'
/*     */       //   425: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   428: aload_1
/*     */       //   429: astore #5
/*     */       //   431: aload_1
/*     */       //   432: aload_3
/*     */       //   433: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   438: istore #6
/*     */       //   440: iconst_0
/*     */       //   441: istore #7
/*     */       //   443: aload #5
/*     */       //   445: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   450: astore #8
/*     */       //   452: iconst_0
/*     */       //   453: istore #9
/*     */       //   455: iload #6
/*     */       //   457: ifne -> 471
/*     */       //   460: aload #8
/*     */       //   462: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   465: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   468: if_acmpne -> 506
/*     */       //   471: astore #33
/*     */       //   473: iconst_0
/*     */       //   474: istore #10
/*     */       //   476: new androidx/compose/animation/CrossfadeKt$Crossfade$5$1$1$1
/*     */       //   479: dup
/*     */       //   480: aload_3
/*     */       //   481: invokespecial <init> : (Landroidx/compose/runtime/State;)V
/*     */       //   484: checkcast kotlin/jvm/functions/Function1
/*     */       //   487: aload #33
/*     */       //   489: swap
/*     */       //   490: astore #11
/*     */       //   492: aload #5
/*     */       //   494: aload #11
/*     */       //   496: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   501: aload #11
/*     */       //   503: goto -> 508
/*     */       //   506: aload #8
/*     */       //   508: nop
/*     */       //   509: nop
/*     */       //   510: nop
/*     */       //   511: checkcast kotlin/jvm/functions/Function1
/*     */       //   514: astore #4
/*     */       //   516: aload_1
/*     */       //   517: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   520: aload #4
/*     */       //   522: invokestatic graphicsLayer : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */       //   525: astore #4
/*     */       //   527: aload_0
/*     */       //   528: getfield $content : Lkotlin/jvm/functions/Function3;
/*     */       //   531: astore #7
/*     */       //   533: aload_0
/*     */       //   534: getfield $stateForContent : Ljava/lang/Object;
/*     */       //   537: astore #8
/*     */       //   539: iconst_0
/*     */       //   540: istore #9
/*     */       //   542: iconst_0
/*     */       //   543: istore #10
/*     */       //   545: aload_1
/*     */       //   546: ldc 733328855
/*     */       //   548: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */       //   550: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   553: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   556: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */       //   559: astore #5
/*     */       //   561: iconst_0
/*     */       //   562: istore #6
/*     */       //   564: aload #5
/*     */       //   566: iload #6
/*     */       //   568: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   571: astore #11
/*     */       //   573: bipush #112
/*     */       //   575: iload #9
/*     */       //   577: iconst_3
/*     */       //   578: ishl
/*     */       //   579: iand
/*     */       //   580: istore #12
/*     */       //   582: nop
/*     */       //   583: iconst_0
/*     */       //   584: istore #13
/*     */       //   586: aload_1
/*     */       //   587: ldc -1323940314
/*     */       //   589: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   591: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   594: aload_1
/*     */       //   595: iconst_0
/*     */       //   596: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   599: istore #14
/*     */       //   601: aload_1
/*     */       //   602: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   607: astore #15
/*     */       //   609: aload_1
/*     */       //   610: aload #4
/*     */       //   612: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   615: astore #16
/*     */       //   617: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   620: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   623: astore #17
/*     */       //   625: bipush #6
/*     */       //   627: sipush #896
/*     */       //   630: iload #12
/*     */       //   632: bipush #6
/*     */       //   634: ishl
/*     */       //   635: iand
/*     */       //   636: ior
/*     */       //   637: istore #18
/*     */       //   639: nop
/*     */       //   640: iconst_0
/*     */       //   641: istore #19
/*     */       //   643: aload_1
/*     */       //   644: ldc -692256719
/*     */       //   646: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   648: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   651: aload_1
/*     */       //   652: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   657: instanceof androidx/compose/runtime/Applier
/*     */       //   660: ifne -> 666
/*     */       //   663: invokestatic invalidApplier : ()V
/*     */       //   666: aload_1
/*     */       //   667: invokeinterface startReusableNode : ()V
/*     */       //   672: aload_1
/*     */       //   673: invokeinterface getInserting : ()Z
/*     */       //   678: ifeq -> 692
/*     */       //   681: aload_1
/*     */       //   682: aload #17
/*     */       //   684: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   689: goto -> 698
/*     */       //   692: aload_1
/*     */       //   693: invokeinterface useNode : ()V
/*     */       //   698: aload_1
/*     */       //   699: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   702: astore #20
/*     */       //   704: iconst_0
/*     */       //   705: istore #21
/*     */       //   707: aload #20
/*     */       //   709: aload #11
/*     */       //   711: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   714: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   717: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   720: aload #20
/*     */       //   722: aload #15
/*     */       //   724: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   727: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   730: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   733: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   736: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   739: astore #22
/*     */       //   741: iconst_0
/*     */       //   742: istore #23
/*     */       //   744: aload #20
/*     */       //   746: astore #24
/*     */       //   748: iconst_0
/*     */       //   749: istore #25
/*     */       //   751: aload #24
/*     */       //   753: invokeinterface getInserting : ()Z
/*     */       //   758: ifne -> 779
/*     */       //   761: aload #24
/*     */       //   763: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   768: iload #14
/*     */       //   770: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   773: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   776: ifne -> 805
/*     */       //   779: aload #24
/*     */       //   781: iload #14
/*     */       //   783: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   786: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   791: aload #20
/*     */       //   793: iload #14
/*     */       //   795: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   798: aload #22
/*     */       //   800: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   805: nop
/*     */       //   806: nop
/*     */       //   807: nop
/*     */       //   808: aload #20
/*     */       //   810: aload #16
/*     */       //   812: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   815: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   818: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   821: nop
/*     */       //   822: nop
/*     */       //   823: aload_1
/*     */       //   824: bipush #14
/*     */       //   826: iload #18
/*     */       //   828: bipush #6
/*     */       //   830: ishr
/*     */       //   831: iand
/*     */       //   832: istore #26
/*     */       //   834: astore #27
/*     */       //   836: iconst_0
/*     */       //   837: istore #28
/*     */       //   839: aload #27
/*     */       //   841: ldc_w -2146769399
/*     */       //   844: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */       //   847: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   850: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */       //   853: aload #27
/*     */       //   855: bipush #6
/*     */       //   857: bipush #112
/*     */       //   859: iload #9
/*     */       //   861: bipush #6
/*     */       //   863: ishr
/*     */       //   864: iand
/*     */       //   865: ior
/*     */       //   866: istore #29
/*     */       //   868: astore #30
/*     */       //   870: checkcast androidx/compose/foundation/layout/BoxScope
/*     */       //   873: astore #31
/*     */       //   875: iconst_0
/*     */       //   876: istore #32
/*     */       //   878: aload #30
/*     */       //   880: ldc_w -1437785155
/*     */       //   883: ldc_w 'C131@5707L24:Crossfade.kt#xbi5r1'
/*     */       //   886: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   889: aload #7
/*     */       //   891: aload #8
/*     */       //   893: aload #30
/*     */       //   895: iconst_0
/*     */       //   896: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   899: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   904: pop
/*     */       //   905: aload #30
/*     */       //   907: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   910: nop
/*     */       //   911: aload #27
/*     */       //   913: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   916: aload_1
/*     */       //   917: invokeinterface endNode : ()V
/*     */       //   922: aload_1
/*     */       //   923: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   926: nop
/*     */       //   927: aload_1
/*     */       //   928: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   931: nop
/*     */       //   932: aload_1
/*     */       //   933: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   936: nop
/*     */       //   937: invokestatic isTraceInProgress : ()Z
/*     */       //   940: ifeq -> 955
/*     */       //   943: invokestatic traceEventEnd : ()V
/*     */       //   946: goto -> 955
/*     */       //   949: aload_1
/*     */       //   950: invokeinterface skipToGroupEnd : ()V
/*     */       //   955: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #128	-> 6
/*     */       //   #147	-> 76
/*     */       //   #148	-> 79
/*     */       //   #147	-> 83
/*     */       //   #149	-> 136
/*     */       //   #151	-> 139
/*     */       //   #130	-> 191
/*     */       //   #151	-> 232
/*     */       //   #152	-> 234
/*     */       //   #130	-> 286
/*     */       //   #152	-> 327
/*     */       //   #153	-> 329
/*     */       //   #155	-> 357
/*     */       //   #149	-> 399
/*     */       //   #155	-> 404
/*     */       //   #147	-> 405
/*     */       //   #128	-> 413
/*     */       //   #131	-> 414
/*     */       //   #156	-> 443
/*     */       //   #157	-> 455
/*     */       //   #158	-> 471
/*     */       //   #131	-> 476
/*     */       //   #158	-> 490
/*     */       //   #159	-> 492
/*     */       //   #160	-> 501
/*     */       //   #161	-> 506
/*     */       //   #157	-> 508
/*     */       //   #156	-> 509
/*     */       //   #156	-> 510
/*     */       //   #131	-> 511
/*     */       //   #162	-> 550
/*     */       //   #163	-> 553
/*     */       //   #164	-> 561
/*     */       //   #167	-> 564
/*     */       //   #168	-> 582
/*     */       //   #169	-> 591
/*     */       //   #170	-> 596
/*     */       //   #171	-> 602
/*     */       //   #172	-> 610
/*     */       //   #174	-> 617
/*     */       //   #173	-> 639
/*     */       //   #175	-> 648
/*     */       //   #176	-> 651
/*     */       //   #177	-> 667
/*     */       //   #178	-> 672
/*     */       //   #179	-> 682
/*     */       //   #181	-> 693
/*     */       //   #183	-> 698
/*     */       //   #184	-> 707
/*     */       //   #185	-> 720
/*     */       //   #187	-> 733
/*     */       //   #188	-> 744
/*     */       //   #189	-> 751
/*     */       //   #190	-> 779
/*     */       //   #191	-> 791
/*     */       //   #193	-> 805
/*     */       //   #188	-> 806
/*     */       //   #193	-> 807
/*     */       //   #194	-> 808
/*     */       //   #195	-> 821
/*     */       //   #183	-> 822
/*     */       //   #196	-> 823
/*     */       //   #197	-> 847
/*     */       //   #132	-> 886
/*     */       //   #133	-> 910
/*     */       //   #197	-> 911
/*     */       //   #196	-> 916
/*     */       //   #198	-> 917
/*     */       //   #175	-> 923
/*     */       //   #199	-> 926
/*     */       //   #169	-> 928
/*     */       //   #200	-> 931
/*     */       //   #162	-> 933
/*     */       //   #201	-> 936
/*     */       //   #133	-> 949
/*     */       //   #134	-> 955
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   162	67	17	$i$a$-animateFloat-CrossfadeKt$Crossfade$5$1$alpha$3	I
/*     */       //   159	70	16	it	Ljava/lang/Object;
/*     */       //   159	70	15	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   159	70	14	$changed	I
/*     */       //   257	67	17	$i$a$-animateFloat-CrossfadeKt$Crossfade$5$1$alpha$3	I
/*     */       //   254	70	16	it	Ljava/lang/Object;
/*     */       //   254	70	15	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   254	70	14	$changed	I
/*     */       //   131	274	13	$i$f$animateValue	I
/*     */       //   234	171	19	initialValue$iv$iv	Ljava/lang/Object;
/*     */       //   329	76	16	targetValue$iv$iv	Ljava/lang/Object;
/*     */       //   357	48	15	animationSpec$iv$iv	Landroidx/compose/animation/core/FiniteAnimationSpec;
/*     */       //   128	277	10	$this$animateValue$iv$iv	Landroidx/compose/animation/core/Transition;
/*     */       //   128	277	11	typeConverter$iv$iv	Landroidx/compose/animation/core/TwoWayConverter;
/*     */       //   128	277	12	$changed$iv$iv	I
/*     */       //   71	342	9	$i$f$animateFloat	I
/*     */       //   68	345	4	$this$animateFloat$iv	Landroidx/compose/animation/core/Transition;
/*     */       //   68	345	5	transitionSpec$iv	Lkotlin/jvm/functions/Function3;
/*     */       //   83	330	6	label$iv	Ljava/lang/String;
/*     */       //   68	345	8	$changed$iv	I
/*     */       //   476	11	10	$i$a$-cache-CrossfadeKt$Crossfade$5$1$1	I
/*     */       //   492	11	11	value$iv	Ljava/lang/Object;
/*     */       //   455	54	9	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   452	57	8	it$iv	Ljava/lang/Object;
/*     */       //   443	68	7	$i$f$cache	I
/*     */       //   440	71	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   440	71	6	invalid$iv	Z
/*     */       //   878	33	32	$i$a$-Box-CrossfadeKt$Crossfade$5$1$2	I
/*     */       //   875	36	31	$this$invoke_u24lambda_u243	Landroidx/compose/foundation/layout/BoxScope;
/*     */       //   875	36	30	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   875	36	29	$changed	I
/*     */       //   839	77	28	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */       //   836	80	27	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   836	80	26	$changed$iv	I
/*     */       //   751	55	25	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   748	58	24	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   744	64	23	$i$f$set-impl	I
/*     */       //   741	67	22	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   707	115	21	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   704	118	20	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   643	284	19	$i$f$ReusableComposeNode	I
/*     */       //   640	287	17	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   640	287	18	$changed$iv$iv$iv	I
/*     */       //   586	346	13	$i$f$Layout	I
/*     */       //   601	331	14	compositeKeyHash$iv$iv	I
/*     */       //   609	323	15	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   617	315	16	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   583	349	12	$changed$iv$iv	I
/*     */       //   545	392	10	$i$f$Box	I
/*     */       //   573	364	11	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   542	395	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */       //   561	376	5	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */       //   564	373	6	propagateMinConstraints$iv	Z
/*     */       //   542	395	9	$changed$iv	I
/*     */       //   414	532	3	alpha$delegate	Landroidx/compose/runtime/State;
/*     */       //   0	956	0	this	Landroidx/compose/animation/CrossfadeKt$Crossfade$5$1;
/*     */       //   0	956	1	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	956	2	$changed	I
/*     */     }
/*     */     
/*     */     CrossfadeKt$Crossfade$5$1(Transition<T> $receiver, FiniteAnimationSpec<Float> $animationSpec, Object $stateForContent, Function3<T, Composer, Integer, Unit> $content) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\020\007\n\000\n\002\030\002\n\002\b\002\020\000\032\b\022\004\022\0020\0020\001\"\004\b\000\020\003*\b\022\004\022\002H\0030\004H\013¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "T", "Landroidx/compose/animation/core/Transition$Segment;", "invoke", "(Landroidx/compose/animation/core/Transition$Segment;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/FiniteAnimationSpec;"})
/*     */     static final class CrossfadeKt$Crossfade$5$1$alpha$2 extends Lambda implements Function3<Transition.Segment<T>, Composer, Integer, FiniteAnimationSpec<Float>> {
/*     */       @Composable
/*     */       @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */       @NotNull
/*     */       public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment $this$animateFloat, @Nullable Composer $composer, int $changed) {
/*     */         Intrinsics.checkNotNullParameter($this$animateFloat, "$this$animateFloat");
/*     */         $composer.startReplaceGroup(438406499);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(438406499, $changed, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:128)"); 
/*     */         FiniteAnimationSpec<Float> finiteAnimationSpec = this.$animationSpec;
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */         $composer.endReplaceGroup();
/*     */         return finiteAnimationSpec;
/*     */       }
/*     */       
/*     */       CrossfadeKt$Crossfade$5$1$alpha$2(FiniteAnimationSpec<Float> $animationSpec) {
/*     */         super(3);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class CrossfadeKt$Crossfade$1 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     CrossfadeKt$Crossfade$1(Object $targetState, Modifier $modifier, FiniteAnimationSpec<Float> $animationSpec, String $label, Function3<T, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       CrossfadeKt.Crossfade(this.$targetState, this.$modifier, this.$animationSpec, this.$label, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class CrossfadeKt$Crossfade$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     CrossfadeKt$Crossfade$2(Object $targetState, Modifier $modifier, FiniteAnimationSpec<Float> $animationSpec, Function3<T, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       CrossfadeKt.Crossfade(this.$targetState, this.$modifier, this.$animationSpec, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class CrossfadeKt$Crossfade$7 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     CrossfadeKt$Crossfade$7(Transition<T> $receiver, Modifier $modifier, FiniteAnimationSpec<Float> $animationSpec, Function1<T, Object> $contentKey, Function3<T, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       CrossfadeKt.Crossfade(this.$this_Crossfade, this.$modifier, this.$animationSpec, this.$contentKey, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\CrossfadeKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */