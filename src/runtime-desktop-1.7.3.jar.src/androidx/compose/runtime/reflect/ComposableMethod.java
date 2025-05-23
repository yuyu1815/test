/*     */ package androidx.compose.runtime.reflect;
/*     */ 
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.lang.reflect.Method;
/*     */ import java.lang.reflect.Parameter;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.IntIterator;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\004\b\007\030\0002\0020\001B\027\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\006\020\024\032\0020\003J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001H\002J\b\020\030\032\0020\bH\026J:\020\031\032\004\030\0010\0012\006\020\032\032\0020\0332\b\020\034\032\004\030\0010\0012\026\020\035\032\f\022\b\b\001\022\004\030\0010\0010\f\"\004\030\0010\001H\002¢\006\002\020\036R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\021\020\007\032\0020\b8F¢\006\006\032\004\b\t\020\nR\033\020\013\032\f\022\b\022\006\022\002\b\0030\r0\f8F¢\006\006\032\004\b\016\020\017R\027\020\020\032\b\022\004\022\0020\0210\f8F¢\006\006\032\004\b\022\020\023¨\006\037"}, d2 = {"Landroidx/compose/runtime/reflect/ComposableMethod;", "", "method", "Ljava/lang/reflect/Method;", "composableInfo", "Landroidx/compose/runtime/reflect/ComposableInfo;", "(Ljava/lang/reflect/Method;Landroidx/compose/runtime/reflect/ComposableInfo;)V", "parameterCount", "", "getParameterCount", "()I", "parameterTypes", "", "Ljava/lang/Class;", "getParameterTypes", "()[Ljava/lang/Class;", "parameters", "Ljava/lang/reflect/Parameter;", "getParameters", "()[Ljava/lang/reflect/Parameter;", "asMethod", "equals", "", "other", "hashCode", "invoke", "composer", "Landroidx/compose/runtime/Composer;", "instance", "args", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n1549#2:223\n1620#2,3:224\n1804#2,4:227\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n*L\n145#1:223\n145#1:224,3\n146#1:227,4\n*E\n"})
/*     */ public final class ComposableMethod
/*     */ {
/*     */   @NotNull
/*     */   private final Method method;
/*     */   @NotNull
/*     */   private final ComposableInfo composableInfo;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public ComposableMethod(@NotNull Method method, @NotNull ComposableInfo composableInfo) {
/* 102 */     this.method = method;
/* 103 */     this.composableInfo = composableInfo;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Method asMethod() {
/* 108 */     return this.method;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getParameterCount() {
/* 114 */     return this.composableInfo.getRealParamsCount();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Parameter[] getParameters() {
/* 121 */     Intrinsics.checkNotNullExpressionValue(this.method.getParameters(), "getParameters(...)"); Object[] arrayOfObject = (Object[])this.method.getParameters(); boolean bool = false; int i = this.composableInfo.getRealParamsCount(); return (Parameter[])ArraysKt.copyOfRange(arrayOfObject, bool, i);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Class<?>[] getParameterTypes() {
/* 127 */     Intrinsics.checkNotNullExpressionValue(this.method.getParameterTypes(), "getParameterTypes(...)"); Object[] arrayOfObject = (Object[])this.method.getParameterTypes(); boolean bool = false; int i = this.composableInfo.getRealParamsCount(); return (Class[])ArraysKt.copyOfRange(arrayOfObject, bool, i);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull Composer composer, @Nullable Object instance, @NotNull Object... args) {
/* 135 */     Intrinsics.checkNotNullParameter(composer, "composer"); Intrinsics.checkNotNullParameter(args, "args"); ComposableInfo composableInfo = this.composableInfo; int realParamsCount = composableInfo.component2(), changedParams = composableInfo.component3(), defaultParams = composableInfo.component4();
/*     */     
/* 137 */     int totalParams = (this.method.getParameterTypes()).length;
/* 138 */     int changedStartIndex = realParamsCount + 1;
/* 139 */     int defaultStartIndex = changedStartIndex + changedParams;
/*     */     Integer[] arrayOfInteger1;
/* 141 */     for (byte b1 = 0; b1 < defaultParams; ) { byte b3 = b1;
/* 142 */       int start = b3 * 31;
/* 143 */       int end = Math.min(start + 31, realParamsCount);
/*     */       
/* 145 */       Iterable iterable1 = (Iterable)RangesKt.until(start, end); byte b4 = b3; Integer[] arrayOfInteger = arrayOfInteger1; int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 223 */       Iterable iterable2 = iterable1; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); int $i$f$mapTo = 0;
/* 224 */       for (Iterator iterator = iterable2.iterator(); iterator.hasNext(); ) { int item$iv$iv = ((IntIterator)iterator).nextInt();
/* 225 */         int j = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-ComposableMethod$invoke$defaultsMasks$1$useDefault$1 = 0; }
/* 226 */        List list2 = (List)destination$iv$iv; List useDefault = list2; List list1 = useDefault; boolean bool = false; b4 = b4; arrayOfInteger = arrayOfInteger; int $i$f$foldIndexed = 0;
/* 227 */       int index$iv = 0;
/* 228 */       int accumulator$iv = bool;
/* 229 */       for (Object element$iv : list1) { int j = index$iv++; if (j < 0) CollectionsKt.throwIndexOverflow();  int k = ((Number)element$iv).intValue(), m = accumulator$iv, n = j, $i$a$-foldIndexed-ComposableMethod$invoke$defaultsMasks$1$mask$1 = 0; accumulator$iv = m | k << n; }
/* 230 */        int i = accumulator$iv; int mask = i; arrayOfInteger[b4] = Integer.valueOf(mask);
/*     */       b1++; }
/*     */     
/*     */     Integer[] defaultsMasks = arrayOfInteger1;
/*     */     Object[] arrayOfObject1;
/*     */     for (byte b2 = 0; b2 < totalParams; ) {
/*     */       byte b3 = b2;
/*     */       byte b4 = b3;
/*     */       Object[] arrayOfObject2 = args;
/*     */       byte b5 = b3, b6 = b3;
/*     */       Object[] arrayOfObject3 = arrayOfObject1;
/*     */       int $i$a$-getOrElse-ComposableMethod$invoke$arguments$1$1 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(this.method.getParameterTypes()[b3], "get(...)");
/*     */       Object object = ComposableMethodKt.access$getDefaultValue(this.method.getParameterTypes()[b3]);
/*     */       if ((defaultStartIndex <= b4) ? ((b4 < totalParams)) : false) {
/*     */       
/*     */       } else {
/*     */         throw new IllegalStateException("Unexpected index".toString());
/*     */       } 
/*     */       ((j >= args.length || args[j] == null) ? 1 : 0)[arrayOfObject3] = ((0 <= b4) ? ((b4 < realParamsCount)) : false) ? ((b3 >= 0 && b3 <= ArraysKt.getLastIndex(arrayOfObject2)) ? arrayOfObject2[b3] : object) : ((b4 == realParamsCount) ? composer : ((b4 == changedStartIndex) ? Integer.valueOf(0) : (((changedStartIndex + 1 <= b4) ? ((b4 < defaultStartIndex)) : false) ? Integer.valueOf(0) : b6)));
/*     */       b2++;
/*     */     } 
/*     */     Object[] arguments = arrayOfObject1;
/*     */     return this.method.invoke(instance, Arrays.copyOf(arguments, arguments.length));
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     return (other instanceof ComposableMethod) ? Intrinsics.areEqual(this.method, ((ComposableMethod)other).method) : false;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return this.method.hashCode();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\reflect\ComposableMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */