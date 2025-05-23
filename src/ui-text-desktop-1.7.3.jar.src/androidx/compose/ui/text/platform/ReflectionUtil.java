/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.InaccessibleObjectException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.Arrays;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NonNls;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\021\n\002\b\r\n\002\020#\n\002\b\002\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J,\020\003\032\004\030\0010\0042\n\020\005\032\006\022\002\b\0030\0062\f\020\007\032\b\022\002\b\003\030\0010\0062\b\b\001\020\b\032\0020\tJ$\020\n\032\004\030\0010\0042\n\020\013\032\006\022\002\b\0030\0062\016\020\f\032\n\022\006\b\000\022\0020\0040\rJ*\020\016\032\0020\0042\n\020\005\032\006\022\002\b\0030\0062\f\020\007\032\b\022\002\b\003\030\0010\0062\b\b\001\020\b\032\0020\tJ=\020\017\032\004\030\0010\0202\n\020\005\032\006\022\002\b\0030\0062\006\020\021\032\0020\t2\032\020\022\032\016\022\n\b\001\022\006\022\002\b\0030\0060\023\"\006\022\002\b\0030\006¢\006\002\020\024J'\020\025\032\004\030\001H\026\"\004\b\000\020\0262\006\020\027\032\0020\0042\b\020\030\032\004\030\0010\001H\002¢\006\002\020\031JA\020\032\032\004\030\001H\026\"\004\b\000\020\0262\n\020\033\032\006\022\002\b\0030\0062\b\020\034\032\004\030\0010\0012\016\020\007\032\n\022\004\022\002H\026\030\0010\0062\006\020\b\032\0020\t¢\006\002\020\035JE\020\036\032\004\030\0010\0042\020\020\037\032\f\022\b\022\006\022\002\b\0030\0060\0232\022\020 \032\016\022\n\b\000\022\006\022\002\b\0030\0060!2\016\020\f\032\n\022\006\b\000\022\0020\0040\rH\002¢\006\002\020\"¨\006#"}, d2 = {"Landroidx/compose/ui/text/platform/ReflectionUtil;", "", "()V", "findAssignableField", "Ljava/lang/reflect/Field;", "clazz", "Ljava/lang/Class;", "fieldType", "fieldName", "", "findFieldInHierarchy", "rootClass", "checker", "Ljava/util/function/Predicate;", "getAssignableField", "getDeclaredMethodOrNull", "Ljava/lang/reflect/Method;", "name", "parameters", "", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "getFieldValue", "T", "field", "instance", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;", "getFieldValueOrNull", "objectClass", "object", "(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "processInterfaces", "interfaces", "visited", "", "([Ljava/lang/Class;Ljava/util/Set;Ljava/util/function/Predicate;)Ljava/lang/reflect/Field;", "ui-text"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nReflectionUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionUtil.kt\nandroidx/compose/ui/text/platform/ReflectionUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
/*     */ public final class ReflectionUtil
/*     */ {
/*     */   @NotNull
/*     */   public static final ReflectionUtil INSTANCE = new ReflectionUtil();
/*     */   public static final int $stable;
/*     */   
/*     */   @Nullable
/*     */   public final Method getDeclaredMethodOrNull(@NotNull Class clazz, @NotNull String name, @NotNull Class... parameters) {
/*     */     Method method;
/*  32 */     Intrinsics.checkNotNullParameter(clazz, "clazz"); Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(parameters, "parameters"); try {
/*  33 */       method = clazz.getDeclaredMethod(name, (Class[])Arrays.<Class<?>[]>copyOf((Class<?>[][])parameters, parameters.length));
/*  34 */       Method $this$getDeclaredMethodOrNull_u24lambda_u240 = method;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 131 */       int $i$a$-apply-ReflectionUtil$getDeclaredMethodOrNull$1 = 0;
/*     */       $this$getDeclaredMethodOrNull_u24lambda_u240.setAccessible(true);
/*     */       method = method;
/*     */     } catch (NoSuchMethodException e) {
/*     */       method = null;
/*     */     } catch (InaccessibleObjectException e) {
/*     */       method = null;
/*     */     } 
/*     */     return method;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final <T> T getFieldValueOrNull(@NotNull Class<?> objectClass, @Nullable Object object, @Nullable Class<?> fieldType, @NotNull String fieldName) {
/*     */     T t;
/*     */     Intrinsics.checkNotNullParameter(objectClass, "objectClass");
/*     */     Intrinsics.checkNotNullParameter(fieldName, "fieldName");
/*     */     try {
/*     */       t = (T)getAssignableField(objectClass, fieldType, fieldName);
/*     */       t = getFieldValue((Field)t, object);
/*     */     } catch (NoSuchFieldException e) {
/*     */       t = null;
/*     */     } 
/*     */     return t;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Field getAssignableField(@NotNull Class<?> clazz, @Nullable Class<?> fieldType, @NonNls @NotNull String fieldName) {
/*     */     Intrinsics.checkNotNullParameter(clazz, "clazz");
/*     */     Intrinsics.checkNotNullParameter(fieldName, "fieldName");
/*     */     if (findAssignableField(clazz, fieldType, fieldName) == null) {
/*     */       findAssignableField(clazz, fieldType, fieldName);
/*     */       throw new NoSuchFieldException("Class: " + clazz + " fieldName: " + fieldName + " fieldType: " + fieldType);
/*     */     } 
/*     */     return findAssignableField(clazz, fieldType, fieldName);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Field findAssignableField(@NotNull Class<?> clazz, @Nullable Class fieldType, @NonNls @NotNull String fieldName) {
/*     */     Intrinsics.checkNotNullParameter(clazz, "clazz");
/*     */     Intrinsics.checkNotNullParameter(fieldName, "fieldName");
/*     */     Field result = findFieldInHierarchy(clazz, new ReflectionUtil$findAssignableField$result$1(fieldName, fieldType)::findAssignableField$lambda$1);
/*     */     return result;
/*     */   }
/*     */   
/*     */   private static final boolean findAssignableField$lambda$1(Function1 $tmp0, Object p0) {
/*     */     Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "field", "Ljava/lang/reflect/Field;", "invoke", "(Ljava/lang/reflect/Field;)Ljava/lang/Boolean;"})
/*     */   static final class ReflectionUtil$findAssignableField$result$1 extends Lambda implements Function1<Field, Boolean> {
/*     */     @NotNull
/*     */     public final Boolean invoke(@NotNull Field field) {
/*     */       Intrinsics.checkNotNullParameter(field, "field");
/*     */       return Boolean.valueOf((Intrinsics.areEqual(this.$fieldName, field.getName()) && (this.$fieldType == null || this.$fieldType.isAssignableFrom(field.getType()))));
/*     */     }
/*     */     
/*     */     ReflectionUtil$findAssignableField$result$1(String $fieldName, Class<?> $fieldType) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Field findFieldInHierarchy(@NotNull Class rootClass, @NotNull Predicate<Field> checker) {
/*     */     Intrinsics.checkNotNullParameter(rootClass, "rootClass");
/*     */     Intrinsics.checkNotNullParameter(checker, "checker");
/*     */     Class aClass = rootClass;
/*     */     try {
/*     */       while (aClass != null) {
/*     */         Intrinsics.checkNotNullExpressionValue(aClass.getDeclaredFields(), "getDeclaredFields(...)");
/*     */         Field[] arrayOfField;
/*     */         byte b;
/*     */         int i;
/*     */         for (arrayOfField = aClass.getDeclaredFields(), b = 0, i = arrayOfField.length; b < i; ) {
/*     */           Field field = arrayOfField[b];
/*     */           Intrinsics.checkNotNull(field);
/*     */           if (checker.test(field)) {
/*     */             field.setAccessible(true);
/*     */             return field;
/*     */           } 
/*     */           b++;
/*     */         } 
/*     */         aClass = aClass.getSuperclass();
/*     */       } 
/*     */     } catch (InaccessibleObjectException e) {
/*     */       return null;
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(rootClass.getInterfaces(), "getInterfaces(...)");
/*     */     return processInterfaces(rootClass.getInterfaces(), new HashSet<>(), checker);
/*     */   }
/*     */   
/*     */   private final Field processInterfaces(Class[] interfaces, Set<Class<?>> visited, Predicate<Field> checker) {
/*     */     byte b;
/*     */     int i;
/*     */     for (b = 0, i = interfaces.length; b < i; ) {
/*     */       Class<?> anInterface = interfaces[b];
/*     */       if (visited.add(anInterface)) {
/*     */         Intrinsics.checkNotNullExpressionValue(anInterface.getDeclaredFields(), "getDeclaredFields(...)");
/*     */         Field[] arrayOfField;
/*     */         byte b1;
/*     */         int j;
/*     */         for (arrayOfField = anInterface.getDeclaredFields(), b1 = 0, j = arrayOfField.length; b1 < j; ) {
/*     */           Field field1 = arrayOfField[b1];
/*     */           Intrinsics.checkNotNull(field1);
/*     */           if (checker.test(field1)) {
/*     */             field1.setAccessible(true);
/*     */             return field1;
/*     */           } 
/*     */           b1++;
/*     */         } 
/*     */         Intrinsics.checkNotNullExpressionValue(anInterface.getInterfaces(), "getInterfaces(...)");
/*     */         Field field = processInterfaces(anInterface.getInterfaces(), visited, checker);
/*     */         if (field != null)
/*     */           return field; 
/*     */       } 
/*     */       b++;
/*     */     } 
/*     */     return null;
/*     */   }
/*     */   
/*     */   private final <T> T getFieldValue(Field field, Object instance) {
/*     */     T t;
/*     */     try {
/*     */       t = (T)field.get(instance);
/*     */     } catch (IllegalAccessException e) {
/*     */       t = null;
/*     */     } 
/*     */     return t;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\ReflectionUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */