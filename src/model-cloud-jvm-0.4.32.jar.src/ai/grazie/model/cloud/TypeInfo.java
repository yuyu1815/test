/*    */ package ai.grazie.model.cloud;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlin.reflect.KType;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\030\000*\b\b\000\020\001*\0020\0022\0020\002B\033\022\006\020\003\032\0020\004\022\f\020\005\032\b\022\004\022\0028\0000\006¢\006\002\020\007R\027\020\005\032\b\022\004\022\0028\0000\006¢\006\b\n\000\032\004\b\b\020\tR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lai/grazie/model/cloud/TypeInfo;", "T", "", "type", "Lkotlin/reflect/KType;", "kclass", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KType;Lkotlin/reflect/KClass;)V", "getKclass", "()Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KType;", "model-cloud"})
/*    */ public final class TypeInfo<T>
/*    */ {
/*    */   @NotNull
/*    */   private final KType type;
/*    */   @NotNull
/*    */   private final KClass<T> kclass;
/*    */   
/*    */   public TypeInfo(@NotNull KType type, @NotNull KClass<T> kclass) {
/* 24 */     this.type = type;
/* 25 */     this.kclass = kclass; } @NotNull public final KClass<T> getKclass() { return this.kclass; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final KType getType() {
/*    */     return this.type;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\TypeInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */