/*     */ package com.intellij.ml.llm.matterhorn.core.llm.settings;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornProperty;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import com.intellij.openapi.components.Service;
/*     */ import com.intellij.util.ApplicationKt;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.AbstractCoroutineContextElement;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.sync.Mutex;
/*     */ import kotlinx.coroutines.sync.MutexKt;
/*     */ import org.jetbrains.annotations.ApiStatus.Internal;
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
/*     */ @Service({Service.Level.APP})
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020$\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\004\b\007\030\000 \"2\0020\001:\003\"#$B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005JQ\020\006\032\002H\007\"\004\b\000\020\0072\022\020\b\032\016\022\004\022\0020\n\022\004\022\0020\n0\t2'\020\013\032#\b\001\022\004\022\0020\003\022\n\022\b\022\004\022\002H\0070\r\022\006\022\004\030\0010\0160\f¢\006\002\b\017H@¢\006\002\020\020J\030\020\027\032\004\030\0010\n2\006\020\030\032\0020\nH@¢\006\002\020\031J\016\020\032\032\0020\024H@¢\006\002\020\033J\030\020\034\032\004\030\0010\n2\006\020\035\032\0020\036H@¢\006\002\020\037J\016\020 \032\0020!H@¢\006\002\020\033R\016\020\021\032\0020\022X\004¢\006\002\n\000R\020\020\023\032\004\030\0010\024X\016¢\006\002\n\000R\016\020\025\032\0020\026X\004¢\006\002\n\000¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "withOverriddenSettings", "T", "settings", "", "", "body", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loader", "Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader;", "settingsCache", "Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettings;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "getSetting", "name", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProperty", "property", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetSettings", "", "Companion", "ContextSettingsKey", "ContextSettingsCoroutineElement", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornSettingsService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornSettingsService.kt\ncom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,321:1\n116#2,10:322\n116#2,10:332\n*S KotlinDebug\n*F\n+ 1 MatterhornSettingsService.kt\ncom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService\n*L\n97#1:322,10\n110#1:332,10\n*E\n"})
/*     */ public final class MatterhornSettingsService
/*     */   implements MatterhornPropertyProvider
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final MatterhornSettingsLoader loader;
/*     */   @Nullable
/*     */   private MatterhornSettings settingsCache;
/*     */   @NotNull
/*     */   private final Mutex mutex;
/*     */   
/*     */   public MatterhornSettingsService(@NotNull CoroutineScope scope) {
/*  81 */     this.loader = new MatterhornSettingsLoader(scope, null, null, 6, null);
/*     */ 
/*     */ 
/*     */     
/*  85 */     this.mutex = MutexKt.Mutex$default(false, 1, null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;", "core-llm"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final MatterhornSettingsService getInstance() {
/*     */       Intrinsics.checkNotNullExpressionValue(ApplicationKt.getApplication().getService(MatterhornSettingsService.class), "getService(...)");
/*     */       return (MatterhornSettingsService)ApplicationKt.getApplication().getService(MatterhornSettingsService.class);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object getProperty(@NotNull MatterhornProperty property, @NotNull Continuation<? super String> $completion) {
/* 106 */     return getSetting(property.getName(), $completion);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$ContextSettingsKey;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$ContextSettingsCoroutineElement;", "<init>", "()V", "core-llm"})
/*     */   public static final class ContextSettingsKey implements CoroutineContext.Key<ContextSettingsCoroutineElement> {
/*     */     @NotNull
/*     */     public static final ContextSettingsKey INSTANCE = new ContextSettingsKey();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\b\005\030\0002\0020\001B\033\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0040\003¢\006\004\b\005\020\006R\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$ContextSettingsCoroutineElement;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "settings", "", "", "<init>", "(Ljava/util/Map;)V", "getSettings", "()Ljava/util/Map;", "core-llm"})
/*     */   public static final class ContextSettingsCoroutineElement extends AbstractCoroutineContextElement {
/*     */     @NotNull
/*     */     private final Map<String, String> settings;
/*     */     
/*     */     public ContextSettingsCoroutineElement(@NotNull Map<String, String> settings) {
/*     */       super(MatterhornSettingsService.ContextSettingsKey.INSTANCE);
/*     */       this.settings = settings;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Map<String, String> getSettings() {
/*     */       return this.settings;
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final <T> Object withOverriddenSettings(@NotNull Map<String, String> settings, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> body, @NotNull Continuation $completion) {
/*     */     return BuildersKt.withContext((CoroutineContext)new ContextSettingsCoroutineElement(settings), new MatterhornSettingsService$withOverriddenSettings$2(body, null), $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "MatterhornSettingsService.kt", l = {67, 70, 74, 74}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsService$withOverriddenSettings$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class MatterhornSettingsService$withOverriddenSettings$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     MatterhornSettingsService$withOverriddenSettings$2(Function2<CoroutineScope, Continuation<? super T>, Object> $body, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #5
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 222, 0 -> 44, 1 -> 73, 2 -> 116, 3 -> 153, 4 -> 200
/*     */       //   44: aload_1
/*     */       //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   48: aload_0
/*     */       //   49: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */       //   52: aload_0
/*     */       //   53: checkcast kotlin/coroutines/Continuation
/*     */       //   56: aload_0
/*     */       //   57: iconst_1
/*     */       //   58: putfield label : I
/*     */       //   61: invokevirtual resetSettings : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   64: dup
/*     */       //   65: aload #5
/*     */       //   67: if_acmpne -> 78
/*     */       //   70: aload #5
/*     */       //   72: areturn
/*     */       //   73: aload_1
/*     */       //   74: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   77: aload_1
/*     */       //   78: pop
/*     */       //   79: nop
/*     */       //   80: new com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$withOverriddenSettings$2$ret$1
/*     */       //   83: dup
/*     */       //   84: aload_0
/*     */       //   85: getfield $body : Lkotlin/jvm/functions/Function2;
/*     */       //   88: aconst_null
/*     */       //   89: invokespecial <init> : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
/*     */       //   92: checkcast kotlin/jvm/functions/Function2
/*     */       //   95: aload_0
/*     */       //   96: checkcast kotlin/coroutines/Continuation
/*     */       //   99: aload_0
/*     */       //   100: iconst_2
/*     */       //   101: putfield label : I
/*     */       //   104: invokestatic coroutineScope : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   107: dup
/*     */       //   108: aload #5
/*     */       //   110: if_acmpne -> 122
/*     */       //   113: aload #5
/*     */       //   115: areturn
/*     */       //   116: nop
/*     */       //   117: aload_1
/*     */       //   118: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   121: aload_1
/*     */       //   122: astore_3
/*     */       //   123: aload_0
/*     */       //   124: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */       //   127: aload_0
/*     */       //   128: checkcast kotlin/coroutines/Continuation
/*     */       //   131: aload_0
/*     */       //   132: aload_3
/*     */       //   133: putfield L$0 : Ljava/lang/Object;
/*     */       //   136: aload_0
/*     */       //   137: iconst_3
/*     */       //   138: putfield label : I
/*     */       //   141: invokevirtual resetSettings : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   144: dup
/*     */       //   145: aload #5
/*     */       //   147: if_acmpne -> 163
/*     */       //   150: aload #5
/*     */       //   152: areturn
/*     */       //   153: aload_0
/*     */       //   154: getfield L$0 : Ljava/lang/Object;
/*     */       //   157: astore_3
/*     */       //   158: aload_1
/*     */       //   159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   162: aload_1
/*     */       //   163: pop
/*     */       //   164: goto -> 218
/*     */       //   167: astore #4
/*     */       //   169: aload_0
/*     */       //   170: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */       //   173: aload_0
/*     */       //   174: checkcast kotlin/coroutines/Continuation
/*     */       //   177: aload_0
/*     */       //   178: aload #4
/*     */       //   180: putfield L$0 : Ljava/lang/Object;
/*     */       //   183: aload_0
/*     */       //   184: iconst_4
/*     */       //   185: putfield label : I
/*     */       //   188: invokevirtual resetSettings : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   191: dup
/*     */       //   192: aload #5
/*     */       //   194: if_acmpne -> 214
/*     */       //   197: aload #5
/*     */       //   199: areturn
/*     */       //   200: aload_0
/*     */       //   201: getfield L$0 : Ljava/lang/Object;
/*     */       //   204: checkcast java/lang/Throwable
/*     */       //   207: astore #4
/*     */       //   209: aload_1
/*     */       //   210: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   213: aload_1
/*     */       //   214: pop
/*     */       //   215: aload #4
/*     */       //   217: athrow
/*     */       //   218: aload_3
/*     */       //   219: astore_2
/*     */       //   220: aload_2
/*     */       //   221: areturn
/*     */       //   222: new java/lang/IllegalStateException
/*     */       //   225: dup
/*     */       //   226: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   228: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   231: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #66	-> 3
/*     */       //   #67	-> 48
/*     */       //   #66	-> 70
/*     */       //   #69	-> 78
/*     */       //   #70	-> 80
/*     */       //   #66	-> 113
/*     */       //   #74	-> 123
/*     */       //   #66	-> 150
/*     */       //   #75	-> 163
/*     */       //   #74	-> 167
/*     */       //   #66	-> 197
/*     */       //   #69	-> 214
/*     */       //   #77	-> 220
/*     */       //   #66	-> 222
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   220	2	2	ret	Ljava/lang/Object;
/*     */       //   0	232	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$withOverriddenSettings$2;
/*     */       //   48	174	1	$result	Ljava/lang/Object;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   79	107	167	finally
/*     */       //   116	123	167	finally
/*     */       //   167	169	167	finally
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super MatterhornSettingsService$withOverriddenSettings$2> $completion) {
/*     */       return (Continuation<Unit>)new MatterhornSettingsService$withOverriddenSettings$2(this.$body, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((MatterhornSettingsService$withOverriddenSettings$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "MatterhornSettingsService.kt", l = {71}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsService$withOverriddenSettings$2$ret$1")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */     static final class MatterhornSettingsService$withOverriddenSettings$2$ret$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
/*     */       int label;
/*     */       
/*     */       MatterhornSettingsService$withOverriddenSettings$2$ret$1(Function2<CoroutineScope, Continuation<? super T>, Object> $body, Continuation $completion) {
/*     */         super(2, $completion);
/*     */       }
/*     */       
/*     */       public final Object invokeSuspend(Object $result) {
/*     */         CoroutineScope $this$coroutineScope;
/*     */         Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */         switch (this.label) {
/*     */           case 0:
/*     */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */             $this$coroutineScope = (CoroutineScope)this.L$0;
/*     */             this.label = 1;
/*     */             if (this.$body.invoke($this$coroutineScope, this) == object)
/*     */               return object; 
/*     */             return this.$body.invoke($this$coroutineScope, this);
/*     */           case 1:
/*     */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */             return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */         } 
/*     */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */       }
/*     */       
/*     */       public final Continuation<Unit> create(Object value, Continuation<? super MatterhornSettingsService$withOverriddenSettings$2$ret$1> $completion) {
/*     */         MatterhornSettingsService$withOverriddenSettings$2$ret$1 matterhornSettingsService$withOverriddenSettings$2$ret$1 = new MatterhornSettingsService$withOverriddenSettings$2$ret$1(this.$body, $completion);
/*     */         matterhornSettingsService$withOverriddenSettings$2$ret$1.L$0 = value;
/*     */         return (Continuation<Unit>)matterhornSettingsService$withOverriddenSettings$2$ret$1;
/*     */       }
/*     */       
/*     */       public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */         return ((MatterhornSettingsService$withOverriddenSettings$2$ret$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object getSetting(@NotNull String name, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$getSetting$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$getSetting$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$getSetting$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: aload #5
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 158, 0 -> 88, 1 -> 120
/*     */     //   88: aload #4
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: aload #5
/*     */     //   96: aload #5
/*     */     //   98: aload_1
/*     */     //   99: putfield L$0 : Ljava/lang/Object;
/*     */     //   102: aload #5
/*     */     //   104: iconst_1
/*     */     //   105: putfield label : I
/*     */     //   108: invokevirtual getSettings : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   111: dup
/*     */     //   112: aload #6
/*     */     //   114: if_acmpne -> 136
/*     */     //   117: aload #6
/*     */     //   119: areturn
/*     */     //   120: aload #5
/*     */     //   122: getfield L$0 : Ljava/lang/Object;
/*     */     //   125: checkcast java/lang/String
/*     */     //   128: astore_1
/*     */     //   129: aload #4
/*     */     //   131: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   134: aload #4
/*     */     //   136: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettings
/*     */     //   139: astore_3
/*     */     //   140: aload_3
/*     */     //   141: aload_1
/*     */     //   142: invokevirtual get : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/core/llm/settings/Value;
/*     */     //   145: dup
/*     */     //   146: ifnull -> 155
/*     */     //   149: invokevirtual getValue : ()Ljava/lang/String;
/*     */     //   152: goto -> 157
/*     */     //   155: pop
/*     */     //   156: aconst_null
/*     */     //   157: areturn
/*     */     //   158: new java/lang/IllegalStateException
/*     */     //   161: dup
/*     */     //   162: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   164: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   167: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #90	-> 60
/*     */     //   #91	-> 93
/*     */     //   #90	-> 117
/*     */     //   #92	-> 140
/*     */     //   #90	-> 158
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	18	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   93	27	1	name	Ljava/lang/String;
/*     */     //   129	16	1	name	Ljava/lang/String;
/*     */     //   140	5	3	settings	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettings;
/*     */     //   0	168	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	108	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	101	4	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Internal
/*     */   @Nullable
/*     */   public final Object getSettings(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$getSettings$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$getSettings$1
/*     */     //   11: astore #9
/*     */     //   13: aload #9
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #9
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$getSettings$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #9
/*     */     //   50: aload #9
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #8
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #10
/*     */     //   62: aload #9
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 321, 0 -> 92, 1 -> 144, 2 -> 232
/*     */     //   92: aload #8
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: getfield mutex : Lkotlinx/coroutines/sync/Mutex;
/*     */     //   101: astore_2
/*     */     //   102: aconst_null
/*     */     //   103: astore_3
/*     */     //   104: iconst_0
/*     */     //   105: istore #4
/*     */     //   107: nop
/*     */     //   108: aload_2
/*     */     //   109: aload_3
/*     */     //   110: aload #9
/*     */     //   112: aload #9
/*     */     //   114: aload_0
/*     */     //   115: putfield L$0 : Ljava/lang/Object;
/*     */     //   118: aload #9
/*     */     //   120: aload_2
/*     */     //   121: putfield L$1 : Ljava/lang/Object;
/*     */     //   124: aload #9
/*     */     //   126: iconst_1
/*     */     //   127: putfield label : I
/*     */     //   130: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   135: dup
/*     */     //   136: aload #10
/*     */     //   138: if_acmpne -> 174
/*     */     //   141: aload #10
/*     */     //   143: areturn
/*     */     //   144: iconst_0
/*     */     //   145: istore #4
/*     */     //   147: aconst_null
/*     */     //   148: astore_3
/*     */     //   149: aload #9
/*     */     //   151: getfield L$1 : Ljava/lang/Object;
/*     */     //   154: checkcast kotlinx/coroutines/sync/Mutex
/*     */     //   157: astore_2
/*     */     //   158: aload #9
/*     */     //   160: getfield L$0 : Ljava/lang/Object;
/*     */     //   163: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService
/*     */     //   166: astore_0
/*     */     //   167: aload #8
/*     */     //   169: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   172: aload #8
/*     */     //   174: pop
/*     */     //   175: nop
/*     */     //   176: iconst_0
/*     */     //   177: istore #5
/*     */     //   179: aload_0
/*     */     //   180: getfield settingsCache : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettings;
/*     */     //   183: ifnonnull -> 285
/*     */     //   186: aload_0
/*     */     //   187: astore #6
/*     */     //   189: aload_0
/*     */     //   190: getfield loader : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader;
/*     */     //   193: aload #9
/*     */     //   195: aload #9
/*     */     //   197: aload_0
/*     */     //   198: putfield L$0 : Ljava/lang/Object;
/*     */     //   201: aload #9
/*     */     //   203: aload_2
/*     */     //   204: putfield L$1 : Ljava/lang/Object;
/*     */     //   207: aload #9
/*     */     //   209: aload #6
/*     */     //   211: putfield L$2 : Ljava/lang/Object;
/*     */     //   214: aload #9
/*     */     //   216: iconst_2
/*     */     //   217: putfield label : I
/*     */     //   220: invokevirtual loadSettings : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   223: dup
/*     */     //   224: aload #10
/*     */     //   226: if_acmpne -> 276
/*     */     //   229: aload #10
/*     */     //   231: areturn
/*     */     //   232: iconst_0
/*     */     //   233: istore #4
/*     */     //   235: iconst_0
/*     */     //   236: istore #5
/*     */     //   238: aload #9
/*     */     //   240: getfield L$2 : Ljava/lang/Object;
/*     */     //   243: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService
/*     */     //   246: astore #6
/*     */     //   248: aconst_null
/*     */     //   249: astore_3
/*     */     //   250: aload #9
/*     */     //   252: getfield L$1 : Ljava/lang/Object;
/*     */     //   255: checkcast kotlinx/coroutines/sync/Mutex
/*     */     //   258: astore_2
/*     */     //   259: aload #9
/*     */     //   261: getfield L$0 : Ljava/lang/Object;
/*     */     //   264: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService
/*     */     //   267: astore_0
/*     */     //   268: nop
/*     */     //   269: aload #8
/*     */     //   271: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   274: aload #8
/*     */     //   276: aload #6
/*     */     //   278: swap
/*     */     //   279: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettings
/*     */     //   282: putfield settingsCache : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettings;
/*     */     //   285: aload_0
/*     */     //   286: getfield settingsCache : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettings;
/*     */     //   289: dup
/*     */     //   290: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   293: astore #7
/*     */     //   295: aload_2
/*     */     //   296: aload_3
/*     */     //   297: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   302: goto -> 317
/*     */     //   305: astore #5
/*     */     //   307: aload_2
/*     */     //   308: aload_3
/*     */     //   309: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   314: aload #5
/*     */     //   316: athrow
/*     */     //   317: aload #7
/*     */     //   319: nop
/*     */     //   320: areturn
/*     */     //   321: new java/lang/IllegalStateException
/*     */     //   324: dup
/*     */     //   325: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   327: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   330: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #95	-> 60
/*     */     //   #97	-> 97
/*     */     //   #322	-> 102
/*     */     //   #323	-> 107
/*     */     //   #326	-> 108
/*     */     //   #95	-> 141
/*     */     //   #327	-> 174
/*     */     //   #328	-> 176
/*     */     //   #98	-> 179
/*     */     //   #99	-> 186
/*     */     //   #95	-> 229
/*     */     //   #101	-> 285
/*     */     //   #328	-> 293
/*     */     //   #330	-> 295
/*     */     //   #331	-> 302
/*     */     //   #330	-> 305
/*     */     //   #327	-> 319
/*     */     //   #97	-> 320
/*     */     //   #95	-> 321
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	47	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   167	65	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   268	25	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   102	42	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   158	74	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   259	34	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   293	9	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   305	15	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   104	40	3	owner$iv	Ljava/lang/Object;
/*     */     //   158	74	3	owner$iv	Ljava/lang/Object;
/*     */     //   259	34	3	owner$iv	Ljava/lang/Object;
/*     */     //   293	9	3	owner$iv	Ljava/lang/Object;
/*     */     //   305	15	3	owner$iv	Ljava/lang/Object;
/*     */     //   179	53	5	$i$a$-withLock$default-MatterhornSettingsService$getSettings$2	I
/*     */     //   107	37	4	$i$f$withLock	I
/*     */     //   0	331	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	271	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	264	8	$result	Ljava/lang/Object;
/*     */     //   147	85	4	$i$f$withLock	I
/*     */     //   238	55	5	$i$a$-withLock$default-MatterhornSettingsService$getSettings$2	I
/*     */     //   235	85	4	$i$f$withLock	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   175	223	305	finally
/*     */     //   268	295	305	finally
/*     */     //   305	307	305	finally
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object resetSettings(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$resetSettings$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$resetSettings$1
/*     */     //   11: astore #8
/*     */     //   13: aload #8
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #8
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$resetSettings$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #8
/*     */     //   50: aload #8
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #7
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #9
/*     */     //   62: aload #8
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 213, 0 -> 88, 1 -> 140
/*     */     //   88: aload #7
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield mutex : Lkotlinx/coroutines/sync/Mutex;
/*     */     //   97: astore_2
/*     */     //   98: aconst_null
/*     */     //   99: astore_3
/*     */     //   100: iconst_0
/*     */     //   101: istore #4
/*     */     //   103: nop
/*     */     //   104: aload_2
/*     */     //   105: aload_3
/*     */     //   106: aload #8
/*     */     //   108: aload #8
/*     */     //   110: aload_0
/*     */     //   111: putfield L$0 : Ljava/lang/Object;
/*     */     //   114: aload #8
/*     */     //   116: aload_2
/*     */     //   117: putfield L$1 : Ljava/lang/Object;
/*     */     //   120: aload #8
/*     */     //   122: iconst_1
/*     */     //   123: putfield label : I
/*     */     //   126: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   131: dup
/*     */     //   132: aload #9
/*     */     //   134: if_acmpne -> 170
/*     */     //   137: aload #9
/*     */     //   139: areturn
/*     */     //   140: iconst_0
/*     */     //   141: istore #4
/*     */     //   143: aconst_null
/*     */     //   144: astore_3
/*     */     //   145: aload #8
/*     */     //   147: getfield L$1 : Ljava/lang/Object;
/*     */     //   150: checkcast kotlinx/coroutines/sync/Mutex
/*     */     //   153: astore_2
/*     */     //   154: aload #8
/*     */     //   156: getfield L$0 : Ljava/lang/Object;
/*     */     //   159: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService
/*     */     //   162: astore_0
/*     */     //   163: aload #7
/*     */     //   165: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   168: aload #7
/*     */     //   170: pop
/*     */     //   171: nop
/*     */     //   172: iconst_0
/*     */     //   173: istore #5
/*     */     //   175: aload_0
/*     */     //   176: aconst_null
/*     */     //   177: putfield settingsCache : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettings;
/*     */     //   180: nop
/*     */     //   181: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   184: astore #6
/*     */     //   186: aload_2
/*     */     //   187: aload_3
/*     */     //   188: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   193: goto -> 208
/*     */     //   196: astore #5
/*     */     //   198: aload_2
/*     */     //   199: aload_3
/*     */     //   200: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   205: aload #5
/*     */     //   207: athrow
/*     */     //   208: nop
/*     */     //   209: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   212: areturn
/*     */     //   213: new java/lang/IllegalStateException
/*     */     //   216: dup
/*     */     //   217: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   219: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   222: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #109	-> 60
/*     */     //   #110	-> 93
/*     */     //   #332	-> 98
/*     */     //   #333	-> 103
/*     */     //   #336	-> 104
/*     */     //   #109	-> 137
/*     */     //   #337	-> 170
/*     */     //   #338	-> 172
/*     */     //   #111	-> 175
/*     */     //   #112	-> 180
/*     */     //   #338	-> 184
/*     */     //   #340	-> 186
/*     */     //   #341	-> 193
/*     */     //   #340	-> 196
/*     */     //   #337	-> 208
/*     */     //   #113	-> 209
/*     */     //   #109	-> 213
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	47	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   163	17	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   98	42	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   154	27	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   181	12	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   196	13	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   100	40	3	owner$iv	Ljava/lang/Object;
/*     */     //   154	27	3	owner$iv	Ljava/lang/Object;
/*     */     //   181	12	3	owner$iv	Ljava/lang/Object;
/*     */     //   196	13	3	owner$iv	Ljava/lang/Object;
/*     */     //   175	6	5	$i$a$-withLock$default-MatterhornSettingsService$resetSettings$2	I
/*     */     //   103	37	4	$i$f$withLock	I
/*     */     //   0	223	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	163	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	156	7	$result	Ljava/lang/Object;
/*     */     //   143	66	4	$i$f$withLock	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   171	186	196	finally
/*     */     //   196	198	196	finally
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "MatterhornSettingsService.kt", l = {91}, i = {0}, s = {"L$0"}, n = {"name"}, m = "getSetting", c = "com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsService")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class MatterhornSettingsService$getSetting$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     MatterhornSettingsService$getSetting$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return MatterhornSettingsService.this.getSetting(null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "MatterhornSettingsService.kt", l = {326, 99}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, m = "getSettings", c = "com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsService")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class MatterhornSettingsService$getSettings$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     MatterhornSettingsService$getSettings$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return MatterhornSettingsService.this.getSettings((Continuation<? super MatterhornSettings>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "MatterhornSettingsService.kt", l = {326}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "$this$withLock_u24default$iv"}, m = "resetSettings", c = "com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsService")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class MatterhornSettingsService$resetSettings$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     MatterhornSettingsService$resetSettings$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return MatterhornSettingsService.this.resetSettings((Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\settings\MatterhornSettingsService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */