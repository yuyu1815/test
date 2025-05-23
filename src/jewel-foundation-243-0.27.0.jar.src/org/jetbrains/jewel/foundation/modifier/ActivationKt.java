/*     */ package org.jetbrains.jewel.foundation.modifier;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.DisposableEffectResult;
/*     */ import androidx.compose.runtime.DisposableEffectScope;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.focus.FocusState;
/*     */ import androidx.compose.ui.modifier.ProvidableModifierLocal;
/*     */ import androidx.compose.ui.platform.InspectableValueKt;
/*     */ import java.awt.Component;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.FocusEvent;
/*     */ import java.awt.event.WindowEvent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\013\n\002\b\005\n\002\030\002\n\002\020\002\n\002\b\002\032\022\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\003\032\022\020\004\032\0020\001*\0020\0012\006\020\005\032\0020\006\032\f\020\007\032\0020\001*\0020\001H\007\032(\020\r\032\0020\001*\0020\0012\b\b\002\020\016\032\0020\n2\022\020\017\032\016\022\004\022\0020\n\022\004\022\0020\0210\020\"\027\020\b\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\013\020\f¨\006\022²\006\n\020\023\032\0020\nX\002²\006\n\020\023\032\0020\nX\002"}, d2 = {"trackWindowActivation", "Landroidx/compose/ui/Modifier;", "window", "Ljava/awt/Window;", "trackComponentActivation", "awtParent", "Ljava/awt/Component;", "trackActivation", "ModifierLocalActivated", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "", "getModifierLocalActivated", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "onActivated", "enabled", "onChanged", "Lkotlin/Function1;", "", "foundation", "parentActivated"})
/*     */ @SourceDebugExtension({"SMAP\nActivation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activation.kt\norg/jetbrains/jewel/foundation/modifier/ActivationKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,163:1\n135#2:164\n135#2:165\n135#2:166\n135#2:167\n*S KotlinDebug\n*F\n+ 1 Activation.kt\norg/jetbrains/jewel/foundation/modifier/ActivationKt\n*L\n33#1:164\n59#1:165\n86#1:166\n127#1:167\n*E\n"})
/*     */ public final class ActivationKt {
/*     */   @NotNull
/*     */   public static final Modifier trackWindowActivation(@NotNull Modifier $this$trackWindowActivation, @NotNull Window window) {
/*  32 */     Intrinsics.checkNotNullParameter($this$trackWindowActivation, "<this>"); Intrinsics.checkNotNullParameter(window, "window");
/*  33 */     int $i$f$debugInspectorInfo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 164 */     return ComposedModifierKt.composed($this$trackWindowActivation, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ActivationKt$trackWindowActivation$$inlined$debugInspectorInfo$1(window) : InspectableValueKt.getNoInspectorInfo(), new ActivationKt$trackWindowActivation$2(window));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nActivation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activation.kt\norg/jetbrains/jewel/foundation/modifier/ActivationKt$trackWindowActivation$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,163:1\n1225#2,6:164\n1225#2,6:170\n1225#2,6:176\n81#3:182\n107#3,2:183\n63#4,5:185\n*S KotlinDebug\n*F\n+ 1 Activation.kt\norg/jetbrains/jewel/foundation/modifier/ActivationKt$trackWindowActivation$2\n*L\n38#1:164,6\n40#1:170,6\n54#1:176,6\n38#1:182\n38#1:183,2\n52#1:185,5\n*E\n"})
/*     */   static final class ActivationKt$trackWindowActivation$2
/*     */     implements Function3<Modifier, Composer, Integer, Modifier>
/*     */   {
/*     */     @Composable
/*     */     public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$composed'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc -1804037326
/*     */       //   9: invokeinterface startReplaceGroup : (I)V
/*     */       //   14: invokestatic isTraceInProgress : ()Z
/*     */       //   17: ifeq -> 29
/*     */       //   20: ldc -1804037326
/*     */       //   22: iload_3
/*     */       //   23: iconst_m1
/*     */       //   24: ldc 'org.jetbrains.jewel.foundation.modifier.trackWindowActivation.<anonymous> (Activation.kt:37)'
/*     */       //   26: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   29: aload_2
/*     */       //   30: ldc 2067157449
/*     */       //   32: invokeinterface startReplaceGroup : (I)V
/*     */       //   37: aload_2
/*     */       //   38: astore #6
/*     */       //   40: iconst_0
/*     */       //   41: istore #7
/*     */       //   43: iconst_0
/*     */       //   44: istore #8
/*     */       //   46: aload #6
/*     */       //   48: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   53: astore #9
/*     */       //   55: iconst_0
/*     */       //   56: istore #10
/*     */       //   58: aload #9
/*     */       //   60: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   63: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   66: if_acmpne -> 98
/*     */       //   69: iconst_0
/*     */       //   70: istore #11
/*     */       //   72: iconst_0
/*     */       //   73: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */       //   76: aconst_null
/*     */       //   77: iconst_2
/*     */       //   78: aconst_null
/*     */       //   79: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */       //   82: astore #11
/*     */       //   84: aload #6
/*     */       //   86: aload #11
/*     */       //   88: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   93: aload #11
/*     */       //   95: goto -> 100
/*     */       //   98: aload #9
/*     */       //   100: nop
/*     */       //   101: nop
/*     */       //   102: nop
/*     */       //   103: checkcast androidx/compose/runtime/MutableState
/*     */       //   106: astore #5
/*     */       //   108: aload_2
/*     */       //   109: invokeinterface endReplaceGroup : ()V
/*     */       //   114: aload #5
/*     */       //   116: astore #4
/*     */       //   118: aload_0
/*     */       //   119: getfield $window : Ljava/awt/Window;
/*     */       //   122: aload_2
/*     */       //   123: ldc 2067160111
/*     */       //   125: invokeinterface startReplaceGroup : (I)V
/*     */       //   130: aload_2
/*     */       //   131: astore #6
/*     */       //   133: aload_2
/*     */       //   134: aload_0
/*     */       //   135: getfield $window : Ljava/awt/Window;
/*     */       //   138: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   143: istore #7
/*     */       //   145: aload_0
/*     */       //   146: getfield $window : Ljava/awt/Window;
/*     */       //   149: astore #8
/*     */       //   151: iconst_0
/*     */       //   152: istore #9
/*     */       //   154: aload #6
/*     */       //   156: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   161: astore #10
/*     */       //   163: iconst_0
/*     */       //   164: istore #11
/*     */       //   166: iload #7
/*     */       //   168: ifne -> 182
/*     */       //   171: aload #10
/*     */       //   173: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   176: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   179: if_acmpne -> 215
/*     */       //   182: astore #14
/*     */       //   184: iconst_0
/*     */       //   185: istore #12
/*     */       //   187: aload #8
/*     */       //   189: aload #4
/*     */       //   191: <illegal opcode> invoke : (Ljava/awt/Window;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */       //   196: aload #14
/*     */       //   198: swap
/*     */       //   199: astore #13
/*     */       //   201: aload #6
/*     */       //   203: aload #13
/*     */       //   205: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   210: aload #13
/*     */       //   212: goto -> 217
/*     */       //   215: aload #10
/*     */       //   217: nop
/*     */       //   218: nop
/*     */       //   219: nop
/*     */       //   220: checkcast kotlin/jvm/functions/Function1
/*     */       //   223: astore #5
/*     */       //   225: aload_2
/*     */       //   226: invokeinterface endReplaceGroup : ()V
/*     */       //   231: aload #5
/*     */       //   233: aload_2
/*     */       //   234: iconst_0
/*     */       //   235: invokestatic DisposableEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */       //   238: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   241: checkcast androidx/compose/ui/Modifier
/*     */       //   244: invokestatic getModifierLocalActivated : ()Landroidx/compose/ui/modifier/ProvidableModifierLocal;
/*     */       //   247: aload_2
/*     */       //   248: ldc 2067177306
/*     */       //   250: invokeinterface startReplaceGroup : (I)V
/*     */       //   255: aload_2
/*     */       //   256: astore #7
/*     */       //   258: iconst_0
/*     */       //   259: istore #8
/*     */       //   261: iconst_0
/*     */       //   262: istore #9
/*     */       //   264: aload #7
/*     */       //   266: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   271: astore #10
/*     */       //   273: iconst_0
/*     */       //   274: istore #11
/*     */       //   276: aload #10
/*     */       //   278: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   281: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   284: if_acmpne -> 325
/*     */       //   287: astore #15
/*     */       //   289: astore #14
/*     */       //   291: iconst_0
/*     */       //   292: istore #12
/*     */       //   294: aload #4
/*     */       //   296: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */       //   301: astore #16
/*     */       //   303: aload #14
/*     */       //   305: aload #15
/*     */       //   307: aload #16
/*     */       //   309: astore #13
/*     */       //   311: aload #7
/*     */       //   313: aload #13
/*     */       //   315: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   320: aload #13
/*     */       //   322: goto -> 327
/*     */       //   325: aload #10
/*     */       //   327: nop
/*     */       //   328: nop
/*     */       //   329: nop
/*     */       //   330: checkcast kotlin/jvm/functions/Function0
/*     */       //   333: astore #6
/*     */       //   335: aload_2
/*     */       //   336: invokeinterface endReplaceGroup : ()V
/*     */       //   341: aload #6
/*     */       //   343: invokestatic modifierLocalProvider : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/modifier/ProvidableModifierLocal;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;
/*     */       //   346: astore #5
/*     */       //   348: invokestatic isTraceInProgress : ()Z
/*     */       //   351: ifeq -> 357
/*     */       //   354: invokestatic traceEventEnd : ()V
/*     */       //   357: aload_2
/*     */       //   358: invokeinterface endReplaceGroup : ()V
/*     */       //   363: aload #5
/*     */       //   365: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #38	-> 26
/*     */       //   #164	-> 46
/*     */       //   #165	-> 58
/*     */       //   #166	-> 69
/*     */       //   #38	-> 72
/*     */       //   #166	-> 82
/*     */       //   #167	-> 84
/*     */       //   #168	-> 93
/*     */       //   #169	-> 98
/*     */       //   #165	-> 100
/*     */       //   #164	-> 101
/*     */       //   #164	-> 102
/*     */       //   #38	-> 103
/*     */       //   #40	-> 118
/*     */       //   #170	-> 154
/*     */       //   #171	-> 166
/*     */       //   #172	-> 182
/*     */       //   #40	-> 187
/*     */       //   #172	-> 199
/*     */       //   #173	-> 201
/*     */       //   #174	-> 210
/*     */       //   #175	-> 215
/*     */       //   #171	-> 217
/*     */       //   #170	-> 218
/*     */       //   #170	-> 219
/*     */       //   #40	-> 220
/*     */       //   #54	-> 238
/*     */       //   #176	-> 264
/*     */       //   #177	-> 276
/*     */       //   #178	-> 287
/*     */       //   #54	-> 294
/*     */       //   #178	-> 309
/*     */       //   #179	-> 311
/*     */       //   #180	-> 320
/*     */       //   #181	-> 325
/*     */       //   #177	-> 327
/*     */       //   #176	-> 328
/*     */       //   #176	-> 329
/*     */       //   #54	-> 330
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   72	10	11	$i$a$-cache-ActivationKt$trackWindowActivation$2$parentActivated$2	I
/*     */       //   84	11	11	value$iv	Ljava/lang/Object;
/*     */       //   58	43	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   55	46	9	it$iv	Ljava/lang/Object;
/*     */       //   46	57	8	$i$f$cache	I
/*     */       //   43	60	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   43	60	7	invalid$iv	Z
/*     */       //   187	9	12	$i$a$-cache-ActivationKt$trackWindowActivation$2$1	I
/*     */       //   201	11	13	value$iv	Ljava/lang/Object;
/*     */       //   166	52	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   163	55	10	it$iv	Ljava/lang/Object;
/*     */       //   154	66	9	$i$f$cache	I
/*     */       //   151	69	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   151	69	7	invalid$iv	Z
/*     */       //   294	7	12	$i$a$-cache-ActivationKt$trackWindowActivation$2$2	I
/*     */       //   311	11	13	value$iv	Ljava/lang/Object;
/*     */       //   276	52	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   273	55	10	it$iv	Ljava/lang/Object;
/*     */       //   264	66	9	$i$f$cache	I
/*     */       //   261	69	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   261	69	8	invalid$iv	Z
/*     */       //   118	248	4	parentActivated$delegate	Landroidx/compose/runtime/MutableState;
/*     */       //   0	366	0	this	Lorg/jetbrains/jewel/foundation/modifier/ActivationKt$trackWindowActivation$2;
/*     */       //   0	366	1	$this$composed	Landroidx/compose/ui/Modifier;
/*     */       //   0	366	2	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	366	3	$changed	I
/*     */     }
/*     */     
/*     */     private static final boolean invoke$lambda$1(MutableState $parentActivated$delegate) {
/*     */       State state = (State)$parentActivated$delegate;
/*     */       Object object = null;
/*     */       KProperty property$iv = null;
/*     */       int $i$f$getValue = 0;
/* 182 */       return ((Boolean)state.getValue()).booleanValue(); } private static final void invoke$lambda$2(MutableState $parentActivated$delegate, boolean <set-?>) { MutableState mutableState = $parentActivated$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 183 */       mutableState.setValue(value$iv); }
/*     */     private static final boolean invoke$lambda$7$lambda$6(MutableState<Boolean> $parentActivated$delegate) { return invoke$lambda$1($parentActivated$delegate); } private static final DisposableEffectResult invoke$lambda$5$lambda$4(Window $window, MutableState<Boolean> $parentActivated$delegate, DisposableEffectScope $this$DisposableEffect) { Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect"); ActivationKt$trackWindowActivation$2$1$1$listener$1 listener = new ActivationKt$trackWindowActivation$2$1$1$listener$1($parentActivated$delegate); $window.addWindowListener(listener); DisposableEffectScope this_$iv = $this$DisposableEffect; int $i$f$onDispose = 0;
/* 185 */       return new ActivationKt$trackWindowActivation$2$invoke$lambda$5$lambda$4$$inlined$onDispose$1($window, listener); } ActivationKt$trackWindowActivation$2(Window $window) {} } @NotNull public static final Modifier trackComponentActivation(@NotNull Modifier $this$trackComponentActivation, @NotNull Component awtParent) { Intrinsics.checkNotNullParameter($this$trackComponentActivation, "<this>"); Intrinsics.checkNotNullParameter(awtParent, "awtParent"); int $i$f$debugInspectorInfo = 0; return ComposedModifierKt.composed($this$trackComponentActivation, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ActivationKt$trackComponentActivation$$inlined$debugInspectorInfo$1(awtParent) : InspectableValueKt.getNoInspectorInfo(), new ActivationKt$trackComponentActivation$2(awtParent)); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nActivation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activation.kt\norg/jetbrains/jewel/foundation/modifier/ActivationKt$trackComponentActivation$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,163:1\n1225#2,6:164\n1225#2,6:170\n1225#2,6:176\n81#3:182\n107#3,2:183\n63#4,5:185\n*S KotlinDebug\n*F\n+ 1 Activation.kt\norg/jetbrains/jewel/foundation/modifier/ActivationKt$trackComponentActivation$2\n*L\n64#1:164,6\n66#1:170,6\n81#1:176,6\n64#1:182\n64#1:183,2\n78#1:185,5\n*E\n"}) static final class ActivationKt$trackComponentActivation$2 implements Function3<Modifier, Composer, Integer, Modifier> { private static final DisposableEffectResult invoke$lambda$5$lambda$4(Component $awtParent, MutableState<Boolean> $parentActivated$delegate, DisposableEffectScope $this$DisposableEffect) { Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect"); ActivationKt$trackComponentActivation$2$1$1$listener$1 listener = new ActivationKt$trackComponentActivation$2$1$1$listener$1($parentActivated$delegate); $awtParent.addFocusListener(listener); DisposableEffectScope this_$iv = $this$DisposableEffect; int $i$f$onDispose = 0; return new ActivationKt$trackComponentActivation$2$invoke$lambda$5$lambda$4$$inlined$onDispose$1($awtParent, listener); }
/*     */ 
/*     */     
/*     */     @Composable
/*     */     public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$composed'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 1736187464
/*     */       //   9: invokeinterface startReplaceGroup : (I)V
/*     */       //   14: invokestatic isTraceInProgress : ()Z
/*     */       //   17: ifeq -> 29
/*     */       //   20: ldc 1736187464
/*     */       //   22: iload_3
/*     */       //   23: iconst_m1
/*     */       //   24: ldc 'org.jetbrains.jewel.foundation.modifier.trackComponentActivation.<anonymous> (Activation.kt:63)'
/*     */       //   26: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   29: aload_2
/*     */       //   30: ldc 229177362
/*     */       //   32: invokeinterface startReplaceGroup : (I)V
/*     */       //   37: aload_2
/*     */       //   38: astore #6
/*     */       //   40: iconst_0
/*     */       //   41: istore #7
/*     */       //   43: iconst_0
/*     */       //   44: istore #8
/*     */       //   46: aload #6
/*     */       //   48: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   53: astore #9
/*     */       //   55: iconst_0
/*     */       //   56: istore #10
/*     */       //   58: aload #9
/*     */       //   60: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   63: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   66: if_acmpne -> 98
/*     */       //   69: iconst_0
/*     */       //   70: istore #11
/*     */       //   72: iconst_0
/*     */       //   73: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */       //   76: aconst_null
/*     */       //   77: iconst_2
/*     */       //   78: aconst_null
/*     */       //   79: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */       //   82: astore #11
/*     */       //   84: aload #6
/*     */       //   86: aload #11
/*     */       //   88: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   93: aload #11
/*     */       //   95: goto -> 100
/*     */       //   98: aload #9
/*     */       //   100: nop
/*     */       //   101: nop
/*     */       //   102: nop
/*     */       //   103: checkcast androidx/compose/runtime/MutableState
/*     */       //   106: astore #5
/*     */       //   108: aload_2
/*     */       //   109: invokeinterface endReplaceGroup : ()V
/*     */       //   114: aload #5
/*     */       //   116: astore #4
/*     */       //   118: aload_0
/*     */       //   119: getfield $awtParent : Ljava/awt/Component;
/*     */       //   122: aload_2
/*     */       //   123: ldc 229180108
/*     */       //   125: invokeinterface startReplaceGroup : (I)V
/*     */       //   130: aload_2
/*     */       //   131: astore #6
/*     */       //   133: aload_2
/*     */       //   134: aload_0
/*     */       //   135: getfield $awtParent : Ljava/awt/Component;
/*     */       //   138: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   143: istore #7
/*     */       //   145: aload_0
/*     */       //   146: getfield $awtParent : Ljava/awt/Component;
/*     */       //   149: astore #8
/*     */       //   151: iconst_0
/*     */       //   152: istore #9
/*     */       //   154: aload #6
/*     */       //   156: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   161: astore #10
/*     */       //   163: iconst_0
/*     */       //   164: istore #11
/*     */       //   166: iload #7
/*     */       //   168: ifne -> 182
/*     */       //   171: aload #10
/*     */       //   173: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   176: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   179: if_acmpne -> 215
/*     */       //   182: astore #14
/*     */       //   184: iconst_0
/*     */       //   185: istore #12
/*     */       //   187: aload #8
/*     */       //   189: aload #4
/*     */       //   191: <illegal opcode> invoke : (Ljava/awt/Component;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */       //   196: aload #14
/*     */       //   198: swap
/*     */       //   199: astore #13
/*     */       //   201: aload #6
/*     */       //   203: aload #13
/*     */       //   205: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   210: aload #13
/*     */       //   212: goto -> 217
/*     */       //   215: aload #10
/*     */       //   217: nop
/*     */       //   218: nop
/*     */       //   219: nop
/*     */       //   220: checkcast kotlin/jvm/functions/Function1
/*     */       //   223: astore #5
/*     */       //   225: aload_2
/*     */       //   226: invokeinterface endReplaceGroup : ()V
/*     */       //   231: aload #5
/*     */       //   233: aload_2
/*     */       //   234: iconst_0
/*     */       //   235: invokestatic DisposableEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */       //   238: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   241: checkcast androidx/compose/ui/Modifier
/*     */       //   244: invokestatic getModifierLocalActivated : ()Landroidx/compose/ui/modifier/ProvidableModifierLocal;
/*     */       //   247: aload_2
/*     */       //   248: ldc 229196963
/*     */       //   250: invokeinterface startReplaceGroup : (I)V
/*     */       //   255: aload_2
/*     */       //   256: astore #7
/*     */       //   258: iconst_0
/*     */       //   259: istore #8
/*     */       //   261: iconst_0
/*     */       //   262: istore #9
/*     */       //   264: aload #7
/*     */       //   266: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   271: astore #10
/*     */       //   273: iconst_0
/*     */       //   274: istore #11
/*     */       //   276: aload #10
/*     */       //   278: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   281: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   284: if_acmpne -> 325
/*     */       //   287: astore #15
/*     */       //   289: astore #14
/*     */       //   291: iconst_0
/*     */       //   292: istore #12
/*     */       //   294: aload #4
/*     */       //   296: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */       //   301: astore #16
/*     */       //   303: aload #14
/*     */       //   305: aload #15
/*     */       //   307: aload #16
/*     */       //   309: astore #13
/*     */       //   311: aload #7
/*     */       //   313: aload #13
/*     */       //   315: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   320: aload #13
/*     */       //   322: goto -> 327
/*     */       //   325: aload #10
/*     */       //   327: nop
/*     */       //   328: nop
/*     */       //   329: nop
/*     */       //   330: checkcast kotlin/jvm/functions/Function0
/*     */       //   333: astore #6
/*     */       //   335: aload_2
/*     */       //   336: invokeinterface endReplaceGroup : ()V
/*     */       //   341: aload #6
/*     */       //   343: invokestatic modifierLocalProvider : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/modifier/ProvidableModifierLocal;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;
/*     */       //   346: astore #5
/*     */       //   348: invokestatic isTraceInProgress : ()Z
/*     */       //   351: ifeq -> 357
/*     */       //   354: invokestatic traceEventEnd : ()V
/*     */       //   357: aload_2
/*     */       //   358: invokeinterface endReplaceGroup : ()V
/*     */       //   363: aload #5
/*     */       //   365: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #64	-> 26
/*     */       //   #164	-> 46
/*     */       //   #165	-> 58
/*     */       //   #166	-> 69
/*     */       //   #64	-> 72
/*     */       //   #166	-> 82
/*     */       //   #167	-> 84
/*     */       //   #168	-> 93
/*     */       //   #169	-> 98
/*     */       //   #165	-> 100
/*     */       //   #164	-> 101
/*     */       //   #164	-> 102
/*     */       //   #64	-> 103
/*     */       //   #66	-> 118
/*     */       //   #170	-> 154
/*     */       //   #171	-> 166
/*     */       //   #172	-> 182
/*     */       //   #66	-> 187
/*     */       //   #172	-> 199
/*     */       //   #173	-> 201
/*     */       //   #174	-> 210
/*     */       //   #175	-> 215
/*     */       //   #171	-> 217
/*     */       //   #170	-> 218
/*     */       //   #170	-> 219
/*     */       //   #66	-> 220
/*     */       //   #81	-> 238
/*     */       //   #176	-> 264
/*     */       //   #177	-> 276
/*     */       //   #178	-> 287
/*     */       //   #81	-> 294
/*     */       //   #178	-> 309
/*     */       //   #179	-> 311
/*     */       //   #180	-> 320
/*     */       //   #181	-> 325
/*     */       //   #177	-> 327
/*     */       //   #176	-> 328
/*     */       //   #176	-> 329
/*     */       //   #81	-> 330
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   72	10	11	$i$a$-cache-ActivationKt$trackComponentActivation$2$parentActivated$2	I
/*     */       //   84	11	11	value$iv	Ljava/lang/Object;
/*     */       //   58	43	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   55	46	9	it$iv	Ljava/lang/Object;
/*     */       //   46	57	8	$i$f$cache	I
/*     */       //   43	60	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   43	60	7	invalid$iv	Z
/*     */       //   187	9	12	$i$a$-cache-ActivationKt$trackComponentActivation$2$1	I
/*     */       //   201	11	13	value$iv	Ljava/lang/Object;
/*     */       //   166	52	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   163	55	10	it$iv	Ljava/lang/Object;
/*     */       //   154	66	9	$i$f$cache	I
/*     */       //   151	69	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   151	69	7	invalid$iv	Z
/*     */       //   294	7	12	$i$a$-cache-ActivationKt$trackComponentActivation$2$2	I
/*     */       //   311	11	13	value$iv	Ljava/lang/Object;
/*     */       //   276	52	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   273	55	10	it$iv	Ljava/lang/Object;
/*     */       //   264	66	9	$i$f$cache	I
/*     */       //   261	69	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   261	69	8	invalid$iv	Z
/*     */       //   118	248	4	parentActivated$delegate	Landroidx/compose/runtime/MutableState;
/*     */       //   0	366	0	this	Lorg/jetbrains/jewel/foundation/modifier/ActivationKt$trackComponentActivation$2;
/*     */       //   0	366	1	$this$composed	Landroidx/compose/ui/Modifier;
/*     */       //   0	366	2	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	366	3	$changed	I
/*     */     }
/*     */     
/*     */     private static final boolean invoke$lambda$1(MutableState $parentActivated$delegate) {
/*     */       State state = (State)$parentActivated$delegate;
/*     */       Object object = null;
/*     */       KProperty property$iv = null;
/*     */       int $i$f$getValue = 0;
/*     */       return ((Boolean)state.getValue()).booleanValue();
/*     */     }
/*     */     
/*     */     private static final void invoke$lambda$2(MutableState $parentActivated$delegate, boolean <set-?>) {
/*     */       MutableState mutableState = $parentActivated$delegate;
/*     */       Object object1 = null, object2 = null;
/*     */       Object value$iv = Boolean.valueOf(<set-?>);
/*     */       int $i$f$setValue = 0;
/*     */       mutableState.setValue(value$iv);
/*     */     }
/*     */     
/*     */     private static final boolean invoke$lambda$7$lambda$6(MutableState<Boolean> $parentActivated$delegate) {
/*     */       return invoke$lambda$1($parentActivated$delegate);
/*     */     }
/*     */     
/*     */     ActivationKt$trackComponentActivation$2(Component $awtParent) {} }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final Modifier trackActivation(@NotNull Modifier $this$trackActivation) {
/*     */     Intrinsics.checkNotNullParameter($this$trackActivation, "<this>");
/*     */     int $i$f$debugInspectorInfo = 0;
/*     */     return ComposedModifierKt.composed($this$trackActivation, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ActivationKt$trackActivation$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), ActivationKt$trackActivation$2.INSTANCE);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nActivation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activation.kt\norg/jetbrains/jewel/foundation/modifier/ActivationKt$trackActivation$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,163:1\n1225#2,6:164\n1225#2,6:170\n*S KotlinDebug\n*F\n+ 1 Activation.kt\norg/jetbrains/jewel/foundation/modifier/ActivationKt$trackActivation$2\n*L\n87#1:164,6\n89#1:170,6\n*E\n"})
/*     */   static final class ActivationKt$trackActivation$2 implements Function3<Modifier, Composer, Integer, Modifier> {
/*     */     public static final ActivationKt$trackActivation$2 INSTANCE = new ActivationKt$trackActivation$2();
/*     */     
/*     */     @Composable
/*     */     public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$composed, "$this$composed");
/*     */       $composer.startReplaceGroup(-1148956750);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventStart(-1148956750, $changed, -1, "org.jetbrains.jewel.foundation.modifier.trackActivation.<anonymous> (Activation.kt:86)"); 
/*     */       $composer.startReplaceGroup(-1740740772);
/*     */       Composer composer1 = $composer;
/*     */       boolean invalid$iv = false;
/*     */       int $i$f$cache = 0;
/*     */       Object it$iv = composer1.rememberedValue();
/*     */       int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */       if (it$iv == Composer.Companion.getEmpty()) {
/*     */         int $i$a$-cache-ActivationKt$trackActivation$2$activatedModifierLocal$1 = 0;
/*     */         Object value$iv = new ActivatedModifierLocal();
/*     */         composer1.updateRememberedValue(value$iv);
/*     */       } 
/*     */       ActivatedModifierLocal activatedModifierLocal1 = (ActivatedModifierLocal)it$iv;
/*     */       $composer.endReplaceGroup();
/*     */       ActivatedModifierLocal activatedModifierLocal = activatedModifierLocal1;
/*     */       $composer.startReplaceGroup(-1740737522);
/*     */       Composer composer2 = $composer;
/*     */       boolean bool1 = false;
/*     */       int i = 0;
/*     */       Object object1 = composer2.rememberedValue();
/*     */       int j = 0;
/*     */       if (object1 == Composer.Companion.getEmpty()) {
/*     */         Modifier modifier1 = FocusableKt.focusGroup((Modifier)Modifier.Companion);
/*     */         int $i$a$-cache-ActivationKt$trackActivation$2$1 = 0;
/*     */         Object value$iv = activatedModifierLocal::invoke$lambda$2$lambda$1;
/*     */         composer2.updateRememberedValue(value$iv);
/*     */       } 
/*     */       Function1 function1 = (Function1)object1;
/*     */       $composer.endReplaceGroup();
/*     */       Modifier modifier = FocusChangedModifierKt.onFocusChanged(modifier1, function1).then((Modifier)activatedModifierLocal);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */       $composer.endReplaceGroup();
/*     */       return modifier;
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$2$lambda$1(ActivatedModifierLocal $activatedModifierLocal, FocusState it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       if (it.getHasFocus()) {
/*     */         $activatedModifierLocal.childGainedFocus();
/*     */       } else {
/*     */         $activatedModifierLocal.childLostFocus();
/*     */       } 
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   @NotNull
/*     */   private static final ProvidableModifierLocal<Boolean> ModifierLocalActivated = ModifierLocalKt.modifierLocalOf(ActivationKt::ModifierLocalActivated$lambda$3);
/*     */   
/*     */   @NotNull
/*     */   public static final ProvidableModifierLocal<Boolean> getModifierLocalActivated() {
/*     */     return ModifierLocalActivated;
/*     */   }
/*     */   
/*     */   private static final boolean ModifierLocalActivated$lambda$3() {
/*     */     return false;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Modifier onActivated(@NotNull Modifier $this$onActivated, boolean enabled, @NotNull Function1<? super Boolean, Unit> onChanged) {
/*     */     Intrinsics.checkNotNullParameter($this$onActivated, "<this>");
/*     */     Intrinsics.checkNotNullParameter(onChanged, "onChanged");
/*     */     int $i$f$debugInspectorInfo = 0;
/*     */     return $this$onActivated.then(enabled ? (Modifier)new ActivateChangedModifierElement(onChanged, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ActivationKt$onActivated$$inlined$debugInspectorInfo$1(onChanged) : InspectableValueKt.getNoInspectorInfo()) : (Modifier)Modifier.Companion);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\modifier\ActivationKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */