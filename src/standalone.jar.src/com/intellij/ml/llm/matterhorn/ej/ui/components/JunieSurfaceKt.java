/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ import androidx.compose.foundation.layout.BoxWithConstraintsScope;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Pair;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000d\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\b\n\002\020\b\n\002\b\003\n\002\b\005\n\002\020\007\n\000\n\002\020\013\n\000\n\002\b\002\n\002\020$\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\002*\002\033$\032?\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\006\020\004\032\0020\0052\034\020\006\032\030\022\004\022\0020\b\022\004\022\0020\0010\007¢\006\002\b\t¢\006\002\b\nH\007¢\006\004\b\013\020\f\0326\020\r\032\0020\0012\b\b\002\020\004\032\0020\0052\b\b\002\020\002\032\0020\0032\021\020\006\032\r\022\004\022\0020\0010\016¢\006\002\b\tH\007¢\006\004\b\017\020\020\032\027\020\021\032\0020\0012\006\020\004\032\0020\005H\003¢\006\004\b\022\020\023\032#\020\024\032\0020\003*\0020\0032\006\020\025\032\0020\0052\b\b\002\020\026\032\0020\027¢\006\004\b\030\020\031\032A\020\032\032\0020\033\"\004\b\000\020\034\"\004\b\001\020\0352\b\b\002\020\026\032\0020\0272\b\b\002\020\036\032\0020\0272\b\b\002\020\037\032\0020 2\b\b\002\020!\032\0020\"H\002¢\006\002\020#\0327\020\032\032\0020$\"\004\b\000\020\034\"\004\b\001\020\0352\022\020%\032\016\022\004\022\002H\034\022\004\022\002H\0350&2\b\b\002\020\026\032\0020\027H\002¢\006\002\020'\032\"\020)\032\024\022\020\022\016\022\004\022\0020\027\022\004\022\0020\0270+0*2\006\020,\032\0020\027H\002\"\016\020(\032\0020\027XT¢\006\002\n\000¨\006-"}, d2 = {"JunieSurfaceWithConstraints", "", "modifier", "Landroidx/compose/ui/Modifier;", "dotsColor", "Landroidx/compose/ui/graphics/Color;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "JunieSurfaceWithConstraints-3IgeMak", "(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "JunieSurface", "Lkotlin/Function0;", "JunieSurface-KTwxG1Y", "(JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "JunieDotsPattern", "JunieDotsPattern-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)V", "junieBackground", "color", "maxCapacity", "", "junieBackground-bw27NRU", "(Landroidx/compose/ui/Modifier;JI)Landroidx/compose/ui/Modifier;", "LRUHashMap", "com/intellij/ml/llm/matterhorn/ej/ui/components/JunieSurfaceKt$LRUHashMap$1", "K", "V", "initialCapacity", "loadFactor", "", "accessOrder", "", "(IIFZ)Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieSurfaceKt$LRUHashMap$1;", "com/intellij/ml/llm/matterhorn/ej/ui/components/JunieSurfaceKt$LRUHashMap$2", "from", "", "(Ljava/util/Map;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieSurfaceKt$LRUHashMap$2;", "RANDOM_SEED", "generateDotPattern", "", "Lkotlin/Pair;", "n", "standalone"})
/*     */ @SourceDebugExtension({"SMAP\nJunieSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieSurface.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieSurfaceKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,158:1\n71#2:159\n68#2,6:160\n74#2:194\n78#2:198\n79#3,6:166\n86#3,4:181\n90#3,2:191\n94#3:197\n368#4,9:172\n377#4:193\n378#4,2:195\n4034#5,6:185\n149#6:199\n*S KotlinDebug\n*F\n+ 1 JunieSurface.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieSurfaceKt\n*L\n43#1:159\n43#1:160,6\n43#1:194\n43#1:198\n43#1:166,6\n43#1:181,4\n43#1:191,2\n43#1:197\n43#1:172,9\n43#1:193\n43#1:195,2\n43#1:185,6\n58#1:199\n*E\n"})
/*     */ public final class JunieSurfaceKt {
/*     */   private static final int RANDOM_SEED = 3328930;
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void JunieSurfaceWithConstraints-3IgeMak(@Nullable Modifier modifier, long dotsColor, @NotNull Function3 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc 'content'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #4
/*     */     //   8: ldc 1290668513
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore #4
/*     */     //   17: iload #5
/*     */     //   19: istore #7
/*     */     //   21: iload #6
/*     */     //   23: iconst_1
/*     */     //   24: iand
/*     */     //   25: ifeq -> 38
/*     */     //   28: iload #7
/*     */     //   30: bipush #6
/*     */     //   32: ior
/*     */     //   33: istore #7
/*     */     //   35: goto -> 67
/*     */     //   38: iload #5
/*     */     //   40: bipush #6
/*     */     //   42: iand
/*     */     //   43: ifne -> 67
/*     */     //   46: iload #7
/*     */     //   48: aload #4
/*     */     //   50: aload_0
/*     */     //   51: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   56: ifeq -> 63
/*     */     //   59: iconst_4
/*     */     //   60: goto -> 64
/*     */     //   63: iconst_2
/*     */     //   64: ior
/*     */     //   65: istore #7
/*     */     //   67: iload #6
/*     */     //   69: iconst_2
/*     */     //   70: iand
/*     */     //   71: ifeq -> 84
/*     */     //   74: iload #7
/*     */     //   76: bipush #48
/*     */     //   78: ior
/*     */     //   79: istore #7
/*     */     //   81: goto -> 115
/*     */     //   84: iload #5
/*     */     //   86: bipush #48
/*     */     //   88: iand
/*     */     //   89: ifne -> 115
/*     */     //   92: iload #7
/*     */     //   94: aload #4
/*     */     //   96: lload_1
/*     */     //   97: invokeinterface changed : (J)Z
/*     */     //   102: ifeq -> 110
/*     */     //   105: bipush #32
/*     */     //   107: goto -> 112
/*     */     //   110: bipush #16
/*     */     //   112: ior
/*     */     //   113: istore #7
/*     */     //   115: iload #6
/*     */     //   117: iconst_4
/*     */     //   118: iand
/*     */     //   119: ifeq -> 133
/*     */     //   122: iload #7
/*     */     //   124: sipush #384
/*     */     //   127: ior
/*     */     //   128: istore #7
/*     */     //   130: goto -> 167
/*     */     //   133: iload #5
/*     */     //   135: sipush #384
/*     */     //   138: iand
/*     */     //   139: ifne -> 167
/*     */     //   142: iload #7
/*     */     //   144: aload #4
/*     */     //   146: aload_3
/*     */     //   147: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   152: ifeq -> 161
/*     */     //   155: sipush #256
/*     */     //   158: goto -> 164
/*     */     //   161: sipush #128
/*     */     //   164: ior
/*     */     //   165: istore #7
/*     */     //   167: iload #7
/*     */     //   169: sipush #147
/*     */     //   172: iand
/*     */     //   173: sipush #146
/*     */     //   176: if_icmpne -> 189
/*     */     //   179: aload #4
/*     */     //   181: invokeinterface getSkipping : ()Z
/*     */     //   186: ifne -> 281
/*     */     //   189: iload #6
/*     */     //   191: iconst_1
/*     */     //   192: iand
/*     */     //   193: ifeq -> 203
/*     */     //   196: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   199: checkcast androidx/compose/ui/Modifier
/*     */     //   202: astore_0
/*     */     //   203: invokestatic isTraceInProgress : ()Z
/*     */     //   206: ifeq -> 219
/*     */     //   209: ldc 1290668513
/*     */     //   211: iload #7
/*     */     //   213: iconst_m1
/*     */     //   214: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieSurfaceWithConstraints (JunieSurface.kt:27)'
/*     */     //   216: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   219: aload_0
/*     */     //   220: aload #4
/*     */     //   222: iconst_0
/*     */     //   223: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   226: invokevirtual getBackgroundColor-0d7_KjU : ()J
/*     */     //   229: aconst_null
/*     */     //   230: iconst_2
/*     */     //   231: aconst_null
/*     */     //   232: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   235: aconst_null
/*     */     //   236: iconst_0
/*     */     //   237: ldc -1910066741
/*     */     //   239: iconst_1
/*     */     //   240: new com/intellij/ml/llm/matterhorn/ej/ui/components/JunieSurfaceKt$JunieSurfaceWithConstraints$1
/*     */     //   243: dup
/*     */     //   244: lload_1
/*     */     //   245: aload_3
/*     */     //   246: invokespecial <init> : (JLkotlin/jvm/functions/Function3;)V
/*     */     //   249: aload #4
/*     */     //   251: bipush #54
/*     */     //   253: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   256: checkcast kotlin/jvm/functions/Function3
/*     */     //   259: aload #4
/*     */     //   261: sipush #3072
/*     */     //   264: bipush #6
/*     */     //   266: invokestatic BoxWithConstraints : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   269: invokestatic isTraceInProgress : ()Z
/*     */     //   272: ifeq -> 288
/*     */     //   275: invokestatic traceEventEnd : ()V
/*     */     //   278: goto -> 288
/*     */     //   281: aload #4
/*     */     //   283: invokeinterface skipToGroupEnd : ()V
/*     */     //   288: aload #4
/*     */     //   290: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   295: dup
/*     */     //   296: ifnull -> 319
/*     */     //   299: aload_0
/*     */     //   300: lload_1
/*     */     //   301: aload_3
/*     */     //   302: iload #5
/*     */     //   304: iload #6
/*     */     //   306: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function3;II)Lkotlin/jvm/functions/Function2;
/*     */     //   311: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   316: goto -> 320
/*     */     //   319: pop
/*     */     //   320: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #28	-> 6
/*     */     //   #25	-> 196
/*     */     //   #28	-> 216
/*     */     //   #30	-> 219
/*     */     //   #31	-> 237
/*     */     //   #29	-> 266
/*     */     //   #35	-> 281
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   21	300	7	$dirty	I
/*     */     //   0	321	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	321	1	dotsColor	J
/*     */     //   0	321	3	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	321	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	321	5	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieSurfaceKt$JunieSurfaceWithConstraints$1 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(BoxWithConstraintsScope $this$BoxWithConstraints, Composer $composer, int $changed) {
/*  32 */       Intrinsics.checkNotNullParameter($this$BoxWithConstraints, "$this$BoxWithConstraints"); int $dirty = $changed; if (($changed & 0x6) == 0) $dirty |= $composer.changed($this$BoxWithConstraints) ? 4 : 2;  if (($dirty & 0x13) != 18 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1910066741, $dirty, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.JunieSurfaceWithConstraints.<anonymous> (JunieSurface.kt:31)");  JunieSurfaceKt.JunieDotsPattern-ek8zF_U(this.$dotsColor, $composer, 0);
/*  33 */         this.$content.invoke($this$BoxWithConstraints, $composer, Integer.valueOf(0xE & $dirty)); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */     
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
/*     */     JunieSurfaceKt$JunieSurfaceWithConstraints$1(long $dotsColor, Function3<BoxWithConstraintsScope, Composer, Integer, Unit> $content) {}
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
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void JunieSurface-KTwxG1Y(long dotsColor, @Nullable Modifier modifier, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc 'content'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #4
/*     */     //   8: ldc -311305206
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore #4
/*     */     //   17: iload #5
/*     */     //   19: istore #7
/*     */     //   21: iload #5
/*     */     //   23: bipush #6
/*     */     //   25: iand
/*     */     //   26: ifne -> 57
/*     */     //   29: iload #7
/*     */     //   31: iload #6
/*     */     //   33: iconst_1
/*     */     //   34: iand
/*     */     //   35: ifne -> 53
/*     */     //   38: aload #4
/*     */     //   40: lload_0
/*     */     //   41: invokeinterface changed : (J)Z
/*     */     //   46: ifeq -> 53
/*     */     //   49: iconst_4
/*     */     //   50: goto -> 54
/*     */     //   53: iconst_2
/*     */     //   54: ior
/*     */     //   55: istore #7
/*     */     //   57: iload #6
/*     */     //   59: iconst_2
/*     */     //   60: iand
/*     */     //   61: ifeq -> 74
/*     */     //   64: iload #7
/*     */     //   66: bipush #48
/*     */     //   68: ior
/*     */     //   69: istore #7
/*     */     //   71: goto -> 105
/*     */     //   74: iload #5
/*     */     //   76: bipush #48
/*     */     //   78: iand
/*     */     //   79: ifne -> 105
/*     */     //   82: iload #7
/*     */     //   84: aload #4
/*     */     //   86: aload_2
/*     */     //   87: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   92: ifeq -> 100
/*     */     //   95: bipush #32
/*     */     //   97: goto -> 102
/*     */     //   100: bipush #16
/*     */     //   102: ior
/*     */     //   103: istore #7
/*     */     //   105: iload #6
/*     */     //   107: iconst_4
/*     */     //   108: iand
/*     */     //   109: ifeq -> 123
/*     */     //   112: iload #7
/*     */     //   114: sipush #384
/*     */     //   117: ior
/*     */     //   118: istore #7
/*     */     //   120: goto -> 157
/*     */     //   123: iload #5
/*     */     //   125: sipush #384
/*     */     //   128: iand
/*     */     //   129: ifne -> 157
/*     */     //   132: iload #7
/*     */     //   134: aload #4
/*     */     //   136: aload_3
/*     */     //   137: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   142: ifeq -> 151
/*     */     //   145: sipush #256
/*     */     //   148: goto -> 154
/*     */     //   151: sipush #128
/*     */     //   154: ior
/*     */     //   155: istore #7
/*     */     //   157: iload #7
/*     */     //   159: sipush #147
/*     */     //   162: iand
/*     */     //   163: sipush #146
/*     */     //   166: if_icmpne -> 179
/*     */     //   169: aload #4
/*     */     //   171: invokeinterface getSkipping : ()Z
/*     */     //   176: ifne -> 733
/*     */     //   179: aload #4
/*     */     //   181: invokeinterface startDefaults : ()V
/*     */     //   186: iload #5
/*     */     //   188: iconst_1
/*     */     //   189: iand
/*     */     //   190: ifeq -> 203
/*     */     //   193: aload #4
/*     */     //   195: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   200: ifeq -> 244
/*     */     //   203: iload #6
/*     */     //   205: iconst_1
/*     */     //   206: iand
/*     */     //   207: ifeq -> 227
/*     */     //   210: aload #4
/*     */     //   212: iconst_0
/*     */     //   213: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   216: invokevirtual getDefaultBackgroundDotsColor-0d7_KjU : ()J
/*     */     //   219: lstore_0
/*     */     //   220: iload #7
/*     */     //   222: bipush #-15
/*     */     //   224: iand
/*     */     //   225: istore #7
/*     */     //   227: iload #6
/*     */     //   229: iconst_2
/*     */     //   230: iand
/*     */     //   231: ifeq -> 265
/*     */     //   234: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   237: checkcast androidx/compose/ui/Modifier
/*     */     //   240: astore_2
/*     */     //   241: goto -> 265
/*     */     //   244: aload #4
/*     */     //   246: invokeinterface skipToGroupEnd : ()V
/*     */     //   251: iload #6
/*     */     //   253: iconst_1
/*     */     //   254: iand
/*     */     //   255: ifeq -> 265
/*     */     //   258: iload #7
/*     */     //   260: bipush #-15
/*     */     //   262: iand
/*     */     //   263: istore #7
/*     */     //   265: aload #4
/*     */     //   267: invokeinterface endDefaults : ()V
/*     */     //   272: invokestatic isTraceInProgress : ()Z
/*     */     //   275: ifeq -> 288
/*     */     //   278: ldc -311305206
/*     */     //   280: iload #7
/*     */     //   282: iconst_m1
/*     */     //   283: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieSurface (JunieSurface.kt:41)'
/*     */     //   285: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   288: aload_2
/*     */     //   289: aload #4
/*     */     //   291: iconst_0
/*     */     //   292: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   295: invokevirtual getBackgroundColor-0d7_KjU : ()J
/*     */     //   298: aconst_null
/*     */     //   299: iconst_2
/*     */     //   300: aconst_null
/*     */     //   301: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   304: astore #8
/*     */     //   306: iconst_0
/*     */     //   307: istore #11
/*     */     //   309: nop
/*     */     //   310: iconst_0
/*     */     //   311: istore #12
/*     */     //   313: aload #4
/*     */     //   315: ldc 733328855
/*     */     //   317: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   319: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   322: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   325: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   328: astore #9
/*     */     //   330: iconst_0
/*     */     //   331: istore #10
/*     */     //   333: aload #9
/*     */     //   335: iload #10
/*     */     //   337: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   340: astore #13
/*     */     //   342: bipush #112
/*     */     //   344: iload #11
/*     */     //   346: iconst_3
/*     */     //   347: ishl
/*     */     //   348: iand
/*     */     //   349: istore #14
/*     */     //   351: nop
/*     */     //   352: iconst_0
/*     */     //   353: istore #15
/*     */     //   355: aload #4
/*     */     //   357: ldc -1323940314
/*     */     //   359: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   361: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   364: aload #4
/*     */     //   366: iconst_0
/*     */     //   367: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   370: istore #16
/*     */     //   372: aload #4
/*     */     //   374: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   379: astore #17
/*     */     //   381: aload #4
/*     */     //   383: aload #8
/*     */     //   385: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   388: astore #18
/*     */     //   390: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   393: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   396: astore #19
/*     */     //   398: bipush #6
/*     */     //   400: sipush #896
/*     */     //   403: iload #14
/*     */     //   405: bipush #6
/*     */     //   407: ishl
/*     */     //   408: iand
/*     */     //   409: ior
/*     */     //   410: istore #20
/*     */     //   412: nop
/*     */     //   413: iconst_0
/*     */     //   414: istore #21
/*     */     //   416: aload #4
/*     */     //   418: ldc -692256719
/*     */     //   420: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   422: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   425: aload #4
/*     */     //   427: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   432: instanceof androidx/compose/runtime/Applier
/*     */     //   435: ifne -> 441
/*     */     //   438: invokestatic invalidApplier : ()V
/*     */     //   441: aload #4
/*     */     //   443: invokeinterface startReusableNode : ()V
/*     */     //   448: aload #4
/*     */     //   450: invokeinterface getInserting : ()Z
/*     */     //   455: ifeq -> 470
/*     */     //   458: aload #4
/*     */     //   460: aload #19
/*     */     //   462: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   467: goto -> 477
/*     */     //   470: aload #4
/*     */     //   472: invokeinterface useNode : ()V
/*     */     //   477: aload #4
/*     */     //   479: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   482: astore #22
/*     */     //   484: iconst_0
/*     */     //   485: istore #23
/*     */     //   487: aload #22
/*     */     //   489: aload #13
/*     */     //   491: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   494: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   497: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   500: aload #22
/*     */     //   502: aload #17
/*     */     //   504: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   507: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   510: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   513: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   516: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   519: astore #24
/*     */     //   521: iconst_0
/*     */     //   522: istore #25
/*     */     //   524: aload #22
/*     */     //   526: astore #26
/*     */     //   528: iconst_0
/*     */     //   529: istore #27
/*     */     //   531: aload #26
/*     */     //   533: invokeinterface getInserting : ()Z
/*     */     //   538: ifne -> 559
/*     */     //   541: aload #26
/*     */     //   543: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   548: iload #16
/*     */     //   550: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   553: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   556: ifne -> 585
/*     */     //   559: aload #26
/*     */     //   561: iload #16
/*     */     //   563: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   566: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   571: aload #22
/*     */     //   573: iload #16
/*     */     //   575: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   578: aload #24
/*     */     //   580: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   585: nop
/*     */     //   586: nop
/*     */     //   587: nop
/*     */     //   588: aload #22
/*     */     //   590: aload #18
/*     */     //   592: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   595: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   598: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   601: nop
/*     */     //   602: nop
/*     */     //   603: aload #4
/*     */     //   605: bipush #14
/*     */     //   607: iload #20
/*     */     //   609: bipush #6
/*     */     //   611: ishr
/*     */     //   612: iand
/*     */     //   613: istore #28
/*     */     //   615: astore #29
/*     */     //   617: iconst_0
/*     */     //   618: istore #30
/*     */     //   620: aload #29
/*     */     //   622: ldc_w -2146769399
/*     */     //   625: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   628: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   631: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   634: aload #29
/*     */     //   636: bipush #6
/*     */     //   638: bipush #112
/*     */     //   640: iload #11
/*     */     //   642: bipush #6
/*     */     //   644: ishr
/*     */     //   645: iand
/*     */     //   646: ior
/*     */     //   647: istore #31
/*     */     //   649: astore #32
/*     */     //   651: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   654: astore #33
/*     */     //   656: iconst_0
/*     */     //   657: istore #34
/*     */     //   659: lload_0
/*     */     //   660: aload #32
/*     */     //   662: bipush #14
/*     */     //   664: iload #7
/*     */     //   666: iand
/*     */     //   667: invokestatic JunieDotsPattern-ek8zF_U : (JLandroidx/compose/runtime/Composer;I)V
/*     */     //   670: aload_3
/*     */     //   671: aload #32
/*     */     //   673: bipush #14
/*     */     //   675: iload #7
/*     */     //   677: bipush #6
/*     */     //   679: ishr
/*     */     //   680: iand
/*     */     //   681: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   684: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   689: pop
/*     */     //   690: nop
/*     */     //   691: aload #29
/*     */     //   693: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   696: aload #4
/*     */     //   698: invokeinterface endNode : ()V
/*     */     //   703: aload #4
/*     */     //   705: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   708: nop
/*     */     //   709: aload #4
/*     */     //   711: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   714: nop
/*     */     //   715: aload #4
/*     */     //   717: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   720: nop
/*     */     //   721: invokestatic isTraceInProgress : ()Z
/*     */     //   724: ifeq -> 740
/*     */     //   727: invokestatic traceEventEnd : ()V
/*     */     //   730: goto -> 740
/*     */     //   733: aload #4
/*     */     //   735: invokeinterface skipToGroupEnd : ()V
/*     */     //   740: aload #4
/*     */     //   742: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   747: dup
/*     */     //   748: ifnull -> 771
/*     */     //   751: lload_0
/*     */     //   752: aload_2
/*     */     //   753: aload_3
/*     */     //   754: iload #5
/*     */     //   756: iload #6
/*     */     //   758: <illegal opcode> invoke : (JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*     */     //   763: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   768: goto -> 772
/*     */     //   771: pop
/*     */     //   772: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #42	-> 6
/*     */     //   #39	-> 210
/*     */     //   #40	-> 234
/*     */     //   #42	-> 285
/*     */     //   #44	-> 288
/*     */     //   #43	-> 309
/*     */     //   #159	-> 319
/*     */     //   #160	-> 322
/*     */     //   #161	-> 330
/*     */     //   #164	-> 333
/*     */     //   #165	-> 351
/*     */     //   #166	-> 361
/*     */     //   #167	-> 367
/*     */     //   #168	-> 374
/*     */     //   #169	-> 383
/*     */     //   #171	-> 390
/*     */     //   #170	-> 412
/*     */     //   #172	-> 422
/*     */     //   #173	-> 425
/*     */     //   #174	-> 443
/*     */     //   #175	-> 448
/*     */     //   #176	-> 460
/*     */     //   #178	-> 472
/*     */     //   #180	-> 477
/*     */     //   #181	-> 487
/*     */     //   #182	-> 500
/*     */     //   #184	-> 513
/*     */     //   #185	-> 524
/*     */     //   #186	-> 531
/*     */     //   #187	-> 559
/*     */     //   #188	-> 571
/*     */     //   #190	-> 585
/*     */     //   #185	-> 586
/*     */     //   #190	-> 587
/*     */     //   #191	-> 588
/*     */     //   #192	-> 601
/*     */     //   #180	-> 602
/*     */     //   #193	-> 603
/*     */     //   #194	-> 628
/*     */     //   #46	-> 659
/*     */     //   #47	-> 670
/*     */     //   #48	-> 690
/*     */     //   #194	-> 691
/*     */     //   #193	-> 696
/*     */     //   #195	-> 698
/*     */     //   #172	-> 705
/*     */     //   #196	-> 708
/*     */     //   #166	-> 711
/*     */     //   #197	-> 714
/*     */     //   #159	-> 717
/*     */     //   #198	-> 720
/*     */     //   #49	-> 733
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   659	32	34	$i$a$-Box-JunieSurfaceKt$JunieSurface$1	I
/*     */     //   656	35	33	$this$JunieSurface_KTwxG1Y_u24lambda_u241	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   656	35	32	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   656	35	31	$changed	I
/*     */     //   620	76	30	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   617	79	29	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   617	79	28	$changed$iv	I
/*     */     //   531	55	27	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   528	58	26	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   524	64	25	$i$f$set-impl	I
/*     */     //   521	67	24	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   487	115	23	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   484	118	22	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   416	293	21	$i$f$ReusableComposeNode	I
/*     */     //   413	296	19	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   413	296	20	$changed$iv$iv$iv	I
/*     */     //   355	360	15	$i$f$Layout	I
/*     */     //   372	343	16	compositeKeyHash$iv$iv	I
/*     */     //   381	334	17	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   390	325	18	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   352	363	14	$changed$iv$iv	I
/*     */     //   313	408	12	$i$f$Box	I
/*     */     //   342	379	13	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   310	411	8	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   330	391	9	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   333	388	10	propagateMinConstraints$iv	Z
/*     */     //   310	411	11	$changed$iv	I
/*     */     //   21	752	7	$dirty	I
/*     */     //   0	773	0	dotsColor	J
/*     */     //   0	773	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	773	3	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	773	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	773	5	$changed	I
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
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void JunieDotsPattern-ek8zF_U(long dotsColor, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w 1166475119
/*     */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   9: astore_2
/*     */     //   10: iload_3
/*     */     //   11: istore #4
/*     */     //   13: iload_3
/*     */     //   14: bipush #6
/*     */     //   16: iand
/*     */     //   17: ifne -> 40
/*     */     //   20: iload #4
/*     */     //   22: aload_2
/*     */     //   23: lload_0
/*     */     //   24: invokeinterface changed : (J)Z
/*     */     //   29: ifeq -> 36
/*     */     //   32: iconst_4
/*     */     //   33: goto -> 37
/*     */     //   36: iconst_2
/*     */     //   37: ior
/*     */     //   38: istore #4
/*     */     //   40: iload #4
/*     */     //   42: iconst_3
/*     */     //   43: iand
/*     */     //   44: iconst_2
/*     */     //   45: if_icmpne -> 57
/*     */     //   48: aload_2
/*     */     //   49: invokeinterface getSkipping : ()Z
/*     */     //   54: ifne -> 130
/*     */     //   57: invokestatic isTraceInProgress : ()Z
/*     */     //   60: ifeq -> 75
/*     */     //   63: ldc_w 1166475119
/*     */     //   66: iload #4
/*     */     //   68: iconst_m1
/*     */     //   69: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieDotsPattern (JunieSurface.kt:51)'
/*     */     //   72: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   75: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   78: checkcast androidx/compose/ui/Modifier
/*     */     //   81: fconst_0
/*     */     //   82: iconst_1
/*     */     //   83: aconst_null
/*     */     //   84: invokestatic fillMaxSize$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   87: lload_0
/*     */     //   88: iconst_0
/*     */     //   89: iconst_2
/*     */     //   90: aconst_null
/*     */     //   91: invokestatic junieBackground-bw27NRU$default : (Landroidx/compose/ui/Modifier;JIILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   94: bipush #30
/*     */     //   96: istore #5
/*     */     //   98: iconst_0
/*     */     //   99: istore #6
/*     */     //   101: iload #5
/*     */     //   103: i2f
/*     */     //   104: invokestatic constructor-impl : (F)F
/*     */     //   107: fconst_0
/*     */     //   108: iconst_2
/*     */     //   109: aconst_null
/*     */     //   110: invokestatic padding-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   113: aload_2
/*     */     //   114: iconst_0
/*     */     //   115: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   118: invokestatic isTraceInProgress : ()Z
/*     */     //   121: ifeq -> 136
/*     */     //   124: invokestatic traceEventEnd : ()V
/*     */     //   127: goto -> 136
/*     */     //   130: aload_2
/*     */     //   131: invokeinterface skipToGroupEnd : ()V
/*     */     //   136: aload_2
/*     */     //   137: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   142: dup
/*     */     //   143: ifnull -> 161
/*     */     //   146: lload_0
/*     */     //   147: iload_3
/*     */     //   148: <illegal opcode> invoke : (JI)Lkotlin/jvm/functions/Function2;
/*     */     //   153: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   158: goto -> 162
/*     */     //   161: pop
/*     */     //   162: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #52	-> 0
/*     */     //   #55	-> 75
/*     */     //   #56	-> 81
/*     */     //   #57	-> 87
/*     */     //   #58	-> 94
/*     */     //   #199	-> 101
/*     */     //   #58	-> 107
/*     */     //   #53	-> 115
/*     */     //   #60	-> 130
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	6	6	$i$f$getDp	I
/*     */     //   98	9	5	$this$dp$iv	I
/*     */     //   13	150	4	$dirty	I
/*     */     //   0	163	0	dotsColor	J
/*     */     //   0	163	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	163	3	$changed	I
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
/*     */   @NotNull
/*     */   public static final Modifier junieBackground-bw27NRU(@NotNull Modifier $this$junieBackground_u2dbw27NRU, long color, int maxCapacity) {
/* 105 */     Intrinsics.checkNotNullParameter($this$junieBackground_u2dbw27NRU, "$this$junieBackground"); return $this$junieBackground_u2dbw27NRU.then((Modifier)new JunieBackgroundElement(color, maxCapacity, null));
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
/*     */   private static final <K, V> JunieSurfaceKt$LRUHashMap$1 LRUHashMap(int maxCapacity, int initialCapacity, float loadFactor, boolean accessOrder) {
/* 120 */     return new JunieSurfaceKt$LRUHashMap$1(initialCapacity, loadFactor, accessOrder, maxCapacity); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020'\n\000*\001\000\b\n\030\0002\036\022\004\022\0028\000\022\004\022\0028\0010\001j\016\022\004\022\0028\000\022\004\022\0028\001`\002J\036\020\003\032\0020\0042\024\020\005\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\006H\024¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/components/JunieSurfaceKt$LRUHashMap$1", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "removeEldestEntry", "", "eldest", "", "standalone"}) public static final class JunieSurfaceKt$LRUHashMap$1 extends LinkedHashMap<K, V> { JunieSurfaceKt$LRUHashMap$1(int $initialCapacity, float $loadFactor, boolean $accessOrder, int $maxCapacity) { super($initialCapacity, $loadFactor, $accessOrder); } protected boolean removeEldestEntry(Map.Entry eldest) {
/* 121 */       return (size() > this.$maxCapacity);
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   private static final <K, V> JunieSurfaceKt$LRUHashMap$2 LRUHashMap(Map<K, ? extends V> from, int maxCapacity) {
/* 127 */     return new JunieSurfaceKt$LRUHashMap$2(from, maxCapacity); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020'\n\000*\001\000\b\n\030\0002\036\022\004\022\0028\000\022\004\022\0028\0010\001j\016\022\004\022\0028\000\022\004\022\0028\001`\002J\036\020\003\032\0020\0042\024\020\005\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\006H\024¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/components/JunieSurfaceKt$LRUHashMap$2", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "removeEldestEntry", "", "eldest", "", "standalone"}) public static final class JunieSurfaceKt$LRUHashMap$2 extends LinkedHashMap<K, V> { JunieSurfaceKt$LRUHashMap$2(Map<? extends K, ? extends V> $from, int $maxCapacity) { super($from); } protected boolean removeEldestEntry(Map.Entry eldest) {
/* 128 */       return (size() > this.$maxCapacity);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final List<Pair<Integer, Integer>> generateDotPattern(int n) {
/* 144 */     Random random = RandomKt.Random(3328930);
/* 145 */     ArrayList<Pair> result = new ArrayList(n * n);
/*     */     
/* 147 */     int sum = 2, i = 2 * n; if (sum <= i)
/* 148 */       while (true) { int j = 1; if (j <= n)
/* 149 */           while (true) { int k = sum - j;
/* 150 */             if (((1 <= k) ? ((k <= n)) : false) && random.nextInt(5) != 3)
/* 151 */               result.add(new Pair(Integer.valueOf(j - 1), Integer.valueOf(k - 1)));  if (j != n) { j++; continue; }
/*     */              break; }
/*     */             if (sum != i) {
/*     */           sum++; continue;
/*     */         }  break; }
/* 156 */         return (List)result;
/*     */   }
/*     */   
/*     */   private static final Unit JunieSurfaceWithConstraints_3IgeMak$lambda$0(Modifier $modifier, long $dotsColor, Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     JunieSurfaceWithConstraints-3IgeMak($modifier, $dotsColor, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit JunieSurface_KTwxG1Y$lambda$2(long $dotsColor, Modifier $modifier, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     JunieSurface-KTwxG1Y($dotsColor, $modifier, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit JunieDotsPattern_ek8zF_U$lambda$3(long $dotsColor, int $$changed, Composer $composer, int $force) {
/*     */     JunieDotsPattern-ek8zF_U($dotsColor, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieSurfaceKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */