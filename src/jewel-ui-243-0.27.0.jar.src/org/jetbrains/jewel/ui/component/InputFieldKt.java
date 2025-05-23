/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.ScrollState;
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.text.KeyboardActions;
/*     */ import androidx.compose.foundation.text.KeyboardOptions;
/*     */ import androidx.compose.foundation.text.input.InputTransformation;
/*     */ import androidx.compose.foundation.text.input.KeyboardActionHandler;
/*     */ import androidx.compose.foundation.text.input.OutputTransformation;
/*     */ import androidx.compose.foundation.text.input.TextFieldDecorator;
/*     */ import androidx.compose.foundation.text.input.TextFieldLineLimits;
/*     */ import androidx.compose.foundation.text.input.TextFieldState;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.text.TextLayoutResult;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.text.input.TextFieldValue;
/*     */ import androidx.compose.ui.text.input.VisualTransformation;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.ApiStatus.ScheduledForRemoval;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.Outline;
/*     */ import org.jetbrains.jewel.ui.component.styling.InputFieldStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000¶\001\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\004\032Ï\001\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\b\020\t\032\004\030\0010\n2\006\020\013\032\0020\f2\006\020\r\032\0020\0162\b\020\017\032\004\030\0010\0202\006\020\021\032\0020\02226\020\023\0322\022\004\022\0020\025\022\033\022\031\022\006\022\004\030\0010\0270\026¢\006\f\b\030\022\b\b\031\022\004\b\b(\032\022\004\022\0020\001\030\0010\024¢\006\002\b\0332\006\020\034\032\0020\0352\006\020\036\032\0020\0372\006\020 \032\0020!2\b\020\"\032\004\030\0010#2\b\020$\032\004\030\0010%2\b\b\002\020&\032\0020\0072\006\020'\032\0020(H\001¢\006\002\020)\032í\001\020\000\032\0020\0012\006\020*\032\0020+2\022\020,\032\016\022\004\022\0020+\022\004\022\0020\0010-2\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020 \032\0020!2\006\020&\032\0020\0072\006\020.\032\0020/2\006\020\r\032\0020\0162\006\0200\032\002012\006\0202\032\0020\0072\006\0203\032\002042\022\020\023\032\016\022\004\022\0020\027\022\004\022\0020\0010-2\006\020\034\032\0020\0352\006\020\036\032\0020\0372\006\020\013\032\0020\f2F\0205\032B\022\036\022\034\022\004\022\0020\0010\026¢\006\002\b6¢\006\f\b\030\022\b\b\031\022\004\b\b(7\022\023\022\02108¢\006\f\b\030\022\b\b\031\022\004\b\b(\002\022\004\022\0020\0010\024¢\006\002\b6H\001¢\006\002\0209¨\006:²\006\n\020;\032\00208X\002²\006\n\020<\032\0020=X\002²\006\n\020>\032\0020=X\002²\006\n\020?\032\0020=X\002²\006\n\020@\032\0020=X\002²\006\n\020A\032\00208X\002²\006\n\020<\032\0020=X\002²\006\n\020>\032\0020=X\002²\006\n\020?\032\0020=X\002²\006\n\020@\032\0020=X\002"}, d2 = {"InputField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "style", "Lorg/jetbrains/jewel/ui/component/styling/InputFieldStyle;", "outline", "Lorg/jetbrains/jewel/ui/Outline;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "decorator", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "undecorated", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/InputFieldStyle;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "decorationBox", "Landroidx/compose/runtime/Composable;", "innerTextField", "Lorg/jetbrains/jewel/ui/component/InputFieldState;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/Outline;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/InputFieldStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "ui", "inputFieldState", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "contentColor", "caretColor", "inputState"})
/*     */ @SourceDebugExtension({"SMAP\nInputField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputField.kt\norg/jetbrains/jewel/ui/component/InputFieldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 ModifierExtensions.kt\norg/jetbrains/jewel/ui/util/ModifierExtensionsKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,258:1\n1225#2,6:259\n1225#2,6:265\n1225#2,6:271\n1225#2,6:282\n1225#2,6:288\n1225#2,6:294\n696#3:277\n696#3:279\n696#3:300\n696#3:302\n10#4:278\n10#4:280\n10#4:281\n10#4:301\n10#4:303\n10#4:304\n81#5:305\n107#5,2:306\n81#5:308\n81#5:309\n81#5:310\n81#5:311\n81#5:312\n107#5,2:313\n81#5:315\n81#5:316\n81#5:317\n81#5:318\n*S KotlinDebug\n*F\n+ 1 InputField.kt\norg/jetbrains/jewel/ui/component/InputFieldKt\n*L\n67#1:259,6\n68#1:265,6\n70#1:271,6\n150#1:282,6\n151#1:288,6\n153#1:294,6\n84#1:277\n89#1:279\n167#1:300\n172#1:302\n84#1:278\n89#1:280\n107#1:281\n167#1:301\n172#1:303\n191#1:304\n67#1:305\n67#1:306,2\n80#1:308\n86#1:309\n98#1:310\n100#1:311\n150#1:312\n150#1:313,2\n163#1:315\n169#1:316\n181#1:317\n183#1:318\n*E\n"})
/*     */ public final class InputFieldKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
/*     */   public static final void InputField(@NotNull TextFieldState state, @NotNull Modifier modifier, boolean enabled, boolean readOnly, @Nullable InputTransformation inputTransformation, @NotNull TextStyle textStyle, @NotNull KeyboardOptions keyboardOptions, @Nullable KeyboardActionHandler onKeyboardAction, @NotNull TextFieldLineLimits lineLimits, @Nullable Function2 onTextLayout, @NotNull MutableInteractionSource interactionSource, @NotNull InputFieldStyle style, @NotNull Outline outline, @Nullable OutputTransformation outputTransformation, @Nullable TextFieldDecorator decorator, boolean undecorated, @NotNull ScrollState scrollState, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'state'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'modifier'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #5
/*     */     //   14: ldc 'textStyle'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #6
/*     */     //   21: ldc 'keyboardOptions'
/*     */     //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   26: aload #8
/*     */     //   28: ldc 'lineLimits'
/*     */     //   30: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   33: aload #10
/*     */     //   35: ldc 'interactionSource'
/*     */     //   37: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   40: aload #11
/*     */     //   42: ldc 'style'
/*     */     //   44: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   47: aload #12
/*     */     //   49: ldc 'outline'
/*     */     //   51: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   54: aload #16
/*     */     //   56: ldc 'scrollState'
/*     */     //   58: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   61: aload #17
/*     */     //   63: ldc 1618712207
/*     */     //   65: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   70: astore #17
/*     */     //   72: iload #18
/*     */     //   74: istore #21
/*     */     //   76: iload #19
/*     */     //   78: istore #22
/*     */     //   80: iload #20
/*     */     //   82: iconst_1
/*     */     //   83: iand
/*     */     //   84: ifeq -> 97
/*     */     //   87: iload #21
/*     */     //   89: bipush #6
/*     */     //   91: ior
/*     */     //   92: istore #21
/*     */     //   94: goto -> 126
/*     */     //   97: iload #18
/*     */     //   99: bipush #6
/*     */     //   101: iand
/*     */     //   102: ifne -> 126
/*     */     //   105: iload #21
/*     */     //   107: aload #17
/*     */     //   109: aload_0
/*     */     //   110: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   115: ifeq -> 122
/*     */     //   118: iconst_4
/*     */     //   119: goto -> 123
/*     */     //   122: iconst_2
/*     */     //   123: ior
/*     */     //   124: istore #21
/*     */     //   126: iload #20
/*     */     //   128: iconst_2
/*     */     //   129: iand
/*     */     //   130: ifeq -> 143
/*     */     //   133: iload #21
/*     */     //   135: bipush #48
/*     */     //   137: ior
/*     */     //   138: istore #21
/*     */     //   140: goto -> 174
/*     */     //   143: iload #18
/*     */     //   145: bipush #48
/*     */     //   147: iand
/*     */     //   148: ifne -> 174
/*     */     //   151: iload #21
/*     */     //   153: aload #17
/*     */     //   155: aload_1
/*     */     //   156: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   161: ifeq -> 169
/*     */     //   164: bipush #32
/*     */     //   166: goto -> 171
/*     */     //   169: bipush #16
/*     */     //   171: ior
/*     */     //   172: istore #21
/*     */     //   174: iload #20
/*     */     //   176: iconst_4
/*     */     //   177: iand
/*     */     //   178: ifeq -> 192
/*     */     //   181: iload #21
/*     */     //   183: sipush #384
/*     */     //   186: ior
/*     */     //   187: istore #21
/*     */     //   189: goto -> 226
/*     */     //   192: iload #18
/*     */     //   194: sipush #384
/*     */     //   197: iand
/*     */     //   198: ifne -> 226
/*     */     //   201: iload #21
/*     */     //   203: aload #17
/*     */     //   205: iload_2
/*     */     //   206: invokeinterface changed : (Z)Z
/*     */     //   211: ifeq -> 220
/*     */     //   214: sipush #256
/*     */     //   217: goto -> 223
/*     */     //   220: sipush #128
/*     */     //   223: ior
/*     */     //   224: istore #21
/*     */     //   226: iload #20
/*     */     //   228: bipush #8
/*     */     //   230: iand
/*     */     //   231: ifeq -> 245
/*     */     //   234: iload #21
/*     */     //   236: sipush #3072
/*     */     //   239: ior
/*     */     //   240: istore #21
/*     */     //   242: goto -> 279
/*     */     //   245: iload #18
/*     */     //   247: sipush #3072
/*     */     //   250: iand
/*     */     //   251: ifne -> 279
/*     */     //   254: iload #21
/*     */     //   256: aload #17
/*     */     //   258: iload_3
/*     */     //   259: invokeinterface changed : (Z)Z
/*     */     //   264: ifeq -> 273
/*     */     //   267: sipush #2048
/*     */     //   270: goto -> 276
/*     */     //   273: sipush #1024
/*     */     //   276: ior
/*     */     //   277: istore #21
/*     */     //   279: iload #20
/*     */     //   281: bipush #16
/*     */     //   283: iand
/*     */     //   284: ifeq -> 298
/*     */     //   287: iload #21
/*     */     //   289: sipush #24576
/*     */     //   292: ior
/*     */     //   293: istore #21
/*     */     //   295: goto -> 333
/*     */     //   298: iload #18
/*     */     //   300: sipush #24576
/*     */     //   303: iand
/*     */     //   304: ifne -> 333
/*     */     //   307: iload #21
/*     */     //   309: aload #17
/*     */     //   311: aload #4
/*     */     //   313: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   318: ifeq -> 327
/*     */     //   321: sipush #16384
/*     */     //   324: goto -> 330
/*     */     //   327: sipush #8192
/*     */     //   330: ior
/*     */     //   331: istore #21
/*     */     //   333: iload #20
/*     */     //   335: bipush #32
/*     */     //   337: iand
/*     */     //   338: ifeq -> 351
/*     */     //   341: iload #21
/*     */     //   343: ldc 196608
/*     */     //   345: ior
/*     */     //   346: istore #21
/*     */     //   348: goto -> 383
/*     */     //   351: iload #18
/*     */     //   353: ldc 196608
/*     */     //   355: iand
/*     */     //   356: ifne -> 383
/*     */     //   359: iload #21
/*     */     //   361: aload #17
/*     */     //   363: aload #5
/*     */     //   365: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   370: ifeq -> 378
/*     */     //   373: ldc 131072
/*     */     //   375: goto -> 380
/*     */     //   378: ldc 65536
/*     */     //   380: ior
/*     */     //   381: istore #21
/*     */     //   383: iload #20
/*     */     //   385: bipush #64
/*     */     //   387: iand
/*     */     //   388: ifeq -> 401
/*     */     //   391: iload #21
/*     */     //   393: ldc 1572864
/*     */     //   395: ior
/*     */     //   396: istore #21
/*     */     //   398: goto -> 433
/*     */     //   401: iload #18
/*     */     //   403: ldc 1572864
/*     */     //   405: iand
/*     */     //   406: ifne -> 433
/*     */     //   409: iload #21
/*     */     //   411: aload #17
/*     */     //   413: aload #6
/*     */     //   415: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   420: ifeq -> 428
/*     */     //   423: ldc 1048576
/*     */     //   425: goto -> 430
/*     */     //   428: ldc 524288
/*     */     //   430: ior
/*     */     //   431: istore #21
/*     */     //   433: iload #20
/*     */     //   435: sipush #128
/*     */     //   438: iand
/*     */     //   439: ifeq -> 452
/*     */     //   442: iload #21
/*     */     //   444: ldc 12582912
/*     */     //   446: ior
/*     */     //   447: istore #21
/*     */     //   449: goto -> 484
/*     */     //   452: iload #18
/*     */     //   454: ldc 12582912
/*     */     //   456: iand
/*     */     //   457: ifne -> 484
/*     */     //   460: iload #21
/*     */     //   462: aload #17
/*     */     //   464: aload #7
/*     */     //   466: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   471: ifeq -> 479
/*     */     //   474: ldc 8388608
/*     */     //   476: goto -> 481
/*     */     //   479: ldc 4194304
/*     */     //   481: ior
/*     */     //   482: istore #21
/*     */     //   484: iload #20
/*     */     //   486: sipush #256
/*     */     //   489: iand
/*     */     //   490: ifeq -> 503
/*     */     //   493: iload #21
/*     */     //   495: ldc 100663296
/*     */     //   497: ior
/*     */     //   498: istore #21
/*     */     //   500: goto -> 535
/*     */     //   503: iload #18
/*     */     //   505: ldc 100663296
/*     */     //   507: iand
/*     */     //   508: ifne -> 535
/*     */     //   511: iload #21
/*     */     //   513: aload #17
/*     */     //   515: aload #8
/*     */     //   517: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   522: ifeq -> 530
/*     */     //   525: ldc 67108864
/*     */     //   527: goto -> 532
/*     */     //   530: ldc 33554432
/*     */     //   532: ior
/*     */     //   533: istore #21
/*     */     //   535: iload #20
/*     */     //   537: sipush #512
/*     */     //   540: iand
/*     */     //   541: ifeq -> 554
/*     */     //   544: iload #21
/*     */     //   546: ldc 805306368
/*     */     //   548: ior
/*     */     //   549: istore #21
/*     */     //   551: goto -> 586
/*     */     //   554: iload #18
/*     */     //   556: ldc 805306368
/*     */     //   558: iand
/*     */     //   559: ifne -> 586
/*     */     //   562: iload #21
/*     */     //   564: aload #17
/*     */     //   566: aload #9
/*     */     //   568: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   573: ifeq -> 581
/*     */     //   576: ldc 536870912
/*     */     //   578: goto -> 583
/*     */     //   581: ldc 268435456
/*     */     //   583: ior
/*     */     //   584: istore #21
/*     */     //   586: iload #20
/*     */     //   588: sipush #1024
/*     */     //   591: iand
/*     */     //   592: ifeq -> 605
/*     */     //   595: iload #22
/*     */     //   597: bipush #6
/*     */     //   599: ior
/*     */     //   600: istore #22
/*     */     //   602: goto -> 635
/*     */     //   605: iload #19
/*     */     //   607: bipush #6
/*     */     //   609: iand
/*     */     //   610: ifne -> 635
/*     */     //   613: iload #22
/*     */     //   615: aload #17
/*     */     //   617: aload #10
/*     */     //   619: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   624: ifeq -> 631
/*     */     //   627: iconst_4
/*     */     //   628: goto -> 632
/*     */     //   631: iconst_2
/*     */     //   632: ior
/*     */     //   633: istore #22
/*     */     //   635: iload #20
/*     */     //   637: sipush #2048
/*     */     //   640: iand
/*     */     //   641: ifeq -> 654
/*     */     //   644: iload #22
/*     */     //   646: bipush #48
/*     */     //   648: ior
/*     */     //   649: istore #22
/*     */     //   651: goto -> 686
/*     */     //   654: iload #19
/*     */     //   656: bipush #48
/*     */     //   658: iand
/*     */     //   659: ifne -> 686
/*     */     //   662: iload #22
/*     */     //   664: aload #17
/*     */     //   666: aload #11
/*     */     //   668: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   673: ifeq -> 681
/*     */     //   676: bipush #32
/*     */     //   678: goto -> 683
/*     */     //   681: bipush #16
/*     */     //   683: ior
/*     */     //   684: istore #22
/*     */     //   686: iload #20
/*     */     //   688: sipush #4096
/*     */     //   691: iand
/*     */     //   692: ifeq -> 706
/*     */     //   695: iload #22
/*     */     //   697: sipush #384
/*     */     //   700: ior
/*     */     //   701: istore #22
/*     */     //   703: goto -> 741
/*     */     //   706: iload #19
/*     */     //   708: sipush #384
/*     */     //   711: iand
/*     */     //   712: ifne -> 741
/*     */     //   715: iload #22
/*     */     //   717: aload #17
/*     */     //   719: aload #12
/*     */     //   721: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   726: ifeq -> 735
/*     */     //   729: sipush #256
/*     */     //   732: goto -> 738
/*     */     //   735: sipush #128
/*     */     //   738: ior
/*     */     //   739: istore #22
/*     */     //   741: iload #20
/*     */     //   743: sipush #8192
/*     */     //   746: iand
/*     */     //   747: ifeq -> 761
/*     */     //   750: iload #22
/*     */     //   752: sipush #3072
/*     */     //   755: ior
/*     */     //   756: istore #22
/*     */     //   758: goto -> 796
/*     */     //   761: iload #19
/*     */     //   763: sipush #3072
/*     */     //   766: iand
/*     */     //   767: ifne -> 796
/*     */     //   770: iload #22
/*     */     //   772: aload #17
/*     */     //   774: aload #13
/*     */     //   776: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   781: ifeq -> 790
/*     */     //   784: sipush #2048
/*     */     //   787: goto -> 793
/*     */     //   790: sipush #1024
/*     */     //   793: ior
/*     */     //   794: istore #22
/*     */     //   796: iload #20
/*     */     //   798: sipush #16384
/*     */     //   801: iand
/*     */     //   802: ifeq -> 816
/*     */     //   805: iload #22
/*     */     //   807: sipush #24576
/*     */     //   810: ior
/*     */     //   811: istore #22
/*     */     //   813: goto -> 851
/*     */     //   816: iload #19
/*     */     //   818: sipush #24576
/*     */     //   821: iand
/*     */     //   822: ifne -> 851
/*     */     //   825: iload #22
/*     */     //   827: aload #17
/*     */     //   829: aload #14
/*     */     //   831: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   836: ifeq -> 845
/*     */     //   839: sipush #16384
/*     */     //   842: goto -> 848
/*     */     //   845: sipush #8192
/*     */     //   848: ior
/*     */     //   849: istore #22
/*     */     //   851: iload #19
/*     */     //   853: ldc 196608
/*     */     //   855: iand
/*     */     //   856: ifne -> 891
/*     */     //   859: iload #22
/*     */     //   861: iload #20
/*     */     //   863: ldc 32768
/*     */     //   865: iand
/*     */     //   866: ifne -> 886
/*     */     //   869: aload #17
/*     */     //   871: iload #15
/*     */     //   873: invokeinterface changed : (Z)Z
/*     */     //   878: ifeq -> 886
/*     */     //   881: ldc 131072
/*     */     //   883: goto -> 888
/*     */     //   886: ldc 65536
/*     */     //   888: ior
/*     */     //   889: istore #22
/*     */     //   891: iload #20
/*     */     //   893: ldc 65536
/*     */     //   895: iand
/*     */     //   896: ifeq -> 909
/*     */     //   899: iload #22
/*     */     //   901: ldc 1572864
/*     */     //   903: ior
/*     */     //   904: istore #22
/*     */     //   906: goto -> 941
/*     */     //   909: iload #19
/*     */     //   911: ldc 1572864
/*     */     //   913: iand
/*     */     //   914: ifne -> 941
/*     */     //   917: iload #22
/*     */     //   919: aload #17
/*     */     //   921: aload #16
/*     */     //   923: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   928: ifeq -> 936
/*     */     //   931: ldc 1048576
/*     */     //   933: goto -> 938
/*     */     //   936: ldc 524288
/*     */     //   938: ior
/*     */     //   939: istore #22
/*     */     //   941: iload #21
/*     */     //   943: ldc 306783379
/*     */     //   945: iand
/*     */     //   946: ldc 306783378
/*     */     //   948: if_icmpne -> 971
/*     */     //   951: iload #22
/*     */     //   953: ldc 599187
/*     */     //   955: iand
/*     */     //   956: ldc 599186
/*     */     //   958: if_icmpne -> 971
/*     */     //   961: aload #17
/*     */     //   963: invokeinterface getSkipping : ()Z
/*     */     //   968: ifne -> 2091
/*     */     //   971: aload #17
/*     */     //   973: invokeinterface startDefaults : ()V
/*     */     //   978: iload #18
/*     */     //   980: iconst_1
/*     */     //   981: iand
/*     */     //   982: ifeq -> 995
/*     */     //   985: aload #17
/*     */     //   987: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   992: ifeq -> 1025
/*     */     //   995: iload #20
/*     */     //   997: ldc 32768
/*     */     //   999: iand
/*     */     //   1000: ifeq -> 1047
/*     */     //   1003: aload #14
/*     */     //   1005: ifnonnull -> 1012
/*     */     //   1008: iconst_1
/*     */     //   1009: goto -> 1013
/*     */     //   1012: iconst_0
/*     */     //   1013: istore #15
/*     */     //   1015: iload #22
/*     */     //   1017: ldc -458753
/*     */     //   1019: iand
/*     */     //   1020: istore #22
/*     */     //   1022: goto -> 1047
/*     */     //   1025: aload #17
/*     */     //   1027: invokeinterface skipToGroupEnd : ()V
/*     */     //   1032: iload #20
/*     */     //   1034: ldc 32768
/*     */     //   1036: iand
/*     */     //   1037: ifeq -> 1047
/*     */     //   1040: iload #22
/*     */     //   1042: ldc -458753
/*     */     //   1044: iand
/*     */     //   1045: istore #22
/*     */     //   1047: aload #17
/*     */     //   1049: invokeinterface endDefaults : ()V
/*     */     //   1054: invokestatic isTraceInProgress : ()Z
/*     */     //   1057: ifeq -> 1071
/*     */     //   1060: ldc 1618712207
/*     */     //   1062: iload #21
/*     */     //   1064: iload #22
/*     */     //   1066: ldc 'org.jetbrains.jewel.ui.component.InputField (InputField.kt:65)'
/*     */     //   1068: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1071: aload #17
/*     */     //   1073: ldc 912025379
/*     */     //   1075: invokeinterface startReplaceGroup : (I)V
/*     */     //   1080: aload #17
/*     */     //   1082: astore #25
/*     */     //   1084: iload #22
/*     */     //   1086: bipush #14
/*     */     //   1088: iand
/*     */     //   1089: iconst_4
/*     */     //   1090: if_icmpne -> 1097
/*     */     //   1093: iconst_1
/*     */     //   1094: goto -> 1098
/*     */     //   1097: iconst_0
/*     */     //   1098: istore #26
/*     */     //   1100: nop
/*     */     //   1101: iconst_0
/*     */     //   1102: istore #27
/*     */     //   1104: aload #25
/*     */     //   1106: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1111: astore #28
/*     */     //   1113: iconst_0
/*     */     //   1114: istore #29
/*     */     //   1116: iload #26
/*     */     //   1118: ifne -> 1132
/*     */     //   1121: aload #28
/*     */     //   1123: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1126: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1129: if_acmpne -> 1174
/*     */     //   1132: iconst_0
/*     */     //   1133: istore #30
/*     */     //   1135: getstatic org/jetbrains/jewel/ui/component/InputFieldState.Companion : Lorg/jetbrains/jewel/ui/component/InputFieldState$Companion;
/*     */     //   1138: iload_2
/*     */     //   1139: iconst_0
/*     */     //   1140: iconst_0
/*     */     //   1141: iconst_0
/*     */     //   1142: iconst_0
/*     */     //   1143: bipush #30
/*     */     //   1145: aconst_null
/*     */     //   1146: invokestatic of-raUdB0Y$default : (Lorg/jetbrains/jewel/ui/component/InputFieldState$Companion;ZZZZZILjava/lang/Object;)J
/*     */     //   1149: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/InputFieldState;
/*     */     //   1152: aconst_null
/*     */     //   1153: iconst_2
/*     */     //   1154: aconst_null
/*     */     //   1155: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1158: astore #31
/*     */     //   1160: aload #25
/*     */     //   1162: aload #31
/*     */     //   1164: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1169: aload #31
/*     */     //   1171: goto -> 1176
/*     */     //   1174: aload #28
/*     */     //   1176: nop
/*     */     //   1177: nop
/*     */     //   1178: nop
/*     */     //   1179: checkcast androidx/compose/runtime/MutableState
/*     */     //   1182: astore #24
/*     */     //   1184: aload #17
/*     */     //   1186: invokeinterface endReplaceGroup : ()V
/*     */     //   1191: aload #24
/*     */     //   1193: astore #23
/*     */     //   1195: aload #17
/*     */     //   1197: ldc 912028253
/*     */     //   1199: invokeinterface startReplaceGroup : (I)V
/*     */     //   1204: aload #17
/*     */     //   1206: astore #24
/*     */     //   1208: iload #21
/*     */     //   1210: sipush #896
/*     */     //   1213: iand
/*     */     //   1214: sipush #256
/*     */     //   1217: if_icmpne -> 1224
/*     */     //   1220: iconst_1
/*     */     //   1221: goto -> 1225
/*     */     //   1224: iconst_0
/*     */     //   1225: istore #25
/*     */     //   1227: nop
/*     */     //   1228: iconst_0
/*     */     //   1229: istore #26
/*     */     //   1231: aload #24
/*     */     //   1233: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1238: astore #27
/*     */     //   1240: iconst_0
/*     */     //   1241: istore #28
/*     */     //   1243: iload #25
/*     */     //   1245: ifne -> 1259
/*     */     //   1248: aload #27
/*     */     //   1250: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1253: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1256: if_acmpne -> 1302
/*     */     //   1259: iconst_0
/*     */     //   1260: istore #29
/*     */     //   1262: aload #23
/*     */     //   1264: aload #23
/*     */     //   1266: invokestatic InputField$lambda$1 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1269: iload_2
/*     */     //   1270: iconst_0
/*     */     //   1271: iconst_0
/*     */     //   1272: iconst_0
/*     */     //   1273: iconst_0
/*     */     //   1274: bipush #30
/*     */     //   1276: aconst_null
/*     */     //   1277: invokestatic copy-raUdB0Y$default : (JZZZZZILjava/lang/Object;)J
/*     */     //   1280: invokestatic InputField$lambda$2 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   1283: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1286: astore #30
/*     */     //   1288: aload #24
/*     */     //   1290: aload #30
/*     */     //   1292: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1297: aload #30
/*     */     //   1299: goto -> 1304
/*     */     //   1302: aload #27
/*     */     //   1304: nop
/*     */     //   1305: nop
/*     */     //   1306: nop
/*     */     //   1307: pop
/*     */     //   1308: aload #17
/*     */     //   1310: invokeinterface endReplaceGroup : ()V
/*     */     //   1315: aload #10
/*     */     //   1317: aload #17
/*     */     //   1319: ldc 912032313
/*     */     //   1321: invokeinterface startReplaceGroup : (I)V
/*     */     //   1326: aload #17
/*     */     //   1328: astore #25
/*     */     //   1330: iload #22
/*     */     //   1332: bipush #14
/*     */     //   1334: iand
/*     */     //   1335: iconst_4
/*     */     //   1336: if_icmpne -> 1343
/*     */     //   1339: iconst_1
/*     */     //   1340: goto -> 1344
/*     */     //   1343: iconst_0
/*     */     //   1344: aload #17
/*     */     //   1346: aload #23
/*     */     //   1348: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1353: ior
/*     */     //   1354: istore #26
/*     */     //   1356: iconst_0
/*     */     //   1357: istore #27
/*     */     //   1359: aload #25
/*     */     //   1361: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1366: astore #28
/*     */     //   1368: iconst_0
/*     */     //   1369: istore #29
/*     */     //   1371: iload #26
/*     */     //   1373: ifne -> 1387
/*     */     //   1376: aload #28
/*     */     //   1378: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1381: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1384: if_acmpne -> 1426
/*     */     //   1387: astore #40
/*     */     //   1389: iconst_0
/*     */     //   1390: istore #30
/*     */     //   1392: new org/jetbrains/jewel/ui/component/InputFieldKt$InputField$2$1
/*     */     //   1395: dup
/*     */     //   1396: aload #10
/*     */     //   1398: aload #23
/*     */     //   1400: aconst_null
/*     */     //   1401: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   1404: checkcast kotlin/jvm/functions/Function2
/*     */     //   1407: aload #40
/*     */     //   1409: swap
/*     */     //   1410: astore #31
/*     */     //   1412: aload #25
/*     */     //   1414: aload #31
/*     */     //   1416: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1421: aload #31
/*     */     //   1423: goto -> 1428
/*     */     //   1426: aload #28
/*     */     //   1428: nop
/*     */     //   1429: nop
/*     */     //   1430: nop
/*     */     //   1431: checkcast kotlin/jvm/functions/Function2
/*     */     //   1434: astore #24
/*     */     //   1436: aload #17
/*     */     //   1438: invokeinterface endReplaceGroup : ()V
/*     */     //   1443: aload #24
/*     */     //   1445: aload #17
/*     */     //   1447: bipush #14
/*     */     //   1449: iload #22
/*     */     //   1451: iand
/*     */     //   1452: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1455: aload #11
/*     */     //   1457: invokeinterface getColors : ()Lorg/jetbrains/jewel/ui/component/styling/InputFieldColors;
/*     */     //   1462: astore #24
/*     */     //   1464: aload #24
/*     */     //   1466: aload #23
/*     */     //   1468: invokestatic InputField$lambda$1 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1471: aload #17
/*     */     //   1473: iconst_0
/*     */     //   1474: invokeinterface backgroundFor-xB6EZ8U : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1479: astore #25
/*     */     //   1481: aload #11
/*     */     //   1483: invokeinterface getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/InputFieldMetrics;
/*     */     //   1488: invokeinterface getCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   1493: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1496: astore #26
/*     */     //   1498: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1501: checkcast androidx/compose/ui/Modifier
/*     */     //   1504: astore #28
/*     */     //   1506: iload #15
/*     */     //   1508: ifne -> 1542
/*     */     //   1511: aload #25
/*     */     //   1513: invokestatic InputField$lambda$5 : (Landroidx/compose/runtime/State;)J
/*     */     //   1516: lstore #29
/*     */     //   1518: iconst_0
/*     */     //   1519: istore #31
/*     */     //   1521: lload #29
/*     */     //   1523: ldc2_w 16
/*     */     //   1526: lcmp
/*     */     //   1527: ifeq -> 1534
/*     */     //   1530: iconst_1
/*     */     //   1531: goto -> 1535
/*     */     //   1534: iconst_0
/*     */     //   1535: ifeq -> 1542
/*     */     //   1538: iconst_1
/*     */     //   1539: goto -> 1543
/*     */     //   1542: iconst_0
/*     */     //   1543: istore #29
/*     */     //   1545: iconst_0
/*     */     //   1546: istore #30
/*     */     //   1548: iload #29
/*     */     //   1550: ifeq -> 1578
/*     */     //   1553: aload #28
/*     */     //   1555: astore #31
/*     */     //   1557: iconst_0
/*     */     //   1558: istore #32
/*     */     //   1560: aload #31
/*     */     //   1562: aload #25
/*     */     //   1564: invokestatic InputField$lambda$5 : (Landroidx/compose/runtime/State;)J
/*     */     //   1567: aload #26
/*     */     //   1569: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1572: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   1575: goto -> 1580
/*     */     //   1578: aload #28
/*     */     //   1580: astore #27
/*     */     //   1582: aload #11
/*     */     //   1584: invokeinterface getColors : ()Lorg/jetbrains/jewel/ui/component/styling/InputFieldColors;
/*     */     //   1589: aload #23
/*     */     //   1591: invokestatic InputField$lambda$1 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1594: aload #17
/*     */     //   1596: iconst_0
/*     */     //   1597: invokeinterface borderFor-xB6EZ8U : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1602: astore #28
/*     */     //   1604: aload #12
/*     */     //   1606: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   1609: if_acmpne -> 1616
/*     */     //   1612: iconst_1
/*     */     //   1613: goto -> 1617
/*     */     //   1616: iconst_0
/*     */     //   1617: istore #29
/*     */     //   1619: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1622: checkcast androidx/compose/ui/Modifier
/*     */     //   1625: astore #31
/*     */     //   1627: iload #15
/*     */     //   1629: ifne -> 1668
/*     */     //   1632: aload #28
/*     */     //   1634: invokestatic InputField$lambda$7 : (Landroidx/compose/runtime/State;)J
/*     */     //   1637: lstore #32
/*     */     //   1639: iconst_0
/*     */     //   1640: istore #34
/*     */     //   1642: lload #32
/*     */     //   1644: ldc2_w 16
/*     */     //   1647: lcmp
/*     */     //   1648: ifeq -> 1655
/*     */     //   1651: iconst_1
/*     */     //   1652: goto -> 1656
/*     */     //   1655: iconst_0
/*     */     //   1656: ifeq -> 1668
/*     */     //   1659: iload #29
/*     */     //   1661: ifeq -> 1668
/*     */     //   1664: iconst_1
/*     */     //   1665: goto -> 1669
/*     */     //   1668: iconst_0
/*     */     //   1669: istore #32
/*     */     //   1671: iconst_0
/*     */     //   1672: istore #33
/*     */     //   1674: iload #32
/*     */     //   1676: ifeq -> 1724
/*     */     //   1679: aload #31
/*     */     //   1681: astore #34
/*     */     //   1683: iconst_0
/*     */     //   1684: istore #35
/*     */     //   1686: aload #34
/*     */     //   1688: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Inside : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   1691: aload #11
/*     */     //   1693: invokeinterface getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/InputFieldMetrics;
/*     */     //   1698: invokeinterface getBorderWidth-D9Ej5fM : ()F
/*     */     //   1703: aload #28
/*     */     //   1705: invokestatic InputField$lambda$7 : (Landroidx/compose/runtime/State;)J
/*     */     //   1708: aload #26
/*     */     //   1710: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1713: fconst_0
/*     */     //   1714: bipush #16
/*     */     //   1716: aconst_null
/*     */     //   1717: invokestatic border-QWjY48E$default : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FJLandroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1720: nop
/*     */     //   1721: goto -> 1726
/*     */     //   1724: aload #31
/*     */     //   1726: astore #30
/*     */     //   1728: aload #24
/*     */     //   1730: aload #23
/*     */     //   1732: invokestatic InputField$lambda$1 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1735: aload #17
/*     */     //   1737: iconst_0
/*     */     //   1738: invokeinterface contentFor-xB6EZ8U : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1743: astore #31
/*     */     //   1745: aload #5
/*     */     //   1747: aload #31
/*     */     //   1749: invokestatic InputField$lambda$9 : (Landroidx/compose/runtime/State;)J
/*     */     //   1752: lconst_0
/*     */     //   1753: aconst_null
/*     */     //   1754: aconst_null
/*     */     //   1755: aconst_null
/*     */     //   1756: aconst_null
/*     */     //   1757: aconst_null
/*     */     //   1758: lconst_0
/*     */     //   1759: aconst_null
/*     */     //   1760: aconst_null
/*     */     //   1761: aconst_null
/*     */     //   1762: lconst_0
/*     */     //   1763: aconst_null
/*     */     //   1764: aconst_null
/*     */     //   1765: aconst_null
/*     */     //   1766: iconst_0
/*     */     //   1767: iconst_0
/*     */     //   1768: lconst_0
/*     */     //   1769: aconst_null
/*     */     //   1770: aconst_null
/*     */     //   1771: aconst_null
/*     */     //   1772: iconst_0
/*     */     //   1773: iconst_0
/*     */     //   1774: aconst_null
/*     */     //   1775: ldc_w 16777214
/*     */     //   1778: aconst_null
/*     */     //   1779: invokestatic copy-p1EtxEg$default : (Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
/*     */     //   1782: astore #32
/*     */     //   1784: aload #24
/*     */     //   1786: aload #23
/*     */     //   1788: invokestatic InputField$lambda$1 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1791: aload #17
/*     */     //   1793: iconst_0
/*     */     //   1794: invokeinterface caretFor-xB6EZ8U : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1799: astore #33
/*     */     //   1801: aload_0
/*     */     //   1802: aload #17
/*     */     //   1804: ldc_w 912076411
/*     */     //   1807: invokeinterface startReplaceGroup : (I)V
/*     */     //   1812: aload_1
/*     */     //   1813: aload #27
/*     */     //   1815: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1820: astore #35
/*     */     //   1822: iload #15
/*     */     //   1824: ifne -> 1836
/*     */     //   1827: iload #29
/*     */     //   1829: ifeq -> 1836
/*     */     //   1832: iconst_1
/*     */     //   1833: goto -> 1837
/*     */     //   1836: iconst_0
/*     */     //   1837: istore #36
/*     */     //   1839: iconst_0
/*     */     //   1840: istore #37
/*     */     //   1842: iload #36
/*     */     //   1844: ifeq -> 1892
/*     */     //   1847: aload #35
/*     */     //   1849: astore #38
/*     */     //   1851: astore #40
/*     */     //   1853: iconst_0
/*     */     //   1854: istore #39
/*     */     //   1856: aload #38
/*     */     //   1858: aload #23
/*     */     //   1860: invokestatic InputField$lambda$1 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1863: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/InputFieldState;
/*     */     //   1866: aload #26
/*     */     //   1868: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1871: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Center : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   1874: fconst_0
/*     */     //   1875: fconst_0
/*     */     //   1876: aload #17
/*     */     //   1878: sipush #3072
/*     */     //   1881: bipush #24
/*     */     //   1883: invokestatic focusOutline-AGcomas : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   1886: aload #40
/*     */     //   1888: swap
/*     */     //   1889: goto -> 1894
/*     */     //   1892: aload #35
/*     */     //   1894: astore #34
/*     */     //   1896: aload #17
/*     */     //   1898: invokeinterface endReplaceGroup : ()V
/*     */     //   1903: aload #34
/*     */     //   1905: aload #30
/*     */     //   1907: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1912: aload #23
/*     */     //   1914: invokestatic InputField$lambda$1 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1917: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/InputFieldState;
/*     */     //   1920: aload #12
/*     */     //   1922: aload #26
/*     */     //   1924: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1927: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Center : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   1930: fconst_0
/*     */     //   1931: aload #17
/*     */     //   1933: sipush #24576
/*     */     //   1936: sipush #896
/*     */     //   1939: iload #22
/*     */     //   1941: iand
/*     */     //   1942: ior
/*     */     //   1943: bipush #16
/*     */     //   1945: invokestatic outline-HYR8e34 : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   1948: iload_2
/*     */     //   1949: iload_3
/*     */     //   1950: aload #4
/*     */     //   1952: aload #32
/*     */     //   1954: aload #6
/*     */     //   1956: aload #7
/*     */     //   1958: aload #8
/*     */     //   1960: aload #9
/*     */     //   1962: aload #10
/*     */     //   1964: new androidx/compose/ui/graphics/SolidColor
/*     */     //   1967: dup
/*     */     //   1968: aload #33
/*     */     //   1970: invokestatic InputField$lambda$10 : (Landroidx/compose/runtime/State;)J
/*     */     //   1973: aconst_null
/*     */     //   1974: invokespecial <init> : (JLkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1977: checkcast androidx/compose/ui/graphics/Brush
/*     */     //   1980: aload #13
/*     */     //   1982: aload #14
/*     */     //   1984: aload #16
/*     */     //   1986: aload #17
/*     */     //   1988: bipush #14
/*     */     //   1990: iload #21
/*     */     //   1992: iand
/*     */     //   1993: sipush #896
/*     */     //   1996: iload #21
/*     */     //   1998: iand
/*     */     //   1999: ior
/*     */     //   2000: sipush #7168
/*     */     //   2003: iload #21
/*     */     //   2005: iand
/*     */     //   2006: ior
/*     */     //   2007: ldc_w 57344
/*     */     //   2010: iload #21
/*     */     //   2012: iand
/*     */     //   2013: ior
/*     */     //   2014: ldc_w 3670016
/*     */     //   2017: iload #21
/*     */     //   2019: iand
/*     */     //   2020: ior
/*     */     //   2021: ldc_w 29360128
/*     */     //   2024: iload #21
/*     */     //   2026: iand
/*     */     //   2027: ior
/*     */     //   2028: ldc_w 234881024
/*     */     //   2031: iload #21
/*     */     //   2033: iand
/*     */     //   2034: ior
/*     */     //   2035: ldc_w 1879048192
/*     */     //   2038: iload #21
/*     */     //   2040: iand
/*     */     //   2041: ior
/*     */     //   2042: bipush #14
/*     */     //   2044: iload #22
/*     */     //   2046: iand
/*     */     //   2047: sipush #896
/*     */     //   2050: iload #22
/*     */     //   2052: iconst_3
/*     */     //   2053: ishr
/*     */     //   2054: iand
/*     */     //   2055: ior
/*     */     //   2056: sipush #7168
/*     */     //   2059: iload #22
/*     */     //   2061: iconst_3
/*     */     //   2062: ishr
/*     */     //   2063: iand
/*     */     //   2064: ior
/*     */     //   2065: ldc_w 57344
/*     */     //   2068: iload #22
/*     */     //   2070: bipush #6
/*     */     //   2072: ishr
/*     */     //   2073: iand
/*     */     //   2074: ior
/*     */     //   2075: iconst_0
/*     */     //   2076: invokestatic BasicTextField : (Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V
/*     */     //   2079: invokestatic isTraceInProgress : ()Z
/*     */     //   2082: ifeq -> 2098
/*     */     //   2085: invokestatic traceEventEnd : ()V
/*     */     //   2088: goto -> 2098
/*     */     //   2091: aload #17
/*     */     //   2093: invokeinterface skipToGroupEnd : ()V
/*     */     //   2098: aload #17
/*     */     //   2100: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   2105: dup
/*     */     //   2106: ifnull -> 2158
/*     */     //   2109: aload_0
/*     */     //   2110: aload_1
/*     */     //   2111: iload_2
/*     */     //   2112: iload_3
/*     */     //   2113: aload #4
/*     */     //   2115: aload #5
/*     */     //   2117: aload #6
/*     */     //   2119: aload #7
/*     */     //   2121: aload #8
/*     */     //   2123: aload #9
/*     */     //   2125: aload #10
/*     */     //   2127: aload #11
/*     */     //   2129: aload #12
/*     */     //   2131: aload #13
/*     */     //   2133: aload #14
/*     */     //   2135: iload #15
/*     */     //   2137: aload #16
/*     */     //   2139: iload #18
/*     */     //   2141: iload #19
/*     */     //   2143: iload #20
/*     */     //   2145: <illegal opcode> invoke : (Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/InputFieldStyle;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;ZLandroidx/compose/foundation/ScrollState;III)Lkotlin/jvm/functions/Function2;
/*     */     //   2150: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2155: goto -> 2159
/*     */     //   2158: pop
/*     */     //   2159: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #66	-> 61
/*     */     //   #64	-> 1003
/*     */     //   #66	-> 1068
/*     */     //   #67	-> 1100
/*     */     //   #259	-> 1104
/*     */     //   #260	-> 1116
/*     */     //   #261	-> 1132
/*     */     //   #67	-> 1135
/*     */     //   #261	-> 1158
/*     */     //   #262	-> 1160
/*     */     //   #263	-> 1169
/*     */     //   #264	-> 1174
/*     */     //   #260	-> 1176
/*     */     //   #259	-> 1177
/*     */     //   #259	-> 1178
/*     */     //   #67	-> 1179
/*     */     //   #68	-> 1227
/*     */     //   #265	-> 1231
/*     */     //   #266	-> 1243
/*     */     //   #267	-> 1259
/*     */     //   #68	-> 1262
/*     */     //   #267	-> 1286
/*     */     //   #268	-> 1288
/*     */     //   #269	-> 1297
/*     */     //   #270	-> 1302
/*     */     //   #266	-> 1304
/*     */     //   #265	-> 1305
/*     */     //   #265	-> 1306
/*     */     //   #70	-> 1315
/*     */     //   #271	-> 1359
/*     */     //   #272	-> 1371
/*     */     //   #273	-> 1387
/*     */     //   #70	-> 1392
/*     */     //   #273	-> 1410
/*     */     //   #274	-> 1412
/*     */     //   #275	-> 1421
/*     */     //   #276	-> 1426
/*     */     //   #272	-> 1428
/*     */     //   #271	-> 1429
/*     */     //   #271	-> 1430
/*     */     //   #70	-> 1431
/*     */     //   #79	-> 1455
/*     */     //   #80	-> 1464
/*     */     //   #81	-> 1481
/*     */     //   #84	-> 1498
/*     */     //   #277	-> 1521
/*     */     //   #84	-> 1535
/*     */     //   #278	-> 1548
/*     */     //   #84	-> 1560
/*     */     //   #278	-> 1575
/*     */     //   #84	-> 1580
/*     */     //   #83	-> 1580
/*     */     //   #86	-> 1582
/*     */     //   #87	-> 1604
/*     */     //   #89	-> 1619
/*     */     //   #279	-> 1642
/*     */     //   #89	-> 1656
/*     */     //   #280	-> 1674
/*     */     //   #90	-> 1686
/*     */     //   #91	-> 1688
/*     */     //   #92	-> 1691
/*     */     //   #93	-> 1703
/*     */     //   #94	-> 1708
/*     */     //   #90	-> 1713
/*     */     //   #95	-> 1720
/*     */     //   #280	-> 1721
/*     */     //   #89	-> 1726
/*     */     //   #88	-> 1726
/*     */     //   #98	-> 1728
/*     */     //   #99	-> 1745
/*     */     //   #100	-> 1784
/*     */     //   #103	-> 1801
/*     */     //   #105	-> 1812
/*     */     //   #106	-> 1813
/*     */     //   #107	-> 1822
/*     */     //   #281	-> 1842
/*     */     //   #108	-> 1856
/*     */     //   #281	-> 1889
/*     */     //   #107	-> 1894
/*     */     //   #110	-> 1905
/*     */     //   #111	-> 1912
/*     */     //   #112	-> 1948
/*     */     //   #113	-> 1949
/*     */     //   #114	-> 1950
/*     */     //   #115	-> 1952
/*     */     //   #116	-> 1954
/*     */     //   #117	-> 1956
/*     */     //   #118	-> 1958
/*     */     //   #119	-> 1960
/*     */     //   #120	-> 1962
/*     */     //   #121	-> 1964
/*     */     //   #122	-> 1980
/*     */     //   #123	-> 1982
/*     */     //   #124	-> 1984
/*     */     //   #102	-> 2076
/*     */     //   #126	-> 2091
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   1135	23	30	$i$a$-cache-InputFieldKt$InputField$inputFieldState$2	I
/*     */     //   1160	11	31	value$iv	Ljava/lang/Object;
/*     */     //   1116	61	29	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1113	64	28	it$iv	Ljava/lang/Object;
/*     */     //   1104	75	27	$i$f$cache	I
/*     */     //   1101	78	25	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1101	78	26	invalid$iv	Z
/*     */     //   1262	21	29	$i$a$-cache-InputFieldKt$InputField$1	I
/*     */     //   1288	11	30	value$iv	Ljava/lang/Object;
/*     */     //   1243	62	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1240	65	27	it$iv	Ljava/lang/Object;
/*     */     //   1231	76	26	$i$f$cache	I
/*     */     //   1228	79	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1228	79	25	invalid$iv	Z
/*     */     //   1392	15	30	$i$a$-cache-InputFieldKt$InputField$2	I
/*     */     //   1412	11	31	value$iv	Ljava/lang/Object;
/*     */     //   1371	58	29	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1368	61	28	it$iv	Ljava/lang/Object;
/*     */     //   1359	72	27	$i$f$cache	I
/*     */     //   1356	75	25	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1356	75	26	invalid$iv	Z
/*     */     //   1521	14	31	$i$f$isSpecified-8_81llA	I
/*     */     //   1518	17	29	$this$isSpecified$iv	J
/*     */     //   1560	15	32	$i$a$-thenIf-InputFieldKt$InputField$backgroundModifier$1	I
/*     */     //   1557	18	31	$this$InputField_u24lambda_u246	Landroidx/compose/ui/Modifier;
/*     */     //   1548	32	30	$i$f$thenIf	I
/*     */     //   1545	35	28	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1545	35	29	precondition$iv	Z
/*     */     //   1642	14	34	$i$f$isSpecified-8_81llA	I
/*     */     //   1639	17	32	$this$isSpecified$iv	J
/*     */     //   1686	35	35	$i$a$-thenIf-InputFieldKt$InputField$borderModifier$1	I
/*     */     //   1683	38	34	$this$InputField_u24lambda_u248	Landroidx/compose/ui/Modifier;
/*     */     //   1674	52	33	$i$f$thenIf	I
/*     */     //   1671	55	31	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1671	55	32	precondition$iv	Z
/*     */     //   1856	30	39	$i$a$-thenIf-InputFieldKt$InputField$3	I
/*     */     //   1853	33	38	$this$InputField_u24lambda_u2411	Landroidx/compose/ui/Modifier;
/*     */     //   1842	52	37	$i$f$thenIf	I
/*     */     //   1839	55	35	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1839	55	36	precondition$iv	Z
/*     */     //   1195	893	23	inputFieldState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1464	624	24	colors	Lorg/jetbrains/jewel/ui/component/styling/InputFieldColors;
/*     */     //   1481	607	25	backgroundColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   1498	590	26	shape	Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1582	506	27	backgroundModifier	Landroidx/compose/ui/Modifier;
/*     */     //   1604	484	28	borderColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   1619	469	29	hasNoOutline	Z
/*     */     //   1728	360	30	borderModifier	Landroidx/compose/ui/Modifier;
/*     */     //   1745	343	31	contentColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   1784	304	32	mergedTextStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   1801	287	33	caretColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   76	2084	21	$dirty	I
/*     */     //   80	2080	22	$dirty1	I
/*     */     //   0	2160	0	state	Landroidx/compose/foundation/text/input/TextFieldState;
/*     */     //   0	2160	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2160	2	enabled	Z
/*     */     //   0	2160	3	readOnly	Z
/*     */     //   0	2160	4	inputTransformation	Landroidx/compose/foundation/text/input/InputTransformation;
/*     */     //   0	2160	5	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	2160	6	keyboardOptions	Landroidx/compose/foundation/text/KeyboardOptions;
/*     */     //   0	2160	7	onKeyboardAction	Landroidx/compose/foundation/text/input/KeyboardActionHandler;
/*     */     //   0	2160	8	lineLimits	Landroidx/compose/foundation/text/input/TextFieldLineLimits;
/*     */     //   0	2160	9	onTextLayout	Lkotlin/jvm/functions/Function2;
/*     */     //   0	2160	10	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	2160	11	style	Lorg/jetbrains/jewel/ui/component/styling/InputFieldStyle;
/*     */     //   0	2160	12	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	2160	13	outputTransformation	Landroidx/compose/foundation/text/input/OutputTransformation;
/*     */     //   0	2160	14	decorator	Landroidx/compose/foundation/text/input/TextFieldDecorator;
/*     */     //   0	2160	15	undecorated	Z
/*     */     //   0	2160	16	scrollState	Landroidx/compose/foundation/ScrollState;
/*     */     //   0	2160	17	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2160	18	$changed	I
/*     */     //   0	2160	19	$changed1	I
/*     */   }
/*     */   
/*     */   private static final long InputField$lambda$1(MutableState $inputFieldState$delegate) {
/*  67 */     State state = (State)$inputFieldState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 305 */       (InputFieldState)state.getValue()).unbox-impl(); } private static final void InputField$lambda$2(MutableState $inputFieldState$delegate, long <set-?>) { MutableState mutableState = $inputFieldState$delegate; Object object1 = null, object2 = null; Object value$iv = InputFieldState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 306 */     mutableState.setValue(value$iv); } private static final long InputField$lambda$5(State $backgroundColor$delegate) { State state = $backgroundColor$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 308 */     return ((Color)state.getValue()).unbox-impl(); } @DebugMetadata(f = "InputField.kt", l = {71}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.InputFieldKt$InputField$2$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class InputFieldKt$InputField$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/* 309 */     int label; InputFieldKt$InputField$2$1(MutableInteractionSource $interactionSource, MutableState<InputFieldState> $inputFieldState$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$inputFieldState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { InputFieldKt.InputField$lambda$2(this.$inputFieldState$delegate, InputFieldState.copy-raUdB0Y$default(InputFieldKt.InputField$lambda$1(this.$inputFieldState$delegate), false, true, false, false, false, 29, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { InputFieldKt.InputField$lambda$2(this.$inputFieldState$delegate, InputFieldState.copy-raUdB0Y$default(InputFieldKt.InputField$lambda$1(this.$inputFieldState$delegate), false, false, false, false, false, 29, null)); }  return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$inputFieldState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { InputFieldKt.InputField$lambda$2(this.$inputFieldState$delegate, InputFieldState.copy-raUdB0Y$default(InputFieldKt.InputField$lambda$1(this.$inputFieldState$delegate), false, true, false, false, false, 29, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { InputFieldKt.InputField$lambda$2(this.$inputFieldState$delegate, InputFieldState.copy-raUdB0Y$default(InputFieldKt.InputField$lambda$1(this.$inputFieldState$delegate), false, false, false, false, false, 29, null)); }  return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super InputFieldKt$InputField$2$1> $completion) { return (Continuation<Unit>)new InputFieldKt$InputField$2$1(this.$interactionSource, this.$inputFieldState$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((InputFieldKt$InputField$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final long InputField$lambda$7(State $borderColor$delegate) { State state = $borderColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Color)state.getValue()).unbox-impl(); } private static final long InputField$lambda$9(State $contentColor$delegate) { State state = $contentColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 310 */     return ((Color)state.getValue()).unbox-impl(); } private static final long InputField$lambda$10(State $caretColor$delegate) { State state = $caretColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 311 */     return ((Color)state.getValue()).unbox-impl(); } @Deprecated(message = "NO") @ScheduledForRemoval @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]") public static final void InputField(@NotNull TextFieldValue value, @NotNull Function1 onValueChange, @NotNull Modifier modifier, boolean enabled, boolean readOnly, @NotNull Outline outline, boolean undecorated, @NotNull VisualTransformation visualTransformation, @NotNull KeyboardOptions keyboardOptions, @NotNull KeyboardActions keyboardActions, boolean singleLine, int maxLines, @NotNull Function1 onTextLayout, @NotNull MutableInteractionSource interactionSource, @NotNull InputFieldStyle style, @NotNull TextStyle textStyle, @NotNull Function4 decorationBox, @Nullable Composer $composer, int $changed, int $changed1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'value'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'onValueChange'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_2
/*     */     //   15: ldc 'modifier'
/*     */     //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   20: aload #5
/*     */     //   22: ldc 'outline'
/*     */     //   24: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   27: aload #7
/*     */     //   29: ldc_w 'visualTransformation'
/*     */     //   32: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   35: aload #8
/*     */     //   37: ldc 'keyboardOptions'
/*     */     //   39: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   42: aload #9
/*     */     //   44: ldc_w 'keyboardActions'
/*     */     //   47: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   50: aload #12
/*     */     //   52: ldc_w 'onTextLayout'
/*     */     //   55: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   58: aload #13
/*     */     //   60: ldc 'interactionSource'
/*     */     //   62: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   65: aload #14
/*     */     //   67: ldc 'style'
/*     */     //   69: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   72: aload #15
/*     */     //   74: ldc 'textStyle'
/*     */     //   76: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   79: aload #16
/*     */     //   81: ldc_w 'decorationBox'
/*     */     //   84: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   87: aload #17
/*     */     //   89: ldc_w 1789275829
/*     */     //   92: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   97: astore #17
/*     */     //   99: iload #18
/*     */     //   101: istore #20
/*     */     //   103: iload #19
/*     */     //   105: istore #21
/*     */     //   107: iload #18
/*     */     //   109: bipush #6
/*     */     //   111: iand
/*     */     //   112: ifne -> 136
/*     */     //   115: iload #20
/*     */     //   117: aload #17
/*     */     //   119: aload_0
/*     */     //   120: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   125: ifeq -> 132
/*     */     //   128: iconst_4
/*     */     //   129: goto -> 133
/*     */     //   132: iconst_2
/*     */     //   133: ior
/*     */     //   134: istore #20
/*     */     //   136: iload #18
/*     */     //   138: bipush #48
/*     */     //   140: iand
/*     */     //   141: ifne -> 167
/*     */     //   144: iload #20
/*     */     //   146: aload #17
/*     */     //   148: aload_1
/*     */     //   149: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   154: ifeq -> 162
/*     */     //   157: bipush #32
/*     */     //   159: goto -> 164
/*     */     //   162: bipush #16
/*     */     //   164: ior
/*     */     //   165: istore #20
/*     */     //   167: iload #18
/*     */     //   169: sipush #384
/*     */     //   172: iand
/*     */     //   173: ifne -> 201
/*     */     //   176: iload #20
/*     */     //   178: aload #17
/*     */     //   180: aload_2
/*     */     //   181: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   186: ifeq -> 195
/*     */     //   189: sipush #256
/*     */     //   192: goto -> 198
/*     */     //   195: sipush #128
/*     */     //   198: ior
/*     */     //   199: istore #20
/*     */     //   201: iload #18
/*     */     //   203: sipush #3072
/*     */     //   206: iand
/*     */     //   207: ifne -> 235
/*     */     //   210: iload #20
/*     */     //   212: aload #17
/*     */     //   214: iload_3
/*     */     //   215: invokeinterface changed : (Z)Z
/*     */     //   220: ifeq -> 229
/*     */     //   223: sipush #2048
/*     */     //   226: goto -> 232
/*     */     //   229: sipush #1024
/*     */     //   232: ior
/*     */     //   233: istore #20
/*     */     //   235: iload #18
/*     */     //   237: sipush #24576
/*     */     //   240: iand
/*     */     //   241: ifne -> 270
/*     */     //   244: iload #20
/*     */     //   246: aload #17
/*     */     //   248: iload #4
/*     */     //   250: invokeinterface changed : (Z)Z
/*     */     //   255: ifeq -> 264
/*     */     //   258: sipush #16384
/*     */     //   261: goto -> 267
/*     */     //   264: sipush #8192
/*     */     //   267: ior
/*     */     //   268: istore #20
/*     */     //   270: iload #18
/*     */     //   272: ldc 196608
/*     */     //   274: iand
/*     */     //   275: ifne -> 302
/*     */     //   278: iload #20
/*     */     //   280: aload #17
/*     */     //   282: aload #5
/*     */     //   284: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   289: ifeq -> 297
/*     */     //   292: ldc 131072
/*     */     //   294: goto -> 299
/*     */     //   297: ldc 65536
/*     */     //   299: ior
/*     */     //   300: istore #20
/*     */     //   302: iload #18
/*     */     //   304: ldc 1572864
/*     */     //   306: iand
/*     */     //   307: ifne -> 334
/*     */     //   310: iload #20
/*     */     //   312: aload #17
/*     */     //   314: iload #6
/*     */     //   316: invokeinterface changed : (Z)Z
/*     */     //   321: ifeq -> 329
/*     */     //   324: ldc 1048576
/*     */     //   326: goto -> 331
/*     */     //   329: ldc 524288
/*     */     //   331: ior
/*     */     //   332: istore #20
/*     */     //   334: iload #18
/*     */     //   336: ldc 12582912
/*     */     //   338: iand
/*     */     //   339: ifne -> 366
/*     */     //   342: iload #20
/*     */     //   344: aload #17
/*     */     //   346: aload #7
/*     */     //   348: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   353: ifeq -> 361
/*     */     //   356: ldc 8388608
/*     */     //   358: goto -> 363
/*     */     //   361: ldc 4194304
/*     */     //   363: ior
/*     */     //   364: istore #20
/*     */     //   366: iload #18
/*     */     //   368: ldc 100663296
/*     */     //   370: iand
/*     */     //   371: ifne -> 398
/*     */     //   374: iload #20
/*     */     //   376: aload #17
/*     */     //   378: aload #8
/*     */     //   380: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   385: ifeq -> 393
/*     */     //   388: ldc 67108864
/*     */     //   390: goto -> 395
/*     */     //   393: ldc 33554432
/*     */     //   395: ior
/*     */     //   396: istore #20
/*     */     //   398: iload #18
/*     */     //   400: ldc 805306368
/*     */     //   402: iand
/*     */     //   403: ifne -> 430
/*     */     //   406: iload #20
/*     */     //   408: aload #17
/*     */     //   410: aload #9
/*     */     //   412: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   417: ifeq -> 425
/*     */     //   420: ldc 536870912
/*     */     //   422: goto -> 427
/*     */     //   425: ldc 268435456
/*     */     //   427: ior
/*     */     //   428: istore #20
/*     */     //   430: iload #19
/*     */     //   432: bipush #6
/*     */     //   434: iand
/*     */     //   435: ifne -> 460
/*     */     //   438: iload #21
/*     */     //   440: aload #17
/*     */     //   442: iload #10
/*     */     //   444: invokeinterface changed : (Z)Z
/*     */     //   449: ifeq -> 456
/*     */     //   452: iconst_4
/*     */     //   453: goto -> 457
/*     */     //   456: iconst_2
/*     */     //   457: ior
/*     */     //   458: istore #21
/*     */     //   460: iload #19
/*     */     //   462: bipush #48
/*     */     //   464: iand
/*     */     //   465: ifne -> 492
/*     */     //   468: iload #21
/*     */     //   470: aload #17
/*     */     //   472: iload #11
/*     */     //   474: invokeinterface changed : (I)Z
/*     */     //   479: ifeq -> 487
/*     */     //   482: bipush #32
/*     */     //   484: goto -> 489
/*     */     //   487: bipush #16
/*     */     //   489: ior
/*     */     //   490: istore #21
/*     */     //   492: iload #19
/*     */     //   494: sipush #384
/*     */     //   497: iand
/*     */     //   498: ifne -> 527
/*     */     //   501: iload #21
/*     */     //   503: aload #17
/*     */     //   505: aload #12
/*     */     //   507: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   512: ifeq -> 521
/*     */     //   515: sipush #256
/*     */     //   518: goto -> 524
/*     */     //   521: sipush #128
/*     */     //   524: ior
/*     */     //   525: istore #21
/*     */     //   527: iload #19
/*     */     //   529: sipush #3072
/*     */     //   532: iand
/*     */     //   533: ifne -> 562
/*     */     //   536: iload #21
/*     */     //   538: aload #17
/*     */     //   540: aload #13
/*     */     //   542: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   547: ifeq -> 556
/*     */     //   550: sipush #2048
/*     */     //   553: goto -> 559
/*     */     //   556: sipush #1024
/*     */     //   559: ior
/*     */     //   560: istore #21
/*     */     //   562: iload #19
/*     */     //   564: sipush #24576
/*     */     //   567: iand
/*     */     //   568: ifne -> 597
/*     */     //   571: iload #21
/*     */     //   573: aload #17
/*     */     //   575: aload #14
/*     */     //   577: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   582: ifeq -> 591
/*     */     //   585: sipush #16384
/*     */     //   588: goto -> 594
/*     */     //   591: sipush #8192
/*     */     //   594: ior
/*     */     //   595: istore #21
/*     */     //   597: iload #19
/*     */     //   599: ldc 196608
/*     */     //   601: iand
/*     */     //   602: ifne -> 629
/*     */     //   605: iload #21
/*     */     //   607: aload #17
/*     */     //   609: aload #15
/*     */     //   611: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   616: ifeq -> 624
/*     */     //   619: ldc 131072
/*     */     //   621: goto -> 626
/*     */     //   624: ldc 65536
/*     */     //   626: ior
/*     */     //   627: istore #21
/*     */     //   629: iload #19
/*     */     //   631: ldc 1572864
/*     */     //   633: iand
/*     */     //   634: ifne -> 661
/*     */     //   637: iload #21
/*     */     //   639: aload #17
/*     */     //   641: aload #16
/*     */     //   643: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   648: ifeq -> 656
/*     */     //   651: ldc 1048576
/*     */     //   653: goto -> 658
/*     */     //   656: ldc 524288
/*     */     //   658: ior
/*     */     //   659: istore #21
/*     */     //   661: iload #20
/*     */     //   663: ldc 306783379
/*     */     //   665: iand
/*     */     //   666: ldc 306783378
/*     */     //   668: if_icmpne -> 691
/*     */     //   671: iload #21
/*     */     //   673: ldc 599187
/*     */     //   675: iand
/*     */     //   676: ldc 599186
/*     */     //   678: if_icmpne -> 691
/*     */     //   681: aload #17
/*     */     //   683: invokeinterface getSkipping : ()Z
/*     */     //   688: ifne -> 1773
/*     */     //   691: invokestatic isTraceInProgress : ()Z
/*     */     //   694: ifeq -> 710
/*     */     //   697: ldc_w 1789275829
/*     */     //   700: iload #20
/*     */     //   702: iload #21
/*     */     //   704: ldc_w 'org.jetbrains.jewel.ui.component.InputField (InputField.kt:148)'
/*     */     //   707: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   710: aload #17
/*     */     //   712: ldc_w 912125347
/*     */     //   715: invokeinterface startReplaceGroup : (I)V
/*     */     //   720: aload #17
/*     */     //   722: astore #24
/*     */     //   724: iload #21
/*     */     //   726: sipush #7168
/*     */     //   729: iand
/*     */     //   730: sipush #2048
/*     */     //   733: if_icmpne -> 740
/*     */     //   736: iconst_1
/*     */     //   737: goto -> 741
/*     */     //   740: iconst_0
/*     */     //   741: istore #25
/*     */     //   743: nop
/*     */     //   744: iconst_0
/*     */     //   745: istore #26
/*     */     //   747: aload #24
/*     */     //   749: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   754: astore #27
/*     */     //   756: iconst_0
/*     */     //   757: istore #28
/*     */     //   759: iload #25
/*     */     //   761: ifne -> 775
/*     */     //   764: aload #27
/*     */     //   766: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   769: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   772: if_acmpne -> 817
/*     */     //   775: iconst_0
/*     */     //   776: istore #29
/*     */     //   778: getstatic org/jetbrains/jewel/ui/component/InputFieldState.Companion : Lorg/jetbrains/jewel/ui/component/InputFieldState$Companion;
/*     */     //   781: iload_3
/*     */     //   782: iconst_0
/*     */     //   783: iconst_0
/*     */     //   784: iconst_0
/*     */     //   785: iconst_0
/*     */     //   786: bipush #30
/*     */     //   788: aconst_null
/*     */     //   789: invokestatic of-raUdB0Y$default : (Lorg/jetbrains/jewel/ui/component/InputFieldState$Companion;ZZZZZILjava/lang/Object;)J
/*     */     //   792: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/InputFieldState;
/*     */     //   795: aconst_null
/*     */     //   796: iconst_2
/*     */     //   797: aconst_null
/*     */     //   798: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   801: astore #30
/*     */     //   803: aload #24
/*     */     //   805: aload #30
/*     */     //   807: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   812: aload #30
/*     */     //   814: goto -> 819
/*     */     //   817: aload #27
/*     */     //   819: nop
/*     */     //   820: nop
/*     */     //   821: nop
/*     */     //   822: checkcast androidx/compose/runtime/MutableState
/*     */     //   825: astore #23
/*     */     //   827: aload #17
/*     */     //   829: invokeinterface endReplaceGroup : ()V
/*     */     //   834: aload #23
/*     */     //   836: astore #22
/*     */     //   838: aload #17
/*     */     //   840: ldc_w 912128211
/*     */     //   843: invokeinterface startReplaceGroup : (I)V
/*     */     //   848: aload #17
/*     */     //   850: astore #23
/*     */     //   852: iload #20
/*     */     //   854: sipush #7168
/*     */     //   857: iand
/*     */     //   858: sipush #2048
/*     */     //   861: if_icmpne -> 868
/*     */     //   864: iconst_1
/*     */     //   865: goto -> 869
/*     */     //   868: iconst_0
/*     */     //   869: istore #24
/*     */     //   871: nop
/*     */     //   872: iconst_0
/*     */     //   873: istore #25
/*     */     //   875: aload #23
/*     */     //   877: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   882: astore #26
/*     */     //   884: iconst_0
/*     */     //   885: istore #27
/*     */     //   887: iload #24
/*     */     //   889: ifne -> 903
/*     */     //   892: aload #26
/*     */     //   894: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   897: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   900: if_acmpne -> 946
/*     */     //   903: iconst_0
/*     */     //   904: istore #28
/*     */     //   906: aload #22
/*     */     //   908: aload #22
/*     */     //   910: invokestatic InputField$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   913: iload_3
/*     */     //   914: iconst_0
/*     */     //   915: iconst_0
/*     */     //   916: iconst_0
/*     */     //   917: iconst_0
/*     */     //   918: bipush #30
/*     */     //   920: aconst_null
/*     */     //   921: invokestatic copy-raUdB0Y$default : (JZZZZZILjava/lang/Object;)J
/*     */     //   924: invokestatic InputField$lambda$15 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   927: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   930: astore #29
/*     */     //   932: aload #23
/*     */     //   934: aload #29
/*     */     //   936: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   941: aload #29
/*     */     //   943: goto -> 948
/*     */     //   946: aload #26
/*     */     //   948: nop
/*     */     //   949: nop
/*     */     //   950: nop
/*     */     //   951: pop
/*     */     //   952: aload #17
/*     */     //   954: invokeinterface endReplaceGroup : ()V
/*     */     //   959: aload #13
/*     */     //   961: aload #17
/*     */     //   963: ldc_w 912131941
/*     */     //   966: invokeinterface startReplaceGroup : (I)V
/*     */     //   971: aload #17
/*     */     //   973: astore #24
/*     */     //   975: iload #21
/*     */     //   977: sipush #7168
/*     */     //   980: iand
/*     */     //   981: sipush #2048
/*     */     //   984: if_icmpne -> 991
/*     */     //   987: iconst_1
/*     */     //   988: goto -> 992
/*     */     //   991: iconst_0
/*     */     //   992: aload #17
/*     */     //   994: aload #22
/*     */     //   996: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1001: ior
/*     */     //   1002: istore #25
/*     */     //   1004: iconst_0
/*     */     //   1005: istore #26
/*     */     //   1007: aload #24
/*     */     //   1009: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1014: astore #27
/*     */     //   1016: iconst_0
/*     */     //   1017: istore #28
/*     */     //   1019: iload #25
/*     */     //   1021: ifne -> 1035
/*     */     //   1024: aload #27
/*     */     //   1026: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1029: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1032: if_acmpne -> 1074
/*     */     //   1035: astore #40
/*     */     //   1037: iconst_0
/*     */     //   1038: istore #29
/*     */     //   1040: new org/jetbrains/jewel/ui/component/InputFieldKt$InputField$6$1
/*     */     //   1043: dup
/*     */     //   1044: aload #13
/*     */     //   1046: aload #22
/*     */     //   1048: aconst_null
/*     */     //   1049: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   1052: checkcast kotlin/jvm/functions/Function2
/*     */     //   1055: aload #40
/*     */     //   1057: swap
/*     */     //   1058: astore #30
/*     */     //   1060: aload #24
/*     */     //   1062: aload #30
/*     */     //   1064: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1069: aload #30
/*     */     //   1071: goto -> 1076
/*     */     //   1074: aload #27
/*     */     //   1076: nop
/*     */     //   1077: nop
/*     */     //   1078: nop
/*     */     //   1079: checkcast kotlin/jvm/functions/Function2
/*     */     //   1082: astore #23
/*     */     //   1084: aload #17
/*     */     //   1086: invokeinterface endReplaceGroup : ()V
/*     */     //   1091: aload #23
/*     */     //   1093: aload #17
/*     */     //   1095: bipush #14
/*     */     //   1097: iload #21
/*     */     //   1099: bipush #9
/*     */     //   1101: ishr
/*     */     //   1102: iand
/*     */     //   1103: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1106: aload #14
/*     */     //   1108: invokeinterface getColors : ()Lorg/jetbrains/jewel/ui/component/styling/InputFieldColors;
/*     */     //   1113: astore #23
/*     */     //   1115: aload #23
/*     */     //   1117: aload #22
/*     */     //   1119: invokestatic InputField$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1122: aload #17
/*     */     //   1124: iconst_0
/*     */     //   1125: invokeinterface backgroundFor-xB6EZ8U : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1130: astore #24
/*     */     //   1132: aload #14
/*     */     //   1134: invokeinterface getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/InputFieldMetrics;
/*     */     //   1139: invokeinterface getCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   1144: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1147: astore #25
/*     */     //   1149: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1152: checkcast androidx/compose/ui/Modifier
/*     */     //   1155: astore #27
/*     */     //   1157: iload #6
/*     */     //   1159: ifne -> 1193
/*     */     //   1162: aload #24
/*     */     //   1164: invokestatic InputField$lambda$18 : (Landroidx/compose/runtime/State;)J
/*     */     //   1167: lstore #28
/*     */     //   1169: iconst_0
/*     */     //   1170: istore #30
/*     */     //   1172: lload #28
/*     */     //   1174: ldc2_w 16
/*     */     //   1177: lcmp
/*     */     //   1178: ifeq -> 1185
/*     */     //   1181: iconst_1
/*     */     //   1182: goto -> 1186
/*     */     //   1185: iconst_0
/*     */     //   1186: ifeq -> 1193
/*     */     //   1189: iconst_1
/*     */     //   1190: goto -> 1194
/*     */     //   1193: iconst_0
/*     */     //   1194: istore #28
/*     */     //   1196: iconst_0
/*     */     //   1197: istore #29
/*     */     //   1199: iload #28
/*     */     //   1201: ifeq -> 1229
/*     */     //   1204: aload #27
/*     */     //   1206: astore #30
/*     */     //   1208: iconst_0
/*     */     //   1209: istore #31
/*     */     //   1211: aload #30
/*     */     //   1213: aload #24
/*     */     //   1215: invokestatic InputField$lambda$18 : (Landroidx/compose/runtime/State;)J
/*     */     //   1218: aload #25
/*     */     //   1220: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1223: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   1226: goto -> 1231
/*     */     //   1229: aload #27
/*     */     //   1231: astore #26
/*     */     //   1233: aload #14
/*     */     //   1235: invokeinterface getColors : ()Lorg/jetbrains/jewel/ui/component/styling/InputFieldColors;
/*     */     //   1240: aload #22
/*     */     //   1242: invokestatic InputField$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1245: aload #17
/*     */     //   1247: iconst_0
/*     */     //   1248: invokeinterface borderFor-xB6EZ8U : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1253: astore #27
/*     */     //   1255: aload #5
/*     */     //   1257: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   1260: if_acmpne -> 1267
/*     */     //   1263: iconst_1
/*     */     //   1264: goto -> 1268
/*     */     //   1267: iconst_0
/*     */     //   1268: istore #28
/*     */     //   1270: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1273: checkcast androidx/compose/ui/Modifier
/*     */     //   1276: astore #30
/*     */     //   1278: iload #6
/*     */     //   1280: ifne -> 1319
/*     */     //   1283: aload #27
/*     */     //   1285: invokestatic InputField$lambda$20 : (Landroidx/compose/runtime/State;)J
/*     */     //   1288: lstore #31
/*     */     //   1290: iconst_0
/*     */     //   1291: istore #33
/*     */     //   1293: lload #31
/*     */     //   1295: ldc2_w 16
/*     */     //   1298: lcmp
/*     */     //   1299: ifeq -> 1306
/*     */     //   1302: iconst_1
/*     */     //   1303: goto -> 1307
/*     */     //   1306: iconst_0
/*     */     //   1307: ifeq -> 1319
/*     */     //   1310: iload #28
/*     */     //   1312: ifeq -> 1319
/*     */     //   1315: iconst_1
/*     */     //   1316: goto -> 1320
/*     */     //   1319: iconst_0
/*     */     //   1320: istore #31
/*     */     //   1322: iconst_0
/*     */     //   1323: istore #32
/*     */     //   1325: iload #31
/*     */     //   1327: ifeq -> 1375
/*     */     //   1330: aload #30
/*     */     //   1332: astore #33
/*     */     //   1334: iconst_0
/*     */     //   1335: istore #34
/*     */     //   1337: aload #33
/*     */     //   1339: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Center : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   1342: aload #14
/*     */     //   1344: invokeinterface getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/InputFieldMetrics;
/*     */     //   1349: invokeinterface getBorderWidth-D9Ej5fM : ()F
/*     */     //   1354: aload #27
/*     */     //   1356: invokestatic InputField$lambda$20 : (Landroidx/compose/runtime/State;)J
/*     */     //   1359: aload #25
/*     */     //   1361: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1364: fconst_0
/*     */     //   1365: bipush #16
/*     */     //   1367: aconst_null
/*     */     //   1368: invokestatic border-QWjY48E$default : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FJLandroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1371: nop
/*     */     //   1372: goto -> 1377
/*     */     //   1375: aload #30
/*     */     //   1377: astore #29
/*     */     //   1379: aload #23
/*     */     //   1381: aload #22
/*     */     //   1383: invokestatic InputField$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1386: aload #17
/*     */     //   1388: iconst_0
/*     */     //   1389: invokeinterface contentFor-xB6EZ8U : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1394: astore #30
/*     */     //   1396: aload #15
/*     */     //   1398: aload #30
/*     */     //   1400: invokestatic InputField$lambda$22 : (Landroidx/compose/runtime/State;)J
/*     */     //   1403: lconst_0
/*     */     //   1404: aconst_null
/*     */     //   1405: aconst_null
/*     */     //   1406: aconst_null
/*     */     //   1407: aconst_null
/*     */     //   1408: aconst_null
/*     */     //   1409: lconst_0
/*     */     //   1410: aconst_null
/*     */     //   1411: aconst_null
/*     */     //   1412: aconst_null
/*     */     //   1413: lconst_0
/*     */     //   1414: aconst_null
/*     */     //   1415: aconst_null
/*     */     //   1416: aconst_null
/*     */     //   1417: iconst_0
/*     */     //   1418: iconst_0
/*     */     //   1419: lconst_0
/*     */     //   1420: aconst_null
/*     */     //   1421: aconst_null
/*     */     //   1422: aconst_null
/*     */     //   1423: iconst_0
/*     */     //   1424: iconst_0
/*     */     //   1425: aconst_null
/*     */     //   1426: ldc_w 16777214
/*     */     //   1429: aconst_null
/*     */     //   1430: invokestatic copy-p1EtxEg$default : (Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
/*     */     //   1433: astore #31
/*     */     //   1435: aload #23
/*     */     //   1437: aload #22
/*     */     //   1439: invokestatic InputField$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1442: aload #17
/*     */     //   1444: iconst_0
/*     */     //   1445: invokeinterface caretFor-xB6EZ8U : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1450: astore #32
/*     */     //   1452: aload #17
/*     */     //   1454: ldc_w 912175894
/*     */     //   1457: invokeinterface startReplaceGroup : (I)V
/*     */     //   1462: aload_2
/*     */     //   1463: aload #26
/*     */     //   1465: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1470: aload #29
/*     */     //   1472: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1477: astore #35
/*     */     //   1479: iload #6
/*     */     //   1481: ifne -> 1493
/*     */     //   1484: iload #28
/*     */     //   1486: ifeq -> 1493
/*     */     //   1489: iconst_1
/*     */     //   1490: goto -> 1494
/*     */     //   1493: iconst_0
/*     */     //   1494: istore #36
/*     */     //   1496: iconst_0
/*     */     //   1497: istore #37
/*     */     //   1499: iload #36
/*     */     //   1501: ifeq -> 1540
/*     */     //   1504: aload #35
/*     */     //   1506: astore #38
/*     */     //   1508: iconst_0
/*     */     //   1509: istore #39
/*     */     //   1511: aload #38
/*     */     //   1513: aload #22
/*     */     //   1515: invokestatic InputField$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1518: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/InputFieldState;
/*     */     //   1521: aload #25
/*     */     //   1523: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1526: aconst_null
/*     */     //   1527: fconst_0
/*     */     //   1528: fconst_0
/*     */     //   1529: aload #17
/*     */     //   1531: iconst_0
/*     */     //   1532: bipush #28
/*     */     //   1534: invokestatic focusOutline-AGcomas : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   1537: goto -> 1542
/*     */     //   1540: aload #35
/*     */     //   1542: astore #34
/*     */     //   1544: aload #17
/*     */     //   1546: invokeinterface endReplaceGroup : ()V
/*     */     //   1551: aload #34
/*     */     //   1553: aload #22
/*     */     //   1555: invokestatic InputField$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1558: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/InputFieldState;
/*     */     //   1561: aload #5
/*     */     //   1563: aload #25
/*     */     //   1565: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1568: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Center : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   1571: fconst_0
/*     */     //   1572: aload #17
/*     */     //   1574: sipush #24576
/*     */     //   1577: sipush #896
/*     */     //   1580: iload #20
/*     */     //   1582: bipush #9
/*     */     //   1584: ishr
/*     */     //   1585: iand
/*     */     //   1586: ior
/*     */     //   1587: bipush #16
/*     */     //   1589: invokestatic outline-HYR8e34 : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   1592: astore #33
/*     */     //   1594: new androidx/compose/ui/graphics/SolidColor
/*     */     //   1597: dup
/*     */     //   1598: aload #32
/*     */     //   1600: invokestatic InputField$lambda$23 : (Landroidx/compose/runtime/State;)J
/*     */     //   1603: aconst_null
/*     */     //   1604: invokespecial <init> : (JLkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1607: astore #34
/*     */     //   1609: aload_0
/*     */     //   1610: aload_1
/*     */     //   1611: aload #33
/*     */     //   1613: iload_3
/*     */     //   1614: iload #4
/*     */     //   1616: aload #31
/*     */     //   1618: aload #8
/*     */     //   1620: aload #9
/*     */     //   1622: iload #10
/*     */     //   1624: iload #11
/*     */     //   1626: iconst_0
/*     */     //   1627: aload #7
/*     */     //   1629: aload #12
/*     */     //   1631: aload #13
/*     */     //   1633: aload #34
/*     */     //   1635: checkcast androidx/compose/ui/graphics/Brush
/*     */     //   1638: ldc_w 2091292274
/*     */     //   1641: iconst_1
/*     */     //   1642: new org/jetbrains/jewel/ui/component/InputFieldKt$InputField$8
/*     */     //   1645: dup
/*     */     //   1646: aload #16
/*     */     //   1648: aload #22
/*     */     //   1650: invokespecial <init> : (Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/MutableState;)V
/*     */     //   1653: aload #17
/*     */     //   1655: bipush #54
/*     */     //   1657: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1660: checkcast kotlin/jvm/functions/Function3
/*     */     //   1663: aload #17
/*     */     //   1665: bipush #14
/*     */     //   1667: iload #20
/*     */     //   1669: iand
/*     */     //   1670: bipush #112
/*     */     //   1672: iload #20
/*     */     //   1674: iand
/*     */     //   1675: ior
/*     */     //   1676: sipush #7168
/*     */     //   1679: iload #20
/*     */     //   1681: iand
/*     */     //   1682: ior
/*     */     //   1683: ldc_w 57344
/*     */     //   1686: iload #20
/*     */     //   1688: iand
/*     */     //   1689: ior
/*     */     //   1690: ldc_w 3670016
/*     */     //   1693: iload #20
/*     */     //   1695: bipush #6
/*     */     //   1697: ishr
/*     */     //   1698: iand
/*     */     //   1699: ior
/*     */     //   1700: ldc_w 29360128
/*     */     //   1703: iload #20
/*     */     //   1705: bipush #6
/*     */     //   1707: ishr
/*     */     //   1708: iand
/*     */     //   1709: ior
/*     */     //   1710: ldc_w 234881024
/*     */     //   1713: iload #21
/*     */     //   1715: bipush #24
/*     */     //   1717: ishl
/*     */     //   1718: iand
/*     */     //   1719: ior
/*     */     //   1720: ldc_w 1879048192
/*     */     //   1723: iload #21
/*     */     //   1725: bipush #24
/*     */     //   1727: ishl
/*     */     //   1728: iand
/*     */     //   1729: ior
/*     */     //   1730: ldc 196608
/*     */     //   1732: bipush #112
/*     */     //   1734: iload #20
/*     */     //   1736: bipush #18
/*     */     //   1738: ishr
/*     */     //   1739: iand
/*     */     //   1740: ior
/*     */     //   1741: sipush #896
/*     */     //   1744: iload #21
/*     */     //   1746: iand
/*     */     //   1747: ior
/*     */     //   1748: sipush #7168
/*     */     //   1751: iload #21
/*     */     //   1753: iand
/*     */     //   1754: ior
/*     */     //   1755: sipush #1024
/*     */     //   1758: invokestatic BasicTextField : (Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1761: invokestatic isTraceInProgress : ()Z
/*     */     //   1764: ifeq -> 1780
/*     */     //   1767: invokestatic traceEventEnd : ()V
/*     */     //   1770: goto -> 1780
/*     */     //   1773: aload #17
/*     */     //   1775: invokeinterface skipToGroupEnd : ()V
/*     */     //   1780: aload #17
/*     */     //   1782: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1787: dup
/*     */     //   1788: ifnull -> 1838
/*     */     //   1791: aload_0
/*     */     //   1792: aload_1
/*     */     //   1793: aload_2
/*     */     //   1794: iload_3
/*     */     //   1795: iload #4
/*     */     //   1797: aload #5
/*     */     //   1799: iload #6
/*     */     //   1801: aload #7
/*     */     //   1803: aload #8
/*     */     //   1805: aload #9
/*     */     //   1807: iload #10
/*     */     //   1809: iload #11
/*     */     //   1811: aload #12
/*     */     //   1813: aload #13
/*     */     //   1815: aload #14
/*     */     //   1817: aload #15
/*     */     //   1819: aload #16
/*     */     //   1821: iload #18
/*     */     //   1823: iload #19
/*     */     //   1825: <illegal opcode> invoke : (Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/Outline;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/InputFieldStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function4;II)Lkotlin/jvm/functions/Function2;
/*     */     //   1830: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1835: goto -> 1839
/*     */     //   1838: pop
/*     */     //   1839: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #149	-> 87
/*     */     //   #150	-> 743
/*     */     //   #282	-> 747
/*     */     //   #283	-> 759
/*     */     //   #284	-> 775
/*     */     //   #150	-> 778
/*     */     //   #284	-> 801
/*     */     //   #285	-> 803
/*     */     //   #286	-> 812
/*     */     //   #287	-> 817
/*     */     //   #283	-> 819
/*     */     //   #282	-> 820
/*     */     //   #282	-> 821
/*     */     //   #150	-> 822
/*     */     //   #151	-> 871
/*     */     //   #288	-> 875
/*     */     //   #289	-> 887
/*     */     //   #290	-> 903
/*     */     //   #151	-> 906
/*     */     //   #290	-> 930
/*     */     //   #291	-> 932
/*     */     //   #292	-> 941
/*     */     //   #293	-> 946
/*     */     //   #289	-> 948
/*     */     //   #288	-> 949
/*     */     //   #288	-> 950
/*     */     //   #153	-> 959
/*     */     //   #294	-> 1007
/*     */     //   #295	-> 1019
/*     */     //   #296	-> 1035
/*     */     //   #153	-> 1040
/*     */     //   #296	-> 1058
/*     */     //   #297	-> 1060
/*     */     //   #298	-> 1069
/*     */     //   #299	-> 1074
/*     */     //   #295	-> 1076
/*     */     //   #294	-> 1077
/*     */     //   #294	-> 1078
/*     */     //   #153	-> 1079
/*     */     //   #162	-> 1106
/*     */     //   #163	-> 1115
/*     */     //   #164	-> 1132
/*     */     //   #167	-> 1149
/*     */     //   #300	-> 1172
/*     */     //   #167	-> 1186
/*     */     //   #301	-> 1199
/*     */     //   #167	-> 1211
/*     */     //   #301	-> 1226
/*     */     //   #167	-> 1231
/*     */     //   #166	-> 1231
/*     */     //   #169	-> 1233
/*     */     //   #170	-> 1255
/*     */     //   #172	-> 1270
/*     */     //   #302	-> 1293
/*     */     //   #172	-> 1307
/*     */     //   #303	-> 1325
/*     */     //   #173	-> 1337
/*     */     //   #174	-> 1339
/*     */     //   #175	-> 1342
/*     */     //   #176	-> 1354
/*     */     //   #177	-> 1359
/*     */     //   #173	-> 1364
/*     */     //   #178	-> 1371
/*     */     //   #303	-> 1372
/*     */     //   #172	-> 1377
/*     */     //   #171	-> 1377
/*     */     //   #181	-> 1379
/*     */     //   #182	-> 1396
/*     */     //   #183	-> 1435
/*     */     //   #188	-> 1462
/*     */     //   #189	-> 1463
/*     */     //   #190	-> 1470
/*     */     //   #191	-> 1479
/*     */     //   #304	-> 1499
/*     */     //   #191	-> 1511
/*     */     //   #304	-> 1537
/*     */     //   #191	-> 1542
/*     */     //   #192	-> 1553
/*     */     //   #197	-> 1594
/*     */     //   #186	-> 1609
/*     */     //   #193	-> 1610
/*     */     //   #192	-> 1611
/*     */     //   #194	-> 1613
/*     */     //   #195	-> 1614
/*     */     //   #196	-> 1616
/*     */     //   #200	-> 1618
/*     */     //   #201	-> 1620
/*     */     //   #203	-> 1622
/*     */     //   #204	-> 1624
/*     */     //   #198	-> 1627
/*     */     //   #199	-> 1629
/*     */     //   #202	-> 1631
/*     */     //   #197	-> 1633
/*     */     //   #206	-> 1638
/*     */     //   #185	-> 1758
/*     */     //   #208	-> 1773
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   778	23	29	$i$a$-cache-InputFieldKt$InputField$inputState$2	I
/*     */     //   803	11	30	value$iv	Ljava/lang/Object;
/*     */     //   759	61	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   756	64	27	it$iv	Ljava/lang/Object;
/*     */     //   747	75	26	$i$f$cache	I
/*     */     //   744	78	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   744	78	25	invalid$iv	Z
/*     */     //   906	21	28	$i$a$-cache-InputFieldKt$InputField$5	I
/*     */     //   932	11	29	value$iv	Ljava/lang/Object;
/*     */     //   887	62	27	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   884	65	26	it$iv	Ljava/lang/Object;
/*     */     //   875	76	25	$i$f$cache	I
/*     */     //   872	79	23	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   872	79	24	invalid$iv	Z
/*     */     //   1040	15	29	$i$a$-cache-InputFieldKt$InputField$6	I
/*     */     //   1060	11	30	value$iv	Ljava/lang/Object;
/*     */     //   1019	58	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1016	61	27	it$iv	Ljava/lang/Object;
/*     */     //   1007	72	26	$i$f$cache	I
/*     */     //   1004	75	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1004	75	25	invalid$iv	Z
/*     */     //   1172	14	30	$i$f$isSpecified-8_81llA	I
/*     */     //   1169	17	28	$this$isSpecified$iv	J
/*     */     //   1211	15	31	$i$a$-thenIf-InputFieldKt$InputField$backgroundModifier$2	I
/*     */     //   1208	18	30	$this$InputField_u24lambda_u2419	Landroidx/compose/ui/Modifier;
/*     */     //   1199	32	29	$i$f$thenIf	I
/*     */     //   1196	35	27	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1196	35	28	precondition$iv	Z
/*     */     //   1293	14	33	$i$f$isSpecified-8_81llA	I
/*     */     //   1290	17	31	$this$isSpecified$iv	J
/*     */     //   1337	35	34	$i$a$-thenIf-InputFieldKt$InputField$borderModifier$2	I
/*     */     //   1334	38	33	$this$InputField_u24lambda_u2421	Landroidx/compose/ui/Modifier;
/*     */     //   1325	52	32	$i$f$thenIf	I
/*     */     //   1322	55	30	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1322	55	31	precondition$iv	Z
/*     */     //   1511	26	39	$i$a$-thenIf-InputFieldKt$InputField$7	I
/*     */     //   1508	29	38	$this$InputField_u24lambda_u2424	Landroidx/compose/ui/Modifier;
/*     */     //   1499	43	37	$i$f$thenIf	I
/*     */     //   1496	46	35	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1496	46	36	precondition$iv	Z
/*     */     //   838	932	22	inputState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1115	655	23	colors	Lorg/jetbrains/jewel/ui/component/styling/InputFieldColors;
/*     */     //   1132	638	24	backgroundColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   1149	621	25	shape	Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1233	537	26	backgroundModifier	Landroidx/compose/ui/Modifier;
/*     */     //   1255	515	27	borderColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   1270	500	28	hasNoOutline	Z
/*     */     //   1379	391	29	borderModifier	Landroidx/compose/ui/Modifier;
/*     */     //   1396	374	30	contentColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   1435	335	31	mergedTextStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   1452	318	32	caretColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   103	1737	20	$dirty	I
/*     */     //   107	1733	21	$dirty1	I
/*     */     //   0	1840	0	value	Landroidx/compose/ui/text/input/TextFieldValue;
/*     */     //   0	1840	1	onValueChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1840	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1840	3	enabled	Z
/*     */     //   0	1840	4	readOnly	Z
/*     */     //   0	1840	5	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	1840	6	undecorated	Z
/*     */     //   0	1840	7	visualTransformation	Landroidx/compose/ui/text/input/VisualTransformation;
/*     */     //   0	1840	8	keyboardOptions	Landroidx/compose/foundation/text/KeyboardOptions;
/*     */     //   0	1840	9	keyboardActions	Landroidx/compose/foundation/text/KeyboardActions;
/*     */     //   0	1840	10	singleLine	Z
/*     */     //   0	1840	11	maxLines	I
/*     */     //   0	1840	12	onTextLayout	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1840	13	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1840	14	style	Lorg/jetbrains/jewel/ui/component/styling/InputFieldStyle;
/*     */     //   0	1840	15	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1840	16	decorationBox	Lkotlin/jvm/functions/Function4;
/*     */     //   0	1840	17	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1840	18	$changed	I
/*     */     //   0	1840	19	$changed1	I }
/* 312 */   private static final long InputField$lambda$14(MutableState $inputState$delegate) { State state = (State)$inputState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((InputFieldState)state.getValue()).unbox-impl(); } private static final void InputField$lambda$15(MutableState $inputState$delegate, long <set-?>) { MutableState mutableState = $inputState$delegate; Object object1 = null, object2 = null; Object value$iv = InputFieldState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 313 */     mutableState.setValue(value$iv); } @DebugMetadata(f = "InputField.kt", l = {154}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.InputFieldKt$InputField$6$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class InputFieldKt$InputField$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label; InputFieldKt$InputField$6$1(MutableInteractionSource $interactionSource, MutableState<InputFieldState> $inputState$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$inputState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { InputFieldKt.InputField$lambda$15(this.$inputState$delegate, InputFieldState.copy-raUdB0Y$default(InputFieldKt.InputField$lambda$14(this.$inputState$delegate), false, true, false, false, false, 29, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { InputFieldKt.InputField$lambda$15(this.$inputState$delegate, InputFieldState.copy-raUdB0Y$default(InputFieldKt.InputField$lambda$14(this.$inputState$delegate), false, false, false, false, false, 29, null)); }  return Unit.INSTANCE; } }
/* 315 */               (Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$inputState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { InputFieldKt.InputField$lambda$15(this.$inputState$delegate, InputFieldState.copy-raUdB0Y$default(InputFieldKt.InputField$lambda$14(this.$inputState$delegate), false, true, false, false, false, 29, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { InputFieldKt.InputField$lambda$15(this.$inputState$delegate, InputFieldState.copy-raUdB0Y$default(InputFieldKt.InputField$lambda$14(this.$inputState$delegate), false, false, false, false, false, 29, null)); }  return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super InputFieldKt$InputField$6$1> $completion) { return (Continuation<Unit>)new InputFieldKt$InputField$6$1(this.$interactionSource, this.$inputState$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((InputFieldKt$InputField$6$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final long InputField$lambda$18(State $backgroundColor$delegate) { State state = $backgroundColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Color)state.getValue()).unbox-impl(); } private static final long InputField$lambda$20(State $borderColor$delegate) { State state = $borderColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 316 */     return ((Color)state.getValue()).unbox-impl(); } private static final long InputField$lambda$22(State $contentColor$delegate) { State state = $contentColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 317 */     return ((Color)state.getValue()).unbox-impl(); } private static final long InputField$lambda$23(State $caretColor$delegate) { State state = $caretColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 318 */     return ((Color)state.getValue()).unbox-impl(); }
/*     */ 
/*     */   
/*     */   private static final Unit InputField$lambda$12(TextFieldState $state, Modifier $modifier, boolean $enabled, boolean $readOnly, InputTransformation $inputTransformation, TextStyle $textStyle, KeyboardOptions $keyboardOptions, KeyboardActionHandler $onKeyboardAction, TextFieldLineLimits $lineLimits, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> $onTextLayout, MutableInteractionSource $interactionSource, InputFieldStyle $style, Outline $outline, OutputTransformation $outputTransformation, TextFieldDecorator $decorator, boolean $undecorated, ScrollState $scrollState, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     InputField($state, $modifier, $enabled, $readOnly, $inputTransformation, $textStyle, $keyboardOptions, $onKeyboardAction, $lineLimits, $onTextLayout, $interactionSource, $style, $outline, $outputTransformation, $decorator, $undecorated, $scrollState, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit InputField$lambda$25(TextFieldValue $value, Function1<? super TextFieldValue, Unit> $onValueChange, Modifier $modifier, boolean $enabled, boolean $readOnly, Outline $outline, boolean $undecorated, VisualTransformation $visualTransformation, KeyboardOptions $keyboardOptions, KeyboardActions $keyboardActions, boolean $singleLine, int $maxLines, Function1<? super TextLayoutResult, Unit> $onTextLayout, MutableInteractionSource $interactionSource, InputFieldStyle $style, TextStyle $textStyle, Function4<? super Function2<? super Composer, ? super Integer, Unit>, ? super InputFieldState, ? super Composer, ? super Integer, Unit> $decorationBox, int $$changed, int $$changed1, Composer $composer, int $force) {
/*     */     InputField($value, $onValueChange, $modifier, $enabled, $readOnly, $outline, $undecorated, $visualTransformation, $keyboardOptions, $keyboardActions, $singleLine, $maxLines, $onTextLayout, $interactionSource, $style, $textStyle, $decorationBox, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class InputFieldKt$InputField$8 implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
/*     */     InputFieldKt$InputField$8(Function4<Function2<? super Composer, ? super Integer, Unit>, InputFieldState, Composer, Integer, Unit> $decorationBox, MutableState<InputFieldState> $inputState$delegate) {}
/*     */     
/*     */     @Composable
/*     */     @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */     public final void invoke(Function2 innerTextField, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
/*     */       int $dirty = $changed;
/*     */       if (($changed & 0x6) == 0)
/*     */         $dirty |= $composer.changedInstance(innerTextField) ? 4 : 2; 
/*     */       if (($dirty & 0x13) != 18 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(2091292274, $dirty, -1, "org.jetbrains.jewel.ui.component.InputField.<anonymous> (InputField.kt:205)"); 
/*     */         this.$decorationBox.invoke(innerTextField, InputFieldState.box-impl(InputFieldKt.InputField$lambda$14(this.$inputState$delegate)), $composer, Integer.valueOf(0xE & $dirty));
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\InputFieldKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */