/*     */ package androidx.compose.runtime.saveable;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.DisposableEffectResult;
/*     */ import androidx.compose.runtime.DisposableEffectScope;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.functions.Function1;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\020%\n\002\020\000\n\002\020$\n\002\020\016\n\002\020 \n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\006\b\002\030\000 \0322\0020\001:\002\032\033B/\022(\b\002\020\002\032\"\022\004\022\0020\004\022\030\022\026\022\004\022\0020\006\022\f\022\n\022\006\022\004\030\0010\0040\0070\0050\003¢\006\002\020\bJ(\020\021\032\0020\0222\006\020\023\032\0020\0042\021\020\024\032\r\022\004\022\0020\0220\025¢\006\002\b\026H\027¢\006\002\020\027J\020\020\030\032\0020\0222\006\020\023\032\0020\004H\026J*\020\031\032$\022\004\022\0020\004\022\030\022\026\022\004\022\0020\006\022\f\022\n\022\006\022\004\030\0010\0040\0070\005\030\0010\003H\002R\034\020\t\032\004\030\0010\nX\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R\036\020\017\032\022\022\004\022\0020\004\022\b\022\0060\020R\0020\0000\003X\004¢\006\002\n\000R.\020\002\032\"\022\004\022\0020\004\022\030\022\026\022\004\022\0020\006\022\f\022\n\022\006\022\004\030\0010\0040\0070\0050\003X\004¢\006\002\n\000¨\006\034"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "savedStates", "", "", "", "", "", "(Ljava/util/Map;)V", "parentSaveableStateRegistry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getParentSaveableStateRegistry", "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "setParentSaveableStateRegistry", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;)V", "registryHolders", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;", "SaveableStateProvider", "", "key", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "removeState", "saveAll", "Companion", "RegistryHolder", "runtime-saveable"})
/*     */ @SourceDebugExtension({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n148#2,3:144\n151#2,2:159\n1225#3,6:147\n1225#3,6:153\n1855#4,2:161\n1#5:163\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n*L\n77#1:144,3\n77#1:159,2\n78#1:147,6\n89#1:153,6\n103#1:161,2\n*E\n"})
/*     */ final class SaveableStateHolderImpl
/*     */   implements SaveableStateHolder
/*     */ {
/*     */   public SaveableStateHolderImpl(@NotNull Map<Object, Map<String, List<Object>>> savedStates) {
/*  70 */     this.savedStates = savedStates;
/*     */     
/*  72 */     this.registryHolders = new LinkedHashMap<>(); } @Nullable
/*  73 */   public final SaveableStateRegistry getParentSaveableStateRegistry() { return this.parentSaveableStateRegistry; } public final void setParentSaveableStateRegistry(@Nullable SaveableStateRegistry <set-?>) { this.parentSaveableStateRegistry = <set-?>; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   public void SaveableStateProvider(@NotNull Object key, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'key'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'content'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc -1198538093
/*     */     //   15: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   20: astore_3
/*     */     //   21: aload_3
/*     */     //   22: ldc 'C(SaveableStateProvider)P(1)76@3032L923:SaveableStateHolder.kt#r2ddri'
/*     */     //   24: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   27: iload #4
/*     */     //   29: istore #5
/*     */     //   31: iload #4
/*     */     //   33: bipush #6
/*     */     //   35: iand
/*     */     //   36: ifne -> 59
/*     */     //   39: iload #5
/*     */     //   41: aload_3
/*     */     //   42: aload_1
/*     */     //   43: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   48: ifeq -> 55
/*     */     //   51: iconst_4
/*     */     //   52: goto -> 56
/*     */     //   55: iconst_2
/*     */     //   56: ior
/*     */     //   57: istore #5
/*     */     //   59: iload #4
/*     */     //   61: bipush #48
/*     */     //   63: iand
/*     */     //   64: ifne -> 89
/*     */     //   67: iload #5
/*     */     //   69: aload_3
/*     */     //   70: aload_2
/*     */     //   71: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   76: ifeq -> 84
/*     */     //   79: bipush #32
/*     */     //   81: goto -> 86
/*     */     //   84: bipush #16
/*     */     //   86: ior
/*     */     //   87: istore #5
/*     */     //   89: iload #4
/*     */     //   91: sipush #384
/*     */     //   94: iand
/*     */     //   95: ifne -> 122
/*     */     //   98: iload #5
/*     */     //   100: aload_3
/*     */     //   101: aload_0
/*     */     //   102: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   107: ifeq -> 116
/*     */     //   110: sipush #256
/*     */     //   113: goto -> 119
/*     */     //   116: sipush #128
/*     */     //   119: ior
/*     */     //   120: istore #5
/*     */     //   122: iload #5
/*     */     //   124: sipush #147
/*     */     //   127: iand
/*     */     //   128: sipush #146
/*     */     //   131: if_icmpne -> 143
/*     */     //   134: aload_3
/*     */     //   135: invokeinterface getSkipping : ()Z
/*     */     //   140: ifne -> 555
/*     */     //   143: invokestatic isTraceInProgress : ()Z
/*     */     //   146: ifeq -> 159
/*     */     //   149: ldc -1198538093
/*     */     //   151: iload #5
/*     */     //   153: iconst_m1
/*     */     //   154: ldc 'androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:75)'
/*     */     //   156: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   159: bipush #14
/*     */     //   161: iload #5
/*     */     //   163: iand
/*     */     //   164: istore #6
/*     */     //   166: nop
/*     */     //   167: iconst_0
/*     */     //   168: istore #7
/*     */     //   170: aload_3
/*     */     //   171: ldc 444418301
/*     */     //   173: ldc 'CC(ReusableContent)P(1)149@5444L9:Composables.kt#9igjgp'
/*     */     //   175: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   178: aload_3
/*     */     //   179: sipush #207
/*     */     //   182: aload_1
/*     */     //   183: invokeinterface startReusableGroup : (ILjava/lang/Object;)V
/*     */     //   188: aload_3
/*     */     //   189: bipush #14
/*     */     //   191: iload #6
/*     */     //   193: iconst_3
/*     */     //   194: ishr
/*     */     //   195: iand
/*     */     //   196: istore #8
/*     */     //   198: astore #9
/*     */     //   200: iconst_0
/*     */     //   201: istore #10
/*     */     //   203: aload #9
/*     */     //   205: ldc 1358150931
/*     */     //   207: ldc 'C77@3088L321,84@3422L150,88@3608L337,88@3585L360:SaveableStateHolder.kt#r2ddri'
/*     */     //   209: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   212: aload #9
/*     */     //   214: ldc -233283229
/*     */     //   216: ldc 'CC(remember):SaveableStateHolder.kt#9igjgp'
/*     */     //   218: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   221: aload #9
/*     */     //   223: astore #11
/*     */     //   225: iconst_0
/*     */     //   226: istore #12
/*     */     //   228: iconst_0
/*     */     //   229: istore #13
/*     */     //   231: aload #11
/*     */     //   233: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   238: astore #14
/*     */     //   240: iconst_0
/*     */     //   241: istore #15
/*     */     //   243: aload #14
/*     */     //   245: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   248: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   251: if_acmpne -> 346
/*     */     //   254: iconst_0
/*     */     //   255: istore #16
/*     */     //   257: aload_0
/*     */     //   258: getfield parentSaveableStateRegistry : Landroidx/compose/runtime/saveable/SaveableStateRegistry;
/*     */     //   261: dup
/*     */     //   262: ifnull -> 274
/*     */     //   265: aload_1
/*     */     //   266: invokeinterface canBeSaved : (Ljava/lang/Object;)Z
/*     */     //   271: goto -> 276
/*     */     //   274: pop
/*     */     //   275: iconst_1
/*     */     //   276: ifne -> 321
/*     */     //   279: iconst_0
/*     */     //   280: istore #17
/*     */     //   282: new java/lang/StringBuilder
/*     */     //   285: dup
/*     */     //   286: invokespecial <init> : ()V
/*     */     //   289: ldc 'Type of the key '
/*     */     //   291: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   294: aload_1
/*     */     //   295: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   298: ldc ' is not supported. On Android you can only use types which can be stored inside the Bundle.'
/*     */     //   300: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   303: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   306: astore #17
/*     */     //   308: new java/lang/IllegalArgumentException
/*     */     //   311: dup
/*     */     //   312: aload #17
/*     */     //   314: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   317: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   320: athrow
/*     */     //   321: new androidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder
/*     */     //   324: dup
/*     */     //   325: aload_0
/*     */     //   326: aload_1
/*     */     //   327: invokespecial <init> : (Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;Ljava/lang/Object;)V
/*     */     //   330: astore #18
/*     */     //   332: aload #11
/*     */     //   334: aload #18
/*     */     //   336: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   341: aload #18
/*     */     //   343: goto -> 348
/*     */     //   346: aload #14
/*     */     //   348: nop
/*     */     //   349: nop
/*     */     //   350: nop
/*     */     //   351: checkcast androidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder
/*     */     //   354: astore #19
/*     */     //   356: aload #9
/*     */     //   358: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   361: aload #19
/*     */     //   363: astore #20
/*     */     //   365: invokestatic getLocalSaveableStateRegistry : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   368: aload #20
/*     */     //   370: invokevirtual getRegistry : ()Landroidx/compose/runtime/saveable/SaveableStateRegistry;
/*     */     //   373: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   376: aload_2
/*     */     //   377: aload #9
/*     */     //   379: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   382: bipush #112
/*     */     //   384: iload #5
/*     */     //   386: iand
/*     */     //   387: ior
/*     */     //   388: invokestatic CompositionLocalProvider : (Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   391: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   394: aload #9
/*     */     //   396: ldc -233266573
/*     */     //   398: ldc 'CC(remember):SaveableStateHolder.kt#9igjgp'
/*     */     //   400: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   403: aload #9
/*     */     //   405: astore #11
/*     */     //   407: aload_3
/*     */     //   408: aload_0
/*     */     //   409: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   414: aload_3
/*     */     //   415: aload_1
/*     */     //   416: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   421: ior
/*     */     //   422: aload_3
/*     */     //   423: aload #20
/*     */     //   425: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   430: ior
/*     */     //   431: istore #12
/*     */     //   433: iconst_0
/*     */     //   434: istore #13
/*     */     //   436: aload #11
/*     */     //   438: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   443: astore #14
/*     */     //   445: iconst_0
/*     */     //   446: istore #15
/*     */     //   448: iload #12
/*     */     //   450: ifne -> 464
/*     */     //   453: aload #14
/*     */     //   455: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   458: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   461: if_acmpne -> 502
/*     */     //   464: astore #21
/*     */     //   466: iconst_0
/*     */     //   467: istore #16
/*     */     //   469: new androidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1$1
/*     */     //   472: dup
/*     */     //   473: aload_0
/*     */     //   474: aload_1
/*     */     //   475: aload #20
/*     */     //   477: invokespecial <init> : (Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;Ljava/lang/Object;Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;)V
/*     */     //   480: checkcast kotlin/jvm/functions/Function1
/*     */     //   483: aload #21
/*     */     //   485: swap
/*     */     //   486: astore #17
/*     */     //   488: aload #11
/*     */     //   490: aload #17
/*     */     //   492: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   497: aload #17
/*     */     //   499: goto -> 504
/*     */     //   502: aload #14
/*     */     //   504: nop
/*     */     //   505: nop
/*     */     //   506: nop
/*     */     //   507: checkcast kotlin/jvm/functions/Function1
/*     */     //   510: astore #19
/*     */     //   512: aload #9
/*     */     //   514: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   517: aload #19
/*     */     //   519: aload #9
/*     */     //   521: bipush #6
/*     */     //   523: invokestatic DisposableEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   526: aload #9
/*     */     //   528: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   531: nop
/*     */     //   532: aload_3
/*     */     //   533: invokeinterface endReusableGroup : ()V
/*     */     //   538: aload_3
/*     */     //   539: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   542: nop
/*     */     //   543: invokestatic isTraceInProgress : ()Z
/*     */     //   546: ifeq -> 561
/*     */     //   549: invokestatic traceEventEnd : ()V
/*     */     //   552: goto -> 561
/*     */     //   555: aload_3
/*     */     //   556: invokeinterface skipToGroupEnd : ()V
/*     */     //   561: aload_3
/*     */     //   562: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   567: dup
/*     */     //   568: ifnull -> 594
/*     */     //   571: new androidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$2
/*     */     //   574: dup
/*     */     //   575: aload_0
/*     */     //   576: aload_1
/*     */     //   577: aload_2
/*     */     //   578: iload #4
/*     */     //   580: invokespecial <init> : (Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;I)V
/*     */     //   583: checkcast kotlin/jvm/functions/Function2
/*     */     //   586: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   591: goto -> 595
/*     */     //   594: pop
/*     */     //   595: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #76	-> 12
/*     */     //   #77	-> 166
/*     */     //   #144	-> 175
/*     */     //   #145	-> 179
/*     */     //   #146	-> 188
/*     */     //   #78	-> 209
/*     */     //   #147	-> 231
/*     */     //   #148	-> 243
/*     */     //   #149	-> 254
/*     */     //   #79	-> 257
/*     */     //   #80	-> 282
/*     */     //   #79	-> 306
/*     */     //   #83	-> 321
/*     */     //   #149	-> 330
/*     */     //   #150	-> 332
/*     */     //   #151	-> 341
/*     */     //   #152	-> 346
/*     */     //   #148	-> 348
/*     */     //   #147	-> 349
/*     */     //   #147	-> 350
/*     */     //   #78	-> 351
/*     */     //   #86	-> 365
/*     */     //   #87	-> 376
/*     */     //   #85	-> 388
/*     */     //   #89	-> 391
/*     */     //   #153	-> 436
/*     */     //   #154	-> 448
/*     */     //   #155	-> 464
/*     */     //   #89	-> 469
/*     */     //   #155	-> 486
/*     */     //   #156	-> 488
/*     */     //   #157	-> 497
/*     */     //   #158	-> 502
/*     */     //   #154	-> 504
/*     */     //   #153	-> 505
/*     */     //   #153	-> 506
/*     */     //   #89	-> 507
/*     */     //   #78	-> 528
/*     */     //   #98	-> 531
/*     */     //   #146	-> 532
/*     */     //   #159	-> 533
/*     */     //   #144	-> 539
/*     */     //   #160	-> 542
/*     */     //   #99	-> 555
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   282	24	17	$i$a$-require-SaveableStateHolderImpl$SaveableStateProvider$1$registryHolder$1$1	I
/*     */     //   257	73	16	$i$a$-cache-SaveableStateHolderImpl$SaveableStateProvider$1$registryHolder$1	I
/*     */     //   332	11	18	value$iv	Ljava/lang/Object;
/*     */     //   243	106	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   240	109	14	it$iv	Ljava/lang/Object;
/*     */     //   231	120	13	$i$f$cache	I
/*     */     //   228	123	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   228	123	12	invalid$iv	Z
/*     */     //   469	14	16	$i$a$-cache-SaveableStateHolderImpl$SaveableStateProvider$1$1	I
/*     */     //   488	11	17	value$iv	Ljava/lang/Object;
/*     */     //   448	57	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   445	60	14	it$iv	Ljava/lang/Object;
/*     */     //   436	71	13	$i$f$cache	I
/*     */     //   433	74	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   433	74	12	invalid$iv	Z
/*     */     //   365	166	20	registryHolder	Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;
/*     */     //   203	329	10	$i$a$-ReusableContent-SaveableStateHolderImpl$SaveableStateProvider$1	I
/*     */     //   200	332	9	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   200	332	8	$changed	I
/*     */     //   170	373	7	$i$f$ReusableContent	I
/*     */     //   167	376	6	$changed$iv	I
/*     */     //   31	565	5	$dirty	I
/*     */     //   0	596	0	this	Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;
/*     */     //   0	596	1	key	Ljava/lang/Object;
/*     */     //   0	596	2	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	596	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	596	4	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,143:1\n1#2:144\n63#3,5:145\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1$1\n*L\n93#1:145,5\n*E\n"})
/*     */   static final class SaveableStateHolderImpl$SaveableStateProvider$1$1$1
/*     */     extends Lambda
/*     */     implements Function1<DisposableEffectScope, DisposableEffectResult>
/*     */   {
/*     */     @NotNull
/*     */     public final DisposableEffectResult invoke(@NotNull DisposableEffectScope $this$DisposableEffect) {
/*  90 */       Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect"); boolean bool = !SaveableStateHolderImpl.this.registryHolders.containsKey(this.$key) ? true : false; Object object1 = this.$key; if (!bool) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 144 */         int $i$a$-require-SaveableStateHolderImpl$SaveableStateProvider$1$1$1$1 = 0; String str = "Key " + object1 + " was used multiple times "; throw new IllegalArgumentException(str.toString());
/* 145 */       }  SaveableStateHolderImpl.this.savedStates.remove(this.$key); SaveableStateHolderImpl.this.registryHolders.put(this.$key, this.$registryHolder); DisposableEffectScope disposableEffectScope = $this$DisposableEffect; object1 = this.$registryHolder; SaveableStateHolderImpl saveableStateHolderImpl = SaveableStateHolderImpl.this; Object object2 = this.$key; int $i$f$onDispose = 0; return new SaveableStateHolderImpl$SaveableStateProvider$1$1$1$invoke$$inlined$onDispose$1((SaveableStateHolderImpl.RegistryHolder)object1, saveableStateHolderImpl, object2);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     SaveableStateHolderImpl$SaveableStateProvider$1$1$1(Object $key, SaveableStateHolderImpl.RegistryHolder $registryHolder) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final Map<Object, Map<String, List<Object>>> saveAll() {
/*     */     Map<Object, Map<String, List<Object>>> map = MapsKt.toMutableMap(this.savedStates);
/*     */     Iterable<RegistryHolder> $this$forEach$iv = this.registryHolders.values();
/*     */     int $i$f$forEach = 0;
/* 161 */     Iterator<RegistryHolder> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); RegistryHolder it = (RegistryHolder)element$iv; int $i$a$-forEach-SaveableStateHolderImpl$saveAll$1 = 0; it.saveTo(map); }
/*     */      Map<Object, Map<String, List<Object>>> map1 = map;
/* 163 */     int $i$a$-ifEmpty-SaveableStateHolderImpl$saveAll$2 = 0;
/*     */     return map1.isEmpty() ? null : map1;
/*     */   }
/*     */   
/*     */   public void removeState(@NotNull Object key) {
/*     */     Intrinsics.checkNotNullParameter(key, "key");
/*     */     RegistryHolder registryHolder = this.registryHolders.get(key);
/*     */     if (registryHolder != null) {
/*     */       registryHolder.setShouldSave(false);
/*     */     } else {
/*     */       this.savedStates.remove(key);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\005\n\002\020\002\n\000\n\002\020%\n\002\020$\n\002\020\016\n\002\020 \n\000\b\004\030\0002\0020\001B\r\022\006\020\002\032\0020\001¢\006\002\020\003J.\020\020\032\0020\0212&\020\022\032\"\022\004\022\0020\001\022\030\022\026\022\004\022\0020\025\022\f\022\n\022\006\022\004\030\0010\0010\0260\0240\023R\021\020\002\032\0020\001¢\006\b\n\000\032\004\b\004\020\005R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\b\020\tR\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017¨\006\027"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;", "", "key", "(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "registry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getRegistry", "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "shouldSave", "", "getShouldSave", "()Z", "setShouldSave", "(Z)V", "saveTo", "", "map", "", "", "", "", "runtime-saveable"})
/*     */   public final class RegistryHolder {
/*     */     @NotNull
/*     */     private final Object key;
/*     */     private boolean shouldSave;
/*     */     @NotNull
/*     */     private final SaveableStateRegistry registry;
/*     */     
/*     */     public RegistryHolder(Object key) {
/*     */       this.key = key;
/*     */       this.shouldSave = true;
/*     */       this.registry = SaveableStateRegistryKt.SaveableStateRegistry((Map<String, ? extends List<? extends Object>>)SaveableStateHolderImpl.this.savedStates.get(this.key), new SaveableStateHolderImpl$RegistryHolder$registry$1());
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Object getKey() {
/*     */       return this.key;
/*     */     }
/*     */     
/*     */     public final boolean getShouldSave() {
/*     */       return this.shouldSave;
/*     */     }
/*     */     
/*     */     public final void setShouldSave(boolean <set-?>) {
/*     */       this.shouldSave = <set-?>;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SaveableStateRegistry getRegistry() {
/*     */       return this.registry;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\000\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"})
/*     */     static final class SaveableStateHolderImpl$RegistryHolder$registry$1 extends Lambda implements Function1<Object, Boolean> {
/*     */       @NotNull
/*     */       public final Boolean invoke(@NotNull Object it) {
/*     */         Intrinsics.checkNotNullParameter(it, "it");
/*     */         SaveableStateHolderImpl.this.getParentSaveableStateRegistry();
/*     */         return Boolean.valueOf((SaveableStateHolderImpl.this.getParentSaveableStateRegistry() != null) ? SaveableStateHolderImpl.this.getParentSaveableStateRegistry().canBeSaved(it) : true);
/*     */       }
/*     */       
/*     */       SaveableStateHolderImpl$RegistryHolder$registry$1() {
/*     */         super(1);
/*     */       }
/*     */     }
/*     */     
/*     */     public final void saveTo(@NotNull Map<Object, Map<String, List<Object>>> map) {
/*     */       Intrinsics.checkNotNullParameter(map, "map");
/*     */       if (this.shouldSave) {
/*     */         Map<String, List<Object>> savedData = this.registry.performSave();
/*     */         if (savedData.isEmpty()) {
/*     */           map.remove(this.key);
/*     */         } else {
/*     */           map.put(this.key, savedData);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\033\020\003\032\f\022\004\022\0020\005\022\002\b\0030\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final Saver<SaveableStateHolderImpl, ?> getSaver() {
/*     */       return SaveableStateHolderImpl.Saver;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Map<Object, Map<String, List<Object>>> savedStates;
/*     */   @NotNull
/*     */   private final Map<Object, RegistryHolder> registryHolders;
/*     */   @Nullable
/*     */   private SaveableStateRegistry parentSaveableStateRegistry;
/*     */   @NotNull
/*     */   private static final Saver<SaveableStateHolderImpl, ?> Saver = SaverKt.Saver(SaveableStateHolderImpl$Companion$Saver$1.INSTANCE, SaveableStateHolderImpl$Companion$Saver$2.INSTANCE);
/*     */   
/*     */   public SaveableStateHolderImpl() {
/*     */     this(null, 1, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\"\n\000\n\002\020%\n\002\020\000\n\002\020$\n\002\020\016\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\020\000\032$\022\004\022\0020\002\022\030\022\026\022\004\022\0020\004\022\f\022\n\022\006\022\004\030\0010\0020\0050\003\030\0010\001*\0020\0062\006\020\007\032\0020\bH\n¢\006\002\b\t"}, d2 = {"<anonymous>", "", "", "", "", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "invoke"})
/*     */   static final class SaveableStateHolderImpl$Companion$Saver$1 extends Lambda implements Function2<SaverScope, SaveableStateHolderImpl, Map<Object, Map<String, ? extends List<? extends Object>>>> {
/*     */     public static final SaveableStateHolderImpl$Companion$Saver$1 INSTANCE = new SaveableStateHolderImpl$Companion$Saver$1();
/*     */     
/*     */     @Nullable
/*     */     public final Map<Object, Map<String, List<Object>>> invoke(@NotNull SaverScope $this$Saver, @NotNull SaveableStateHolderImpl it) {
/*     */       Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver");
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return it.saveAll();
/*     */     }
/*     */     
/*     */     SaveableStateHolderImpl$Companion$Saver$1() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\000\n\002\020%\n\002\020\000\n\002\020$\n\002\020\016\n\002\020 \n\000\020\000\032\004\030\0010\0012&\020\002\032\"\022\004\022\0020\004\022\030\022\026\022\004\022\0020\006\022\f\022\n\022\006\022\004\030\0010\0040\0070\0050\003H\n¢\006\002\b\b"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "it", "", "", "", "", "", "invoke"})
/*     */   static final class SaveableStateHolderImpl$Companion$Saver$2 extends Lambda implements Function1<Map<Object, Map<String, ? extends List<? extends Object>>>, SaveableStateHolderImpl> {
/*     */     public static final SaveableStateHolderImpl$Companion$Saver$2 INSTANCE = new SaveableStateHolderImpl$Companion$Saver$2();
/*     */     
/*     */     @Nullable
/*     */     public final SaveableStateHolderImpl invoke(@NotNull Map<Object, Map<String, List<Object>>> it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return new SaveableStateHolderImpl(it);
/*     */     }
/*     */     
/*     */     SaveableStateHolderImpl$Companion$Saver$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class SaveableStateHolderImpl$SaveableStateProvider$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     SaveableStateHolderImpl$SaveableStateProvider$2(SaveableStateHolderImpl $tmp0_rcvr, Object $key, Function2<Composer, Integer, Unit> $content, int $$changed) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       this.$tmp0_rcvr.SaveableStateProvider(this.$key, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-saveable-desktop-1.7.3.jar!\androidx\compose\runtime\saveable\SaveableStateHolderImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */