/*     */ package org.jetbrains.compose.resources;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\021\n\002\020\000\n\002\b\005\n\002\020 \n\000\n\002\030\002\n\002\b\007\032\036\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H@¢\006\002\020\006\0322\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\022\020\007\032\n\022\006\b\001\022\0020\t0\b\"\0020\tH@¢\006\002\020\n\032\026\020\000\032\0020\0012\006\020\004\032\0020\005H@¢\006\002\020\013\032*\020\000\032\0020\0012\006\020\004\032\0020\0052\022\020\007\032\n\022\006\b\001\022\0020\t0\b\"\0020\tH@¢\006\002\020\f\0324\020\r\032\0020\0012\006\020\004\032\0020\0052\f\020\016\032\b\022\004\022\0020\0010\0172\006\020\020\032\0020\0212\006\020\002\032\0020\003H@¢\006\002\020\022\032&\020\r\032\0020\0012\006\020\004\032\0020\0052\006\020\020\032\0020\0212\006\020\002\032\0020\003H@¢\006\002\020\023\032\025\020\024\032\0020\0012\006\020\004\032\0020\005H\007¢\006\002\020\025\032)\020\024\032\0020\0012\006\020\004\032\0020\0052\022\020\007\032\n\022\006\b\001\022\0020\t0\b\"\0020\tH\007¢\006\002\020\026¨\006\027²\006\n\020\030\032\0020\001X\002²\006\n\020\030\032\0020\001X\002"}, d2 = {"getString", "", "environment", "Lorg/jetbrains/compose/resources/ResourceEnvironment;", "resource", "Lorg/jetbrains/compose/resources/StringResource;", "(Lorg/jetbrains/compose/resources/ResourceEnvironment;Lorg/jetbrains/compose/resources/StringResource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "formatArgs", "", "", "(Lorg/jetbrains/compose/resources/ResourceEnvironment;Lorg/jetbrains/compose/resources/StringResource;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lorg/jetbrains/compose/resources/StringResource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lorg/jetbrains/compose/resources/StringResource;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadString", "args", "", "resourceReader", "Lorg/jetbrains/compose/resources/ResourceReader;", "(Lorg/jetbrains/compose/resources/StringResource;Ljava/util/List;Lorg/jetbrains/compose/resources/ResourceReader;Lorg/jetbrains/compose/resources/ResourceEnvironment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lorg/jetbrains/compose/resources/StringResource;Lorg/jetbrains/compose/resources/ResourceReader;Lorg/jetbrains/compose/resources/ResourceEnvironment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stringResource", "(Lorg/jetbrains/compose/resources/StringResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "(Lorg/jetbrains/compose/resources/StringResource;[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "library", "str"})
/*     */ @SourceDebugExtension({"SMAP\nStringResources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringResources.kt\norg/jetbrains/compose/resources/StringResourcesKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,133:1\n11065#2:134\n11400#2,3:135\n11065#2:138\n11400#2,3:139\n11065#2:142\n11400#2,3:143\n81#3:146\n81#3:147\n*S KotlinDebug\n*F\n+ 1 StringResources.kt\norg/jetbrains/compose/resources/StringResourcesKt\n*L\n79#1:134\n79#1:135,3\n97#1:138\n97#1:139,3\n119#1:142\n119#1:143,3\n27#1:146\n80#1:147\n*E\n"})
/*     */ public final class StringResourcesKt {
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final String stringResource(@NotNull StringResource resource, @Nullable Composer $composer, int $changed) {
/*  25 */     Intrinsics.checkNotNullParameter(resource, "resource"); $composer.startReplaceGroup(-1520244580); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1520244580, $changed, -1, "org.jetbrains.compose.resources.stringResource (StringResources.kt:24)"); 
/*  26 */     ResourceReader resourceReader = ResourceReader_skikoKt.getCurrentOrPreview(ResourceReaderKt.getLocalResourceReader(), $composer, 6);
/*  27 */     State<?> str$delegate = ResourceState_blockingKt.rememberResourceState(resource, StringResourcesKt$stringResource$str$2.INSTANCE, new StringResourcesKt$stringResource$str$3(resource, resourceReader, null), $composer, 0x230 | 0xE & $changed);
/*     */ 
/*     */     
/*  30 */     String str = stringResource$lambda$0((State)str$delegate); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return str;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final String stringResource$lambda$0(State $str$delegate) {
/*     */     State state = $str$delegate;
/*     */     Object object = null;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 146 */     return (String)state.getValue(); } private static final String stringResource$lambda$2(State $str$delegate) { State state = $str$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 147 */     return (String)state.getValue(); }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "StringResources.kt", l = {63}, i = {}, s = {}, n = {}, m = "loadString", c = "org.jetbrains.compose.resources.StringResourcesKt")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class StringResourcesKt$loadString$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     StringResourcesKt$loadString$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return StringResourcesKt.loadString(null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "StringResources.kt", l = {130}, i = {0}, s = {"L$0"}, n = {"args"}, m = "loadString", c = "org.jetbrains.compose.resources.StringResourcesKt")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class StringResourcesKt$loadString$2 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     StringResourcesKt$loadString$2(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return StringResourcesKt.loadString(null, null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class StringResourcesKt$stringResource$str$2 extends Lambda implements Function0<String> {
/*     */     public static final StringResourcesKt$stringResource$str$2 INSTANCE = new StringResourcesKt$stringResource$str$2();
/*     */     
/*     */     StringResourcesKt$stringResource$str$2() {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String invoke() {
/*     */       return "";
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "StringResources.kt", l = {28}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.StringResourcesKt$stringResource$str$3")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\016\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "", "env", "Lorg/jetbrains/compose/resources/ResourceEnvironment;"})
/*     */   static final class StringResourcesKt$stringResource$str$3 extends SuspendLambda implements Function2<ResourceEnvironment, Continuation<? super String>, Object> {
/*     */     int label;
/*     */     
/*     */     StringResourcesKt$stringResource$str$3(StringResource $resource, ResourceReader $resourceReader, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       ResourceEnvironment env;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           env = (ResourceEnvironment)this.L$0;
/*     */           this.label = 1;
/*     */           if (StringResourcesKt.loadString(this.$resource, this.$resourceReader, env, (Continuation)this) == object)
/*     */             return object; 
/*     */           return StringResourcesKt.loadString(this.$resource, this.$resourceReader, env, (Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super StringResourcesKt$stringResource$str$3> $completion) {
/*     */       StringResourcesKt$stringResource$str$3 stringResourcesKt$stringResource$str$3 = new StringResourcesKt$stringResource$str$3(this.$resource, this.$resourceReader, $completion);
/*     */       stringResourcesKt$stringResource$str$3.L$0 = value;
/*     */       return (Continuation<Unit>)stringResourcesKt$stringResource$str$3;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull ResourceEnvironment p1, @Nullable Continuation<?> p2) {
/*     */       return ((StringResourcesKt$stringResource$str$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object getString(@NotNull StringResource resource, @NotNull Continuation<? super String> $completion) {
/*     */     return loadString(resource, ResourceReaderKt.getDefaultResourceReader(), ResourceEnvironmentKt.getSystemResourceEnvironment(), $completion);
/*     */   }
/*     */   
/*     */   @ExperimentalResourceApi
/*     */   @Nullable
/*     */   public static final Object getString(@NotNull ResourceEnvironment environment, @NotNull StringResource resource, @NotNull Continuation<? super String> $completion) {
/*     */     return loadString(resource, ResourceReaderKt.getDefaultResourceReader(), environment, $completion);
/*     */   }
/*     */   
/*     */   private static final Object loadString(StringResource resource, ResourceReader resourceReader, ResourceEnvironment environment, Continuation<? super String> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof org/jetbrains/compose/resources/StringResourcesKt$loadString$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast org/jetbrains/compose/resources/StringResourcesKt$loadString$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #7
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 49
/*     */     //   39: new org/jetbrains/compose/resources/StringResourcesKt$loadString$1
/*     */     //   42: dup
/*     */     //   43: aload_3
/*     */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   47: astore #7
/*     */     //   49: aload #7
/*     */     //   51: getfield result : Ljava/lang/Object;
/*     */     //   54: astore #6
/*     */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   59: astore #8
/*     */     //   61: aload #7
/*     */     //   63: getfield label : I
/*     */     //   66: tableswitch default -> 150, 0 -> 88, 1 -> 126
/*     */     //   88: aload #6
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: checkcast org/jetbrains/compose/resources/Resource
/*     */     //   97: aload_2
/*     */     //   98: invokestatic getResourceItemByEnvironment : (Lorg/jetbrains/compose/resources/Resource;Lorg/jetbrains/compose/resources/ResourceEnvironment;)Lorg/jetbrains/compose/resources/ResourceItem;
/*     */     //   101: astore #4
/*     */     //   103: aload #4
/*     */     //   105: aload_1
/*     */     //   106: aload #7
/*     */     //   108: aload #7
/*     */     //   110: iconst_1
/*     */     //   111: putfield label : I
/*     */     //   114: invokestatic getStringItem : (Lorg/jetbrains/compose/resources/ResourceItem;Lorg/jetbrains/compose/resources/ResourceReader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   117: dup
/*     */     //   118: aload #8
/*     */     //   120: if_acmpne -> 133
/*     */     //   123: aload #8
/*     */     //   125: areturn
/*     */     //   126: aload #6
/*     */     //   128: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   131: aload #6
/*     */     //   133: dup
/*     */     //   134: ldc 'null cannot be cast to non-null type org.jetbrains.compose.resources.StringItem.Value'
/*     */     //   136: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   139: checkcast org/jetbrains/compose/resources/StringItem$Value
/*     */     //   142: astore #5
/*     */     //   144: aload #5
/*     */     //   146: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   149: areturn
/*     */     //   150: new java/lang/IllegalStateException
/*     */     //   153: dup
/*     */     //   154: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   156: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   159: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #57	-> 59
/*     */     //   #62	-> 93
/*     */     //   #63	-> 103
/*     */     //   #57	-> 123
/*     */     //   #63	-> 133
/*     */     //   #64	-> 144
/*     */     //   #57	-> 150
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	10	0	resource	Lorg/jetbrains/compose/resources/StringResource;
/*     */     //   93	24	1	resourceReader	Lorg/jetbrains/compose/resources/ResourceReader;
/*     */     //   93	10	2	environment	Lorg/jetbrains/compose/resources/ResourceEnvironment;
/*     */     //   103	14	4	resourceItem	Lorg/jetbrains/compose/resources/ResourceItem;
/*     */     //   144	6	5	item	Lorg/jetbrains/compose/resources/StringItem$Value;
/*     */     //   49	101	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   56	94	6	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final String stringResource(@NotNull StringResource resource, @NotNull Object[] formatArgs, @Nullable Composer $composer, int $changed) {
/*     */     Intrinsics.checkNotNullParameter(resource, "resource");
/*     */     Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
/*     */     $composer.startReplaceGroup(-217376913);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-217376913, $changed, -1, "org.jetbrains.compose.resources.stringResource (StringResources.kt:76)"); 
/*     */     ResourceReader resourceReader = ResourceReader_skikoKt.getCurrentOrPreview(ResourceReaderKt.getLocalResourceReader(), $composer, 6);
/*     */     Object[] $this$map$iv = formatArgs;
/*     */     int $i$f$map = 0;
/*     */     Object[] arrayOfObject1 = $this$map$iv;
/*     */     Collection<String> destination$iv$iv = new ArrayList($this$map$iv.length);
/*     */     int $i$f$mapTo = 0;
/*     */     byte b;
/*     */     int i;
/*     */     for (b = 0, i = arrayOfObject1.length; b < i; ) {
/*     */       Object item$iv$iv = arrayOfObject1[b];
/*     */       Object object1 = item$iv$iv;
/*     */       Collection<String> collection = destination$iv$iv;
/*     */       int $i$a$-map-StringResourcesKt$stringResource$args$1 = 0;
/*     */       collection.add(object1.toString());
/*     */     } 
/*     */     List<String> args = (List)destination$iv$iv;
/*     */     State<?> str$delegate = ResourceState_blockingKt.rememberResourceState(resource, args, StringResourcesKt$stringResource$str$5.INSTANCE, new StringResourcesKt$stringResource$str$6(resource, args, resourceReader, null), $composer, 0x11C0 | 0xE & $changed);
/*     */     String str = stringResource$lambda$2((State)str$delegate);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return str;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class StringResourcesKt$stringResource$str$5 extends Lambda implements Function0<String> {
/*     */     public static final StringResourcesKt$stringResource$str$5 INSTANCE = new StringResourcesKt$stringResource$str$5();
/*     */     
/*     */     StringResourcesKt$stringResource$str$5() {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String invoke() {
/*     */       return "";
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "StringResources.kt", l = {81}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.StringResourcesKt$stringResource$str$6")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\016\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "", "env", "Lorg/jetbrains/compose/resources/ResourceEnvironment;"})
/*     */   static final class StringResourcesKt$stringResource$str$6 extends SuspendLambda implements Function2<ResourceEnvironment, Continuation<? super String>, Object> {
/*     */     int label;
/*     */     
/*     */     StringResourcesKt$stringResource$str$6(StringResource $resource, List<String> $args, ResourceReader $resourceReader, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       ResourceEnvironment env;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           env = (ResourceEnvironment)this.L$0;
/*     */           this.label = 1;
/*     */           if (StringResourcesKt.loadString(this.$resource, this.$args, this.$resourceReader, env, (Continuation)this) == object)
/*     */             return object; 
/*     */           return StringResourcesKt.loadString(this.$resource, this.$args, this.$resourceReader, env, (Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super StringResourcesKt$stringResource$str$6> $completion) {
/*     */       StringResourcesKt$stringResource$str$6 stringResourcesKt$stringResource$str$6 = new StringResourcesKt$stringResource$str$6(this.$resource, this.$args, this.$resourceReader, $completion);
/*     */       stringResourcesKt$stringResource$str$6.L$0 = value;
/*     */       return (Continuation<Unit>)stringResourcesKt$stringResource$str$6;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull ResourceEnvironment p1, @Nullable Continuation<?> p2) {
/*     */       return ((StringResourcesKt$stringResource$str$6)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object getString(@NotNull StringResource resource, @NotNull Object[] formatArgs, @NotNull Continuation<? super String> $completion) {
/*     */     Object[] arrayOfObject1 = formatArgs;
/*     */     StringResource stringResource = resource;
/*     */     int $i$f$map = 0;
/*     */     Object[] arrayOfObject2 = arrayOfObject1;
/*     */     Collection<String> destination$iv$iv = new ArrayList(arrayOfObject1.length);
/*     */     int $i$f$mapTo = 0;
/*     */     byte b;
/*     */     int i;
/*     */     for (b = 0, i = arrayOfObject2.length; b < i; ) {
/*     */       Object item$iv$iv = arrayOfObject2[b];
/*     */       Object object1 = item$iv$iv;
/*     */       Collection<String> collection = destination$iv$iv;
/*     */       int $i$a$-map-StringResourcesKt$getString$4 = 0;
/*     */       collection.add(object1.toString());
/*     */     } 
/*     */     return loadString(stringResource, (List<String>)destination$iv$iv, ResourceReaderKt.getDefaultResourceReader(), ResourceEnvironmentKt.getSystemResourceEnvironment(), $completion);
/*     */   }
/*     */   
/*     */   @ExperimentalResourceApi
/*     */   @Nullable
/*     */   public static final Object getString(@NotNull ResourceEnvironment environment, @NotNull StringResource resource, @NotNull Object[] formatArgs, @NotNull Continuation<? super String> $completion) {
/*     */     Object[] arrayOfObject1 = formatArgs;
/*     */     StringResource stringResource = resource;
/*     */     int $i$f$map = 0;
/*     */     Object[] arrayOfObject2 = arrayOfObject1;
/*     */     Collection<String> destination$iv$iv = new ArrayList(arrayOfObject1.length);
/*     */     int $i$f$mapTo = 0;
/*     */     byte b;
/*     */     int i;
/*     */     for (b = 0, i = arrayOfObject2.length; b < i; ) {
/*     */       Object item$iv$iv = arrayOfObject2[b];
/*     */       Object object1 = item$iv$iv;
/*     */       Collection<String> collection = destination$iv$iv;
/*     */       int $i$a$-map-StringResourcesKt$getString$6 = 0;
/*     */       collection.add(object1.toString());
/*     */     } 
/*     */     return loadString(stringResource, (List<String>)destination$iv$iv, ResourceReaderKt.getDefaultResourceReader(), environment, $completion);
/*     */   }
/*     */   
/*     */   private static final Object loadString(StringResource resource, List args, ResourceReader resourceReader, ResourceEnvironment environment, Continuation<? super String> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof org/jetbrains/compose/resources/StringResourcesKt$loadString$2
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast org/jetbrains/compose/resources/StringResourcesKt$loadString$2
/*     */     //   13: astore #7
/*     */     //   15: aload #7
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #7
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new org/jetbrains/compose/resources/StringResourcesKt$loadString$2
/*     */     //   44: dup
/*     */     //   45: aload #4
/*     */     //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #7
/*     */     //   52: aload #7
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #6
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #8
/*     */     //   64: aload #7
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 154, 0 -> 92, 1 -> 126
/*     */     //   92: aload #6
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: aload_2
/*     */     //   99: aload_3
/*     */     //   100: aload #7
/*     */     //   102: aload #7
/*     */     //   104: aload_1
/*     */     //   105: putfield L$0 : Ljava/lang/Object;
/*     */     //   108: aload #7
/*     */     //   110: iconst_1
/*     */     //   111: putfield label : I
/*     */     //   114: invokestatic loadString : (Lorg/jetbrains/compose/resources/StringResource;Lorg/jetbrains/compose/resources/ResourceReader;Lorg/jetbrains/compose/resources/ResourceEnvironment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   117: dup
/*     */     //   118: aload #8
/*     */     //   120: if_acmpne -> 142
/*     */     //   123: aload #8
/*     */     //   125: areturn
/*     */     //   126: aload #7
/*     */     //   128: getfield L$0 : Ljava/lang/Object;
/*     */     //   131: checkcast java/util/List
/*     */     //   134: astore_1
/*     */     //   135: aload #6
/*     */     //   137: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   140: aload #6
/*     */     //   142: checkcast java/lang/String
/*     */     //   145: astore #5
/*     */     //   147: aload #5
/*     */     //   149: aload_1
/*     */     //   150: invokestatic replaceWithArgs : (Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
/*     */     //   153: areturn
/*     */     //   154: new java/lang/IllegalStateException
/*     */     //   157: dup
/*     */     //   158: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   160: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   163: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #124	-> 62
/*     */     //   #130	-> 97
/*     */     //   #124	-> 123
/*     */     //   #131	-> 147
/*     */     //   #124	-> 154
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	20	0	resource	Lorg/jetbrains/compose/resources/StringResource;
/*     */     //   97	29	1	args	Ljava/util/List;
/*     */     //   135	19	1	args	Ljava/util/List;
/*     */     //   97	20	2	resourceReader	Lorg/jetbrains/compose/resources/ResourceReader;
/*     */     //   97	20	3	environment	Lorg/jetbrains/compose/resources/ResourceEnvironment;
/*     */     //   147	7	5	str	Ljava/lang/String;
/*     */     //   52	102	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	95	6	$result	Ljava/lang/Object;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\StringResourcesKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */