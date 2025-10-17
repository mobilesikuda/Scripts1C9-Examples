<?php
//$n = 50000000
ini_set("memory_limit", -1);

$n = 10000000;
$array = array();
$array[0] = 0;
$array[1] = 0;
for($i = 2; $i <= $n; $i++){
	$array[$i] = 1;
}
print("Begin-");

$timeBegin = microtime(true);
$i = 2;
while ( $i <= $n ) {
    if( $array[$i] === 1) {
        $sq = $i * $i;
        if($sq <= $n) {
            $m = $sq;
            while ($m <= $n) {
                $array[$m] = 0;
                $m += $i;
            }
        }
    }
	$i += 1;
}

$timeEnd = microtime(true);
$diff = $timeEnd - $timeBegin;
print("End-".$diff);
