/*    */ package androidx.lifecycle.compose;
/*    */ 
/*    */ import androidx.annotation.CheckResult;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.lifecycle.Lifecycle;
/*    */ import androidx.lifecycle.LifecycleOwner;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\032+\020\000\032\b\022\004\022\0020\0020\0012\b\b\002\020\003\032\0020\0042\f\020\005\032\b\022\004\022\0020\0020\001H\007¢\006\002\020\006\032+\020\007\032\b\022\004\022\0020\0020\0012\b\b\002\020\003\032\0020\0042\f\020\005\032\b\022\004\022\0020\0020\001H\007¢\006\002\020\006\0323\020\b\032\b\022\004\022\0020\0020\0012\006\020\t\032\0020\n2\b\b\002\020\003\032\0020\0042\f\020\005\032\b\022\004\022\0020\0020\001H\003¢\006\002\020\013¨\006\f"}, d2 = {"dropUnlessResumed", "Lkotlin/Function0;", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "block", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function0;", "dropUnlessStarted", "dropUnlessStateIsAtLeast", "state", "Landroidx/lifecycle/Lifecycle$State;", "(Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function0;", "lifecycle-runtime-compose"})
/*    */ @SourceDebugExtension({"SMAP\nDropUnlessLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropUnlessLifecycle.kt\nandroidx/lifecycle/compose/DropUnlessLifecycleKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,108:1\n74#2:109\n74#2:116\n74#2:117\n1117#3,6:110\n*S KotlinDebug\n*F\n+ 1 DropUnlessLifecycle.kt\nandroidx/lifecycle/compose/DropUnlessLifecycleKt\n*L\n49#1:109\n81#1:116\n105#1:117\n57#1:110,6\n*E\n"})
/*    */ public final class DropUnlessLifecycleKt
/*    */ {
/*    */   @CheckResult
/*    */   @Composable
/*    */   private static final Function0<Unit> dropUnlessStateIsAtLeast(Lifecycle.State state, LifecycleOwner lifecycleOwner, Function0 block, Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: ldc -2057956404
/*    */     //   3: invokeinterface startReplaceableGroup : (I)V
/*    */     //   8: aload_3
/*    */     //   9: ldc 'C(dropUnlessStateIsAtLeast)P(2,1)48@1927L7,56@2225L107:DropUnlessLifecycle.kt#2vxrgp'
/*    */     //   11: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*    */     //   14: iload #5
/*    */     //   16: iconst_2
/*    */     //   17: iand
/*    */     //   18: ifeq -> 64
/*    */     //   21: invokestatic getLocalLifecycleOwner : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*    */     //   24: checkcast androidx/compose/runtime/CompositionLocal
/*    */     //   27: astore #6
/*    */     //   29: bipush #6
/*    */     //   31: istore #7
/*    */     //   33: iconst_0
/*    */     //   34: istore #8
/*    */     //   36: aload_3
/*    */     //   37: ldc 2023513938
/*    */     //   39: ldc 'CC:CompositionLocal.kt#9igjgp'
/*    */     //   41: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   44: aload_3
/*    */     //   45: aload #6
/*    */     //   47: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*    */     //   52: astore #9
/*    */     //   54: aload_3
/*    */     //   55: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   58: aload #9
/*    */     //   60: checkcast androidx/lifecycle/LifecycleOwner
/*    */     //   63: astore_1
/*    */     //   64: invokestatic isTraceInProgress : ()Z
/*    */     //   67: ifeq -> 80
/*    */     //   70: ldc -2057956404
/*    */     //   72: iload #4
/*    */     //   74: iconst_m1
/*    */     //   75: ldc 'androidx.lifecycle.compose.dropUnlessStateIsAtLeast (DropUnlessLifecycle.kt:50)'
/*    */     //   77: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   80: aload_0
/*    */     //   81: getstatic androidx/lifecycle/Lifecycle$State.DESTROYED : Landroidx/lifecycle/Lifecycle$State;
/*    */     //   84: if_acmpeq -> 91
/*    */     //   87: iconst_1
/*    */     //   88: goto -> 92
/*    */     //   91: iconst_0
/*    */     //   92: ifne -> 116
/*    */     //   95: iconst_0
/*    */     //   96: istore #7
/*    */     //   98: ldc 'Target state is not allowed to be `Lifecycle.State.DESTROYED` because Compose disposes of the composition before `Lifecycle.Event.ON_DESTROY` observers are invoked.'
/*    */     //   100: nop
/*    */     //   101: astore #7
/*    */     //   103: new java/lang/IllegalArgumentException
/*    */     //   106: dup
/*    */     //   107: aload #7
/*    */     //   109: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   112: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   115: athrow
/*    */     //   116: aload_3
/*    */     //   117: ldc 565432844
/*    */     //   119: invokeinterface startReplaceableGroup : (I)V
/*    */     //   124: aload_3
/*    */     //   125: ldc 'CC(remember):DropUnlessLifecycle.kt#9igjgp'
/*    */     //   127: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*    */     //   130: aload_3
/*    */     //   131: astore #8
/*    */     //   133: aload_3
/*    */     //   134: aload_1
/*    */     //   135: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   140: iload #4
/*    */     //   142: bipush #14
/*    */     //   144: iand
/*    */     //   145: bipush #6
/*    */     //   147: ixor
/*    */     //   148: iconst_4
/*    */     //   149: if_icmple -> 162
/*    */     //   152: aload_3
/*    */     //   153: aload_0
/*    */     //   154: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   159: ifne -> 171
/*    */     //   162: iload #4
/*    */     //   164: bipush #6
/*    */     //   166: iand
/*    */     //   167: iconst_4
/*    */     //   168: if_icmpne -> 175
/*    */     //   171: iconst_1
/*    */     //   172: goto -> 176
/*    */     //   175: iconst_0
/*    */     //   176: ior
/*    */     //   177: iload #4
/*    */     //   179: sipush #896
/*    */     //   182: iand
/*    */     //   183: sipush #384
/*    */     //   186: ixor
/*    */     //   187: sipush #256
/*    */     //   190: if_icmple -> 203
/*    */     //   193: aload_3
/*    */     //   194: aload_2
/*    */     //   195: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   200: ifne -> 215
/*    */     //   203: iload #4
/*    */     //   205: sipush #384
/*    */     //   208: iand
/*    */     //   209: sipush #256
/*    */     //   212: if_icmpne -> 219
/*    */     //   215: iconst_1
/*    */     //   216: goto -> 220
/*    */     //   219: iconst_0
/*    */     //   220: ior
/*    */     //   221: istore #9
/*    */     //   223: nop
/*    */     //   224: iconst_0
/*    */     //   225: istore #10
/*    */     //   227: aload #8
/*    */     //   229: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   234: astore #11
/*    */     //   236: iconst_0
/*    */     //   237: istore #12
/*    */     //   239: iload #9
/*    */     //   241: ifne -> 255
/*    */     //   244: aload #11
/*    */     //   246: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   249: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   252: if_acmpne -> 287
/*    */     //   255: iconst_0
/*    */     //   256: istore #13
/*    */     //   258: new androidx/lifecycle/compose/DropUnlessLifecycleKt$dropUnlessStateIsAtLeast$2$1
/*    */     //   261: dup
/*    */     //   262: aload_1
/*    */     //   263: aload_0
/*    */     //   264: aload_2
/*    */     //   265: invokespecial <init> : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function0;)V
/*    */     //   268: checkcast kotlin/jvm/functions/Function0
/*    */     //   271: astore #14
/*    */     //   273: aload #8
/*    */     //   275: aload #14
/*    */     //   277: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   282: aload #14
/*    */     //   284: goto -> 289
/*    */     //   287: aload #11
/*    */     //   289: nop
/*    */     //   290: nop
/*    */     //   291: nop
/*    */     //   292: checkcast kotlin/jvm/functions/Function0
/*    */     //   295: astore #7
/*    */     //   297: aload_3
/*    */     //   298: invokeinterface endReplaceableGroup : ()V
/*    */     //   303: aload #7
/*    */     //   305: astore #6
/*    */     //   307: invokestatic isTraceInProgress : ()Z
/*    */     //   310: ifeq -> 316
/*    */     //   313: invokestatic traceEventEnd : ()V
/*    */     //   316: aload_3
/*    */     //   317: invokeinterface endReplaceableGroup : ()V
/*    */     //   322: aload #6
/*    */     //   324: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #49	-> 21
/*    */     //   #109	-> 41
/*    */     //   #51	-> 77
/*    */     //   #52	-> 80
/*    */     //   #53	-> 100
/*    */     //   #52	-> 101
/*    */     //   #57	-> 223
/*    */     //   #110	-> 227
/*    */     //   #111	-> 239
/*    */     //   #112	-> 255
/*    */     //   #57	-> 258
/*    */     //   #112	-> 271
/*    */     //   #113	-> 273
/*    */     //   #114	-> 282
/*    */     //   #115	-> 287
/*    */     //   #111	-> 289
/*    */     //   #110	-> 290
/*    */     //   #110	-> 291
/*    */     //   #57	-> 292
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   36	24	8	$i$f$getCurrent	I
/*    */     //   33	27	6	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*    */     //   33	27	7	$changed$iv	I
/*    */     //   98	3	7	$i$a$-require-DropUnlessLifecycleKt$dropUnlessStateIsAtLeast$1	I
/*    */     //   258	13	13	$i$a$-cache-DropUnlessLifecycleKt$dropUnlessStateIsAtLeast$2	I
/*    */     //   273	11	14	value$iv	Ljava/lang/Object;
/*    */     //   239	51	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   236	54	11	it$iv	Ljava/lang/Object;
/*    */     //   227	65	10	$i$f$cache	I
/*    */     //   224	68	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   224	68	9	invalid$iv	Z
/*    */     //   0	325	0	state	Landroidx/lifecycle/Lifecycle$State;
/*    */     //   0	325	1	lifecycleOwner	Landroidx/lifecycle/LifecycleOwner;
/*    */     //   0	325	2	block	Lkotlin/jvm/functions/Function0;
/*    */     //   0	325	3	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	325	4	$changed	I
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class DropUnlessLifecycleKt$dropUnlessStateIsAtLeast$2$1
/*    */     extends Lambda
/*    */     implements Function0<Unit>
/*    */   {
/*    */     public final void invoke() {
/* 58 */       if (this.$lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(this.$state))
/* 59 */         this.$block.invoke(); 
/*    */     }
/*    */     
/*    */     DropUnlessLifecycleKt$dropUnlessStateIsAtLeast$2$1(LifecycleOwner $lifecycleOwner, Lifecycle.State $state, Function0<Unit> $block) {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */   
/*    */   @CheckResult
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final Function0<Unit> dropUnlessStarted(@Nullable LifecycleOwner lifecycleOwner, @NotNull Function0 block, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'block'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 1207869935
/*    */     //   9: invokeinterface startReplaceableGroup : (I)V
/*    */     //   14: aload_2
/*    */     //   15: ldc 'C(dropUnlessStarted)P(1)80@3057L7,82@3105L62:DropUnlessLifecycle.kt#2vxrgp'
/*    */     //   17: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*    */     //   20: iload #4
/*    */     //   22: iconst_1
/*    */     //   23: iand
/*    */     //   24: ifeq -> 70
/*    */     //   27: invokestatic getLocalLifecycleOwner : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*    */     //   30: checkcast androidx/compose/runtime/CompositionLocal
/*    */     //   33: astore #5
/*    */     //   35: bipush #6
/*    */     //   37: istore #6
/*    */     //   39: iconst_0
/*    */     //   40: istore #7
/*    */     //   42: aload_2
/*    */     //   43: ldc 2023513938
/*    */     //   45: ldc 'CC:CompositionLocal.kt#9igjgp'
/*    */     //   47: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   50: aload_2
/*    */     //   51: aload #5
/*    */     //   53: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*    */     //   58: astore #8
/*    */     //   60: aload_2
/*    */     //   61: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   64: aload #8
/*    */     //   66: checkcast androidx/lifecycle/LifecycleOwner
/*    */     //   69: astore_0
/*    */     //   70: invokestatic isTraceInProgress : ()Z
/*    */     //   73: ifeq -> 85
/*    */     //   76: ldc 1207869935
/*    */     //   78: iload_3
/*    */     //   79: iconst_m1
/*    */     //   80: ldc 'androidx.lifecycle.compose.dropUnlessStarted (DropUnlessLifecycle.kt:82)'
/*    */     //   82: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   85: getstatic androidx/lifecycle/Lifecycle$State.STARTED : Landroidx/lifecycle/Lifecycle$State;
/*    */     //   88: aload_0
/*    */     //   89: aload_1
/*    */     //   90: aload_2
/*    */     //   91: bipush #6
/*    */     //   93: bipush #112
/*    */     //   95: iload_3
/*    */     //   96: iconst_3
/*    */     //   97: ishl
/*    */     //   98: iand
/*    */     //   99: ior
/*    */     //   100: sipush #896
/*    */     //   103: iload_3
/*    */     //   104: iconst_3
/*    */     //   105: ishl
/*    */     //   106: iand
/*    */     //   107: ior
/*    */     //   108: iconst_0
/*    */     //   109: invokestatic dropUnlessStateIsAtLeast : (Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function0;
/*    */     //   112: astore #5
/*    */     //   114: invokestatic isTraceInProgress : ()Z
/*    */     //   117: ifeq -> 123
/*    */     //   120: invokestatic traceEventEnd : ()V
/*    */     //   123: aload_2
/*    */     //   124: invokeinterface endReplaceableGroup : ()V
/*    */     //   129: aload #5
/*    */     //   131: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #81	-> 27
/*    */     //   #116	-> 47
/*    */     //   #83	-> 82
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   42	24	7	$i$f$getCurrent	I
/*    */     //   39	27	5	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*    */     //   39	27	6	$changed$iv	I
/*    */     //   0	132	0	lifecycleOwner	Landroidx/lifecycle/LifecycleOwner;
/*    */     //   0	132	1	block	Lkotlin/jvm/functions/Function0;
/*    */     //   0	132	2	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	132	3	$changed	I
/*    */   }
/*    */   
/*    */   @CheckResult
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final Function0<Unit> dropUnlessResumed(@Nullable LifecycleOwner lifecycleOwner, @NotNull Function0 block, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'block'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 1331131589
/*    */     //   9: invokeinterface startReplaceableGroup : (I)V
/*    */     //   14: aload_2
/*    */     //   15: ldc 'C(dropUnlessResumed)P(1)104@4047L7,106@4095L62:DropUnlessLifecycle.kt#2vxrgp'
/*    */     //   17: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*    */     //   20: iload #4
/*    */     //   22: iconst_1
/*    */     //   23: iand
/*    */     //   24: ifeq -> 70
/*    */     //   27: invokestatic getLocalLifecycleOwner : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*    */     //   30: checkcast androidx/compose/runtime/CompositionLocal
/*    */     //   33: astore #5
/*    */     //   35: bipush #6
/*    */     //   37: istore #6
/*    */     //   39: iconst_0
/*    */     //   40: istore #7
/*    */     //   42: aload_2
/*    */     //   43: ldc 2023513938
/*    */     //   45: ldc 'CC:CompositionLocal.kt#9igjgp'
/*    */     //   47: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   50: aload_2
/*    */     //   51: aload #5
/*    */     //   53: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*    */     //   58: astore #8
/*    */     //   60: aload_2
/*    */     //   61: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   64: aload #8
/*    */     //   66: checkcast androidx/lifecycle/LifecycleOwner
/*    */     //   69: astore_0
/*    */     //   70: invokestatic isTraceInProgress : ()Z
/*    */     //   73: ifeq -> 85
/*    */     //   76: ldc 1331131589
/*    */     //   78: iload_3
/*    */     //   79: iconst_m1
/*    */     //   80: ldc 'androidx.lifecycle.compose.dropUnlessResumed (DropUnlessLifecycle.kt:106)'
/*    */     //   82: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   85: getstatic androidx/lifecycle/Lifecycle$State.RESUMED : Landroidx/lifecycle/Lifecycle$State;
/*    */     //   88: aload_0
/*    */     //   89: aload_1
/*    */     //   90: aload_2
/*    */     //   91: bipush #6
/*    */     //   93: bipush #112
/*    */     //   95: iload_3
/*    */     //   96: iconst_3
/*    */     //   97: ishl
/*    */     //   98: iand
/*    */     //   99: ior
/*    */     //   100: sipush #896
/*    */     //   103: iload_3
/*    */     //   104: iconst_3
/*    */     //   105: ishl
/*    */     //   106: iand
/*    */     //   107: ior
/*    */     //   108: iconst_0
/*    */     //   109: invokestatic dropUnlessStateIsAtLeast : (Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function0;
/*    */     //   112: astore #5
/*    */     //   114: invokestatic isTraceInProgress : ()Z
/*    */     //   117: ifeq -> 123
/*    */     //   120: invokestatic traceEventEnd : ()V
/*    */     //   123: aload_2
/*    */     //   124: invokeinterface endReplaceableGroup : ()V
/*    */     //   129: aload #5
/*    */     //   131: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #105	-> 27
/*    */     //   #117	-> 47
/*    */     //   #107	-> 82
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   42	24	7	$i$f$getCurrent	I
/*    */     //   39	27	5	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*    */     //   39	27	6	$changed$iv	I
/*    */     //   0	132	0	lifecycleOwner	Landroidx/lifecycle/LifecycleOwner;
/*    */     //   0	132	1	block	Lkotlin/jvm/functions/Function0;
/*    */     //   0	132	2	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	132	3	$changed	I
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-runtime-compose-desktop-2.8.4.jar!\androidx\lifecycle\compose\DropUnlessLifecycleKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */