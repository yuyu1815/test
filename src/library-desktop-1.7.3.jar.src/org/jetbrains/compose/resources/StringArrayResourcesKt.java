/*    */ package org.jetbrains.compose.resources;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.State;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KProperty;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\032$\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\0042\006\020\005\032\0020\006H@¢\006\002\020\007\032\034\020\000\032\b\022\004\022\0020\0020\0012\006\020\005\032\0020\006H@¢\006\002\020\b\032,\020\t\032\b\022\004\022\0020\0020\0012\006\020\005\032\0020\0062\006\020\n\032\0020\0132\006\020\003\032\0020\004H@¢\006\002\020\f\032\033\020\r\032\b\022\004\022\0020\0020\0012\006\020\005\032\0020\006H\007¢\006\002\020\016¨\006\017²\006\020\020\020\032\b\022\004\022\0020\0020\001X\002"}, d2 = {"getStringArray", "", "", "environment", "Lorg/jetbrains/compose/resources/ResourceEnvironment;", "resource", "Lorg/jetbrains/compose/resources/StringArrayResource;", "(Lorg/jetbrains/compose/resources/ResourceEnvironment;Lorg/jetbrains/compose/resources/StringArrayResource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lorg/jetbrains/compose/resources/StringArrayResource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadStringArray", "resourceReader", "Lorg/jetbrains/compose/resources/ResourceReader;", "(Lorg/jetbrains/compose/resources/StringArrayResource;Lorg/jetbrains/compose/resources/ResourceReader;Lorg/jetbrains/compose/resources/ResourceEnvironment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stringArrayResource", "(Lorg/jetbrains/compose/resources/StringArrayResource;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "library", "array"})
/*    */ @SourceDebugExtension({"SMAP\nStringArrayResources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringArrayResources.kt\norg/jetbrains/compose/resources/StringArrayResourcesKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,75:1\n81#2:76\n*S KotlinDebug\n*F\n+ 1 StringArrayResources.kt\norg/jetbrains/compose/resources/StringArrayResourcesKt\n*L\n34#1:76\n*E\n"})
/*    */ public final class StringArrayResourcesKt {
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final List<String> stringArrayResource(@NotNull StringArrayResource resource, @Nullable Composer $composer, int $changed) {
/* 32 */     Intrinsics.checkNotNullParameter(resource, "resource"); $composer.startReplaceGroup(-1689267888); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1689267888, $changed, -1, "org.jetbrains.compose.resources.stringArrayResource (StringArrayResources.kt:31)"); 
/* 33 */     ResourceReader resourceReader = ResourceReader_skikoKt.getCurrentOrPreview(ResourceReaderKt.getLocalResourceReader(), $composer, 6);
/* 34 */     State<?> array$delegate = ResourceState_blockingKt.rememberResourceState(resource, StringArrayResourcesKt$stringArrayResource$array$2.INSTANCE, new StringArrayResourcesKt$stringArrayResource$array$3(resource, resourceReader, null), $composer, 0x230 | 0xE & $changed);
/*    */ 
/*    */     
/* 37 */     List<String> list = stringArrayResource$lambda$0((State)array$delegate); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return list;
/*    */   }
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final List<String> stringArrayResource$lambda$0(State $array$delegate) {
/*    */     State state = $array$delegate;
/*    */     Object object = null;
/*    */     KProperty property$iv = null;
/*    */     int $i$f$getValue = 0;
/* 76 */     return (List<String>)state.getValue();
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "StringArrayResources.kt", l = {72}, i = {}, s = {}, n = {}, m = "loadStringArray", c = "org.jetbrains.compose.resources.StringArrayResourcesKt")
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*    */   static final class StringArrayResourcesKt$loadStringArray$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     StringArrayResourcesKt$loadStringArray$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return StringArrayResourcesKt.loadStringArray(null, null, null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\020\016\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "", "invoke"})
/*    */   static final class StringArrayResourcesKt$stringArrayResource$array$2 extends Lambda implements Function0<List<? extends String>> {
/*    */     public static final StringArrayResourcesKt$stringArrayResource$array$2 INSTANCE = new StringArrayResourcesKt$stringArrayResource$array$2();
/*    */     
/*    */     StringArrayResourcesKt$stringArrayResource$array$2() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<String> invoke() {
/*    */       return CollectionsKt.emptyList();
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "StringArrayResources.kt", l = {35}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.StringArrayResourcesKt$stringArrayResource$array$3")
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\004H@"}, d2 = {"<anonymous>", "", "", "env", "Lorg/jetbrains/compose/resources/ResourceEnvironment;"})
/*    */   static final class StringArrayResourcesKt$stringArrayResource$array$3 extends SuspendLambda implements Function2<ResourceEnvironment, Continuation<? super List<? extends String>>, Object> {
/*    */     int label;
/*    */     
/*    */     StringArrayResourcesKt$stringArrayResource$array$3(StringArrayResource $resource, ResourceReader $resourceReader, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       ResourceEnvironment env;
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           env = (ResourceEnvironment)this.L$0;
/*    */           this.label = 1;
/*    */           if (StringArrayResourcesKt.loadStringArray(this.$resource, this.$resourceReader, env, (Continuation)this) == object)
/*    */             return object; 
/*    */           return StringArrayResourcesKt.loadStringArray(this.$resource, this.$resourceReader, env, (Continuation)this);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super StringArrayResourcesKt$stringArrayResource$array$3> $completion) {
/*    */       StringArrayResourcesKt$stringArrayResource$array$3 stringArrayResourcesKt$stringArrayResource$array$3 = new StringArrayResourcesKt$stringArrayResource$array$3(this.$resource, this.$resourceReader, $completion);
/*    */       stringArrayResourcesKt$stringArrayResource$array$3.L$0 = value;
/*    */       return (Continuation<Unit>)stringArrayResourcesKt$stringArrayResource$array$3;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull ResourceEnvironment p1, @Nullable Continuation<?> p2) {
/*    */       return ((StringArrayResourcesKt$stringArrayResource$array$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static final Object getStringArray(@NotNull StringArrayResource resource, @NotNull Continuation<? super List<String>> $completion) {
/*    */     return loadStringArray(resource, ResourceReaderKt.getDefaultResourceReader(), ResourceEnvironmentKt.getSystemResourceEnvironment(), $completion);
/*    */   }
/*    */   
/*    */   @ExperimentalResourceApi
/*    */   @Nullable
/*    */   public static final Object getStringArray(@NotNull ResourceEnvironment environment, @NotNull StringArrayResource resource, @NotNull Continuation<? super List<String>> $completion) {
/*    */     return loadStringArray(resource, ResourceReaderKt.getDefaultResourceReader(), environment, $completion);
/*    */   }
/*    */   
/*    */   private static final Object loadStringArray(StringArrayResource resource, ResourceReader resourceReader, ResourceEnvironment environment, Continuation<? super List<String>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof org/jetbrains/compose/resources/StringArrayResourcesKt$loadStringArray$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast org/jetbrains/compose/resources/StringArrayResourcesKt$loadStringArray$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 49
/*    */     //   39: new org/jetbrains/compose/resources/StringArrayResourcesKt$loadStringArray$1
/*    */     //   42: dup
/*    */     //   43: aload_3
/*    */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   47: astore #7
/*    */     //   49: aload #7
/*    */     //   51: getfield result : Ljava/lang/Object;
/*    */     //   54: astore #6
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #8
/*    */     //   61: aload #7
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 150, 0 -> 88, 1 -> 126
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: checkcast org/jetbrains/compose/resources/Resource
/*    */     //   97: aload_2
/*    */     //   98: invokestatic getResourceItemByEnvironment : (Lorg/jetbrains/compose/resources/Resource;Lorg/jetbrains/compose/resources/ResourceEnvironment;)Lorg/jetbrains/compose/resources/ResourceItem;
/*    */     //   101: astore #4
/*    */     //   103: aload #4
/*    */     //   105: aload_1
/*    */     //   106: aload #7
/*    */     //   108: aload #7
/*    */     //   110: iconst_1
/*    */     //   111: putfield label : I
/*    */     //   114: invokestatic getStringItem : (Lorg/jetbrains/compose/resources/ResourceItem;Lorg/jetbrains/compose/resources/ResourceReader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   117: dup
/*    */     //   118: aload #8
/*    */     //   120: if_acmpne -> 133
/*    */     //   123: aload #8
/*    */     //   125: areturn
/*    */     //   126: aload #6
/*    */     //   128: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   131: aload #6
/*    */     //   133: dup
/*    */     //   134: ldc 'null cannot be cast to non-null type org.jetbrains.compose.resources.StringItem.Array'
/*    */     //   136: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   139: checkcast org/jetbrains/compose/resources/StringItem$Array
/*    */     //   142: astore #5
/*    */     //   144: aload #5
/*    */     //   146: invokevirtual getItems : ()Ljava/util/List;
/*    */     //   149: areturn
/*    */     //   150: new java/lang/IllegalStateException
/*    */     //   153: dup
/*    */     //   154: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   156: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   159: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #66	-> 59
/*    */     //   #71	-> 93
/*    */     //   #72	-> 103
/*    */     //   #66	-> 123
/*    */     //   #72	-> 133
/*    */     //   #73	-> 144
/*    */     //   #66	-> 150
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	10	0	resource	Lorg/jetbrains/compose/resources/StringArrayResource;
/*    */     //   93	24	1	resourceReader	Lorg/jetbrains/compose/resources/ResourceReader;
/*    */     //   93	10	2	environment	Lorg/jetbrains/compose/resources/ResourceEnvironment;
/*    */     //   103	14	4	resourceItem	Lorg/jetbrains/compose/resources/ResourceItem;
/*    */     //   144	6	5	item	Lorg/jetbrains/compose/resources/StringItem$Array;
/*    */     //   49	101	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	94	6	$result	Ljava/lang/Object;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\StringArrayResourcesKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */