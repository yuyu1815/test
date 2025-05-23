/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.markers.KMutableMap;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\r\n\000\n\002\020'\n\002\b\f*\001\000\b\n\030\0002\016\022\004\022\0028\000\022\004\022\0028\0010\001J\025\020\n\032\0028\0012\006\020\013\032\0028\001H\026¢\006\002\020\fR\034\020\002\032\0028\000X\016¢\006\020\n\002\020\007\032\004\b\003\020\004\"\004\b\005\020\006R\034\020\b\032\0028\001X\016¢\006\020\n\002\020\007\032\004\b\t\020\004\"\004\b\n\020\006¨\006\r"}, d2 = {"ai/grazie/utils/WeakIdentityHashMap$entries$entry$1", "", "key", "getKey", "()Ljava/lang/Object;", "setKey", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "value", "getValue", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "utils-common"})
/*    */ public final class WeakIdentityHashMap$entries$entry$1
/*    */   implements Map.Entry<K, V>, KMutableMap.Entry
/*    */ {
/*    */   private K key;
/*    */   private V value;
/*    */   
/*    */   public K getKey() {
/*    */     return this.key;
/*    */   }
/*    */   
/*    */   public void setKey(Object <set-?>) {
/*    */     this.key = (K)<set-?>;
/*    */   }
/*    */   
/*    */   WeakIdentityHashMap$entries$entry$1(Object $key, Object $value1) {
/* 62 */     this.key = (K)$key;
/* 63 */     this.value = (V)$value1; } public V getValue() { return this.value; } public void setValue(Object <set-?>) { this.value = (V)<set-?>; }
/*    */   
/*    */   public V setValue(Object newValue) {
/* 66 */     setValue((V)newValue);
/* 67 */     return (V)newValue;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\WeakIdentityHashMap$entries$entry$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */