/*     */ package androidx.lifecycle.viewmodel.internal;
/*     */ 
/*     */ import androidx.lifecycle.HasDefaultViewModelProviderFactory;
/*     */ import androidx.lifecycle.ViewModelProvider;
/*     */ import androidx.lifecycle.ViewModelStoreOwner;
/*     */ import androidx.lifecycle.viewmodel.CreationExtras;
/*     */ import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
/*     */ import androidx.lifecycle.viewmodel.ViewModelInitializer;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KClass;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\002\n\002\020\036\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\013\bÀ\002\030\0002\0020\001:\001\"B\007\b\002¢\006\002\020\002J+\020\005\032\0020\0062\032\020\007\032\016\022\n\b\001\022\006\022\002\b\0030\t0\b\"\006\022\002\b\0030\tH\000¢\006\004\b\n\020\013J\037\020\005\032\0020\0062\020\020\007\032\f\022\b\022\006\022\002\b\0030\t0\fH\000¢\006\002\b\nJK\020\r\032\002H\016\"\b\b\000\020\016*\0020\0172\f\020\020\032\b\022\004\022\002H\0160\0212\006\020\022\032\0020\0232\032\020\007\032\016\022\n\b\001\022\006\022\002\b\0030\t0\b\"\006\022\002\b\0030\tH\000¢\006\004\b\024\020\025J\025\020\026\032\0020\0232\006\020\027\032\0020\030H\000¢\006\002\b\031J\025\020\032\032\0020\0062\006\020\027\032\0020\030H\000¢\006\002\b\033J%\020\034\032\0020\004\"\b\b\000\020\035*\0020\0172\f\020\020\032\b\022\004\022\002H\0350\021H\000¢\006\002\b\036J\031\020\037\032\002H\016\"\b\b\000\020\016*\0020\017H\000¢\006\004\b \020!R\016\020\003\032\0020\004XT¢\006\002\n\000¨\006#"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelProviders;", "", "()V", "VIEW_MODEL_PROVIDER_DEFAULT_KEY", "", "createInitializerFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initializers", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "createInitializerFactory$lifecycle_viewmodel", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModelProvider$Factory;", "", "createViewModelFromInitializers", "VM", "Landroidx/lifecycle/ViewModel;", "modelClass", "Lkotlin/reflect/KClass;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "createViewModelFromInitializers$lifecycle_viewmodel", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;[Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModel;", "getDefaultCreationExtras", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "getDefaultCreationExtras$lifecycle_viewmodel", "getDefaultFactory", "getDefaultFactory$lifecycle_viewmodel", "getDefaultKey", "T", "getDefaultKey$lifecycle_viewmodel", "unsupportedCreateViewModel", "unsupportedCreateViewModel$lifecycle_viewmodel", "()Landroidx/lifecycle/ViewModel;", "ViewModelKey", "lifecycle-viewmodel"})
/*     */ @SourceDebugExtension({"SMAP\nViewModelProviders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProviders.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelProviders\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,99:1\n37#2,2:100\n1282#3,2:102\n*S KotlinDebug\n*F\n+ 1 ViewModelProviders.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelProviders\n*L\n59#1:100,2\n85#1:102,2\n*E\n"})
/*     */ public final class ViewModelProviders
/*     */ {
/*     */   @NotNull
/*     */   public static final ViewModelProviders INSTANCE = new ViewModelProviders();
/*     */   @NotNull
/*     */   private static final String VIEW_MODEL_PROVIDER_DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";
/*     */   
/*     */   @NotNull
/*     */   public final <T extends androidx.lifecycle.ViewModel> String getDefaultKey$lifecycle_viewmodel(@NotNull KClass<?> modelClass) {
/*     */     String canonicalName;
/*  42 */     Intrinsics.checkNotNullParameter(modelClass, "modelClass"); if (ViewModelProviders_jvmKt.getCanonicalName(modelClass) == null) { ViewModelProviders_jvmKt.getCanonicalName(modelClass); int $i$a$-requireNotNull-ViewModelProviders$getDefaultKey$canonicalName$1 = 0; String str = 
/*  43 */         "Local and anonymous classes can not be ViewModels"; throw new IllegalArgumentException(str.toString()); }
/*     */     
/*  45 */     return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final <VM extends androidx.lifecycle.ViewModel> VM unsupportedCreateViewModel$lifecycle_viewmodel() {
/*  51 */     throw new UnsupportedOperationException(
/*  52 */         "`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel(@NotNull Collection initializers) {
/*  59 */     Intrinsics.checkNotNullParameter(initializers, "initializers"); Collection $this$toTypedArray$iv = initializers; int $i$f$toTypedArray = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 100 */     Collection thisCollection$iv = $this$toTypedArray$iv;
/* 101 */     ViewModelInitializer[] arrayOfViewModelInitializer = (ViewModelInitializer[])thisCollection$iv.toArray((Object[])new ViewModelInitializer[0]);
/*     */     return (ViewModelProvider.Factory)new InitializerViewModelFactory(Arrays.<ViewModelInitializer>copyOf(arrayOfViewModelInitializer, arrayOfViewModelInitializer.length));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelProviders$ViewModelKey;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "()V", "lifecycle-viewmodel"})
/*     */   public static final class ViewModelKey implements CreationExtras.Key<String> {
/*     */     @NotNull
/*     */     public static final ViewModelKey INSTANCE = new ViewModelKey();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel(@NotNull ViewModelInitializer... initializers) {
/*     */     Intrinsics.checkNotNullParameter(initializers, "initializers");
/*     */     return (ViewModelProvider.Factory)new InitializerViewModelFactory(Arrays.<ViewModelInitializer>copyOf(initializers, initializers.length));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ViewModelProvider.Factory getDefaultFactory$lifecycle_viewmodel(@NotNull ViewModelStoreOwner owner) {
/*     */     Intrinsics.checkNotNullParameter(owner, "owner");
/*     */     return (owner instanceof HasDefaultViewModelProviderFactory) ? ((HasDefaultViewModelProviderFactory)owner).getDefaultViewModelProviderFactory() : DefaultViewModelProviderFactory.INSTANCE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CreationExtras getDefaultCreationExtras$lifecycle_viewmodel(@NotNull ViewModelStoreOwner owner) {
/*     */     Intrinsics.checkNotNullParameter(owner, "owner");
/*     */     return (owner instanceof HasDefaultViewModelProviderFactory) ? ((HasDefaultViewModelProviderFactory)owner).getDefaultViewModelCreationExtras() : (CreationExtras)CreationExtras.Empty.INSTANCE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final <VM extends androidx.lifecycle.ViewModel> VM createViewModelFromInitializers$lifecycle_viewmodel(@NotNull KClass modelClass, @NotNull CreationExtras extras, @NotNull ViewModelInitializer... initializers) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'modelClass'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'extras'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'initializers'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload_3
/*     */     //   19: astore #6
/*     */     //   21: iconst_0
/*     */     //   22: istore #7
/*     */     //   24: iconst_0
/*     */     //   25: istore #8
/*     */     //   27: aload #6
/*     */     //   29: arraylength
/*     */     //   30: istore #9
/*     */     //   32: iload #8
/*     */     //   34: iload #9
/*     */     //   36: if_icmpge -> 76
/*     */     //   39: aload #6
/*     */     //   41: iload #8
/*     */     //   43: aaload
/*     */     //   44: astore #10
/*     */     //   46: aload #10
/*     */     //   48: astore #11
/*     */     //   50: iconst_0
/*     */     //   51: istore #12
/*     */     //   53: aload #11
/*     */     //   55: invokevirtual getClazz$lifecycle_viewmodel : ()Lkotlin/reflect/KClass;
/*     */     //   58: aload_1
/*     */     //   59: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   62: ifeq -> 70
/*     */     //   65: aload #10
/*     */     //   67: goto -> 77
/*     */     //   70: iinc #8, 1
/*     */     //   73: goto -> 32
/*     */     //   76: aconst_null
/*     */     //   77: astore #5
/*     */     //   79: aload #5
/*     */     //   81: ifnull -> 110
/*     */     //   84: aload #5
/*     */     //   86: invokevirtual getInitializer$lifecycle_viewmodel : ()Lkotlin/jvm/functions/Function1;
/*     */     //   89: astore #6
/*     */     //   91: aload #6
/*     */     //   93: ifnull -> 110
/*     */     //   96: aload #6
/*     */     //   98: aload_2
/*     */     //   99: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   104: checkcast androidx/lifecycle/ViewModel
/*     */     //   107: goto -> 111
/*     */     //   110: aconst_null
/*     */     //   111: astore #4
/*     */     //   113: aload #4
/*     */     //   115: dup
/*     */     //   116: ifnonnull -> 147
/*     */     //   119: pop
/*     */     //   120: iconst_0
/*     */     //   121: istore #5
/*     */     //   123: aload_1
/*     */     //   124: invokestatic getCanonicalName : (Lkotlin/reflect/KClass;)Ljava/lang/String;
/*     */     //   127: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   132: astore #5
/*     */     //   134: new java/lang/IllegalArgumentException
/*     */     //   137: dup
/*     */     //   138: aload #5
/*     */     //   140: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   143: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   146: athrow
/*     */     //   147: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #86	-> 18
/*     */     //   #85	-> 18
/*     */     //   #102	-> 24
/*     */     //   #85	-> 53
/*     */     //   #102	-> 62
/*     */     //   #103	-> 76
/*     */     //   #85	-> 77
/*     */     //   #86	-> 79
/*     */     //   #85	-> 84
/*     */     //   #86	-> 86
/*     */     //   #87	-> 91
/*     */     //   #86	-> 96
/*     */     //   #87	-> 98
/*     */     //   #86	-> 110
/*     */     //   #85	-> 111
/*     */     //   #88	-> 113
/*     */     //   #89	-> 123
/*     */     //   #88	-> 132
/*     */     //   #88	-> 147
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   53	9	12	$i$a$-firstOrNull-ViewModelProviders$createViewModelFromInitializers$viewModel$1	I
/*     */     //   50	12	11	it	Landroidx/lifecycle/viewmodel/ViewModelInitializer;
/*     */     //   46	24	10	element$iv	Ljava/lang/Object;
/*     */     //   24	53	7	$i$f$firstOrNull	I
/*     */     //   21	56	6	$this$firstOrNull$iv	[Ljava/lang/Object;
/*     */     //   123	9	5	$i$a$-requireNotNull-ViewModelProviders$createViewModelFromInitializers$1	I
/*     */     //   113	35	4	viewModel	Landroidx/lifecycle/ViewModel;
/*     */     //   0	148	0	this	Landroidx/lifecycle/viewmodel/internal/ViewModelProviders;
/*     */     //   0	148	1	modelClass	Lkotlin/reflect/KClass;
/*     */     //   0	148	2	extras	Landroidx/lifecycle/viewmodel/CreationExtras;
/*     */     //   0	148	3	initializers	[Landroidx/lifecycle/viewmodel/ViewModelInitializer;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\viewmodel\internal\ViewModelProviders.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */