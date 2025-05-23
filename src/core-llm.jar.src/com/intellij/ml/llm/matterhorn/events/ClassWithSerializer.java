/*    */ package com.intellij.ml.llm.matterhorn.events;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.modules.PolymorphicModuleBuilder;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\b\b\000\020\001*\0020\0022\0020\003B#\022\f\020\004\032\b\022\004\022\0028\0000\005\022\f\020\006\032\b\022\004\022\0028\0000\007¢\006\004\b\b\020\tJ\024\020\016\032\0020\0172\f\020\020\032\b\022\004\022\0028\0000\021J\017\020\022\032\b\022\004\022\0028\0000\005HÆ\003J\017\020\023\032\b\022\004\022\0028\0000\007HÆ\003J/\020\024\032\b\022\004\022\0028\0000\0002\016\b\002\020\004\032\b\022\004\022\0028\0000\0052\016\b\002\020\006\032\b\022\004\022\0028\0000\007HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\003HÖ\003J\t\020\030\032\0020\031HÖ\001J\t\020\032\032\0020\033HÖ\001R\027\020\004\032\b\022\004\022\0028\0000\005¢\006\b\n\000\032\004\b\n\020\013R\027\020\006\032\b\022\004\022\0028\0000\007¢\006\b\n\000\032\004\b\f\020\r¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/ClassWithSerializer;", "T", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;", "", "kClass", "Lkotlin/reflect/KClass;", "serializer", "Lkotlinx/serialization/KSerializer;", "<init>", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "getKClass", "()Lkotlin/reflect/KClass;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "registerIn", "", "builder", "Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"})
/*    */ public final class ClassWithSerializer<T extends SerializableEvent>
/*    */ {
/*    */   @NotNull
/*    */   private final KClass<T> kClass;
/*    */   @NotNull
/*    */   private final KSerializer<T> serializer;
/*    */   
/*    */   public ClassWithSerializer(@NotNull KClass<T> kClass, @NotNull KSerializer<T> serializer) {
/* 45 */     this.kClass = kClass;
/* 46 */     this.serializer = serializer; } @NotNull public final KSerializer<T> getSerializer() { return this.serializer; }
/*    */   @NotNull
/*    */   public final KClass<T> getKClass() { return this.kClass; } public final void registerIn(@NotNull PolymorphicModuleBuilder builder) {
/* 49 */     Intrinsics.checkNotNullParameter(builder, "builder"); builder.subclass(this.kClass, this.serializer);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final KClass<T> component1() {
/*    */     return this.kClass;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<T> component2() {
/*    */     return this.serializer;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ClassWithSerializer<T> copy(@NotNull KClass<T> kClass, @NotNull KSerializer<T> serializer) {
/*    */     Intrinsics.checkNotNullParameter(kClass, "kClass");
/*    */     Intrinsics.checkNotNullParameter(serializer, "serializer");
/*    */     return new ClassWithSerializer(kClass, serializer);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ClassWithSerializer(kClass=" + this.kClass + ", serializer=" + this.serializer + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.kClass.hashCode();
/*    */     return result * 31 + this.serializer.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ClassWithSerializer))
/*    */       return false; 
/*    */     ClassWithSerializer classWithSerializer = (ClassWithSerializer)other;
/*    */     return !Intrinsics.areEqual(this.kClass, classWithSerializer.kClass) ? false : (!!Intrinsics.areEqual(this.serializer, classWithSerializer.serializer));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\events\ClassWithSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */